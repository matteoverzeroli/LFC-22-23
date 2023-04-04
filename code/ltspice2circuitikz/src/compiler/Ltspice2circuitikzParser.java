// $ANTLR 3.5.1 C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g 2023-04-04 19:07:31

package compiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class Ltspice2circuitikzParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGN", "DESCRIPTION", "DIGIT", 
		"EXPONENT", "FLAG", "FLOAT", "ID", "INSTNAME", "INTEGER", "IOPIN", "LETTER", 
		"SHEET", "SPECIALCHAR", "SPICELINE", "STRING", "SYMATTR", "SYMBOL", "TYPE", 
		"VALUE", "VERSION", "WINDOW", "WIRE", "WS"
	};
	public static final int EOF=-1;
	public static final int ASSIGN=4;
	public static final int DESCRIPTION=5;
	public static final int DIGIT=6;
	public static final int EXPONENT=7;
	public static final int FLAG=8;
	public static final int FLOAT=9;
	public static final int ID=10;
	public static final int INSTNAME=11;
	public static final int INTEGER=12;
	public static final int IOPIN=13;
	public static final int LETTER=14;
	public static final int SHEET=15;
	public static final int SPECIALCHAR=16;
	public static final int SPICELINE=17;
	public static final int STRING=18;
	public static final int SYMATTR=19;
	public static final int SYMBOL=20;
	public static final int TYPE=21;
	public static final int VALUE=22;
	public static final int VERSION=23;
	public static final int WINDOW=24;
	public static final int WIRE=25;
	public static final int WS=26;

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





	// $ANTLR start "parseCircuit"
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:17:1: parseCircuit : prologueRule ( componentRule )* EOF ;
	public final void parseCircuit() throws RecognitionException {
		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:17:13: ( prologueRule ( componentRule )* EOF )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:17:15: prologueRule ( componentRule )* EOF
			{
			pushFollow(FOLLOW_prologueRule_in_parseCircuit46);
			prologueRule();
			state._fsp--;

			System.out.println("Ho riconosciuto prolog rule");
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:18:3: ( componentRule )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==FLAG||LA1_0==IOPIN||(LA1_0 >= SYMATTR && LA1_0 <= SYMBOL)||(LA1_0 >= WINDOW && LA1_0 <= WIRE)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:18:3: componentRule
					{
					pushFollow(FOLLOW_componentRule_in_parseCircuit52);
					componentRule();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			System.out.println("Ho riconosciuto component rule");
			match(input,EOF,FOLLOW_EOF_in_parseCircuit59); 
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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:21:1: prologueRule : versionRule sheetRule ;
	public final void prologueRule() throws RecognitionException {
		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:22:2: ( versionRule sheetRule )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:22:4: versionRule sheetRule
			{
			pushFollow(FOLLOW_versionRule_in_prologueRule69);
			versionRule();
			state._fsp--;

			pushFollow(FOLLOW_sheetRule_in_prologueRule74);
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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:25:1: versionRule : VERSION INTEGER ;
	public final void versionRule() throws RecognitionException {
		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:26:2: ( VERSION INTEGER )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:27:3: VERSION INTEGER
			{
			match(input,VERSION,FOLLOW_VERSION_in_versionRule87); 
			match(input,INTEGER,FOLLOW_INTEGER_in_versionRule89); 
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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:30:1: sheetRule : SHEET INTEGER INTEGER INTEGER ;
	public final void sheetRule() throws RecognitionException {
		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:31:2: ( SHEET INTEGER INTEGER INTEGER )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:32:3: SHEET INTEGER INTEGER INTEGER
			{
			match(input,SHEET,FOLLOW_SHEET_in_sheetRule104); 
			match(input,INTEGER,FOLLOW_INTEGER_in_sheetRule106); 
			match(input,INTEGER,FOLLOW_INTEGER_in_sheetRule108); 
			match(input,INTEGER,FOLLOW_INTEGER_in_sheetRule110); 
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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:35:1: componentRule : ( wireRule | symbolRule | symattrRule | flagRule | windowRule | iopinRule );
	public final void componentRule() throws RecognitionException {
		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:36:2: ( wireRule | symbolRule | symattrRule | flagRule | windowRule | iopinRule )
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
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:36:4: wireRule
					{
					pushFollow(FOLLOW_wireRule_in_componentRule122);
					wireRule();
					state._fsp--;

					System.out.println("sto riconoscendo wirerule");
					}
					break;
				case 2 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:37:5: symbolRule
					{
					pushFollow(FOLLOW_symbolRule_in_componentRule130);
					symbolRule();
					state._fsp--;

					System.out.println("sto riconoscendo symbol");
					}
					break;
				case 3 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:38:5: symattrRule
					{
					pushFollow(FOLLOW_symattrRule_in_componentRule138);
					symattrRule();
					state._fsp--;

					System.out.println("sto riconoscendo symattr");
					}
					break;
				case 4 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:39:5: flagRule
					{
					pushFollow(FOLLOW_flagRule_in_componentRule145);
					flagRule();
					state._fsp--;

					System.out.println("sto riconoscendo flag");
					}
					break;
				case 5 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:40:5: windowRule
					{
					pushFollow(FOLLOW_windowRule_in_componentRule152);
					windowRule();
					state._fsp--;

					System.out.println("sto riconoscendo window");
					}
					break;
				case 6 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:41:5: iopinRule
					{
					pushFollow(FOLLOW_iopinRule_in_componentRule159);
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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:43:1: wireRule : WIRE INTEGER INTEGER INTEGER INTEGER ;
	public final void wireRule() throws RecognitionException {
		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:44:2: ( WIRE INTEGER INTEGER INTEGER INTEGER )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:45:3: WIRE INTEGER INTEGER INTEGER INTEGER
			{
			match(input,WIRE,FOLLOW_WIRE_in_wireRule172); 
			match(input,INTEGER,FOLLOW_INTEGER_in_wireRule174); 
			match(input,INTEGER,FOLLOW_INTEGER_in_wireRule176); 
			match(input,INTEGER,FOLLOW_INTEGER_in_wireRule178); 
			match(input,INTEGER,FOLLOW_INTEGER_in_wireRule180); 
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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:48:1: flagRule : FLAG INTEGER INTEGER ( INTEGER | ID | reservedWordRule ) ;
	public final void flagRule() throws RecognitionException {
		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:49:2: ( FLAG INTEGER INTEGER ( INTEGER | ID | reservedWordRule ) )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:50:3: FLAG INTEGER INTEGER ( INTEGER | ID | reservedWordRule )
			{
			match(input,FLAG,FOLLOW_FLAG_in_flagRule195); 
			match(input,INTEGER,FOLLOW_INTEGER_in_flagRule197); 
			match(input,INTEGER,FOLLOW_INTEGER_in_flagRule199); 
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:50:24: ( INTEGER | ID | reservedWordRule )
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
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:50:25: INTEGER
					{
					match(input,INTEGER,FOLLOW_INTEGER_in_flagRule202); 
					}
					break;
				case 2 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:50:35: ID
					{
					match(input,ID,FOLLOW_ID_in_flagRule206); 
					}
					break;
				case 3 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:50:40: reservedWordRule
					{
					pushFollow(FOLLOW_reservedWordRule_in_flagRule210);
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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:53:1: windowRule : WINDOW INTEGER INTEGER INTEGER ID INTEGER ;
	public final void windowRule() throws RecognitionException {
		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:54:2: ( WINDOW INTEGER INTEGER INTEGER ID INTEGER )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:55:3: WINDOW INTEGER INTEGER INTEGER ID INTEGER
			{
			match(input,WINDOW,FOLLOW_WINDOW_in_windowRule227); 
			match(input,INTEGER,FOLLOW_INTEGER_in_windowRule229); 
			match(input,INTEGER,FOLLOW_INTEGER_in_windowRule231); 
			match(input,INTEGER,FOLLOW_INTEGER_in_windowRule233); 
			match(input,ID,FOLLOW_ID_in_windowRule235); 
			match(input,INTEGER,FOLLOW_INTEGER_in_windowRule237); 
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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:57:1: iopinRule : IOPIN INTEGER INTEGER ID ;
	public final void iopinRule() throws RecognitionException {
		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:58:2: ( IOPIN INTEGER INTEGER ID )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:59:3: IOPIN INTEGER INTEGER ID
			{
			match(input,IOPIN,FOLLOW_IOPIN_in_iopinRule250); 
			match(input,INTEGER,FOLLOW_INTEGER_in_iopinRule252); 
			match(input,INTEGER,FOLLOW_INTEGER_in_iopinRule254); 
			match(input,ID,FOLLOW_ID_in_iopinRule256); 
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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:61:1: symbolRule : SYMBOL ID INTEGER INTEGER ID ;
	public final void symbolRule() throws RecognitionException {
		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:62:2: ( SYMBOL ID INTEGER INTEGER ID )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:63:3: SYMBOL ID INTEGER INTEGER ID
			{
			match(input,SYMBOL,FOLLOW_SYMBOL_in_symbolRule269); 
			match(input,ID,FOLLOW_ID_in_symbolRule271); 
			match(input,INTEGER,FOLLOW_INTEGER_in_symbolRule273); 
			match(input,INTEGER,FOLLOW_INTEGER_in_symbolRule275); 
			match(input,ID,FOLLOW_ID_in_symbolRule277); 
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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:65:1: symattrRule : SYMATTR ( INSTNAME ID | DESCRIPTION ID | TYPE ID | VALUE ( INTEGER | FLOAT | ID | reservedWordRule ) | SPICELINE ( attrRule )+ ) ;
	public final void symattrRule() throws RecognitionException {
		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:66:2: ( SYMATTR ( INSTNAME ID | DESCRIPTION ID | TYPE ID | VALUE ( INTEGER | FLOAT | ID | reservedWordRule ) | SPICELINE ( attrRule )+ ) )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:67:3: SYMATTR ( INSTNAME ID | DESCRIPTION ID | TYPE ID | VALUE ( INTEGER | FLOAT | ID | reservedWordRule ) | SPICELINE ( attrRule )+ )
			{
			match(input,SYMATTR,FOLLOW_SYMATTR_in_symattrRule290); 
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:67:11: ( INSTNAME ID | DESCRIPTION ID | TYPE ID | VALUE ( INTEGER | FLOAT | ID | reservedWordRule ) | SPICELINE ( attrRule )+ )
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
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:67:13: INSTNAME ID
					{
					match(input,INSTNAME,FOLLOW_INSTNAME_in_symattrRule294); 
					match(input,ID,FOLLOW_ID_in_symattrRule296); 
					}
					break;
				case 2 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:68:6: DESCRIPTION ID
					{
					match(input,DESCRIPTION,FOLLOW_DESCRIPTION_in_symattrRule303); 
					match(input,ID,FOLLOW_ID_in_symattrRule305); 
					}
					break;
				case 3 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:69:6: TYPE ID
					{
					match(input,TYPE,FOLLOW_TYPE_in_symattrRule313); 
					match(input,ID,FOLLOW_ID_in_symattrRule315); 
					}
					break;
				case 4 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:70:6: VALUE ( INTEGER | FLOAT | ID | reservedWordRule )
					{
					match(input,VALUE,FOLLOW_VALUE_in_symattrRule323); 
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:70:12: ( INTEGER | FLOAT | ID | reservedWordRule )
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
							// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:70:13: INTEGER
							{
							match(input,INTEGER,FOLLOW_INTEGER_in_symattrRule326); 
							}
							break;
						case 2 :
							// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:70:23: FLOAT
							{
							match(input,FLOAT,FOLLOW_FLOAT_in_symattrRule330); 
							}
							break;
						case 3 :
							// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:70:31: ID
							{
							match(input,ID,FOLLOW_ID_in_symattrRule334); 
							}
							break;
						case 4 :
							// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:70:36: reservedWordRule
							{
							pushFollow(FOLLOW_reservedWordRule_in_symattrRule338);
							reservedWordRule();
							state._fsp--;

							}
							break;

					}

					}
					break;
				case 5 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:71:6: SPICELINE ( attrRule )+
					{
					match(input,SPICELINE,FOLLOW_SPICELINE_in_symattrRule346); 
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:71:16: ( attrRule )+
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
							// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:71:16: attrRule
							{
							pushFollow(FOLLOW_attrRule_in_symattrRule348);
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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:74:1: attrRule : ID ASSIGN ( INTEGER | FLOAT | STRING | ID | reservedWordRule ) ;
	public final void attrRule() throws RecognitionException {
		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:75:2: ( ID ASSIGN ( INTEGER | FLOAT | STRING | ID | reservedWordRule ) )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:75:5: ID ASSIGN ( INTEGER | FLOAT | STRING | ID | reservedWordRule )
			{
			match(input,ID,FOLLOW_ID_in_attrRule363); 
			match(input,ASSIGN,FOLLOW_ASSIGN_in_attrRule368); 
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:77:3: ( INTEGER | FLOAT | STRING | ID | reservedWordRule )
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
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:77:4: INTEGER
					{
					match(input,INTEGER,FOLLOW_INTEGER_in_attrRule373); 
					}
					break;
				case 2 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:77:14: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_attrRule377); 
					}
					break;
				case 3 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:77:22: STRING
					{
					match(input,STRING,FOLLOW_STRING_in_attrRule381); 
					}
					break;
				case 4 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:77:31: ID
					{
					match(input,ID,FOLLOW_ID_in_attrRule385); 
					}
					break;
				case 5 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:77:36: reservedWordRule
					{
					pushFollow(FOLLOW_reservedWordRule_in_attrRule389);
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
	// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:80:1: reservedWordRule : ( VERSION | SHEET | WIRE | FLAG | WINDOW | SYMBOL | SYMATTR | ASSIGN | IOPIN );
	public final void reservedWordRule() throws RecognitionException {
		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:81:2: ( VERSION | SHEET | WIRE | FLAG | WINDOW | SYMBOL | SYMATTR | ASSIGN | IOPIN )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:
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



	public static final BitSet FOLLOW_prologueRule_in_parseCircuit46 = new BitSet(new long[]{0x0000000003182100L});
	public static final BitSet FOLLOW_componentRule_in_parseCircuit52 = new BitSet(new long[]{0x0000000003182100L});
	public static final BitSet FOLLOW_EOF_in_parseCircuit59 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_versionRule_in_prologueRule69 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_sheetRule_in_prologueRule74 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VERSION_in_versionRule87 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_INTEGER_in_versionRule89 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SHEET_in_sheetRule104 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_INTEGER_in_sheetRule106 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_INTEGER_in_sheetRule108 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_INTEGER_in_sheetRule110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_wireRule_in_componentRule122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_symbolRule_in_componentRule130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_symattrRule_in_componentRule138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_flagRule_in_componentRule145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_windowRule_in_componentRule152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iopinRule_in_componentRule159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WIRE_in_wireRule172 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_INTEGER_in_wireRule174 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_INTEGER_in_wireRule176 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_INTEGER_in_wireRule178 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_INTEGER_in_wireRule180 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLAG_in_flagRule195 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_INTEGER_in_flagRule197 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_INTEGER_in_flagRule199 = new BitSet(new long[]{0x000000000398B510L});
	public static final BitSet FOLLOW_INTEGER_in_flagRule202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_flagRule206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reservedWordRule_in_flagRule210 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WINDOW_in_windowRule227 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_INTEGER_in_windowRule229 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_INTEGER_in_windowRule231 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_INTEGER_in_windowRule233 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_windowRule235 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_INTEGER_in_windowRule237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IOPIN_in_iopinRule250 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_INTEGER_in_iopinRule252 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_INTEGER_in_iopinRule254 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_iopinRule256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYMBOL_in_symbolRule269 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_symbolRule271 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_INTEGER_in_symbolRule273 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_INTEGER_in_symbolRule275 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_symbolRule277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYMATTR_in_symattrRule290 = new BitSet(new long[]{0x0000000000620820L});
	public static final BitSet FOLLOW_INSTNAME_in_symattrRule294 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_symattrRule296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DESCRIPTION_in_symattrRule303 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_symattrRule305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_in_symattrRule313 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_symattrRule315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VALUE_in_symattrRule323 = new BitSet(new long[]{0x000000000398B710L});
	public static final BitSet FOLLOW_INTEGER_in_symattrRule326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_symattrRule330 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_symattrRule334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reservedWordRule_in_symattrRule338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPICELINE_in_symattrRule346 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_attrRule_in_symattrRule348 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_ID_in_attrRule363 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ASSIGN_in_attrRule368 = new BitSet(new long[]{0x00000000039CB710L});
	public static final BitSet FOLLOW_INTEGER_in_attrRule373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_attrRule377 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_attrRule381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_attrRule385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reservedWordRule_in_attrRule389 = new BitSet(new long[]{0x0000000000000002L});
}
