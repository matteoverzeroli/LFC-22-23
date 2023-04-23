package tester;


import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;

import compiler.Ltspice2circuitikzLexer;
import compiler.Ltspice2circuitikzParser;
import compiler.Handler;

public class ParserTester {
 
	static Ltspice2circuitikzParser parser; 
   
	public static void main(String[] args) { 
		CommonTokenStream tokens;  
	  	String fileIn = ".\\resources\\Test1.asc";
 
		try {
			System.out.println ("Parsing con ANTLR lexer");
			System.out.println ("-----------------------");

			// 1.Istanzio il lexer passandogli il documento da analizzare
			Ltspice2circuitikzLexer lexer = new Ltspice2circuitikzLexer (
					new ANTLRFileStream(fileIn, "iso-8859-1")); 

			// 2.Creo uno stream (canale) di token per la comunicazione tra lexer e parser
		    tokens = new CommonTokenStream(lexer); 
		    
		    // 3.Istanzio il parser
			parser = new Ltspice2circuitikzParser(tokens);

			// 4.Lancio l'analisi sintattica del documento di ingresso
			parser.parseCircuit(); 
			
			// 5.controllo i risultati
			Handler h = parser.getHandler();
			h.closeFileOut();
			
			if (h.getErrorList().size() == 0)
				System.out.println ("Parsing terminato con successo");
			else
				for (int i=0; i<h.getErrorList().size(); i++)
					System.err.println ("Errore " + (i+1) + 
							":\t" + h.getErrorList().get(i)+"");
			
		
		} catch (Exception e) {
			System.out.println ("Parsing con ANTLR abortito\n\n");
			e.printStackTrace();
		}

  }

}
