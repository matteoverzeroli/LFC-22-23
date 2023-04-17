// $ANTLR 3.5.1 C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g 2023-04-17 19:32:33

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

			h.checkMandatoryAttribute(); System.out.println("Ho riconosciuto component rule"); 
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
			pushFollow(FOLLOW_versionRule_in_prologueRule80);
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
	// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:55:1: versionRule : v= VERSION ver= INTEGER ;
	public final void versionRule() throws RecognitionException {
		Token v=null;
		Token ver=null;

		try {
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:56:2: (v= VERSION ver= INTEGER )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:57:3: v= VERSION ver= INTEGER
			{
			v=(Token)match(input,VERSION,FOLLOW_VERSION_in_versionRule100); 
			ver=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_versionRule109); 
			 
						h.checkVersion(ver); 
						h.appendRuleToStream(v.getText()+" "+ver.getText()+'\n');
					
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
	// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:65:1: sheetRule : s= SHEET i1= INTEGER i2= INTEGER i3= INTEGER ;
	public final void sheetRule() throws RecognitionException {
		Token s=null;
		Token i1=null;
		Token i2=null;
		Token i3=null;

		try {
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:66:2: (s= SHEET i1= INTEGER i2= INTEGER i3= INTEGER )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:67:3: s= SHEET i1= INTEGER i2= INTEGER i3= INTEGER
			{
			s=(Token)match(input,SHEET,FOLLOW_SHEET_in_sheetRule130); 
			i1=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_sheetRule134); 
			i2=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_sheetRule138); 
			i3=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_sheetRule142); 
			h.appendRuleToStream(s.getText()+" "+i1.getText()+" "+i2.getText()+" "+i3.getText()+'\n');
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
	// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:71:1: componentRule : ( wireRule |symbol= symbolRule | symattrRule | flagRule | windowRule | iopinRule );
	public final void componentRule() throws RecognitionException {
		Token symbol =null;

		try {
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:72:2: ( wireRule |symbol= symbolRule | symattrRule | flagRule | windowRule | iopinRule )
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
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:72:4: wireRule
					{
					pushFollow(FOLLOW_wireRule_in_componentRule158);
					wireRule();
					state._fsp--;

					System.out.println("sto riconoscendo wirerule");
					}
					break;
				case 2 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:73:5: symbol= symbolRule
					{
					pushFollow(FOLLOW_symbolRule_in_componentRule170);
					symbol=symbolRule();
					state._fsp--;

					System.out.println("sto riconoscendo symbol"); h.checkMandatoryAttribute(); h.setLastSymbol(symbol);
					}
					break;
				case 3 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:74:5: symattrRule
					{
					pushFollow(FOLLOW_symattrRule_in_componentRule178);
					symattrRule();
					state._fsp--;

					System.out.println("sto riconoscendo symattr");
					}
					break;
				case 4 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:75:5: flagRule
					{
					pushFollow(FOLLOW_flagRule_in_componentRule186);
					flagRule();
					state._fsp--;

					System.out.println("sto riconoscendo flag");
					}
					break;
				case 5 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:76:5: windowRule
					{
					pushFollow(FOLLOW_windowRule_in_componentRule193);
					windowRule();
					state._fsp--;

					System.out.println("sto riconoscendo window");
					}
					break;
				case 6 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:77:5: iopinRule
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
	// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:79:1: wireRule : w= WIRE i1= INTEGER i2= INTEGER i3= INTEGER i4= INTEGER ;
	public final void wireRule() throws RecognitionException {
		Token w=null;
		Token i1=null;
		Token i2=null;
		Token i3=null;
		Token i4=null;

		try {
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:80:2: (w= WIRE i1= INTEGER i2= INTEGER i3= INTEGER i4= INTEGER )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:81:3: w= WIRE i1= INTEGER i2= INTEGER i3= INTEGER i4= INTEGER
			{
			w=(Token)match(input,WIRE,FOLLOW_WIRE_in_wireRule215); 
			i1=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_wireRule219); 
			i2=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_wireRule223); 
			i3=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_wireRule227); 
			i4=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_wireRule231); 
			h.appendRuleToStream(w.getText()+" "+i1.getText()+" "+i2.getText()+" "+i3.getText()+" "+i4.getText()+'\n');
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
	// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:85:1: flagRule : f= FLAG i1= INTEGER i2= INTEGER v= ( INTEGER | ID | reservedWordRule ) ;
	public final void flagRule() throws RecognitionException {
		Token f=null;
		Token i1=null;
		Token i2=null;
		Token v=null;

		try {
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:86:2: (f= FLAG i1= INTEGER i2= INTEGER v= ( INTEGER | ID | reservedWordRule ) )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:87:3: f= FLAG i1= INTEGER i2= INTEGER v= ( INTEGER | ID | reservedWordRule )
			{
			f=(Token)match(input,FLAG,FOLLOW_FLAG_in_flagRule252); 
			i1=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_flagRule256); 
			i2=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_flagRule260); 
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:87:34: ( INTEGER | ID | reservedWordRule )
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
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:87:35: INTEGER
					{
					v=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_flagRule265); 
					}
					break;
				case 2 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:87:45: ID
					{
					v=(Token)match(input,ID,FOLLOW_ID_in_flagRule269); 
					}
					break;
				case 3 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:87:50: reservedWordRule
					{
					pushFollow(FOLLOW_reservedWordRule_in_flagRule273);
					reservedWordRule();
					state._fsp--;

					}
					break;

			}

			h.appendRuleToStream(f.getText()+" "+i1.getText()+" "+i2.getText()+" "+v.getText()+'\n');
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
	// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:91:1: windowRule : w= WINDOW i1= INTEGER i2= INTEGER i3= INTEGER id= ID i4= INTEGER ;
	public final void windowRule() throws RecognitionException {
		Token w=null;
		Token i1=null;
		Token i2=null;
		Token i3=null;
		Token id=null;
		Token i4=null;

		try {
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:92:2: (w= WINDOW i1= INTEGER i2= INTEGER i3= INTEGER id= ID i4= INTEGER )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:93:3: w= WINDOW i1= INTEGER i2= INTEGER i3= INTEGER id= ID i4= INTEGER
			{
			w=(Token)match(input,WINDOW,FOLLOW_WINDOW_in_windowRule296); 
			i1=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_windowRule303); 
			i2=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_windowRule310); 
			i3=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_windowRule317); 
			id=(Token)match(input,ID,FOLLOW_ID_in_windowRule326); 
			h.checkWindowsOptions(id);
			i4=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_windowRule334); 
			h.appendRuleToStream(w.getText()+" "+i1.getText()+" "+i2.getText()+" "+i3.getText()+" "+id.getText()+" "+i4.getText()+'\n');
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
	// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:101:1: iopinRule : i= IOPIN i1= INTEGER i2= INTEGER id= ID ;
	public final void iopinRule() throws RecognitionException {
		Token i=null;
		Token i1=null;
		Token i2=null;
		Token id=null;

		try {
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:102:2: (i= IOPIN i1= INTEGER i2= INTEGER id= ID )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:103:3: i= IOPIN i1= INTEGER i2= INTEGER id= ID
			{
			i=(Token)match(input,IOPIN,FOLLOW_IOPIN_in_iopinRule352); 
			i1=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_iopinRule358); 
			i2=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_iopinRule364); 
			id=(Token)match(input,ID,FOLLOW_ID_in_iopinRule372); 

						h.checkIOPinAttr(id);
						h.appendRuleToStream(i.getText()+" "+i1.getText()+" "+i2.getText()+" "+id.getText()+'\n');
					
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
	// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:113:1: symbolRule returns [Token symbol] : s= SYMBOL symbolType= ID i1= INTEGER i2= INTEGER rotType= ID ;
	public final Token symbolRule() throws RecognitionException {
		Token symbol = null;


		Token s=null;
		Token symbolType=null;
		Token i1=null;
		Token i2=null;
		Token rotType=null;

		try {
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:114:2: (s= SYMBOL symbolType= ID i1= INTEGER i2= INTEGER rotType= ID )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:115:3: s= SYMBOL symbolType= ID i1= INTEGER i2= INTEGER rotType= ID
			{
			s=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_symbolRule397); 
			symbolType=(Token)match(input,ID,FOLLOW_ID_in_symbolRule406); 
			h.checkSymbolType(symbolType); symbol = symbolType;
			i1=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_symbolRule414); 
			i2=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_symbolRule421); 
			rotType=(Token)match(input,ID,FOLLOW_ID_in_symbolRule430); 

						h.checkRotType(rotType);
						h.appendRuleToStream(s.getText()+" "+symbolType.getText()+" "+i1.getText()+" "+i2.getText()+" "+rotType.getText()+'\n');
					
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
	// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:125:1: symattrRule : s= SYMATTR id1= ID (id2= ID ( attrRuleNoId ( attrRule[$id1] )* )? |i= INTEGER |f= FLOAT |r= reservedWordRule ) ;
	public final void symattrRule() throws RecognitionException {
		Token s=null;
		Token id1=null;
		Token id2=null;
		Token i=null;
		Token f=null;

		try {
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:126:2: (s= SYMATTR id1= ID (id2= ID ( attrRuleNoId ( attrRule[$id1] )* )? |i= INTEGER |f= FLOAT |r= reservedWordRule ) )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:127:3: s= SYMATTR id1= ID (id2= ID ( attrRuleNoId ( attrRule[$id1] )* )? |i= INTEGER |f= FLOAT |r= reservedWordRule )
			{
			s=(Token)match(input,SYMATTR,FOLLOW_SYMATTR_in_symattrRule450); 
			id1=(Token)match(input,ID,FOLLOW_ID_in_symattrRule454); 
			h.checkSymMattrAttr(id1);h.appendRuleToStream(s.getText()+" "+id1.getText());
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:128:4: (id2= ID ( attrRuleNoId ( attrRule[$id1] )* )? |i= INTEGER |f= FLOAT |r= reservedWordRule )
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
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:128:5: id2= ID ( attrRuleNoId ( attrRule[$id1] )* )?
					{
					id2=(Token)match(input,ID,FOLLOW_ID_in_symattrRule465); 
					h.checkSymMattrAttrValue(id1, id2);h.appendRuleToStream(" "+id2.getText());
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:128:92: ( attrRuleNoId ( attrRule[$id1] )* )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==ASSIGN) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:128:93: attrRuleNoId ( attrRule[$id1] )*
							{
							pushFollow(FOLLOW_attrRuleNoId_in_symattrRule470);
							attrRuleNoId();
							state._fsp--;

							// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:128:106: ( attrRule[$id1] )*
							loop4:
							while (true) {
								int alt4=2;
								int LA4_0 = input.LA(1);
								if ( (LA4_0==ID) ) {
									alt4=1;
								}

								switch (alt4) {
								case 1 :
									// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:128:106: attrRule[$id1]
									{
									pushFollow(FOLLOW_attrRule_in_symattrRule472);
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
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:129:6: i= INTEGER
					{
					i=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_symattrRule485); 
					h.checkSymMattrAttrValue(id1, "int");h.appendRuleToStream(i.getText());
					}
					break;
				case 3 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:130:6: f= FLOAT
					{
					f=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_symattrRule496); 
					h.checkSymMattrAttrValue(id1, "float");h.appendRuleToStream(f.getText());
					}
					break;
				case 4 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:131:6: r= reservedWordRule
					{
					pushFollow(FOLLOW_reservedWordRule_in_symattrRule507);
					reservedWordRule();
					state._fsp--;

					h.checkSymMattrAttrValue(id1, "reserved");
					}
					break;

			}

			h.appendRuleToStream("\n");
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
	// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:139:1: attrRuleNoId : a= ASSIGN v= ( INTEGER | FLOAT | STRING | ID | reservedWordRule ) ;
	public final void attrRuleNoId() throws RecognitionException {
		Token a=null;
		Token v=null;

		try {
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:140:2: (a= ASSIGN v= ( INTEGER | FLOAT | STRING | ID | reservedWordRule ) )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:141:3: a= ASSIGN v= ( INTEGER | FLOAT | STRING | ID | reservedWordRule )
			{
			a=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_attrRuleNoId532); 
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:142:5: ( INTEGER | FLOAT | STRING | ID | reservedWordRule )
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
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:142:6: INTEGER
					{
					v=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_attrRuleNoId539); 
					}
					break;
				case 2 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:142:16: FLOAT
					{
					v=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_attrRuleNoId543); 
					}
					break;
				case 3 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:142:24: STRING
					{
					v=(Token)match(input,STRING,FOLLOW_STRING_in_attrRuleNoId547); 
					}
					break;
				case 4 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:142:33: ID
					{
					v=(Token)match(input,ID,FOLLOW_ID_in_attrRuleNoId551); 
					}
					break;
				case 5 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:142:38: reservedWordRule
					{
					pushFollow(FOLLOW_reservedWordRule_in_attrRuleNoId555);
					reservedWordRule();
					state._fsp--;

					}
					break;

			}

			h.appendRuleToStream(" "+a.getText()+" "+v.getText());
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
	// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:145:1: attrRule[Token id1] : id2= ID a= ASSIGN v= ( INTEGER | FLOAT | STRING | ID | reservedWordRule ) ;
	public final void attrRule(Token id1) throws RecognitionException {
		Token id2=null;
		Token a=null;
		Token v=null;

		try {
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:146:2: (id2= ID a= ASSIGN v= ( INTEGER | FLOAT | STRING | ID | reservedWordRule ) )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:147:3: id2= ID a= ASSIGN v= ( INTEGER | FLOAT | STRING | ID | reservedWordRule )
			{
			id2=(Token)match(input,ID,FOLLOW_ID_in_attrRule580); 
			h.checkSymMattrAttrValue(id1, id2);
			a=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_attrRule589); 
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:149:5: ( INTEGER | FLOAT | STRING | ID | reservedWordRule )
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
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:149:6: INTEGER
					{
					v=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_attrRule596); 
					}
					break;
				case 2 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:149:16: FLOAT
					{
					v=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_attrRule600); 
					}
					break;
				case 3 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:149:24: STRING
					{
					v=(Token)match(input,STRING,FOLLOW_STRING_in_attrRule604); 
					}
					break;
				case 4 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:149:33: ID
					{
					v=(Token)match(input,ID,FOLLOW_ID_in_attrRule608); 
					}
					break;
				case 5 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:149:38: reservedWordRule
					{
					pushFollow(FOLLOW_reservedWordRule_in_attrRule612);
					reservedWordRule();
					state._fsp--;

					}
					break;

			}

			h.appendRuleToStream(id2.getText()+" "+a.getText()+" "+v.getText());
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
	// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:154:1: reservedWordRule : v= ( VERSION | SHEET | WIRE | FLAG | WINDOW | SYMBOL | SYMATTR | ASSIGN | IOPIN ) ;
	public final void reservedWordRule() throws RecognitionException {
		Token v=null;

		try {
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:155:2: (v= ( VERSION | SHEET | WIRE | FLAG | WINDOW | SYMBOL | SYMATTR | ASSIGN | IOPIN ) )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:156:3: v= ( VERSION | SHEET | WIRE | FLAG | WINDOW | SYMBOL | SYMATTR | ASSIGN | IOPIN )
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
			h.appendRuleToStream(v.getText());
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
	public static final BitSet FOLLOW_versionRule_in_prologueRule80 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_sheetRule_in_prologueRule84 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VERSION_in_versionRule100 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_versionRule109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SHEET_in_sheetRule130 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_sheetRule134 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_sheetRule138 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_sheetRule142 = new BitSet(new long[]{0x0000000000000002L});
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
	public static final BitSet FOLLOW_FLAG_in_flagRule252 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_flagRule256 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_flagRule260 = new BitSet(new long[]{0x00000000003E5D10L});
	public static final BitSet FOLLOW_INTEGER_in_flagRule265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_flagRule269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reservedWordRule_in_flagRule273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WINDOW_in_windowRule296 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_windowRule303 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_windowRule310 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_windowRule317 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_windowRule326 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_windowRule334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IOPIN_in_iopinRule352 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_iopinRule358 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_iopinRule364 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_iopinRule372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYMBOL_in_symbolRule397 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_symbolRule406 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_symbolRule414 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INTEGER_in_symbolRule421 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_symbolRule430 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYMATTR_in_symattrRule450 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_symattrRule454 = new BitSet(new long[]{0x00000000003E5F10L});
	public static final BitSet FOLLOW_ID_in_symattrRule465 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_attrRuleNoId_in_symattrRule470 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_attrRule_in_symattrRule472 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_INTEGER_in_symattrRule485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_symattrRule496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reservedWordRule_in_symattrRule507 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_in_attrRuleNoId532 = new BitSet(new long[]{0x00000000003F5F10L});
	public static final BitSet FOLLOW_INTEGER_in_attrRuleNoId539 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_attrRuleNoId543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_attrRuleNoId547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_attrRuleNoId551 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reservedWordRule_in_attrRuleNoId555 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_attrRule580 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ASSIGN_in_attrRule589 = new BitSet(new long[]{0x00000000003F5F10L});
	public static final BitSet FOLLOW_INTEGER_in_attrRule596 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_attrRule600 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_attrRule604 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_attrRule608 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reservedWordRule_in_attrRule612 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_reservedWordRule636 = new BitSet(new long[]{0x0000000000000002L});
}
