package tester;

import java.io.FileReader;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

import compiler.Ltspice2circuitikzLexer;
import compiler.Ltspice2circuitikzParser;

public class ParserTester {
 
	static Ltspice2circuitikzParser parser; 
   
	public static void main(String[] args) { 
		CommonTokenStream tokens; 
	  	String fileIn = ".\\resources\\Test4.asc";
 
		try {
			System.out.println ("Parsing con ANTLR lexer");
			System.out.println ("-----------------------");

			// 1.Istanzio il lexer passandogli il documento da analizzare
			Ltspice2circuitikzLexer lexer = new Ltspice2circuitikzLexer(
											new ANTLRReaderStream(
												new FileReader(fileIn))); 

			// 2.Creo uno stream (canale) di token per la comunicazione tra lexer e parser
		    tokens = new CommonTokenStream(lexer); 
		    
		    // 3.Istanzio il parser
			parser = new Ltspice2circuitikzParser(tokens);

			// 4.Lancio l'analisi sintattica del documento di ingresso
			parser.parseCircuit(); 
		
		} catch (Exception e) {
			System.out.println ("Parsing con ANTLR abortito\n\n");
			e.printStackTrace();
		}

  }

}
