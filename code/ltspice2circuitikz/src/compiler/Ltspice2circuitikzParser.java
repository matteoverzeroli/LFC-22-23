// $ANTLR 3.5.1 C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g 2023-04-01 21:19:31

package compiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class Ltspice2circuitikzParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGN", "CAPATTRIBUTE", "DESCRIPTION", 
		"DESCRIPTIONATTR", "DIGIT", "EXPONENT", "FLAG", "FLOAT", "ID", "INDATTRIBUTE", 
		"INSTNAME", "INTEGER", "IOPIN", "IOPINATT", "LETTER", "MIRRORTYPE", "PARATTRIBUTE", 
		"RATTRIBUTE", "ROTTYPE", "SHEET", "SPICELINE", "STRING", "SYMATTR", "SYMBOL", 
		"SYMBOLTYPE", "TYPE", "VALUE", "VERSION", "WINDOW", "WINDOWOPTION", "WIRE", 
		"WS"
	};
	public static final int EOF=-1;
	public static final int ASSIGN=4;
	public static final int CAPATTRIBUTE=5;
	public static final int DESCRIPTION=6;
	public static final int DESCRIPTIONATTR=7;
	public static final int DIGIT=8;
	public static final int EXPONENT=9;
	public static final int FLAG=10;
	public static final int FLOAT=11;
	public static final int ID=12;
	public static final int INDATTRIBUTE=13;
	public static final int INSTNAME=14;
	public static final int INTEGER=15;
	public static final int IOPIN=16;
	public static final int IOPINATT=17;
	public static final int LETTER=18;
	public static final int MIRRORTYPE=19;
	public static final int PARATTRIBUTE=20;
	public static final int RATTRIBUTE=21;
	public static final int ROTTYPE=22;
	public static final int SHEET=23;
	public static final int SPICELINE=24;
	public static final int STRING=25;
	public static final int SYMATTR=26;
	public static final int SYMBOL=27;
	public static final int SYMBOLTYPE=28;
	public static final int TYPE=29;
	public static final int VALUE=30;
	public static final int VERSION=31;
	public static final int WINDOW=32;
	public static final int WINDOWOPTION=33;
	public static final int WIRE=34;
	public static final int WS=35;

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





	// $ANTLR start "parseCircuit"
	// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:17:1: parseCircuit : prologueRule ( componentRule )* ;
	public final void parseCircuit() throws RecognitionException {
		try {
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:17:13: ( prologueRule ( componentRule )* )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:17:15: prologueRule ( componentRule )*
			{
			pushFollow(FOLLOW_prologueRule_in_parseCircuit46);
			prologueRule();
			state._fsp--;

			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:18:3: ( componentRule )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==FLAG||(LA1_0 >= SYMATTR && LA1_0 <= SYMBOL)||LA1_0==WINDOW||LA1_0==WIRE) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:18:3: componentRule
					{
					pushFollow(FOLLOW_componentRule_in_parseCircuit50);
					componentRule();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			System.out.println("Ho riconosciuto component rule");
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
	// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:19:1: prologueRule : versionRule sheetRule ;
	public final void prologueRule() throws RecognitionException {
		try {
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:20:2: ( versionRule sheetRule )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:20:4: versionRule sheetRule
			{
			pushFollow(FOLLOW_versionRule_in_prologueRule61);
			versionRule();
			state._fsp--;

			pushFollow(FOLLOW_sheetRule_in_prologueRule66);
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
	// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:23:1: versionRule : VERSION INTEGER ;
	public final void versionRule() throws RecognitionException {
		try {
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:24:2: ( VERSION INTEGER )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:25:3: VERSION INTEGER
			{
			match(input,VERSION,FOLLOW_VERSION_in_versionRule79); 
			match(input,INTEGER,FOLLOW_INTEGER_in_versionRule81); 
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
	// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:28:1: sheetRule : SHEET INTEGER INTEGER INTEGER ;
	public final void sheetRule() throws RecognitionException {
		try {
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:29:2: ( SHEET INTEGER INTEGER INTEGER )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:30:3: SHEET INTEGER INTEGER INTEGER
			{
			match(input,SHEET,FOLLOW_SHEET_in_sheetRule96); 
			match(input,INTEGER,FOLLOW_INTEGER_in_sheetRule98); 
			match(input,INTEGER,FOLLOW_INTEGER_in_sheetRule100); 
			match(input,INTEGER,FOLLOW_INTEGER_in_sheetRule102); 
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
	// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:33:1: componentRule : ( wireRule | symbolRule | symattrRule | flagRule | windowRule );
	public final void componentRule() throws RecognitionException {
		try {
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:34:2: ( wireRule | symbolRule | symattrRule | flagRule | windowRule )
			int alt2=5;
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
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:34:4: wireRule
					{
					pushFollow(FOLLOW_wireRule_in_componentRule114);
					wireRule();
					state._fsp--;

					System.out.println("sto riconoscendo wirerule");
					}
					break;
				case 2 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:35:5: symbolRule
					{
					pushFollow(FOLLOW_symbolRule_in_componentRule122);
					symbolRule();
					state._fsp--;

					System.out.println("sto riconoscendo symbol");
					}
					break;
				case 3 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:36:5: symattrRule
					{
					pushFollow(FOLLOW_symattrRule_in_componentRule130);
					symattrRule();
					state._fsp--;

					System.out.println("sto riconoscendo symattr");
					}
					break;
				case 4 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:37:5: flagRule
					{
					pushFollow(FOLLOW_flagRule_in_componentRule137);
					flagRule();
					state._fsp--;

					System.out.println("sto riconoscendo flag");
					}
					break;
				case 5 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:38:5: windowRule
					{
					pushFollow(FOLLOW_windowRule_in_componentRule144);
					windowRule();
					state._fsp--;

					System.out.println("sto riconoscendo window");
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
	// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:40:1: wireRule : WIRE INTEGER INTEGER INTEGER INTEGER ;
	public final void wireRule() throws RecognitionException {
		try {
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:41:2: ( WIRE INTEGER INTEGER INTEGER INTEGER )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:42:3: WIRE INTEGER INTEGER INTEGER INTEGER
			{
			match(input,WIRE,FOLLOW_WIRE_in_wireRule157); 
			match(input,INTEGER,FOLLOW_INTEGER_in_wireRule159); 
			match(input,INTEGER,FOLLOW_INTEGER_in_wireRule161); 
			match(input,INTEGER,FOLLOW_INTEGER_in_wireRule163); 
			match(input,INTEGER,FOLLOW_INTEGER_in_wireRule165); 
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
	// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:45:1: flagRule : FLAG INTEGER INTEGER ( INTEGER | ID ) ;
	public final void flagRule() throws RecognitionException {
		try {
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:46:2: ( FLAG INTEGER INTEGER ( INTEGER | ID ) )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:47:3: FLAG INTEGER INTEGER ( INTEGER | ID )
			{
			match(input,FLAG,FOLLOW_FLAG_in_flagRule180); 
			match(input,INTEGER,FOLLOW_INTEGER_in_flagRule182); 
			match(input,INTEGER,FOLLOW_INTEGER_in_flagRule184); 
			if ( input.LA(1)==ID||input.LA(1)==INTEGER ) {
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
	// $ANTLR end "flagRule"



	// $ANTLR start "windowRule"
	// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:50:1: windowRule : WINDOW INTEGER INTEGER INTEGER WINDOWOPTION INTEGER ;
	public final void windowRule() throws RecognitionException {
		try {
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:51:2: ( WINDOW INTEGER INTEGER INTEGER WINDOWOPTION INTEGER )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:52:3: WINDOW INTEGER INTEGER INTEGER WINDOWOPTION INTEGER
			{
			match(input,WINDOW,FOLLOW_WINDOW_in_windowRule208); 
			match(input,INTEGER,FOLLOW_INTEGER_in_windowRule210); 
			match(input,INTEGER,FOLLOW_INTEGER_in_windowRule212); 
			match(input,INTEGER,FOLLOW_INTEGER_in_windowRule214); 
			match(input,WINDOWOPTION,FOLLOW_WINDOWOPTION_in_windowRule216); 
			match(input,INTEGER,FOLLOW_INTEGER_in_windowRule218); 
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



	// $ANTLR start "symbolRule"
	// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:55:1: symbolRule : SYMBOL SYMBOLTYPE INTEGER INTEGER ( ROTTYPE | MIRRORTYPE ) ;
	public final void symbolRule() throws RecognitionException {
		try {
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:56:2: ( SYMBOL SYMBOLTYPE INTEGER INTEGER ( ROTTYPE | MIRRORTYPE ) )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:57:3: SYMBOL SYMBOLTYPE INTEGER INTEGER ( ROTTYPE | MIRRORTYPE )
			{
			match(input,SYMBOL,FOLLOW_SYMBOL_in_symbolRule231); 
			match(input,SYMBOLTYPE,FOLLOW_SYMBOLTYPE_in_symbolRule233); 
			match(input,INTEGER,FOLLOW_INTEGER_in_symbolRule235); 
			match(input,INTEGER,FOLLOW_INTEGER_in_symbolRule237); 
			if ( input.LA(1)==MIRRORTYPE||input.LA(1)==ROTTYPE ) {
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
	// $ANTLR end "symbolRule"



	// $ANTLR start "symattrRule"
	// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:59:1: symattrRule : SYMATTR ( INSTNAME ID | DESCRIPTION DESCRIPTIONATTR | TYPE SYMBOLTYPE | VALUE ( INTEGER | FLOAT | ID ) | SPICELINE ( attrRule )+ ) ;
	public final void symattrRule() throws RecognitionException {
		try {
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:60:2: ( SYMATTR ( INSTNAME ID | DESCRIPTION DESCRIPTIONATTR | TYPE SYMBOLTYPE | VALUE ( INTEGER | FLOAT | ID ) | SPICELINE ( attrRule )+ ) )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:61:3: SYMATTR ( INSTNAME ID | DESCRIPTION DESCRIPTIONATTR | TYPE SYMBOLTYPE | VALUE ( INTEGER | FLOAT | ID ) | SPICELINE ( attrRule )+ )
			{
			match(input,SYMATTR,FOLLOW_SYMATTR_in_symattrRule257); 
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:61:11: ( INSTNAME ID | DESCRIPTION DESCRIPTIONATTR | TYPE SYMBOLTYPE | VALUE ( INTEGER | FLOAT | ID ) | SPICELINE ( attrRule )+ )
			int alt4=5;
			switch ( input.LA(1) ) {
			case INSTNAME:
				{
				alt4=1;
				}
				break;
			case DESCRIPTION:
				{
				alt4=2;
				}
				break;
			case TYPE:
				{
				alt4=3;
				}
				break;
			case VALUE:
				{
				alt4=4;
				}
				break;
			case SPICELINE:
				{
				alt4=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:61:13: INSTNAME ID
					{
					match(input,INSTNAME,FOLLOW_INSTNAME_in_symattrRule261); 
					match(input,ID,FOLLOW_ID_in_symattrRule263); 
					}
					break;
				case 2 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:62:6: DESCRIPTION DESCRIPTIONATTR
					{
					match(input,DESCRIPTION,FOLLOW_DESCRIPTION_in_symattrRule270); 
					match(input,DESCRIPTIONATTR,FOLLOW_DESCRIPTIONATTR_in_symattrRule272); 
					}
					break;
				case 3 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:63:6: TYPE SYMBOLTYPE
					{
					match(input,TYPE,FOLLOW_TYPE_in_symattrRule279); 
					match(input,SYMBOLTYPE,FOLLOW_SYMBOLTYPE_in_symattrRule281); 
					}
					break;
				case 4 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:64:6: VALUE ( INTEGER | FLOAT | ID )
					{
					match(input,VALUE,FOLLOW_VALUE_in_symattrRule288); 
					if ( (input.LA(1) >= FLOAT && input.LA(1) <= ID)||input.LA(1)==INTEGER ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;
				case 5 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:67:6: SPICELINE ( attrRule )+
					{
					match(input,SPICELINE,FOLLOW_SPICELINE_in_symattrRule321); 
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:67:16: ( attrRule )+
					int cnt3=0;
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0==CAPATTRIBUTE||LA3_0==INDATTRIBUTE||(LA3_0 >= PARATTRIBUTE && LA3_0 <= RATTRIBUTE)) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:67:16: attrRule
							{
							pushFollow(FOLLOW_attrRule_in_symattrRule323);
							attrRule();
							state._fsp--;

							}
							break;

						default :
							if ( cnt3 >= 1 ) break loop3;
							EarlyExitException eee = new EarlyExitException(3, input);
							throw eee;
						}
						cnt3++;
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
	// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:70:1: attrRule : ( CAPATTRIBUTE | PARATTRIBUTE | RATTRIBUTE | INDATTRIBUTE ) ASSIGN ( INTEGER | FLOAT | STRING | ID ) ;
	public final void attrRule() throws RecognitionException {
		try {
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:71:2: ( ( CAPATTRIBUTE | PARATTRIBUTE | RATTRIBUTE | INDATTRIBUTE ) ASSIGN ( INTEGER | FLOAT | STRING | ID ) )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:72:3: ( CAPATTRIBUTE | PARATTRIBUTE | RATTRIBUTE | INDATTRIBUTE ) ASSIGN ( INTEGER | FLOAT | STRING | ID )
			{
			if ( input.LA(1)==CAPATTRIBUTE||input.LA(1)==INDATTRIBUTE||(input.LA(1) >= PARATTRIBUTE && input.LA(1) <= RATTRIBUTE) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,ASSIGN,FOLLOW_ASSIGN_in_attrRule358); 
			if ( (input.LA(1) >= FLOAT && input.LA(1) <= ID)||input.LA(1)==INTEGER||input.LA(1)==STRING ) {
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
	// $ANTLR end "attrRule"

	// Delegated rules



	public static final BitSet FOLLOW_prologueRule_in_parseCircuit46 = new BitSet(new long[]{0x000000050C000402L});
	public static final BitSet FOLLOW_componentRule_in_parseCircuit50 = new BitSet(new long[]{0x000000050C000402L});
	public static final BitSet FOLLOW_versionRule_in_prologueRule61 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_sheetRule_in_prologueRule66 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VERSION_in_versionRule79 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_INTEGER_in_versionRule81 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SHEET_in_sheetRule96 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_INTEGER_in_sheetRule98 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_INTEGER_in_sheetRule100 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_INTEGER_in_sheetRule102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_wireRule_in_componentRule114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_symbolRule_in_componentRule122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_symattrRule_in_componentRule130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_flagRule_in_componentRule137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_windowRule_in_componentRule144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WIRE_in_wireRule157 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_INTEGER_in_wireRule159 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_INTEGER_in_wireRule161 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_INTEGER_in_wireRule163 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_INTEGER_in_wireRule165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLAG_in_flagRule180 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_INTEGER_in_flagRule182 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_INTEGER_in_flagRule184 = new BitSet(new long[]{0x0000000000009000L});
	public static final BitSet FOLLOW_set_in_flagRule186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WINDOW_in_windowRule208 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_INTEGER_in_windowRule210 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_INTEGER_in_windowRule212 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_INTEGER_in_windowRule214 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_WINDOWOPTION_in_windowRule216 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_INTEGER_in_windowRule218 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYMBOL_in_symbolRule231 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_SYMBOLTYPE_in_symbolRule233 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_INTEGER_in_symbolRule235 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_INTEGER_in_symbolRule237 = new BitSet(new long[]{0x0000000000480000L});
	public static final BitSet FOLLOW_set_in_symbolRule239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYMATTR_in_symattrRule257 = new BitSet(new long[]{0x0000000061004040L});
	public static final BitSet FOLLOW_INSTNAME_in_symattrRule261 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ID_in_symattrRule263 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DESCRIPTION_in_symattrRule270 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_DESCRIPTIONATTR_in_symattrRule272 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_in_symattrRule279 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_SYMBOLTYPE_in_symattrRule281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VALUE_in_symattrRule288 = new BitSet(new long[]{0x0000000000009800L});
	public static final BitSet FOLLOW_set_in_symattrRule290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPICELINE_in_symattrRule321 = new BitSet(new long[]{0x0000000000302020L});
	public static final BitSet FOLLOW_attrRule_in_symattrRule323 = new BitSet(new long[]{0x0000000000302022L});
	public static final BitSet FOLLOW_set_in_attrRule339 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ASSIGN_in_attrRule358 = new BitSet(new long[]{0x0000000002009800L});
	public static final BitSet FOLLOW_set_in_attrRule362 = new BitSet(new long[]{0x0000000000000002L});
}
