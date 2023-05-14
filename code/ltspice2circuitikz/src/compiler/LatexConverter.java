package compiler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import compiler.util.Component;
import compiler.util.Flag;
import compiler.util.Wire;
import compiler.util.Point;

public class LatexConverter {

	private static float LATEXSCALE = 50;

	private static FileWriter fileLatexOut;

	private static List<Component> components;
	private static List<Wire> wires;
	private static List<Flag> flags;

	private static int x_min = Integer.MAX_VALUE;// sarà l'offset del mio sdr; dovrò togliere questi offset e invertire
	// la y
	private static int y_max = Integer.MIN_VALUE;
	private static int x_max = Integer.MIN_VALUE;
	private static int y_min = Integer.MAX_VALUE;
	private static int width = 0;
	private static int height = 0;

	public static boolean rotate = false;

	public static void convertToLatex(List<Component> components, List<Wire> wires, List<Flag> flags)
			throws IOException {
		LatexConverter.components = components;
		LatexConverter.wires = wires;
		LatexConverter.flags = flags;
		calculateAspectRatio();
		inizializeFileLatex();
		translateCircuitToLatex();
		closeFileLatex();
	}

	private static void inizializeFileLatex() throws IOException {
		Files.createDirectories(Paths.get("./latex_output")); // create folder for latex output

		fileLatexOut = new FileWriter("./latex_output/translated_circuit.tex", false);
		fileLatexOut.write("");
		fileLatexOut.close();
		fileLatexOut = new FileWriter("./latex_output/translated_circuit.tex", true);

		if (rotate) {
			fileLatexOut.write("\\documentclass{article}\n" + "\\usepackage{circuitikz}\n"
					+ "\\usepackage[a4paper, total={6in, 8in}]{geometry}\n" + "\\begin{document}\n" + "\\begin{center}\n"
					+ "\\rotatebox{270}{\n" + "\\begin{circuitikz}\n");
		} else {
			fileLatexOut.write("\\documentclass{article}\n" + "\\usepackage{circuitikz}\n" 
					+ "\\usepackage[a4paper, total={6in, 8in}]{geometry}\n" + "\\begin{document}\n"
					+ "\\begin{center}\n" + "\\begin{circuitikz}\n");
		}
	}

	private static void calculateAspectRatio() {
		for (Component c : components) {
			int min_x = c.getMinX();
			int max_y = c.getMaxY();
			int max_x = c.getMaxX();
			int min_y = c.getMinY();

			if (min_x < x_min)
				x_min = min_x;
			if (max_x > x_max)
				x_max = max_x;
			if (max_y > y_max)
				y_max = max_y;
			if (min_y < y_min)
				y_min = min_y;
		}

		for (Wire w : wires) {
			int min_x = w.getMinX();
			int max_y = w.getMaxY();
			int max_x = w.getMaxX();
			int min_y = w.getMinY();

			if (min_x < x_min)
				x_min = min_x;
			if (max_x > x_max)
				x_max = max_x;
			if (max_y > y_max)
				y_max = max_y;
			if (min_y < y_min)
				y_min = min_y;
		}

		for (Flag f : flags) {
			int f_x = f.getX();
			int f_y = f.getY();

			if (f_x < x_min)
				x_min = f_x;
			if (f_x > x_max)
				x_max = f_x;
			if (f_y > y_max)
				y_max = f_y;
			if (f_y < y_min)
				y_min = f_y;
		}

		width = Math.abs(x_min - x_max);
		height = Math.abs(y_min - y_max);

		System.out.println(width / LATEXSCALE);
		System.out.println(height / LATEXSCALE);

		if ((width / LATEXSCALE) > 15 && width > height)
			rotate = true;
	}

	private static void translateCircuitToLatex() throws IOException {

		if (!rotate) {
			if ((width / LATEXSCALE) > 15 || (height / LATEXSCALE) > 17) {
				LATEXSCALE = Math.max(width / 15, height / 17) + 1;
			}
		} else {
			if ((width / LATEXSCALE) > 17 || (height / LATEXSCALE) > 15) {
				LATEXSCALE = Math.max(width / 17, height / 15) + 1;
			}
		}

		for (Component c : components) {
			float x1 = (c.getX1() - x_min) / LATEXSCALE;
			float y1 = -((c.getY1() - y_max)) / LATEXSCALE;
			float x2 = (c.getX2() - x_min) / LATEXSCALE;
			float y2 = -((c.getY2() - y_max)) / LATEXSCALE;

			fileLatexOut.write(String.format(Locale.ROOT, "\\draw (%.2f,%.2f) to[%s=$%s$, a={%s}] (%.2f,%.2f);\n", x1,
					y1, c.getType(), c.getName(), c.getValue() != null ? c.getValue() : "", x2, y2));
		}
		for (Wire w : wires) {
			float x1 = (w.getX1() - x_min) / LATEXSCALE;
			float y1 = -((w.getY1() - y_max)) / LATEXSCALE;
			float x2 = (w.getX2() - x_min) / LATEXSCALE;
			float y2 = -((w.getY2() - y_max)) / LATEXSCALE;

			fileLatexOut.write(String.format(Locale.ROOT, "\\draw (%.2f,%.2f) to[short, l=${%s}$,] (%.2f,%.2f);\n", x1,
					y1, getWireFlag(x_min, y_max, x1, y1, x2, y2, flags), x2, y2));
		}

		for (Flag f : flags) {
			float x = (f.getX() - x_min) / LATEXSCALE;
			float y = -((f.getY() - y_max)) / LATEXSCALE;

			if (f.getLabel().equals("0")) {
				fileLatexOut
						.write(String.format(Locale.ROOT, "\\draw (%f,%f) to (%f,%f) node[ground]{};\n", x, y, x, y));
			}
		}

		findNode();

	}

	private static void findNode() throws IOException {
		Map<Point, Integer> nodes = new HashMap<>();
		for (Wire w : wires) {
			Point p1 = new Point(w.getX1(), w.getY1());
			Point p2 = new Point(w.getX2(), w.getY2());
			if (nodes.containsKey(p1)) {
				int occurrences = nodes.get(p1) + 1;
				nodes.replace(p1, occurrences);
			} else {
				nodes.put(p1, 1);
			}
			if (nodes.containsKey(p2)) {
				int occurrences = nodes.get(p2) + 1;
				nodes.replace(p2, occurrences);
			} else {
				nodes.put(p2, 1);
			}
		}
		for (Map.Entry<Point, Integer> entry : nodes.entrySet()) {
			if (entry.getValue() >= 3) {
				fileLatexOut.write(String.format(Locale.ROOT, "\\draw (%s,%s) to[short, -*] (%s,%s);\n",
						(entry.getKey().getX() - x_min) / LATEXSCALE, -(entry.getKey().getY() - y_max) / LATEXSCALE,
						(entry.getKey().getX() - x_min) / LATEXSCALE, -(entry.getKey().getY() - y_max) / LATEXSCALE));
			}
		}
	}

	private static void closeFileLatex() throws IOException {

		if (rotate) {
			fileLatexOut.write("\\end{circuitikz}}\r\n" + "\\end{center}\r\n" + "\\end{document}");
		} else {
			fileLatexOut.write("\\end{circuitikz}\r\n" + "\\end{center}\r\n" + "\\end{document}");
		}

		fileLatexOut.close();

		ProcessBuilder pb = new ProcessBuilder("pdflatex", "translated_circuit.tex").inheritIO()
				.directory(new File("./latex_output/"));
		Process process = pb.start();
		try {
			process.waitFor();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static String getWireFlag(int x_min, int y_max, float x1, float y1, float x2, float y2, List<Flag> flags) {
		for (Flag f : flags) {
			float x = (f.getX() - x_min) / LATEXSCALE;
			float y = -((f.getY() - y_max)) / LATEXSCALE;

			if (!f.getLabel().equals("0") && ((x == x1 && y == y1) || (x == x2 && y == y2))) {
				String label;
				label = f.getLabel();
				flags.remove(f);
				return label;
			}
		}
		return "";
	}
}