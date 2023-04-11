// $ANTLR 3.5.1 C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g 2023-04-11 11:30:45

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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:51:1: prologueRule : ver= versionRule sheetRule ;
	public final void prologueRule() throws RecognitionException {
		Token ver =null;

		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:52:2: (ver= versionRule sheetRule )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:52:4: ver= versionRule sheetRule
			{
			pushFollow(FOLLOW_versionRule_in_prologueRule83);
			ver=versionRule();
			state._fsp--;

			h.checkVersion(ver);
			pushFollow(FOLLOW_sheetRule_in_prologueRule89);
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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:55:1: versionRule returns [Token tk] : VERSION ver= INTEGER ;
	public final Token versionRule() throws RecognitionException {
		Token tk = null;


		Token ver=null;

		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:56:2: ( VERSION ver= INTEGER )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:57:3: VERSION ver= INTEGER
			{
			match(input,VERSION,FOLLOW_VERSION_in_versionRule105); 
			ver=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_versionRule114); 
			tk = ver;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return tk;
	}
	// $ANTLR end "versionRule"



	// $ANTLR start "sheetRule"
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:61:1: sheetRule : SHEET INTEGER INTEGER INTEGER ;
	public final void sheetRule() throws RecognitionException {
		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:62:2: ( SHEET INTEGER INTEGER INTEGER )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:63:3: SHEET INTEGER INTEGER INTEGER
			{
			match(input,SHEET,FOLLOW_SHEET_in_sheetRule130); 
			match(input,INTEGER,FOLLOW_INTEGER_in_sheetRule132); 
			match(input,INTEGER,FOLLOW_INTEGER_in_sheetRule134); 
			match(input,INTEGER,FOLLOW_INTEGER_in_sheetRule136); 
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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:66:1: componentRule : ( wireRule | symbolRule | symattrRule | flagRule | windowRule | iopinRule );
	public final void componentRule() throws RecognitionException {
		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:67:2: ( wireRule | symbolRule | symattrRule | flagRule | windowRule | iopinRule )
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
					pushFollow(FOLLOW_wireRule_in_componentRule148);
					wireRule();
					state._fsp--;

					System.out.println("sto riconoscendo wirerule");
					}
					break;
				case 2 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:68:5: symbolRule
					{
					pushFollow(FOLLOW_symbolRule_in_componentRule156);
					symbolRule();
					state._fsp--;

					System.out.println("sto riconoscendo symbol");
					}
					break;
				case 3 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:69:5: symattrRule
					{
					pushFollow(FOLLOW_symattrRule_in_componentRule164);
					symattrRule();
					state._fsp--;

					System.out.println("sto riconoscendo symattr");
					}
					break;
				case 4 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:70:5: flagRule
					{
					pushFollow(FOLLOW_flagRule_in_componentRule171);
					flagRule();
					state._fsp--;

					System.out.println("sto riconoscendo flag");
					}
					break;
				case 5 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:71:5: windowRule
					{
					pushFollow(FOLLOW_windowRule_in_componentRule178);
					windowRule();
					state._fsp--;

					System.out.println("sto riconoscendo window");
					}
					break;
				case 6 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:72:5: iopinRule
					{
					pushFollow(FOLLOW_iopinRule_in_componentRule185);
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
			match(input,WIRE,FOLLOW_WIRE_in_wireRule198); 
			match(input,INTEGER,FOLLOW_INTEGER_in_wireRule200); 
			match(input,INTEGER,FOLLOW_INTEGER_in_wireRule202); 
			match(input,INTEGER,FOLLOW_INTEGER_in_wireRule204); 
			match(input,INTEGER,FOLLOW_INTEGER_in_wireRule206); 
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
			match(input,FLAG,FOLLOW_FLAG_in_flagRule221); 
			match(input,INTEGER,FOLLOW_INTEGER_in_flagRule223); 
			match(input,INTEGER,FOLLOW_INTEGER_in_flagRule225); 
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
					match(input,INTEGER,FOLLOW_INTEGER_in_flagRule228); 
					}
					break;
				case 2 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:81:35: ID
					{
					match(input,ID,FOLLOW_ID_in_flagRule232); 
					}
					break;
				case 3 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:81:40: reservedWordRule
					{
					pushFollow(FOLLOW_reservedWordRule_in_flagRule236);
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
			match(input,WINDOW,FOLLOW_WINDOW_in_windowRule253); 
			match(input,INTEGER,FOLLOW_INTEGER_in_windowRule258); 
			match(input,INTEGER,FOLLOW_INTEGER_in_windowRule263); 
			match(input,INTEGER,FOLLOW_INTEGER_in_windowRule268); 
			id=(Token)match(input,ID,FOLLOW_ID_in_windowRule277); 
			h.checkWindowsOptions(id);
			match(input,INTEGER,FOLLOW_INTEGER_in_windowRule283); 
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
			match(input,IOPIN,FOLLOW_IOPIN_in_iopinRule295); 
			match(input,INTEGER,FOLLOW_INTEGER_in_iopinRule299); 
			match(input,INTEGER,FOLLOW_INTEGER_in_iopinRule303); 
			id=(Token)match(input,ID,FOLLOW_ID_in_iopinRule311); 
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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:100:1: symbolRule : SYMBOL symbolType= ID INTEGER INTEGER rotType= ID ;
	public final void symbolRule() throws RecognitionException {
		Token symbolType=null;
		Token rotType=null;

		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:101:2: ( SYMBOL symbolType= ID INTEGER INTEGER rotType= ID )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:102:3: SYMBOL symbolType= ID INTEGER INTEGER rotType= ID
			{
			match(input,SYMBOL,FOLLOW_SYMBOL_in_symbolRule325); 
			symbolType=(Token)match(input,ID,FOLLOW_ID_in_symbolRule334); 
			h.checkSymbolType(symbolType);
			match(input,INTEGER,FOLLOW_INTEGER_in_symbolRule340); 
			match(input,INTEGER,FOLLOW_INTEGER_in_symbolRule345); 
			rotType=(Token)match(input,ID,FOLLOW_ID_in_symbolRule354); 
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
	}
	// $ANTLR end "symbolRule"



	// $ANTLR start "symattrRule"
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:108:1: symattrRule : SYMATTR id1= ID (id2= ID ( attrRuleNoId ( attrRule )* )? | INTEGER | FLOAT | reservedWordRule ) ;
	public final void symattrRule() throws RecognitionException {
		Token id1=null;
		Token id2=null;

		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:109:2: ( SYMATTR id1= ID (id2= ID ( attrRuleNoId ( attrRule )* )? | INTEGER | FLOAT | reservedWordRule ) )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:110:3: SYMATTR id1= ID (id2= ID ( attrRuleNoId ( attrRule )* )? | INTEGER | FLOAT | reservedWordRule )
			{
			match(input,SYMATTR,FOLLOW_SYMATTR_in_symattrRule369); 
			id1=(Token)match(input,ID,FOLLOW_ID_in_symattrRule375); 
			h.checkSymMattrAttr(id1);
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:111:4: (id2= ID ( attrRuleNoId ( attrRule )* )? | INTEGER | FLOAT | reservedWordRule )
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
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:111:5: id2= ID ( attrRuleNoId ( attrRule )* )?
					{
					id2=(Token)match(input,ID,FOLLOW_ID_in_symattrRule389); 
					h.checkSymMattrAttrValue(id1, id2);
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:111:55: ( attrRuleNoId ( attrRule )* )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==ASSIGN) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:111:56: attrRuleNoId ( attrRule )*
							{
							pushFollow(FOLLOW_attrRuleNoId_in_symattrRule394);
							attrRuleNoId();
							state._fsp--;

							// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:111:69: ( attrRule )*
							loop4:
							while (true) {
								int alt4=2;
								int LA4_0 = input.LA(1);
								if ( (LA4_0==ID) ) {
									alt4=1;
								}

								switch (alt4) {
								case 1 :
									// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:111:69: attrRule
									{
									pushFollow(FOLLOW_attrRule_in_symattrRule396);
									attrRule();
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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:127:1: attrRule : ID ASSIGN ( INTEGER | FLOAT | STRING | ID | reservedWordRule ) ;
	public final void attrRule() throws RecognitionException {
		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:128:2: ( ID ASSIGN ( INTEGER | FLOAT | STRING | ID | reservedWordRule ) )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:128:5: ID ASSIGN ( INTEGER | FLOAT | STRING | ID | reservedWordRule )
			{
			match(input,ID,FOLLOW_ID_in_attrRule478); 
			match(input,ASSIGN,FOLLOW_ASSIGN_in_attrRule484); 
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
					match(input,INTEGER,FOLLOW_INTEGER_in_attrRule489); 
					}
					break;
				case 2 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:130:14: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_attrRule493); 
					}
					break;
				case 3 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:130:22: STRING
					{
					match(input,STRING,FOLLOW_STRING_in_attrRule497); 
					}
					break;
				case 4 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:130:31: ID
					{
					match(input,ID,FOLLOW_ID_in_attrRule501); 
					}
					break;
				case 5 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:130:36: reservedWordRule
					{
					pushFollow(FOLLOW_reservedWordRule_in_attrRule505);
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
	public static final BitSet FOLLOW_versionRule_in_prologueRule83 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_sheetRule_in_prologueRule89 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VERSION_in_versionRule105 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_versionRule114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SHEET_in_sheetRule130 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_sheetRule132 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_sheetRule134 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_sheetRule136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_wireRule_in_componentRule148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_symbolRule_in_componentRule156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_symattrRule_in_componentRule164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_flagRule_in_componentRule171 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_windowRule_in_componentRule178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iopinRule_in_componentRule185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WIRE_in_wireRule198 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_wireRule200 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_wireRule202 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_wireRule204 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_wireRule206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLAG_in_flagRule221 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_flagRule223 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_flagRule225 = new BitSet(new long[]{0x00000000003E5D10L});
	public static final BitSet FOLLOW_INTEGER_in_flagRule228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_flagRule232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reservedWordRule_in_flagRule236 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WINDOW_in_windowRule253 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_windowRule258 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_windowRule263 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_windowRule268 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_windowRule277 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_windowRule283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IOPIN_in_iopinRule295 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_iopinRule299 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_iopinRule303 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_iopinRule311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYMBOL_in_symbolRule325 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_symbolRule334 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_symbolRule340 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_symbolRule345 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_symbolRule354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYMATTR_in_symattrRule369 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_symattrRule375 = new BitSet(new long[]{0x00000000003E5F10L});
	public static final BitSet FOLLOW_ID_in_symattrRule389 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_attrRuleNoId_in_symattrRule394 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_attrRule_in_symattrRule396 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_INTEGER_in_symattrRule406 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_symattrRule415 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reservedWordRule_in_symattrRule424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_in_attrRuleNoId445 = new BitSet(new long[]{0x00000000003F5F10L});
	public static final BitSet FOLLOW_INTEGER_in_attrRuleNoId450 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_attrRuleNoId454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_attrRuleNoId458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_attrRuleNoId462 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reservedWordRule_in_attrRuleNoId466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_attrRule478 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ASSIGN_in_attrRule484 = new BitSet(new long[]{0x00000000003F5F10L});
	public static final BitSet FOLLOW_INTEGER_in_attrRule489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_attrRule493 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_attrRule497 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_attrRule501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reservedWordRule_in_attrRule505 = new BitSet(new long[]{0x0000000000000002L});
}
