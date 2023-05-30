package tester;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;

import compiler.Ltspice2circuitikzLexer;
import compiler.Ltspice2circuitikzParser;
import compiler.Handler;

public class ParserTester {

	static Ltspice2circuitikzParser parser;

	public static void main(String[] args) {
		CommonTokenStream tokens;
		String fileIn;
		fileIn = ".\\resources\\input.asc";
		/*
		 * if(args.length == 1) { fileIn = args[0]; } else { throw new
		 * RuntimeException("File path not provided"); }
		 */
		try {
			System.out.println("Parsing con ANTLR lexer");
			System.out.println("-----------------------");

			// 1.Istanzio il lexer passandogli il documento da analizzare
			Ltspice2circuitikzLexer lexer = new Ltspice2circuitikzLexer(new ANTLRFileStream(fileIn, "iso-8859-1"));

			// 2.Creo uno stream (canale) di token per la comunicazione tra lexer e parser
			tokens = new CommonTokenStream(lexer);

			// 3.Istanzio il parser
			parser = new Ltspice2circuitikzParser(tokens);

			// 4.Lancio l'analisi sintattica del documento di ingresso
			parser.parseCircuit();

			// 5.controllo i risultati
			Handler h = parser.getHandler();

			if (h.getErrorList().size() == 0)
				System.out.println("Parsing terminato con successo");
			else {
				File myObj = new File("./circuit_output/formatted_circuit.asc");
				myObj.delete();
				Files.delete(Paths.get("./circuit_output"));

				File directory = new File("./latex_output");
				File[] files = directory.listFiles();
				if (files != null) {
					for (File file : files)
						file.delete();
				}
				directory.delete();

				// save error logs
				Files.createDirectories(Paths.get("./logs")); // create folder for error log output
				FileWriter fileErrorOut = new FileWriter("./logs/errors.log", false);
				fileErrorOut.write("");
				fileErrorOut.close();
				fileErrorOut = new FileWriter("./logs/errors.log", true);

				for (int i = 0; i < h.getErrorList().size(); i++) {
					System.err.println("Error " + (i + 1) + ":\t" + h.getErrorList().get(i) + "");
					fileErrorOut.write("Error " + (i + 1) + ":\t" + h.getErrorList().get(i) + "\n");
				}

				fileErrorOut.close();
			}

		} catch (IOException e) {
			System.out.println("Problem in deleting or creating files");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Parsing con ANTLR abortito\n\n");
			e.printStackTrace();
		}

	}

	public String runParser(String path) {
		CommonTokenStream tokens;

		try {
			System.out.println("Parsing con ANTLR lexer");
			System.out.println("-----------------------");

			// 1.Istanzio il lexer passandogli il documento da analizzare
			Ltspice2circuitikzLexer lexer = new Ltspice2circuitikzLexer(new ANTLRFileStream(path, "iso-8859-1"));

			// 2.Creo uno stream (canale) di token per la comunicazione tra lexer e parser
			tokens = new CommonTokenStream(lexer);

			// 3.Istanzio il parser
			parser = new Ltspice2circuitikzParser(tokens);

			// 4.Lancio l'analisi sintattica del documento di ingresso
			parser.parseCircuit();

			// 5.controllo i risultati
			Handler h = parser.getHandler();

			if (h.getErrorList().size() == 0)
				return "Parsing terminato con successo";
			else {
				String errors = "";
				for (int i = 0; i < h.getErrorList().size(); i++)
					errors += "Errore " + (i + 1) + ":\t" + h.getErrorList().get(i) + "";

				return errors;
			}

		} catch (Exception e) {
			e.printStackTrace();
			return "Parsing con ANTLR abortito\n\n";
		}
	}

}
