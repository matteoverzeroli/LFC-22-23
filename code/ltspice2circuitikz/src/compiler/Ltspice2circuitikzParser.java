// $ANTLR 3.5.1 C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g 2023-05-05 10:07:08

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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:41:1: parseCircuit : prologueRule ( componentRule )* EOF ;
	public final void parseCircuit() throws RecognitionException {
		initParser();
		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:43:2: ( prologueRule ( componentRule )* EOF )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:44:3: prologueRule ( componentRule )* EOF
			{
			pushFollow(FOLLOW_prologueRule_in_parseCircuit56);
			prologueRule();
			state._fsp--;

			System.out.println("Ho riconosciuto prolog rule");
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:45:3: ( componentRule )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==FLAG||LA1_0==IOPIN||(LA1_0 >= SYMATTR && LA1_0 <= SYMBOL)||(LA1_0 >= WINDOW && LA1_0 <= WIRE)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:45:3: componentRule
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
			h.endOfFileChecks();
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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:48:1: prologueRule : versionRule sheetRule ;
	public final void prologueRule() throws RecognitionException {
		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:49:2: ( versionRule sheetRule )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:49:4: versionRule sheetRule
			{
			pushFollow(FOLLOW_versionRule_in_prologueRule84);
			versionRule();
			state._fsp--;

			pushFollow(FOLLOW_sheetRule_in_prologueRule88);
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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:52:1: versionRule : v= VERSION ver= INTEGER ;
	public final void versionRule() throws RecognitionException {
		Token v=null;
		Token ver=null;

		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:53:2: (v= VERSION ver= INTEGER )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:54:3: v= VERSION ver= INTEGER
			{
			v=(Token)match(input,VERSION,FOLLOW_VERSION_in_versionRule104); 
			ver=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_versionRule113); 
			h.checkVersion(v, ver);
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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:58:1: sheetRule : s= SHEET i1= INTEGER i2= INTEGER i3= INTEGER ;
	public final void sheetRule() throws RecognitionException {
		Token s=null;
		Token i1=null;
		Token i2=null;
		Token i3=null;

		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:59:2: (s= SHEET i1= INTEGER i2= INTEGER i3= INTEGER )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:60:3: s= SHEET i1= INTEGER i2= INTEGER i3= INTEGER
			{
			s=(Token)match(input,SHEET,FOLLOW_SHEET_in_sheetRule132); 
			i1=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_sheetRule136); 
			i2=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_sheetRule140); 
			i3=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_sheetRule144); 
			h.appendRuleToStream(false, true, true, s, i1, i2, i3);
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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:63:1: componentRule : ( wireRule |symbol= symbolRule | symattrRule | flagRule | windowRule | iopinRule );
	public final void componentRule() throws RecognitionException {
		Token symbol =null;

		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:64:2: ( wireRule |symbol= symbolRule | symattrRule | flagRule | windowRule | iopinRule )
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
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:64:4: wireRule
					{
					pushFollow(FOLLOW_wireRule_in_componentRule158);
					wireRule();
					state._fsp--;

					System.out.println("sto riconoscendo wirerule");
					}
					break;
				case 2 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:65:5: symbol= symbolRule
					{
					pushFollow(FOLLOW_symbolRule_in_componentRule170);
					symbol=symbolRule();
					state._fsp--;

					System.out.println("sto riconoscendo symbol");
					}
					break;
				case 3 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:66:5: symattrRule
					{
					pushFollow(FOLLOW_symattrRule_in_componentRule178);
					symattrRule();
					state._fsp--;

					System.out.println("sto riconoscendo symattr");
					}
					break;
				case 4 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:67:5: flagRule
					{
					pushFollow(FOLLOW_flagRule_in_componentRule186);
					flagRule();
					state._fsp--;

					System.out.println("sto riconoscendo flag");
					}
					break;
				case 5 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:68:5: windowRule
					{
					pushFollow(FOLLOW_windowRule_in_componentRule193);
					windowRule();
					state._fsp--;

					System.out.println("sto riconoscendo window");
					}
					break;
				case 6 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:69:5: iopinRule
					{
					pushFollow(FOLLOW_iopinRule_in_componentRule200);
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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:71:1: wireRule : w= WIRE i1= INTEGER i2= INTEGER i3= INTEGER i4= INTEGER ;
	public final void wireRule() throws RecognitionException {
		Token w=null;
		Token i1=null;
		Token i2=null;
		Token i3=null;
		Token i4=null;

		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:72:2: (w= WIRE i1= INTEGER i2= INTEGER i3= INTEGER i4= INTEGER )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:73:3: w= WIRE i1= INTEGER i2= INTEGER i3= INTEGER i4= INTEGER
			{
			w=(Token)match(input,WIRE,FOLLOW_WIRE_in_wireRule215); 
			i1=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_wireRule219); 
			i2=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_wireRule223); 
			i3=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_wireRule227); 
			i4=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_wireRule231); 
			h.createWire(false, true, true, w, i1, i2, i3, i4);
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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:76:1: flagRule : f= FLAG i1= INTEGER i2= INTEGER v= ( INTEGER | ID | reservedWordRule ) ;
	public final void flagRule() throws RecognitionException {
		Token f=null;
		Token i1=null;
		Token i2=null;
		Token v=null;

		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:77:2: (f= FLAG i1= INTEGER i2= INTEGER v= ( INTEGER | ID | reservedWordRule ) )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:78:3: f= FLAG i1= INTEGER i2= INTEGER v= ( INTEGER | ID | reservedWordRule )
			{
			f=(Token)match(input,FLAG,FOLLOW_FLAG_in_flagRule250); 
			i1=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_flagRule254); 
			i2=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_flagRule258); 
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:78:34: ( INTEGER | ID | reservedWordRule )
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
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:78:35: INTEGER
					{
					v=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_flagRule263); 
					}
					break;
				case 2 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:78:45: ID
					{
					v=(Token)match(input,ID,FOLLOW_ID_in_flagRule267); 
					}
					break;
				case 3 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:78:50: reservedWordRule
					{
					pushFollow(FOLLOW_reservedWordRule_in_flagRule271);
					v=reservedWordRule();
					state._fsp--;

					}
					break;

			}

			h.handleFlag(false, true, true,f, i1, i2, v);
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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:81:1: windowRule : w= WINDOW i1= INTEGER i2= INTEGER i3= INTEGER id= ID i4= INTEGER ;
	public final void windowRule() throws RecognitionException {
		Token w=null;
		Token i1=null;
		Token i2=null;
		Token i3=null;
		Token id=null;
		Token i4=null;

		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:82:2: (w= WINDOW i1= INTEGER i2= INTEGER i3= INTEGER id= ID i4= INTEGER )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:83:3: w= WINDOW i1= INTEGER i2= INTEGER i3= INTEGER id= ID i4= INTEGER
			{
			w=(Token)match(input,WINDOW,FOLLOW_WINDOW_in_windowRule291); 
			i1=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_windowRule298); 
			i2=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_windowRule305); 
			i3=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_windowRule312); 
			id=(Token)match(input,ID,FOLLOW_ID_in_windowRule321); 
			i4=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_windowRule327); 
			h.checkWindowsOptions(id, w, i1, i2, i3, i4);
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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:91:1: iopinRule : i= IOPIN i1= INTEGER i2= INTEGER id= ID ;
	public final void iopinRule() throws RecognitionException {
		Token i=null;
		Token i1=null;
		Token i2=null;
		Token id=null;

		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:92:2: (i= IOPIN i1= INTEGER i2= INTEGER id= ID )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:93:3: i= IOPIN i1= INTEGER i2= INTEGER id= ID
			{
			i=(Token)match(input,IOPIN,FOLLOW_IOPIN_in_iopinRule345); 
			i1=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_iopinRule351); 
			i2=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_iopinRule357); 
			id=(Token)match(input,ID,FOLLOW_ID_in_iopinRule365); 
			h.checkIOPinAttr(id, i, i1, i2);
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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:100:1: symbolRule returns [Token symbol] : s= SYMBOL symbolType= ID i1= INTEGER i2= INTEGER rotType= ID ;
	public final Token symbolRule() throws RecognitionException {
		Token symbol = null;


		Token s=null;
		Token symbolType=null;
		Token i1=null;
		Token i2=null;
		Token rotType=null;

		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:101:2: (s= SYMBOL symbolType= ID i1= INTEGER i2= INTEGER rotType= ID )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:102:3: s= SYMBOL symbolType= ID i1= INTEGER i2= INTEGER rotType= ID
			{
			s=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_symbolRule390); 
			symbolType=(Token)match(input,ID,FOLLOW_ID_in_symbolRule399); 
			h.checkSymbolType(symbolType); symbol = symbolType;
			i1=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_symbolRule407); 
			i2=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_symbolRule414); 
			rotType=(Token)match(input,ID,FOLLOW_ID_in_symbolRule423); 
			h.checkRotType(rotType, s, symbolType, i1, i2);
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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:108:1: symattrRule : s= SYMATTR id1= ID (id2= ID ( attrRuleNoId ( attrRule[id1] )* )? |i= INTEGER |f= FLOAT |r= reservedWordRule ) ;
	public final void symattrRule() throws RecognitionException {
		Token s=null;
		Token id1=null;
		Token id2=null;
		Token i=null;
		Token f=null;
		Token r =null;

		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:109:2: (s= SYMATTR id1= ID (id2= ID ( attrRuleNoId ( attrRule[id1] )* )? |i= INTEGER |f= FLOAT |r= reservedWordRule ) )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:110:3: s= SYMATTR id1= ID (id2= ID ( attrRuleNoId ( attrRule[id1] )* )? |i= INTEGER |f= FLOAT |r= reservedWordRule )
			{
			s=(Token)match(input,SYMATTR,FOLLOW_SYMATTR_in_symattrRule441); 
			id1=(Token)match(input,ID,FOLLOW_ID_in_symattrRule445); 
			h.checkSymMattrAttr(id1, s);
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:111:4: (id2= ID ( attrRuleNoId ( attrRule[id1] )* )? |i= INTEGER |f= FLOAT |r= reservedWordRule )
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
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:111:5: id2= ID ( attrRuleNoId ( attrRule[id1] )* )?
					{
					id2=(Token)match(input,ID,FOLLOW_ID_in_symattrRule456); 
					h.checkSymMattrAttrValue(id1, id2, null);
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:111:56: ( attrRuleNoId ( attrRule[id1] )* )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==ASSIGN) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:111:57: attrRuleNoId ( attrRule[id1] )*
							{
							pushFollow(FOLLOW_attrRuleNoId_in_symattrRule461);
							attrRuleNoId();
							state._fsp--;

							// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:111:70: ( attrRule[id1] )*
							loop4:
							while (true) {
								int alt4=2;
								int LA4_0 = input.LA(1);
								if ( (LA4_0==ID) ) {
									alt4=1;
								}

								switch (alt4) {
								case 1 :
									// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:111:70: attrRule[id1]
									{
									pushFollow(FOLLOW_attrRule_in_symattrRule463);
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
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:112:6: i= INTEGER
					{
					i=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_symattrRule476); 
					h.checkSymMattrAttrValue(id1, "int", i);
					}
					break;
				case 3 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:113:6: f= FLOAT
					{
					f=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_symattrRule487); 
					h.checkSymMattrAttrValue(id1, "float", f);
					}
					break;
				case 4 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:114:6: r= reservedWordRule
					{
					pushFollow(FOLLOW_reservedWordRule_in_symattrRule500);
					r=reservedWordRule();
					state._fsp--;

					h.checkSymMattrAttrValue(id1, "reserved", r);
					}
					break;

			}

			h.appendRuleToStream(false, false, true);
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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:123:1: attrRuleNoId : a= ASSIGN v= ( INTEGER | FLOAT | STRING | ID | reservedWordRule ) ;
	public final void attrRuleNoId() throws RecognitionException {
		Token a=null;
		Token v=null;

		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:124:2: (a= ASSIGN v= ( INTEGER | FLOAT | STRING | ID | reservedWordRule ) )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:125:3: a= ASSIGN v= ( INTEGER | FLOAT | STRING | ID | reservedWordRule )
			{
			a=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_attrRuleNoId528); 
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:126:5: ( INTEGER | FLOAT | STRING | ID | reservedWordRule )
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
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:126:6: INTEGER
					{
					v=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_attrRuleNoId535); 
					}
					break;
				case 2 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:126:16: FLOAT
					{
					v=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_attrRuleNoId539); 
					}
					break;
				case 3 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:126:24: STRING
					{
					v=(Token)match(input,STRING,FOLLOW_STRING_in_attrRuleNoId543); 
					}
					break;
				case 4 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:126:33: ID
					{
					v=(Token)match(input,ID,FOLLOW_ID_in_attrRuleNoId547); 
					}
					break;
				case 5 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:126:38: reservedWordRule
					{
					pushFollow(FOLLOW_reservedWordRule_in_attrRuleNoId551);
					v=reservedWordRule();
					state._fsp--;

					}
					break;

			}

			h.appendRuleToStream(false, false, false, a, v);
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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:129:1: attrRule[Token id1] : id2= ID a= ASSIGN v= ( INTEGER | FLOAT | STRING | ID | reservedWordRule ) ;
	public final void attrRule(Token id1) throws RecognitionException {
		Token id2=null;
		Token a=null;
		Token v=null;

		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:130:2: (id2= ID a= ASSIGN v= ( INTEGER | FLOAT | STRING | ID | reservedWordRule ) )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:131:3: id2= ID a= ASSIGN v= ( INTEGER | FLOAT | STRING | ID | reservedWordRule )
			{
			id2=(Token)match(input,ID,FOLLOW_ID_in_attrRule576); 
			h.checkSymMattrAttrValue(id1, id2, null);
			a=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_attrRule584); 
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:133:5: ( INTEGER | FLOAT | STRING | ID | reservedWordRule )
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
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:133:6: INTEGER
					{
					v=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_attrRule591); 
					}
					break;
				case 2 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:133:16: FLOAT
					{
					v=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_attrRule595); 
					}
					break;
				case 3 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:133:24: STRING
					{
					v=(Token)match(input,STRING,FOLLOW_STRING_in_attrRule599); 
					}
					break;
				case 4 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:133:33: ID
					{
					v=(Token)match(input,ID,FOLLOW_ID_in_attrRule603); 
					}
					break;
				case 5 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:133:38: reservedWordRule
					{
					pushFollow(FOLLOW_reservedWordRule_in_attrRule607);
					v=reservedWordRule();
					state._fsp--;

					}
					break;

			}

			h.appendRuleToStream(false, false, false, a, v);
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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:138:1: reservedWordRule returns [Token word] : v= ( VERSION | SHEET | WIRE | FLAG | WINDOW | SYMBOL | SYMATTR | ASSIGN | IOPIN ) ;
	public final Token reservedWordRule() throws RecognitionException {
		Token word = null;


		Token v=null;

		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:139:2: (v= ( VERSION | SHEET | WIRE | FLAG | WINDOW | SYMBOL | SYMATTR | ASSIGN | IOPIN ) )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:140:3: v= ( VERSION | SHEET | WIRE | FLAG | WINDOW | SYMBOL | SYMATTR | ASSIGN | IOPIN )
			{
			v=input.LT(1);
			if ( input.LA(1)==ASSIGN||input.LA(1)==FLAG||input.LA(1)==IOPIN||input.LA(1)==SHEET||(input.LA(1) >= SYMATTR && input.LA(1) <= WIRE) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			word = v; h.appendRuleToStream(true, false, false, v);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return word;
	}
	// $ANTLR end "reservedWordRule"

	// Delegated rules



	public static final BitSet FOLLOW_prologueRule_in_parseCircuit56 = new BitSet(new long[]{0x0000000000361100L});
	public static final BitSet FOLLOW_componentRule_in_parseCircuit62 = new BitSet(new long[]{0x0000000000361100L});
	public static final BitSet FOLLOW_EOF_in_parseCircuit69 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_versionRule_in_prologueRule84 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_sheetRule_in_prologueRule88 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VERSION_in_versionRule104 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_versionRule113 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SHEET_in_sheetRule132 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_sheetRule136 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_sheetRule140 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_sheetRule144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_wireRule_in_componentRule158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_symbolRule_in_componentRule170 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_symattrRule_in_componentRule178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_flagRule_in_componentRule186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_windowRule_in_componentRule193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iopinRule_in_componentRule200 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WIRE_in_wireRule215 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_wireRule219 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_wireRule223 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_wireRule227 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_wireRule231 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLAG_in_flagRule250 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_flagRule254 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_flagRule258 = new BitSet(new long[]{0x00000000003E5D10L});
	public static final BitSet FOLLOW_INTEGER_in_flagRule263 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_flagRule267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reservedWordRule_in_flagRule271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WINDOW_in_windowRule291 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_windowRule298 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_windowRule305 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_windowRule312 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_windowRule321 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_windowRule327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IOPIN_in_iopinRule345 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_iopinRule351 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_iopinRule357 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_iopinRule365 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYMBOL_in_symbolRule390 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_symbolRule399 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_symbolRule407 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_symbolRule414 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_symbolRule423 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYMATTR_in_symattrRule441 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_symattrRule445 = new BitSet(new long[]{0x00000000003E5F10L});
	public static final BitSet FOLLOW_ID_in_symattrRule456 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_attrRuleNoId_in_symattrRule461 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_attrRule_in_symattrRule463 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_INTEGER_in_symattrRule476 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_symattrRule487 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reservedWordRule_in_symattrRule500 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_in_attrRuleNoId528 = new BitSet(new long[]{0x00000000003F5F10L});
	public static final BitSet FOLLOW_INTEGER_in_attrRuleNoId535 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_attrRuleNoId539 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_attrRuleNoId543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_attrRuleNoId547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reservedWordRule_in_attrRuleNoId551 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_attrRule576 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ASSIGN_in_attrRule584 = new BitSet(new long[]{0x00000000003F5F10L});
	public static final BitSet FOLLOW_INTEGER_in_attrRule591 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_attrRule595 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_attrRule599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_attrRule603 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reservedWordRule_in_attrRule607 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_reservedWordRule635 = new BitSet(new long[]{0x0000000000000002L});
}
