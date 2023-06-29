package com.omega.compiler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import com.omega.compiler.util.Component;
import com.omega.compiler.util.Flag;
import com.omega.compiler.util.Point;
import com.omega.compiler.util.Wire;

public class LatexConverter {

	private static float LATEXSCALE = 50;
	private final static int MAXWIDTHTODRAWON = 15; // max width in A4 paper where the circuitikz library can draw
	private final static int MAXHEIGHTTODRAWON = 17; // max height in A4 paper where the circuitikz library can draw

	private static FileWriter fileLatexOut;

	private static List<Component> components;
	private static List<Wire> wires;
	private static List<Flag> flags;

	private static int x_min = Integer.MAX_VALUE;
	private static int y_max = Integer.MIN_VALUE;
	private static int x_max = Integer.MIN_VALUE;
	private static int y_min = Integer.MAX_VALUE;
	private static int width = 0;
	private static int height = 0;

	private static boolean rotate = false;

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
	
	/**
	 * Adds latex prolog
	 */
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
	
	/**
	 * Extracts the max and min values of x and y coordinates and eventually set the rotate property
	 * to true. 
	 */
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
		
		//if width is higher than the max width and the circuit is wider than high than rotate the circuit
		if ((width / LATEXSCALE) > MAXWIDTHTODRAWON && width > height)
			rotate = true;
	}

	/**
	 * Translate the circuit to latex output
	 */
	private static void translateCircuitToLatex() throws IOException {

		// calculate the LATEXSCALE based on width, height and rotate property. +1 is to be sure that the 
		// circuit does not collide with maximum values of width and height. 
		if (!rotate) {
			if ((width / LATEXSCALE) > MAXWIDTHTODRAWON || (height / LATEXSCALE) > MAXHEIGHTTODRAWON) {
				LATEXSCALE = Math.max(width / MAXWIDTHTODRAWON, height / MAXHEIGHTTODRAWON) + 1;
			}
		} else {
			if ((width / LATEXSCALE) > MAXHEIGHTTODRAWON || (height / LATEXSCALE) > MAXWIDTHTODRAWON) {
				LATEXSCALE = Math.max(width / MAXHEIGHTTODRAWON, height / MAXWIDTHTODRAWON) + 1;
			}
		}
		
		// scale and translate coordinates of a component
		for (Component c : components) {
			float x1 = (c.getX1() - x_min) / LATEXSCALE;
			float y1 = -((c.getY1() - y_max)) / LATEXSCALE;
			float x2 = (c.getX2() - x_min) / LATEXSCALE;
			float y2 = -((c.getY2() - y_max)) / LATEXSCALE;
			
			// add the component to latex file
			fileLatexOut.write(String.format(Locale.ROOT, "\\draw (%.2f,%.2f) to[%s=$%s$, a={%s}] (%.2f,%.2f);\n", x1,
					y1, c.getType(), c.getName(), c.getValue() != null ? c.getValue() : "", x2, y2));
		}
		
		// scale and translate coordinates of a wire
		for (Wire w : wires) {
			float x1 = (w.getX1() - x_min) / LATEXSCALE;
			float y1 = -((w.getY1() - y_max)) / LATEXSCALE;
			float x2 = (w.getX2() - x_min) / LATEXSCALE;
			float y2 = -((w.getY2() - y_max)) / LATEXSCALE;
			
			// add the wire to latex file
			fileLatexOut.write(String.format(Locale.ROOT, "\\draw (%.2f,%.2f) to[short, l=${%s}$,] (%.2f,%.2f);\n", x1,
					y1, getWireFlag(x_min, y_max, x1, y1, x2, y2, flags), x2, y2));
		}
		
		// scale and translate coordinates of a ground flag
		for (Flag f : flags) {
			if (f.getLabel().equals("0")) {
				float x = (f.getX() - x_min) / LATEXSCALE;
				float y = -((f.getY() - y_max)) / LATEXSCALE;
				
				fileLatexOut
						.write(String.format(Locale.ROOT, "\\draw (%f,%f) to (%f,%f) node[ground]{};\n", x, y, x, y));
			}
		}

		findNode();

	}
	
	/**
	 * Finds nodes as the intersection of al least three wires
	 */
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
	
	/**
	 * Closes latex file
	 */
	private static void closeFileLatex() throws IOException {

		if (rotate) {
			fileLatexOut.write("\\end{circuitikz}}\r\n" + "\\end{center}\r\n" + "\\end{document}");
		} else {
			fileLatexOut.write("\\end{circuitikz}\r\n" + "\\end{center}\r\n" + "\\end{document}");
		}

		fileLatexOut.close();
		
		ProcessBuilder pb = new ProcessBuilder("pdflatex", "translated_circuit.tex" ,"-interaction","nonstopmode").inheritIO()
				.directory(new File("./latex_output/"));
		Process process = pb.start();
		
		try {
			process.waitFor();
			if(process.exitValue() != 0) {
				System.exit(1);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Finds flag related to a wire
	 */
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