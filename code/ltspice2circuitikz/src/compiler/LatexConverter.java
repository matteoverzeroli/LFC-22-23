package compiler;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

import compiler.util.Component;
import compiler.util.Flag;
import compiler.util.Wire;

public class LatexConverter {

	private static float LATEXSCALE = 50;
	
	// not sure if it is correct to have a reference here for the static method...
	private static FileWriter fileLatexOut;
	
	
	
	public static void convertToLatex(List<Component> components,
			List<Wire> wires, List<Flag> flags) throws IOException {
		inizializeFileLatex();
		translateCircuitToLatex(components, wires, flags);
		closeFileLatex();
	}


	private static void inizializeFileLatex() throws IOException {

		fileLatexOut = new FileWriter("./latex_output/translated_circuit.tex", false);
		fileLatexOut.write("");
		fileLatexOut.close();
		fileLatexOut = new FileWriter("./latex_output/translated_circuit.tex", true);
		fileLatexOut.write("\\documentclass{article}\n"
				+ "\\usepackage{circuitikz}\n"
				+ "\\begin{document}\n"
				+ "\\begin{center}\n"
				+ "\\begin{circuitikz}\n");
	}

	private static void translateCircuitToLatex(List<Component> components,
			List<Wire> wires, List<Flag> flags) throws IOException {
		int x_min = Integer.MAX_VALUE;//sarà l'offset del mio sdr; dovrò togliere questi offset e invertire la y
		int y_max = Integer.MIN_VALUE;

		for(Component c : components) {
			int c_x = c.getMinX();
			int c_y = c.getMaxY();

			if(c_x < x_min) 
				x_min = c_x;
			if(c_y > y_max)
				y_max = c_y;

		}
		for(Wire w : wires) {
			int w_x = w.getMinX();
			int w_y = w.getMaxY();

			if(w_x < x_min) 
				x_min = w_x;
			if(w_y > y_max)
				y_max = w_y;
		}

		for(Flag f : flags) {
			int f_x = f.getX();
			int f_y = f.getY();

			if(f_x < x_min) 
				x_min = f_x;
			if(f_y > y_max)
				y_max = f_y;
		}

		for(Component c : components) {
			float x1 = (c.getX1() - x_min)/LATEXSCALE;
			float y1 = -((c.getY1() - y_max))/LATEXSCALE;
			float x2 = (c.getX2() - x_min)/LATEXSCALE;
			float y2 = -((c.getY2() - y_max))/LATEXSCALE;

			fileLatexOut.write(String.format(Locale.ROOT, "\\draw (%.2f,%.2f) to[%s=$%s$, a={%s}] (%.2f,%.2f);\n", 
					x1, y1, c.getType(), c.getName(), c.getValue() != null ?c.getValue() : "", x2, y2));
		}
		for(Wire w : wires) {
			float x1 = (w.getX1() - x_min)/LATEXSCALE;
			float y1 = -((w.getY1() - y_max))/LATEXSCALE;
			float x2 = (w.getX2() - x_min)/LATEXSCALE;
			float y2 = -((w.getY2() - y_max))/LATEXSCALE;

			fileLatexOut.write(String.format(Locale.ROOT, "\\draw (%.2f,%.2f) to[short, l=${%s}$,] (%.2f,%.2f);\n", x1, y1, getWireFlag(x_min, y_max, x1, y1, x2, y2, flags) ,x2, y2));
		}

		for(Flag f : flags) {
			float x = (f.getX() - x_min)/LATEXSCALE;
			float y = -((f.getY() - y_max))/LATEXSCALE;

			if(f.getLabel().equals("0")) {
				fileLatexOut.write(String.format(Locale.ROOT, "\\draw (%f,%f) to (%f,%f) node[ground]{};\n", 
						x,y,x,y));
			}
		}

	}

	private static void closeFileLatex() throws IOException {
		fileLatexOut.write("\\end{circuitikz}\r\n"
				+ "\\end{center}\r\n"
				+ "\\end{document}");
		fileLatexOut.close();
	}
	
	private static String getWireFlag(int x_min, int y_max, float x1, float y1, float x2, float y2, List<Flag> flags) {
		for(Flag f : flags) {
			float x = (f.getX() - x_min)/LATEXSCALE;
			float y = -((f.getY() - y_max))/LATEXSCALE;
			
			if(!f.getLabel().equals("0") && (x == x1 && y == y1) || (x == x2 && y == y2)) {
				String label;
				label = f.getLabel();
				flags.remove(f);
				return label;
			}
		}
		return "";
	}
}
