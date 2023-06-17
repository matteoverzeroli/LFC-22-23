// $ANTLR 3.5.1 C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g 2023-06-17 12:43:49

package com.omega.compiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class Ltspice2circuitikzParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "ASSIGN", "B", "C", "D", 
		"DIGIT", "E", "ERROR_TK", "EXPONENT", "F", "FLAG", "FLOAT", "G", "H", 
		"I", "ID", "INTEGER", "IOPIN", "J", "K", "L", "LETTER", "M", "N", "O", 
		"P", "Q", "R", "S", "SHEET", "SPECIALCHAR", "STRING", "SYMATTR", "SYMBOL", 
		"T", "U", "V", "VERSION", "W", "WINDOW", "WIRE", "WS", "X", "Y", "Z"
	};
	public static final int EOF=-1;
	public static final int A=4;
	public static final int ASSIGN=5;
	public static final int B=6;
	public static final int C=7;
	public static final int D=8;
	public static final int DIGIT=9;
	public static final int E=10;
	public static final int ERROR_TK=11;
	public static final int EXPONENT=12;
	public static final int F=13;
	public static final int FLAG=14;
	public static final int FLOAT=15;
	public static final int G=16;
	public static final int H=17;
	public static final int I=18;
	public static final int ID=19;
	public static final int INTEGER=20;
	public static final int IOPIN=21;
	public static final int J=22;
	public static final int K=23;
	public static final int L=24;
	public static final int LETTER=25;
	public static final int M=26;
	public static final int N=27;
	public static final int O=28;
	public static final int P=29;
	public static final int Q=30;
	public static final int R=31;
	public static final int S=32;
	public static final int SHEET=33;
	public static final int SPECIALCHAR=34;
	public static final int STRING=35;
	public static final int SYMATTR=36;
	public static final int SYMBOL=37;
	public static final int T=38;
	public static final int U=39;
	public static final int V=40;
	public static final int VERSION=41;
	public static final int W=42;
	public static final int WINDOW=43;
	public static final int WIRE=44;
	public static final int WS=45;
	public static final int X=46;
	public static final int Y=47;
	public static final int Z=48;

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
	@Override public String getGrammarFileName() { return "C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g"; }


		Handler h;
		
		
		public Handler getHandler () {
			return h;
		}
		
		// Override of syntax error handler
		public void displayRecognitionError(String[] tokenNames,
		                                     RecognitionException e) {

			String hdr = " * " + getErrorHeader(e);
			String msg = " - " + getErrorMessage(e, tokenNames);
			
			// takes the token which throw exception
			Token tk = e.token;
			
			h.handleError(tk, hdr, msg);
		}
		
		void initParser () {
			h = new Handler(input);
		}



	// $ANTLR start "parseCircuit"
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:40:1: parseCircuit : prologueRule ( componentRule )* EOF ;
	public final void parseCircuit() throws RecognitionException {
		initParser();
		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:42:2: ( prologueRule ( componentRule )* EOF )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:43:3: prologueRule ( componentRule )* EOF
			{
			pushFollow(FOLLOW_prologueRule_in_parseCircuit56);
			prologueRule();
			state._fsp--;

			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:44:3: ( componentRule )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==FLAG||LA1_0==IOPIN||(LA1_0 >= SYMATTR && LA1_0 <= SYMBOL)||(LA1_0 >= WINDOW && LA1_0 <= WIRE)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:44:3: componentRule
					{
					pushFollow(FOLLOW_componentRule_in_parseCircuit60);
					componentRule();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			match(input,EOF,FOLLOW_EOF_in_parseCircuit65); 
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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:47:1: prologueRule : versionRule sheetRule ;
	public final void prologueRule() throws RecognitionException {
		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:48:2: ( versionRule sheetRule )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:48:4: versionRule sheetRule
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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:51:1: versionRule : v= VERSION ver= INTEGER ;
	public final void versionRule() throws RecognitionException {
		Token v=null;
		Token ver=null;

		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:52:2: (v= VERSION ver= INTEGER )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:53:3: v= VERSION ver= INTEGER
			{
			v=(Token)match(input,VERSION,FOLLOW_VERSION_in_versionRule100); 
			ver=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_versionRule109); 
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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:57:1: sheetRule : s= SHEET i1= INTEGER i2= INTEGER i3= INTEGER ;
	public final void sheetRule() throws RecognitionException {
		Token s=null;
		Token i1=null;
		Token i2=null;
		Token i3=null;

		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:58:2: (s= SHEET i1= INTEGER i2= INTEGER i3= INTEGER )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:59:3: s= SHEET i1= INTEGER i2= INTEGER i3= INTEGER
			{
			s=(Token)match(input,SHEET,FOLLOW_SHEET_in_sheetRule128); 
			i1=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_sheetRule132); 
			i2=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_sheetRule136); 
			i3=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_sheetRule140); 
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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:62:1: componentRule : ( wireRule |symbol= symbolRule | symattrRule | flagRule | windowRule | iopinRule );
	public final void componentRule() throws RecognitionException {
		Token symbol =null;

		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:63:2: ( wireRule |symbol= symbolRule | symattrRule | flagRule | windowRule | iopinRule )
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
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:63:4: wireRule
					{
					pushFollow(FOLLOW_wireRule_in_componentRule154);
					wireRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:64:5: symbol= symbolRule
					{
					pushFollow(FOLLOW_symbolRule_in_componentRule164);
					symbol=symbolRule();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:65:5: symattrRule
					{
					pushFollow(FOLLOW_symattrRule_in_componentRule170);
					symattrRule();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:66:5: flagRule
					{
					pushFollow(FOLLOW_flagRule_in_componentRule176);
					flagRule();
					state._fsp--;

					}
					break;
				case 5 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:67:5: windowRule
					{
					pushFollow(FOLLOW_windowRule_in_componentRule182);
					windowRule();
					state._fsp--;

					}
					break;
				case 6 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:68:5: iopinRule
					{
					pushFollow(FOLLOW_iopinRule_in_componentRule188);
					iopinRule();
					state._fsp--;

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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:70:1: wireRule : w= WIRE i1= INTEGER i2= INTEGER i3= INTEGER i4= INTEGER ;
	public final void wireRule() throws RecognitionException {
		Token w=null;
		Token i1=null;
		Token i2=null;
		Token i3=null;
		Token i4=null;

		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:71:2: (w= WIRE i1= INTEGER i2= INTEGER i3= INTEGER i4= INTEGER )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:72:3: w= WIRE i1= INTEGER i2= INTEGER i3= INTEGER i4= INTEGER
			{
			w=(Token)match(input,WIRE,FOLLOW_WIRE_in_wireRule202); 
			i1=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_wireRule206); 
			i2=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_wireRule210); 
			i3=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_wireRule214); 
			i4=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_wireRule218); 
			h.handleWire(w, i1, i2, i3, i4);
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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:75:1: flagRule : f= FLAG i1= INTEGER i2= INTEGER v= ( INTEGER | ID | reservedWordRule ) ;
	public final void flagRule() throws RecognitionException {
		Token f=null;
		Token i1=null;
		Token i2=null;
		Token v=null;

		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:76:2: (f= FLAG i1= INTEGER i2= INTEGER v= ( INTEGER | ID | reservedWordRule ) )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:77:3: f= FLAG i1= INTEGER i2= INTEGER v= ( INTEGER | ID | reservedWordRule )
			{
			f=(Token)match(input,FLAG,FOLLOW_FLAG_in_flagRule237); 
			i1=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_flagRule241); 
			i2=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_flagRule245); 
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:77:34: ( INTEGER | ID | reservedWordRule )
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
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:77:35: INTEGER
					{
					v=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_flagRule250); 
					}
					break;
				case 2 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:77:45: ID
					{
					v=(Token)match(input,ID,FOLLOW_ID_in_flagRule254); 
					}
					break;
				case 3 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:77:50: reservedWordRule
					{
					pushFollow(FOLLOW_reservedWordRule_in_flagRule258);
					v=reservedWordRule();
					state._fsp--;

					}
					break;

			}

			h.handleFlag(f, i1, i2, v);
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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:80:1: windowRule : w= WINDOW i1= INTEGER i2= INTEGER i3= INTEGER id= ID i4= INTEGER ;
	public final void windowRule() throws RecognitionException {
		Token w=null;
		Token i1=null;
		Token i2=null;
		Token i3=null;
		Token id=null;
		Token i4=null;

		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:81:2: (w= WINDOW i1= INTEGER i2= INTEGER i3= INTEGER id= ID i4= INTEGER )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:82:3: w= WINDOW i1= INTEGER i2= INTEGER i3= INTEGER id= ID i4= INTEGER
			{
			w=(Token)match(input,WINDOW,FOLLOW_WINDOW_in_windowRule278); 
			i1=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_windowRule285); 
			i2=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_windowRule292); 
			i3=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_windowRule299); 
			id=(Token)match(input,ID,FOLLOW_ID_in_windowRule308); 
			i4=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_windowRule314); 
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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:90:1: iopinRule : i= IOPIN i1= INTEGER i2= INTEGER id= ID ;
	public final void iopinRule() throws RecognitionException {
		Token i=null;
		Token i1=null;
		Token i2=null;
		Token id=null;

		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:91:2: (i= IOPIN i1= INTEGER i2= INTEGER id= ID )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:92:3: i= IOPIN i1= INTEGER i2= INTEGER id= ID
			{
			i=(Token)match(input,IOPIN,FOLLOW_IOPIN_in_iopinRule332); 
			i1=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_iopinRule338); 
			i2=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_iopinRule344); 
			id=(Token)match(input,ID,FOLLOW_ID_in_iopinRule352); 
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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:99:1: symbolRule returns [Token symbol] : s= SYMBOL symbolType= ID i1= INTEGER i2= INTEGER rotType= ID ;
	public final Token symbolRule() throws RecognitionException {
		Token symbol = null;


		Token s=null;
		Token symbolType=null;
		Token i1=null;
		Token i2=null;
		Token rotType=null;

		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:100:2: (s= SYMBOL symbolType= ID i1= INTEGER i2= INTEGER rotType= ID )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:101:3: s= SYMBOL symbolType= ID i1= INTEGER i2= INTEGER rotType= ID
			{
			s=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_symbolRule377); 
			symbolType=(Token)match(input,ID,FOLLOW_ID_in_symbolRule386); 
			h.checkSymbolType(symbolType); symbol = symbolType;
			i1=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_symbolRule394); 
			i2=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_symbolRule401); 
			rotType=(Token)match(input,ID,FOLLOW_ID_in_symbolRule410); 
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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:107:1: symattrRule : s= SYMATTR id1= ID (id2= ID (id3= ID | ( attrRuleNoId ( attrRule[id1] )* )? ) |i= INTEGER |f= FLOAT |r= reservedWordRule ) ;
	public final void symattrRule() throws RecognitionException {
		Token s=null;
		Token id1=null;
		Token id2=null;
		Token id3=null;
		Token i=null;
		Token f=null;
		Token r =null;

		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:108:2: (s= SYMATTR id1= ID (id2= ID (id3= ID | ( attrRuleNoId ( attrRule[id1] )* )? ) |i= INTEGER |f= FLOAT |r= reservedWordRule ) )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:109:7: s= SYMATTR id1= ID (id2= ID (id3= ID | ( attrRuleNoId ( attrRule[id1] )* )? ) |i= INTEGER |f= FLOAT |r= reservedWordRule )
			{
			s=(Token)match(input,SYMATTR,FOLLOW_SYMATTR_in_symattrRule432); 
			id1=(Token)match(input,ID,FOLLOW_ID_in_symattrRule436); 
			h.checkSymMattrAttr(id1, s);
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:110:4: (id2= ID (id3= ID | ( attrRuleNoId ( attrRule[id1] )* )? ) |i= INTEGER |f= FLOAT |r= reservedWordRule )
			int alt7=4;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt7=1;
				}
				break;
			case INTEGER:
				{
				alt7=2;
				}
				break;
			case FLOAT:
				{
				alt7=3;
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
				alt7=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:110:6: id2= ID (id3= ID | ( attrRuleNoId ( attrRule[id1] )* )? )
					{
					id2=(Token)match(input,ID,FOLLOW_ID_in_symattrRule448); 
					h.checkSymMattrAttrValue(id1, id2, null);
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:111:5: (id3= ID | ( attrRuleNoId ( attrRule[id1] )* )? )
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==ID) ) {
						alt6=1;
					}
					else if ( (LA6_0==EOF||LA6_0==ASSIGN||LA6_0==FLAG||LA6_0==IOPIN||(LA6_0 >= SYMATTR && LA6_0 <= SYMBOL)||(LA6_0 >= WINDOW && LA6_0 <= WIRE)) ) {
						alt6=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 6, 0, input);
						throw nvae;
					}

					switch (alt6) {
						case 1 :
							// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:111:7: id3= ID
							{
							id3=(Token)match(input,ID,FOLLOW_ID_in_symattrRule461); 
							h.checkPolarizedCapacitor(id1, id2, id3);
							}
							break;
						case 2 :
							// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:112:7: ( attrRuleNoId ( attrRule[id1] )* )?
							{
							// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:112:7: ( attrRuleNoId ( attrRule[id1] )* )?
							int alt5=2;
							int LA5_0 = input.LA(1);
							if ( (LA5_0==ASSIGN) ) {
								alt5=1;
							}
							switch (alt5) {
								case 1 :
									// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:112:8: attrRuleNoId ( attrRule[id1] )*
									{
									pushFollow(FOLLOW_attrRuleNoId_in_symattrRule472);
									attrRuleNoId();
									state._fsp--;

									// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:112:21: ( attrRule[id1] )*
									loop4:
									while (true) {
										int alt4=2;
										int LA4_0 = input.LA(1);
										if ( (LA4_0==ID) ) {
											alt4=1;
										}

										switch (alt4) {
										case 1 :
											// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:112:21: attrRule[id1]
											{
											pushFollow(FOLLOW_attrRule_in_symattrRule474);
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

					}

					}
					break;
				case 2 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:113:6: i= INTEGER
					{
					i=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_symattrRule488); 
					h.checkSymMattrAttrValue(id1, "int", i);
					}
					break;
				case 3 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:114:6: f= FLOAT
					{
					f=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_symattrRule499); 
					h.checkSymMattrAttrValue(id1, "float", f);
					}
					break;
				case 4 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:115:6: r= reservedWordRule
					{
					pushFollow(FOLLOW_reservedWordRule_in_symattrRule512);
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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:124:1: attrRuleNoId : a= ASSIGN v= ( INTEGER | FLOAT | STRING | ID | reservedWordRule ) ;
	public final void attrRuleNoId() throws RecognitionException {
		Token a=null;
		Token v=null;

		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:125:2: (a= ASSIGN v= ( INTEGER | FLOAT | STRING | ID | reservedWordRule ) )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:126:3: a= ASSIGN v= ( INTEGER | FLOAT | STRING | ID | reservedWordRule )
			{
			a=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_attrRuleNoId539); 
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:127:5: ( INTEGER | FLOAT | STRING | ID | reservedWordRule )
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
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:127:6: INTEGER
					{
					v=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_attrRuleNoId546); 
					}
					break;
				case 2 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:127:16: FLOAT
					{
					v=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_attrRuleNoId550); 
					}
					break;
				case 3 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:127:24: STRING
					{
					v=(Token)match(input,STRING,FOLLOW_STRING_in_attrRuleNoId554); 
					}
					break;
				case 4 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:127:33: ID
					{
					v=(Token)match(input,ID,FOLLOW_ID_in_attrRuleNoId558); 
					}
					break;
				case 5 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:127:38: reservedWordRule
					{
					pushFollow(FOLLOW_reservedWordRule_in_attrRuleNoId562);
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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:130:1: attrRule[Token id1] : id2= ID a= ASSIGN v= ( INTEGER | FLOAT | STRING | ID | reservedWordRule ) ;
	public final void attrRule(Token id1) throws RecognitionException {
		Token id2=null;
		Token a=null;
		Token v=null;

		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:131:2: (id2= ID a= ASSIGN v= ( INTEGER | FLOAT | STRING | ID | reservedWordRule ) )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:132:3: id2= ID a= ASSIGN v= ( INTEGER | FLOAT | STRING | ID | reservedWordRule )
			{
			id2=(Token)match(input,ID,FOLLOW_ID_in_attrRule587); 
			h.checkSymMattrAttrValue(id1, id2, null);
			a=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_attrRule595); 
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:134:5: ( INTEGER | FLOAT | STRING | ID | reservedWordRule )
			int alt9=5;
			switch ( input.LA(1) ) {
			case INTEGER:
				{
				alt9=1;
				}
				break;
			case FLOAT:
				{
				alt9=2;
				}
				break;
			case STRING:
				{
				alt9=3;
				}
				break;
			case ID:
				{
				alt9=4;
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
				alt9=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:134:6: INTEGER
					{
					v=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_attrRule602); 
					}
					break;
				case 2 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:134:16: FLOAT
					{
					v=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_attrRule606); 
					}
					break;
				case 3 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:134:24: STRING
					{
					v=(Token)match(input,STRING,FOLLOW_STRING_in_attrRule610); 
					}
					break;
				case 4 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:134:33: ID
					{
					v=(Token)match(input,ID,FOLLOW_ID_in_attrRule614); 
					}
					break;
				case 5 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:134:38: reservedWordRule
					{
					pushFollow(FOLLOW_reservedWordRule_in_attrRule618);
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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:139:1: reservedWordRule returns [Token word] : v= ( VERSION | SHEET | WIRE | FLAG | WINDOW | SYMBOL | SYMATTR | ASSIGN | IOPIN ) ;
	public final Token reservedWordRule() throws RecognitionException {
		Token word = null;


		Token v=null;

		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:140:2: (v= ( VERSION | SHEET | WIRE | FLAG | WINDOW | SYMBOL | SYMATTR | ASSIGN | IOPIN ) )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\com\\omega\\compiler\\Ltspice2circuitikz.g:141:3: v= ( VERSION | SHEET | WIRE | FLAG | WINDOW | SYMBOL | SYMATTR | ASSIGN | IOPIN )
			{
			v=input.LT(1);
			if ( input.LA(1)==ASSIGN||input.LA(1)==FLAG||input.LA(1)==IOPIN||input.LA(1)==SHEET||(input.LA(1) >= SYMATTR && input.LA(1) <= SYMBOL)||input.LA(1)==VERSION||(input.LA(1) >= WINDOW && input.LA(1) <= WIRE) ) {
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



	public static final BitSet FOLLOW_prologueRule_in_parseCircuit56 = new BitSet(new long[]{0x0000183000204000L});
	public static final BitSet FOLLOW_componentRule_in_parseCircuit60 = new BitSet(new long[]{0x0000183000204000L});
	public static final BitSet FOLLOW_EOF_in_parseCircuit65 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_versionRule_in_prologueRule80 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_sheetRule_in_prologueRule84 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VERSION_in_versionRule100 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_INTEGER_in_versionRule109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SHEET_in_sheetRule128 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_INTEGER_in_sheetRule132 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_INTEGER_in_sheetRule136 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_INTEGER_in_sheetRule140 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_wireRule_in_componentRule154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_symbolRule_in_componentRule164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_symattrRule_in_componentRule170 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_flagRule_in_componentRule176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_windowRule_in_componentRule182 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iopinRule_in_componentRule188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WIRE_in_wireRule202 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_INTEGER_in_wireRule206 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_INTEGER_in_wireRule210 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_INTEGER_in_wireRule214 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_INTEGER_in_wireRule218 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLAG_in_flagRule237 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_INTEGER_in_flagRule241 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_INTEGER_in_flagRule245 = new BitSet(new long[]{0x00001A3200384020L});
	public static final BitSet FOLLOW_INTEGER_in_flagRule250 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_flagRule254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reservedWordRule_in_flagRule258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WINDOW_in_windowRule278 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_INTEGER_in_windowRule285 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_INTEGER_in_windowRule292 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_INTEGER_in_windowRule299 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_windowRule308 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_INTEGER_in_windowRule314 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IOPIN_in_iopinRule332 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_INTEGER_in_iopinRule338 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_INTEGER_in_iopinRule344 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_iopinRule352 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYMBOL_in_symbolRule377 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_symbolRule386 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_INTEGER_in_symbolRule394 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_INTEGER_in_symbolRule401 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_symbolRule410 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYMATTR_in_symattrRule432 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_symattrRule436 = new BitSet(new long[]{0x00001A320038C020L});
	public static final BitSet FOLLOW_ID_in_symattrRule448 = new BitSet(new long[]{0x0000000000080022L});
	public static final BitSet FOLLOW_ID_in_symattrRule461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attrRuleNoId_in_symattrRule472 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_attrRule_in_symattrRule474 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_INTEGER_in_symattrRule488 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_symattrRule499 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reservedWordRule_in_symattrRule512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_in_attrRuleNoId539 = new BitSet(new long[]{0x00001A3A0038C020L});
	public static final BitSet FOLLOW_INTEGER_in_attrRuleNoId546 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_attrRuleNoId550 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_attrRuleNoId554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_attrRuleNoId558 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reservedWordRule_in_attrRuleNoId562 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_attrRule587 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_attrRule595 = new BitSet(new long[]{0x00001A3A0038C020L});
	public static final BitSet FOLLOW_INTEGER_in_attrRule602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_attrRule606 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_attrRule610 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_attrRule614 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reservedWordRule_in_attrRule618 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_reservedWordRule646 = new BitSet(new long[]{0x0000000000000002L});
}
