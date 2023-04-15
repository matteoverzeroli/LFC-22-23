// $ANTLR 3.5.1 C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g 2023-04-15 14:38:48

package compiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class Ltspice2circuitikzParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGN", "DIGIT", "ERROR_TK", 
		"EXPONENT", "FLAG", "FLOAT", "ID", "INTEGER", "IOPIN", "LETTER", "SHEET", 
		"SPECIALCHAR", "STRING", "SYMATTR", "SYMBOL", "VERSION", "WINDOW", "WIRE", 
		"WS"
	};
	public static final int EOF=-1;
	public static final int ASSIGN=4;
	public static final int DIGIT=5;
	public static final int ERROR_TK=6;
	public static final int EXPONENT=7;
	public static final int FLAG=8;
	public static final int FLOAT=9;
	public static final int ID=10;
	public static final int INTEGER=11;
	public static final int IOPIN=12;
	public static final int LETTER=13;
	public static final int SHEET=14;
	public static final int SPECIALCHAR=15;
	public static final int STRING=16;
	public static final int SYMATTR=17;
	public static final int SYMBOL=18;
	public static final int VERSION=19;
	public static final int WINDOW=20;
	public static final int WIRE=21;
	public static final int WS=22;

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
	@Override public String getGrammarFileName() { return "C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g"; }


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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:44:1: parseCircuit : prologueRule ( componentRule )* EOF ;
	public final void parseCircuit() throws RecognitionException {
		initParser();
		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:46:2: ( prologueRule ( componentRule )* EOF )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:47:3: prologueRule ( componentRule )* EOF
			{
			pushFollow(FOLLOW_prologueRule_in_parseCircuit56);
			prologueRule();
			state._fsp--;

			System.out.println("Ho riconosciuto prolog rule");
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:48:3: ( componentRule )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==FLAG||LA1_0==IOPIN||(LA1_0 >= SYMATTR && LA1_0 <= SYMBOL)||(LA1_0 >= WINDOW && LA1_0 <= WIRE)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:48:3: componentRule
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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:51:1: prologueRule : versionRule sheetRule ;
	public final void prologueRule() throws RecognitionException {
		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:52:2: ( versionRule sheetRule )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:52:4: versionRule sheetRule
			{
			pushFollow(FOLLOW_versionRule_in_prologueRule79);
			versionRule();
			state._fsp--;

			pushFollow(FOLLOW_sheetRule_in_prologueRule83);
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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:55:1: versionRule : VERSION ver= INTEGER ;
	public final void versionRule() throws RecognitionException {
		Token ver=null;

		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:56:2: ( VERSION ver= INTEGER )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:57:3: VERSION ver= INTEGER
			{
			match(input,VERSION,FOLLOW_VERSION_in_versionRule96); 
			ver=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_versionRule105); 
			h.checkVersion(ver);
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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:61:1: sheetRule : SHEET INTEGER INTEGER INTEGER ;
	public final void sheetRule() throws RecognitionException {
		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:62:2: ( SHEET INTEGER INTEGER INTEGER )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:63:3: SHEET INTEGER INTEGER INTEGER
			{
			match(input,SHEET,FOLLOW_SHEET_in_sheetRule121); 
			match(input,INTEGER,FOLLOW_INTEGER_in_sheetRule123); 
			match(input,INTEGER,FOLLOW_INTEGER_in_sheetRule125); 
			match(input,INTEGER,FOLLOW_INTEGER_in_sheetRule127); 
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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:66:1: componentRule : ( wireRule |symbol= symbolRule | symattrRule | flagRule | windowRule | iopinRule );
	public final void componentRule() throws RecognitionException {
		Token symbol =null;

		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:67:2: ( wireRule |symbol= symbolRule | symattrRule | flagRule | windowRule | iopinRule )
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
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:67:4: wireRule
					{
					pushFollow(FOLLOW_wireRule_in_componentRule139);
					wireRule();
					state._fsp--;

					System.out.println("sto riconoscendo wirerule");
					}
					break;
				case 2 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:68:5: symbol= symbolRule
					{
					pushFollow(FOLLOW_symbolRule_in_componentRule151);
					symbol=symbolRule();
					state._fsp--;

					System.out.println("sto riconoscendo symbol"); h.setLastSymbol(symbol);
					}
					break;
				case 3 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:69:5: symattrRule
					{
					pushFollow(FOLLOW_symattrRule_in_componentRule159);
					symattrRule();
					state._fsp--;

					System.out.println("sto riconoscendo symattr");
					}
					break;
				case 4 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:70:5: flagRule
					{
					pushFollow(FOLLOW_flagRule_in_componentRule167);
					flagRule();
					state._fsp--;

					System.out.println("sto riconoscendo flag");
					}
					break;
				case 5 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:71:5: windowRule
					{
					pushFollow(FOLLOW_windowRule_in_componentRule174);
					windowRule();
					state._fsp--;

					System.out.println("sto riconoscendo window");
					}
					break;
				case 6 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:72:5: iopinRule
					{
					pushFollow(FOLLOW_iopinRule_in_componentRule181);
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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:74:1: wireRule : WIRE INTEGER INTEGER INTEGER INTEGER ;
	public final void wireRule() throws RecognitionException {
		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:75:2: ( WIRE INTEGER INTEGER INTEGER INTEGER )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:76:3: WIRE INTEGER INTEGER INTEGER INTEGER
			{
			match(input,WIRE,FOLLOW_WIRE_in_wireRule194); 
			match(input,INTEGER,FOLLOW_INTEGER_in_wireRule196); 
			match(input,INTEGER,FOLLOW_INTEGER_in_wireRule198); 
			match(input,INTEGER,FOLLOW_INTEGER_in_wireRule200); 
			match(input,INTEGER,FOLLOW_INTEGER_in_wireRule202); 
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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:79:1: flagRule : FLAG INTEGER INTEGER ( INTEGER | ID | reservedWordRule ) ;
	public final void flagRule() throws RecognitionException {
		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:80:2: ( FLAG INTEGER INTEGER ( INTEGER | ID | reservedWordRule ) )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:81:3: FLAG INTEGER INTEGER ( INTEGER | ID | reservedWordRule )
			{
			match(input,FLAG,FOLLOW_FLAG_in_flagRule217); 
			match(input,INTEGER,FOLLOW_INTEGER_in_flagRule219); 
			match(input,INTEGER,FOLLOW_INTEGER_in_flagRule221); 
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:81:24: ( INTEGER | ID | reservedWordRule )
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
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:81:25: INTEGER
					{
					match(input,INTEGER,FOLLOW_INTEGER_in_flagRule224); 
					}
					break;
				case 2 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:81:35: ID
					{
					match(input,ID,FOLLOW_ID_in_flagRule228); 
					}
					break;
				case 3 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:81:40: reservedWordRule
					{
					pushFollow(FOLLOW_reservedWordRule_in_flagRule232);
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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:84:1: windowRule : WINDOW INTEGER INTEGER INTEGER id= ID INTEGER ;
	public final void windowRule() throws RecognitionException {
		Token id=null;

		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:85:2: ( WINDOW INTEGER INTEGER INTEGER id= ID INTEGER )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:86:3: WINDOW INTEGER INTEGER INTEGER id= ID INTEGER
			{
			match(input,WINDOW,FOLLOW_WINDOW_in_windowRule249); 
			match(input,INTEGER,FOLLOW_INTEGER_in_windowRule254); 
			match(input,INTEGER,FOLLOW_INTEGER_in_windowRule259); 
			match(input,INTEGER,FOLLOW_INTEGER_in_windowRule264); 
			id=(Token)match(input,ID,FOLLOW_ID_in_windowRule273); 
			h.checkWindowsOptions(id);
			match(input,INTEGER,FOLLOW_INTEGER_in_windowRule279); 
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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:93:1: iopinRule : IOPIN INTEGER INTEGER id= ID ;
	public final void iopinRule() throws RecognitionException {
		Token id=null;

		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:94:2: ( IOPIN INTEGER INTEGER id= ID )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:95:3: IOPIN INTEGER INTEGER id= ID
			{
			match(input,IOPIN,FOLLOW_IOPIN_in_iopinRule291); 
			match(input,INTEGER,FOLLOW_INTEGER_in_iopinRule295); 
			match(input,INTEGER,FOLLOW_INTEGER_in_iopinRule299); 
			id=(Token)match(input,ID,FOLLOW_ID_in_iopinRule307); 
			h.checkIOPinAttr(id);
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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:100:1: symbolRule returns [Token symbol] : SYMBOL symbolType= ID INTEGER INTEGER rotType= ID ;
	public final Token symbolRule() throws RecognitionException {
		Token symbol = null;


		Token symbolType=null;
		Token rotType=null;

		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:101:2: ( SYMBOL symbolType= ID INTEGER INTEGER rotType= ID )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:102:3: SYMBOL symbolType= ID INTEGER INTEGER rotType= ID
			{
			match(input,SYMBOL,FOLLOW_SYMBOL_in_symbolRule324); 
			symbolType=(Token)match(input,ID,FOLLOW_ID_in_symbolRule333); 
			h.checkSymbolType(symbolType); symbol = symbolType;
			match(input,INTEGER,FOLLOW_INTEGER_in_symbolRule339); 
			match(input,INTEGER,FOLLOW_INTEGER_in_symbolRule344); 
			rotType=(Token)match(input,ID,FOLLOW_ID_in_symbolRule353); 
			h.checkRotType(rotType);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return symbol;
	}
	// $ANTLR end "symbolRule"



	// $ANTLR start "symattrRule"
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:108:1: symattrRule : SYMATTR id1= ID (id2= ID ( attrRuleNoId ( attrRule[$id1] )* )? | INTEGER | FLOAT | reservedWordRule ) ;
	public final void symattrRule() throws RecognitionException {
		Token id1=null;
		Token id2=null;

		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:109:2: ( SYMATTR id1= ID (id2= ID ( attrRuleNoId ( attrRule[$id1] )* )? | INTEGER | FLOAT | reservedWordRule ) )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:110:3: SYMATTR id1= ID (id2= ID ( attrRuleNoId ( attrRule[$id1] )* )? | INTEGER | FLOAT | reservedWordRule )
			{
			match(input,SYMATTR,FOLLOW_SYMATTR_in_symattrRule368); 
			id1=(Token)match(input,ID,FOLLOW_ID_in_symattrRule374); 
			h.checkSymMattrAttr(id1);
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:111:4: (id2= ID ( attrRuleNoId ( attrRule[$id1] )* )? | INTEGER | FLOAT | reservedWordRule )
			int alt6=4;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt6=1;
				}
				break;
			case INTEGER:
				{
				alt6=2;
				}
				break;
			case FLOAT:
				{
				alt6=3;
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
				alt6=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:111:5: id2= ID ( attrRuleNoId ( attrRule[$id1] )* )?
					{
					id2=(Token)match(input,ID,FOLLOW_ID_in_symattrRule388); 
					h.checkSymMattrAttrValue(id1, id2);
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:111:55: ( attrRuleNoId ( attrRule[$id1] )* )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==ASSIGN) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:111:56: attrRuleNoId ( attrRule[$id1] )*
							{
							pushFollow(FOLLOW_attrRuleNoId_in_symattrRule393);
							attrRuleNoId();
							state._fsp--;

							// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:111:69: ( attrRule[$id1] )*
							loop4:
							while (true) {
								int alt4=2;
								int LA4_0 = input.LA(1);
								if ( (LA4_0==ID) ) {
									alt4=1;
								}

								switch (alt4) {
								case 1 :
									// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:111:69: attrRule[$id1]
									{
									pushFollow(FOLLOW_attrRule_in_symattrRule395);
									attrRule(id1);
									state._fsp--;

									}
									break;

								default :
									break loop4;
								}
							}

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:112:6: INTEGER
					{
					match(input,INTEGER,FOLLOW_INTEGER_in_symattrRule406); 
					h.checkSymMattrAttrValue(id1, "int");
					}
					break;
				case 3 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:113:6: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_symattrRule415); 
					h.checkSymMattrAttrValue(id1, "float");
					}
					break;
				case 4 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:114:6: reservedWordRule
					{
					pushFollow(FOLLOW_reservedWordRule_in_symattrRule424);
					reservedWordRule();
					state._fsp--;

					h.checkSymMattrAttrValue(id1, "reserved");
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



	// $ANTLR start "attrRuleNoId"
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:122:1: attrRuleNoId : ASSIGN ( INTEGER | FLOAT | STRING | ID | reservedWordRule ) ;
	public final void attrRuleNoId() throws RecognitionException {
		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:123:2: ( ASSIGN ( INTEGER | FLOAT | STRING | ID | reservedWordRule ) )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:124:3: ASSIGN ( INTEGER | FLOAT | STRING | ID | reservedWordRule )
			{
			match(input,ASSIGN,FOLLOW_ASSIGN_in_attrRuleNoId445); 
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:125:3: ( INTEGER | FLOAT | STRING | ID | reservedWordRule )
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
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:125:4: INTEGER
					{
					match(input,INTEGER,FOLLOW_INTEGER_in_attrRuleNoId450); 
					}
					break;
				case 2 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:125:14: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_attrRuleNoId454); 
					}
					break;
				case 3 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:125:22: STRING
					{
					match(input,STRING,FOLLOW_STRING_in_attrRuleNoId458); 
					}
					break;
				case 4 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:125:31: ID
					{
					match(input,ID,FOLLOW_ID_in_attrRuleNoId462); 
					}
					break;
				case 5 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:125:36: reservedWordRule
					{
					pushFollow(FOLLOW_reservedWordRule_in_attrRuleNoId466);
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
	// $ANTLR end "attrRuleNoId"



	// $ANTLR start "attrRule"
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:127:1: attrRule[Token id1] : id2= ID ASSIGN ( INTEGER | FLOAT | STRING | ID | reservedWordRule ) ;
	public final void attrRule(Token id1) throws RecognitionException {
		Token id2=null;

		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:128:2: (id2= ID ASSIGN ( INTEGER | FLOAT | STRING | ID | reservedWordRule ) )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:128:5: id2= ID ASSIGN ( INTEGER | FLOAT | STRING | ID | reservedWordRule )
			{
			id2=(Token)match(input,ID,FOLLOW_ID_in_attrRule484); 
			h.checkSymMattrAttrValue(id1, id2);
			match(input,ASSIGN,FOLLOW_ASSIGN_in_attrRule491); 
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:130:3: ( INTEGER | FLOAT | STRING | ID | reservedWordRule )
			int alt8=5;
			switch ( input.LA(1) ) {
			case INTEGER:
				{
				alt8=1;
				}
				break;
			case FLOAT:
				{
				alt8=2;
				}
				break;
			case STRING:
				{
				alt8=3;
				}
				break;
			case ID:
				{
				alt8=4;
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
				alt8=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:130:4: INTEGER
					{
					match(input,INTEGER,FOLLOW_INTEGER_in_attrRule496); 
					}
					break;
				case 2 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:130:14: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_attrRule500); 
					}
					break;
				case 3 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:130:22: STRING
					{
					match(input,STRING,FOLLOW_STRING_in_attrRule504); 
					}
					break;
				case 4 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:130:31: ID
					{
					match(input,ID,FOLLOW_ID_in_attrRule508); 
					}
					break;
				case 5 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:130:36: reservedWordRule
					{
					pushFollow(FOLLOW_reservedWordRule_in_attrRule512);
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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:134:1: reservedWordRule : ( VERSION | SHEET | WIRE | FLAG | WINDOW | SYMBOL | SYMATTR | ASSIGN | IOPIN );
	public final void reservedWordRule() throws RecognitionException {
		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:135:2: ( VERSION | SHEET | WIRE | FLAG | WINDOW | SYMBOL | SYMATTR | ASSIGN | IOPIN )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:
			{
			if ( input.LA(1)==ASSIGN||input.LA(1)==FLAG||input.LA(1)==IOPIN||input.LA(1)==SHEET||(input.LA(1) >= SYMATTR && input.LA(1) <= WIRE) ) {
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



	public static final BitSet FOLLOW_prologueRule_in_parseCircuit56 = new BitSet(new long[]{0x0000000000361100L});
	public static final BitSet FOLLOW_componentRule_in_parseCircuit62 = new BitSet(new long[]{0x0000000000361100L});
	public static final BitSet FOLLOW_EOF_in_parseCircuit69 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_versionRule_in_prologueRule79 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_sheetRule_in_prologueRule83 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VERSION_in_versionRule96 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_versionRule105 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SHEET_in_sheetRule121 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_sheetRule123 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_sheetRule125 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_sheetRule127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_wireRule_in_componentRule139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_symbolRule_in_componentRule151 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_symattrRule_in_componentRule159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_flagRule_in_componentRule167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_windowRule_in_componentRule174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iopinRule_in_componentRule181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WIRE_in_wireRule194 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_wireRule196 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_wireRule198 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_wireRule200 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_wireRule202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLAG_in_flagRule217 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_flagRule219 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_flagRule221 = new BitSet(new long[]{0x00000000003E5D10L});
	public static final BitSet FOLLOW_INTEGER_in_flagRule224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_flagRule228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reservedWordRule_in_flagRule232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WINDOW_in_windowRule249 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_windowRule254 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_windowRule259 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_windowRule264 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_windowRule273 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_windowRule279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IOPIN_in_iopinRule291 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_iopinRule295 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_iopinRule299 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_iopinRule307 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYMBOL_in_symbolRule324 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_symbolRule333 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_symbolRule339 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_symbolRule344 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_symbolRule353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYMATTR_in_symattrRule368 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_symattrRule374 = new BitSet(new long[]{0x00000000003E5F10L});
	public static final BitSet FOLLOW_ID_in_symattrRule388 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_attrRuleNoId_in_symattrRule393 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_attrRule_in_symattrRule395 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_INTEGER_in_symattrRule406 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_symattrRule415 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reservedWordRule_in_symattrRule424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_in_attrRuleNoId445 = new BitSet(new long[]{0x00000000003F5F10L});
	public static final BitSet FOLLOW_INTEGER_in_attrRuleNoId450 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_attrRuleNoId454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_attrRuleNoId458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_attrRuleNoId462 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reservedWordRule_in_attrRuleNoId466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_attrRule484 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ASSIGN_in_attrRule491 = new BitSet(new long[]{0x00000000003F5F10L});
	public static final BitSet FOLLOW_INTEGER_in_attrRule496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_attrRule500 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_attrRule504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_attrRule508 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reservedWordRule_in_attrRule512 = new BitSet(new long[]{0x0000000000000002L});
}
