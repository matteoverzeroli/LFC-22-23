package tester;

import java.io.FileReader;
import java.io.IOException;

import compiler.Ltspice2circuitikzLexer;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.Token;


public class ScannerLexer {

	public static void main(String[] args) throws IOException {
		// inserire il path-name del file di input
	  	String fileIn = ".\\resources\\input.asc";
	
	  	Token tk;
	  	int i;

		try {
			System.out.println ("Test ANTLR lexer");
			// istanzio lo scanner passandogli un stream di ingresso
			Ltspice2circuitikzLexer lexer = new Ltspice2circuitikzLexer (
									new ANTLRReaderStream(
											new FileReader(fileIn)	)	); 
			
			i = 1;
			// attivo un ciclo che scandisce lo stream dall'inizio alla fine
			// richiedendo ogni volta allo scanner di fornire il token successivo (metodo nextToken)
			// fino ad incontrare l' End Of File EOF
			while ((tk = lexer.nextToken()).getType() != Ltspice2circuitikzLexer.EOF) {
				// recuper le informazioni relative ai token rilevati
				int line = tk.getLine();
				int col = tk.getCharPositionInLine()+1;
				int type = tk.getType();
				String text = tk.getText();

				// attivo questo controllo se voglio scartare i token nascosti
				if (tk.getChannel() !=  Ltspice2circuitikzLexer.HIDDEN)
					// stampo le informazioni del token corrente
					System.out.println("Token " + i++ + ": "
							+ "(" + line + "," + col + ")\t\t" 
							+ "TokenType: " + type + "\t" + text);
			} 

		} catch (Exception e) {
			System.out.println ("Test ANTLR abortito");
			e.printStackTrace();
		}

	}
  	
}