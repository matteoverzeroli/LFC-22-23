// $ANTLR 3.5.1 C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g 2023-04-06 16:25:21

package compiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class Ltspice2circuitikzParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGN", "DESCRIPTION", "DIGIT", 
		"ERROR_TK", "EXPONENT", "FLAG", "FLOAT", "ID", "INSTNAME", "INTEGER", 
		"IOPIN", "LETTER", "SHEET", "SPECIALCHAR", "SPICELINE", "STRING", "SYMATTR", 
		"SYMBOL", "TYPE", "VALUE", "VERSION", "WINDOW", "WIRE", "WS"
	};
	public static final int EOF=-1;
	public static final int ASSIGN=4;
	public static final int DESCRIPTION=5;
	public static final int DIGIT=6;
	public static final int ERROR_TK=7;
	public static final int EXPONENT=8;
	public static final int FLAG=9;
	public static final int FLOAT=10;
	public static final int ID=11;
	public static final int INSTNAME=12;
	public static final int INTEGER=13;
	public static final int IOPIN=14;
	public static final int LETTER=15;
	public static final int SHEET=16;
	public static final int SPECIALCHAR=17;
	public static final int SPICELINE=18;
	public static final int STRING=19;
	public static final int SYMATTR=20;
	public static final int SYMBOL=21;
	public static final int TYPE=22;
	public static final int VALUE=23;
	public static final int VERSION=24;
	public static final int WINDOW=25;
	public static final int WIRE=26;
	public static final int WS=27;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public Ltspice2circuitikzParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public Ltspice2circuitikzParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return Ltspice2circuitikzParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g"; }


		Handler h;
		
		
		public Handler getHandler () {
			return h;
		}
		
		// Override e delega nella gestione degli errori sintattici
		public void displayRecognitionError(String[] tokenNames,
		                                     RecognitionException e) {
		  	// recupero alcune meta informazioni relative all'errore
			String hdr = " * " + getErrorHeader(e);
			String msg = " - " + getErrorMessage(e, tokenNames);
			
			// recuperoil token corrente  
			Token tk = input.LT(1);
			
			// lascio gestire il messaggio all'handler
			h.handleError(tk, hdr, msg);
		}
		
		void initParser () {
			h = new Handler(input);
		}
			
			
		



	// $ANTLR start "parseCircuit"
	// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:44:1: parseCircuit : prologueRule ( componentRule )* EOF ;
	public final void parseCircuit() throws RecognitionException {
		initParser();
		try {
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:46:2: ( prologueRule ( componentRule )* EOF )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:47:3: prologueRule ( componentRule )* EOF
			{
			pushFollow(FOLLOW_prologueRule_in_parseCircuit56);
			prologueRule();
			state._fsp--;

			System.out.println("Ho riconosciuto prolog rule");
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:48:3: ( componentRule )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==FLAG||LA1_0==IOPIN||(LA1_0 >= SYMATTR && LA1_0 <= SYMBOL)||(LA1_0 >= WINDOW && LA1_0 <= WIRE)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:48:3: componentRule
					{
					pushFollow(FOLLOW_componentRule_in_parseCircuit62);
					componentRule();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			System.out.println("Ho riconosciuto component rule");
			match(input,EOF,FOLLOW_EOF_in_parseCircuit69); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "parseCircuit"



	// $ANTLR start "prologueRule"
	// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:51:1: prologueRule : versionRule sheetRule ;
	public final void prologueRule() throws RecognitionException {
		try {
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:52:2: ( versionRule sheetRule )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:52:4: versionRule sheetRule
			{
			pushFollow(FOLLOW_versionRule_in_prologueRule79);
			versionRule();
			state._fsp--;

			pushFollow(FOLLOW_sheetRule_in_prologueRule84);
			sheetRule();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "prologueRule"



	// $ANTLR start "versionRule"
	// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:55:1: versionRule : VERSION INTEGER ;
	public final void versionRule() throws RecognitionException {
		try {
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:56:2: ( VERSION INTEGER )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:57:3: VERSION INTEGER
			{
			match(input,VERSION,FOLLOW_VERSION_in_versionRule97); 
			match(input,INTEGER,FOLLOW_INTEGER_in_versionRule99); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "versionRule"



	// $ANTLR start "sheetRule"
	// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:60:1: sheetRule : SHEET INTEGER INTEGER INTEGER ;
	public final void sheetRule() throws RecognitionException {
		try {
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:61:2: ( SHEET INTEGER INTEGER INTEGER )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:62:3: SHEET INTEGER INTEGER INTEGER
			{
			match(input,SHEET,FOLLOW_SHEET_in_sheetRule114); 
			match(input,INTEGER,FOLLOW_INTEGER_in_sheetRule116); 
			match(input,INTEGER,FOLLOW_INTEGER_in_sheetRule118); 
			match(input,INTEGER,FOLLOW_INTEGER_in_sheetRule120); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "sheetRule"



	// $ANTLR start "componentRule"
	// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:65:1: componentRule : ( wireRule | symbolRule | symattrRule | flagRule | windowRule | iopinRule );
	public final void componentRule() throws RecognitionException {
		try {
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:66:2: ( wireRule | symbolRule | symattrRule | flagRule | windowRule | iopinRule )
			int alt2=6;
			switch ( input.LA(1) ) {
			case WIRE:
				{
				alt2=1;
				}
				break;
			case SYMBOL:
				{
				alt2=2;
				}
				break;
			case SYMATTR:
				{
				alt2=3;
				}
				break;
			case FLAG:
				{
				alt2=4;
				}
				break;
			case WINDOW:
				{
				alt2=5;
				}
				break;
			case IOPIN:
				{
				alt2=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:66:4: wireRule
					{
					pushFollow(FOLLOW_wireRule_in_componentRule132);
					wireRule();
					state._fsp--;

					System.out.println("sto riconoscendo wirerule");
					}
					break;
				case 2 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:67:5: symbolRule
					{
					pushFollow(FOLLOW_symbolRule_in_componentRule140);
					symbolRule();
					state._fsp--;

					System.out.println("sto riconoscendo symbol");
					}
					break;
				case 3 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:68:5: symattrRule
					{
					pushFollow(FOLLOW_symattrRule_in_componentRule148);
					symattrRule();
					state._fsp--;

					System.out.println("sto riconoscendo symattr");
					}
					break;
				case 4 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:69:5: flagRule
					{
					pushFollow(FOLLOW_flagRule_in_componentRule155);
					flagRule();
					state._fsp--;

					System.out.println("sto riconoscendo flag");
					}
					break;
				case 5 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:70:5: windowRule
					{
					pushFollow(FOLLOW_windowRule_in_componentRule162);
					windowRule();
					state._fsp--;

					System.out.println("sto riconoscendo window");
					}
					break;
				case 6 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:71:5: iopinRule
					{
					pushFollow(FOLLOW_iopinRule_in_componentRule169);
					iopinRule();
					state._fsp--;

					System.out.println("sto riconoscendo iopin");
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "componentRule"



	// $ANTLR start "wireRule"
	// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:73:1: wireRule : WIRE INTEGER INTEGER INTEGER INTEGER ;
	public final void wireRule() throws RecognitionException {
		try {
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:74:2: ( WIRE INTEGER INTEGER INTEGER INTEGER )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:75:3: WIRE INTEGER INTEGER INTEGER INTEGER
			{
			match(input,WIRE,FOLLOW_WIRE_in_wireRule182); 
			match(input,INTEGER,FOLLOW_INTEGER_in_wireRule184); 
			match(input,INTEGER,FOLLOW_INTEGER_in_wireRule186); 
			match(input,INTEGER,FOLLOW_INTEGER_in_wireRule188); 
			match(input,INTEGER,FOLLOW_INTEGER_in_wireRule190); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "wireRule"



	// $ANTLR start "flagRule"
	// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:78:1: flagRule : FLAG INTEGER INTEGER ( INTEGER | ID | reservedWordRule ) ;
	public final void flagRule() throws RecognitionException {
		try {
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:79:2: ( FLAG INTEGER INTEGER ( INTEGER | ID | reservedWordRule ) )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:80:3: FLAG INTEGER INTEGER ( INTEGER | ID | reservedWordRule )
			{
			match(input,FLAG,FOLLOW_FLAG_in_flagRule205); 
			match(input,INTEGER,FOLLOW_INTEGER_in_flagRule207); 
			match(input,INTEGER,FOLLOW_INTEGER_in_flagRule209); 
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:80:24: ( INTEGER | ID | reservedWordRule )
			int alt3=3;
			switch ( input.LA(1) ) {
			case INTEGER:
				{
				alt3=1;
				}
				break;
			case ID:
				{
				alt3=2;
				}
				break;
			case ASSIGN:
			case FLAG:
			case IOPIN:
			case SHEET:
			case SYMATTR:
			case SYMBOL:
			case VERSION:
			case WINDOW:
			case WIRE:
				{
				alt3=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:80:25: INTEGER
					{
					match(input,INTEGER,FOLLOW_INTEGER_in_flagRule212); 
					}
					break;
				case 2 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:80:35: ID
					{
					match(input,ID,FOLLOW_ID_in_flagRule216); 
					}
					break;
				case 3 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:80:40: reservedWordRule
					{
					pushFollow(FOLLOW_reservedWordRule_in_flagRule220);
					reservedWordRule();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "flagRule"



	// $ANTLR start "windowRule"
	// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:83:1: windowRule : WINDOW INTEGER INTEGER INTEGER ID INTEGER ;
	public final void windowRule() throws RecognitionException {
		try {
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:84:2: ( WINDOW INTEGER INTEGER INTEGER ID INTEGER )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:85:3: WINDOW INTEGER INTEGER INTEGER ID INTEGER
			{
			match(input,WINDOW,FOLLOW_WINDOW_in_windowRule237); 
			match(input,INTEGER,FOLLOW_INTEGER_in_windowRule239); 
			match(input,INTEGER,FOLLOW_INTEGER_in_windowRule241); 
			match(input,INTEGER,FOLLOW_INTEGER_in_windowRule243); 
			match(input,ID,FOLLOW_ID_in_windowRule245); 
			match(input,INTEGER,FOLLOW_INTEGER_in_windowRule247); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "windowRule"



	// $ANTLR start "iopinRule"
	// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:87:1: iopinRule : IOPIN INTEGER INTEGER ID ;
	public final void iopinRule() throws RecognitionException {
		try {
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:88:2: ( IOPIN INTEGER INTEGER ID )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:89:3: IOPIN INTEGER INTEGER ID
			{
			match(input,IOPIN,FOLLOW_IOPIN_in_iopinRule260); 
			match(input,INTEGER,FOLLOW_INTEGER_in_iopinRule262); 
			match(input,INTEGER,FOLLOW_INTEGER_in_iopinRule264); 
			match(input,ID,FOLLOW_ID_in_iopinRule266); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "iopinRule"



	// $ANTLR start "symbolRule"
	// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:91:1: symbolRule : SYMBOL ID INTEGER INTEGER ID ;
	public final void symbolRule() throws RecognitionException {
		try {
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:92:2: ( SYMBOL ID INTEGER INTEGER ID )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:93:3: SYMBOL ID INTEGER INTEGER ID
			{
			match(input,SYMBOL,FOLLOW_SYMBOL_in_symbolRule279); 
			match(input,ID,FOLLOW_ID_in_symbolRule281); 
			match(input,INTEGER,FOLLOW_INTEGER_in_symbolRule283); 
			match(input,INTEGER,FOLLOW_INTEGER_in_symbolRule285); 
			match(input,ID,FOLLOW_ID_in_symbolRule287); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "symbolRule"



	// $ANTLR start "symattrRule"
	// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:95:1: symattrRule : SYMATTR ( INSTNAME ID | DESCRIPTION ID | TYPE ID | VALUE ( INTEGER | FLOAT | ID | reservedWordRule ) | SPICELINE ( attrRule )+ ) ;
	public final void symattrRule() throws RecognitionException {
		try {
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:96:2: ( SYMATTR ( INSTNAME ID | DESCRIPTION ID | TYPE ID | VALUE ( INTEGER | FLOAT | ID | reservedWordRule ) | SPICELINE ( attrRule )+ ) )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:97:3: SYMATTR ( INSTNAME ID | DESCRIPTION ID | TYPE ID | VALUE ( INTEGER | FLOAT | ID | reservedWordRule ) | SPICELINE ( attrRule )+ )
			{
			match(input,SYMATTR,FOLLOW_SYMATTR_in_symattrRule300); 
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:97:11: ( INSTNAME ID | DESCRIPTION ID | TYPE ID | VALUE ( INTEGER | FLOAT | ID | reservedWordRule ) | SPICELINE ( attrRule )+ )
			int alt6=5;
			switch ( input.LA(1) ) {
			case INSTNAME:
				{
				alt6=1;
				}
				break;
			case DESCRIPTION:
				{
				alt6=2;
				}
				break;
			case TYPE:
				{
				alt6=3;
				}
				break;
			case VALUE:
				{
				alt6=4;
				}
				break;
			case SPICELINE:
				{
				alt6=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:97:13: INSTNAME ID
					{
					match(input,INSTNAME,FOLLOW_INSTNAME_in_symattrRule304); 
					match(input,ID,FOLLOW_ID_in_symattrRule306); 
					}
					break;
				case 2 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:98:6: DESCRIPTION ID
					{
					match(input,DESCRIPTION,FOLLOW_DESCRIPTION_in_symattrRule313); 
					match(input,ID,FOLLOW_ID_in_symattrRule315); 
					}
					break;
				case 3 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:99:6: TYPE ID
					{
					match(input,TYPE,FOLLOW_TYPE_in_symattrRule323); 
					match(input,ID,FOLLOW_ID_in_symattrRule325); 
					}
					break;
				case 4 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:100:6: VALUE ( INTEGER | FLOAT | ID | reservedWordRule )
					{
					match(input,VALUE,FOLLOW_VALUE_in_symattrRule333); 
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:100:12: ( INTEGER | FLOAT | ID | reservedWordRule )
					int alt4=4;
					switch ( input.LA(1) ) {
					case INTEGER:
						{
						alt4=1;
						}
						break;
					case FLOAT:
						{
						alt4=2;
						}
						break;
					case ID:
						{
						alt4=3;
						}
						break;
					case ASSIGN:
					case FLAG:
					case IOPIN:
					case SHEET:
					case SYMATTR:
					case SYMBOL:
					case VERSION:
					case WINDOW:
					case WIRE:
						{
						alt4=4;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 4, 0, input);
						throw nvae;
					}
					switch (alt4) {
						case 1 :
							// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:100:13: INTEGER
							{
							match(input,INTEGER,FOLLOW_INTEGER_in_symattrRule336); 
							}
							break;
						case 2 :
							// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:100:23: FLOAT
							{
							match(input,FLOAT,FOLLOW_FLOAT_in_symattrRule340); 
							}
							break;
						case 3 :
							// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:100:31: ID
							{
							match(input,ID,FOLLOW_ID_in_symattrRule344); 
							}
							break;
						case 4 :
							// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:100:36: reservedWordRule
							{
							pushFollow(FOLLOW_reservedWordRule_in_symattrRule348);
							reservedWordRule();
							state._fsp--;

							}
							break;

					}

					}
					break;
				case 5 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:101:6: SPICELINE ( attrRule )+
					{
					match(input,SPICELINE,FOLLOW_SPICELINE_in_symattrRule356); 
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:101:16: ( attrRule )+
					int cnt5=0;
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==ID) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:101:16: attrRule
							{
							pushFollow(FOLLOW_attrRule_in_symattrRule358);
							attrRule();
							state._fsp--;

							}
							break;

						default :
							if ( cnt5 >= 1 ) break loop5;
							EarlyExitException eee = new EarlyExitException(5, input);
							throw eee;
						}
						cnt5++;
					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "symattrRule"



	// $ANTLR start "attrRule"
	// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:104:1: attrRule : attr= ID ASSIGN ( INTEGER | FLOAT | STRING | ID | reservedWordRule ) ;
	public final void attrRule() throws RecognitionException {
		Token attr=null;

		try {
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:105:2: (attr= ID ASSIGN ( INTEGER | FLOAT | STRING | ID | reservedWordRule ) )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:105:5: attr= ID ASSIGN ( INTEGER | FLOAT | STRING | ID | reservedWordRule )
			{
			attr=(Token)match(input,ID,FOLLOW_ID_in_attrRule377); 
			h.checkAttribute(attr); 
			match(input,ASSIGN,FOLLOW_ASSIGN_in_attrRule384); 
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:107:3: ( INTEGER | FLOAT | STRING | ID | reservedWordRule )
			int alt7=5;
			switch ( input.LA(1) ) {
			case INTEGER:
				{
				alt7=1;
				}
				break;
			case FLOAT:
				{
				alt7=2;
				}
				break;
			case STRING:
				{
				alt7=3;
				}
				break;
			case ID:
				{
				alt7=4;
				}
				break;
			case ASSIGN:
			case FLAG:
			case IOPIN:
			case SHEET:
			case SYMATTR:
			case SYMBOL:
			case VERSION:
			case WINDOW:
			case WIRE:
				{
				alt7=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:107:4: INTEGER
					{
					match(input,INTEGER,FOLLOW_INTEGER_in_attrRule389); 
					}
					break;
				case 2 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:107:14: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_attrRule393); 
					}
					break;
				case 3 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:107:22: STRING
					{
					match(input,STRING,FOLLOW_STRING_in_attrRule397); 
					}
					break;
				case 4 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:107:31: ID
					{
					match(input,ID,FOLLOW_ID_in_attrRule401); 
					}
					break;
				case 5 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:107:36: reservedWordRule
					{
					pushFollow(FOLLOW_reservedWordRule_in_attrRule405);
					reservedWordRule();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "attrRule"



	// $ANTLR start "reservedWordRule"
	// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:111:1: reservedWordRule : ( VERSION | SHEET | WIRE | FLAG | WINDOW | SYMBOL | SYMATTR | ASSIGN | IOPIN );
	public final void reservedWordRule() throws RecognitionException {
		try {
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:112:2: ( VERSION | SHEET | WIRE | FLAG | WINDOW | SYMBOL | SYMATTR | ASSIGN | IOPIN )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:
			{
			if ( input.LA(1)==ASSIGN||input.LA(1)==FLAG||input.LA(1)==IOPIN||input.LA(1)==SHEET||(input.LA(1) >= SYMATTR && input.LA(1) <= SYMBOL)||(input.LA(1) >= VERSION && input.LA(1) <= WIRE) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "reservedWordRule"

	// Delegated rules



	public static final BitSet FOLLOW_prologueRule_in_parseCircuit56 = new BitSet(new long[]{0x0000000006304200L});
	public static final BitSet FOLLOW_componentRule_in_parseCircuit62 = new BitSet(new long[]{0x0000000006304200L});
	public static final BitSet FOLLOW_EOF_in_parseCircuit69 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_versionRule_in_prologueRule79 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_sheetRule_in_prologueRule84 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VERSION_in_versionRule97 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_INTEGER_in_versionRule99 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SHEET_in_sheetRule114 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_INTEGER_in_sheetRule116 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_INTEGER_in_sheetRule118 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_INTEGER_in_sheetRule120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_wireRule_in_componentRule132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_symbolRule_in_componentRule140 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_symattrRule_in_componentRule148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_flagRule_in_componentRule155 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_windowRule_in_componentRule162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iopinRule_in_componentRule169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WIRE_in_wireRule182 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_INTEGER_in_wireRule184 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_INTEGER_in_wireRule186 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_INTEGER_in_wireRule188 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_INTEGER_in_wireRule190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLAG_in_flagRule205 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_INTEGER_in_flagRule207 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_INTEGER_in_flagRule209 = new BitSet(new long[]{0x0000000007316A10L});
	public static final BitSet FOLLOW_INTEGER_in_flagRule212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_flagRule216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reservedWordRule_in_flagRule220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WINDOW_in_windowRule237 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_INTEGER_in_windowRule239 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_INTEGER_in_windowRule241 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_INTEGER_in_windowRule243 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_windowRule245 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_INTEGER_in_windowRule247 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IOPIN_in_iopinRule260 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_INTEGER_in_iopinRule262 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_INTEGER_in_iopinRule264 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_iopinRule266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYMBOL_in_symbolRule279 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_symbolRule281 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_INTEGER_in_symbolRule283 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_INTEGER_in_symbolRule285 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_symbolRule287 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYMATTR_in_symattrRule300 = new BitSet(new long[]{0x0000000000C41020L});
	public static final BitSet FOLLOW_INSTNAME_in_symattrRule304 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_symattrRule306 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DESCRIPTION_in_symattrRule313 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_symattrRule315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_in_symattrRule323 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_symattrRule325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VALUE_in_symattrRule333 = new BitSet(new long[]{0x0000000007316E10L});
	public static final BitSet FOLLOW_INTEGER_in_symattrRule336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_symattrRule340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_symattrRule344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reservedWordRule_in_symattrRule348 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPICELINE_in_symattrRule356 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_attrRule_in_symattrRule358 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_ID_in_attrRule377 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ASSIGN_in_attrRule384 = new BitSet(new long[]{0x0000000007396E10L});
	public static final BitSet FOLLOW_INTEGER_in_attrRule389 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_attrRule393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_attrRule397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_attrRule401 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reservedWordRule_in_attrRule405 = new BitSet(new long[]{0x0000000000000002L});
}
