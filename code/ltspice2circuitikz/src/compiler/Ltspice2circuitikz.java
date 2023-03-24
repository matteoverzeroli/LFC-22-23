// $ANTLR 3.5.1 C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g 2023-03-24 14:43:11

	package compiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class Ltspice2circuitikz extends Lexer {
	public static final int EOF=-1;
	public static final int ASSIGN=4;
	public static final int CAPATTRIBUTE=5;
	public static final int DESCRIPTION=6;
	public static final int DIGIT=7;
	public static final int DIODEUPPER=8;
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
	public static final int VERSIONNUM=32;
	public static final int WINDOW=33;
	public static final int WINDOWOPTION=34;
	public static final int WIRE=35;
	public static final int WS=36;



	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public Ltspice2circuitikz() {} 
	public Ltspice2circuitikz(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public Ltspice2circuitikz(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g"; }

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:15:8: ( 'a' .. 'z' | 'A' .. 'Z' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:17:7: ( '0' .. '9' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "EXPONENT"
	public final void mEXPONENT() throws RecognitionException {
		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:19:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:19:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:19:22: ( '+' | '-' )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='+'||LA1_0=='-') ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:19:33: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXPONENT"

	// $ANTLR start "VERSION"
	public final void mVERSION() throws RecognitionException {
		try {
			int _type = VERSION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:21:8: ( 'Version' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:21:11: 'Version'
			{
			match("Version"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VERSION"

	// $ANTLR start "VERSIONNUM"
	public final void mVERSIONNUM() throws RecognitionException {
		try {
			int _type = VERSIONNUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:22:11: ( '4' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:22:13: '4'
			{
			match('4'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VERSIONNUM"

	// $ANTLR start "SHEET"
	public final void mSHEET() throws RecognitionException {
		try {
			int _type = SHEET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:23:6: ( 'SHEET' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:23:9: 'SHEET'
			{
			match("SHEET"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SHEET"

	// $ANTLR start "INTEGER"
	public final void mINTEGER() throws RecognitionException {
		try {
			int _type = INTEGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:24:8: ( ( '-' )? ( DIGIT )+ )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:24:11: ( '-' )? ( DIGIT )+
			{
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:24:11: ( '-' )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='-') ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:24:12: '-'
					{
					match('-'); 
					}
					break;

			}

			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:24:17: ( DIGIT )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTEGER"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:26:5: ( ( DIGIT )+ '.' ( DIGIT )* ( EXPONENT )? | '.' ( DIGIT )+ ( EXPONENT )? | ( DIGIT )+ EXPONENT )
			int alt11=3;
			alt11 = dfa11.predict(input);
			switch (alt11) {
				case 1 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:26:9: ( DIGIT )+ '.' ( DIGIT )* ( EXPONENT )?
					{
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:26:9: ( DIGIT )+
					int cnt5=0;
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt5 >= 1 ) break loop5;
							EarlyExitException eee = new EarlyExitException(5, input);
							throw eee;
						}
						cnt5++;
					}

					match('.'); 
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:26:20: ( DIGIT )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop6;
						}
					}

					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:26:27: ( EXPONENT )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0=='E'||LA7_0=='e') ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:26:27: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:27:9: '.' ( DIGIT )+ ( EXPONENT )?
					{
					match('.'); 
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:27:13: ( DIGIT )+
					int cnt8=0;
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt8 >= 1 ) break loop8;
							EarlyExitException eee = new EarlyExitException(8, input);
							throw eee;
						}
						cnt8++;
					}

					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:27:20: ( EXPONENT )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0=='E'||LA9_0=='e') ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:27:20: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 3 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:28:9: ( DIGIT )+ EXPONENT
					{
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:28:9: ( DIGIT )+
					int cnt10=0;
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt10 >= 1 ) break loop10;
							EarlyExitException eee = new EarlyExitException(10, input);
							throw eee;
						}
						cnt10++;
					}

					mEXPONENT(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "WIRE"
	public final void mWIRE() throws RecognitionException {
		try {
			int _type = WIRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:30:5: ( 'WIRE' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:30:8: 'WIRE'
			{
			match("WIRE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WIRE"

	// $ANTLR start "SYMBOL"
	public final void mSYMBOL() throws RecognitionException {
		try {
			int _type = SYMBOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:31:8: ( 'SYMBOL' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:31:10: 'SYMBOL'
			{
			match("SYMBOL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SYMBOL"

	// $ANTLR start "SYMBOLTYPE"
	public final void mSYMBOLTYPE() throws RecognitionException {
		try {
			int _type = SYMBOLTYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:32:11: ( 'res' | 'cap' | 'ind' | 'ind2' | 'diode' | 'schottky' | 'zener' | 'varactor' | 'LED' | 'TVSdiode' | 'pnp' | 'npn' | 'voltage' | 'current' | 'nmos' | 'pmos' | 'polcap' )
			int alt12=17;
			switch ( input.LA(1) ) {
			case 'r':
				{
				alt12=1;
				}
				break;
			case 'c':
				{
				int LA12_2 = input.LA(2);
				if ( (LA12_2=='a') ) {
					alt12=2;
				}
				else if ( (LA12_2=='u') ) {
					alt12=14;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'i':
				{
				int LA12_3 = input.LA(2);
				if ( (LA12_3=='n') ) {
					int LA12_14 = input.LA(3);
					if ( (LA12_14=='d') ) {
						int LA12_22 = input.LA(4);
						if ( (LA12_22=='2') ) {
							alt12=4;
						}

						else {
							alt12=3;
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 12, 14, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'd':
				{
				alt12=5;
				}
				break;
			case 's':
				{
				alt12=6;
				}
				break;
			case 'z':
				{
				alt12=7;
				}
				break;
			case 'v':
				{
				int LA12_7 = input.LA(2);
				if ( (LA12_7=='a') ) {
					alt12=8;
				}
				else if ( (LA12_7=='o') ) {
					alt12=13;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'L':
				{
				alt12=9;
				}
				break;
			case 'T':
				{
				alt12=10;
				}
				break;
			case 'p':
				{
				switch ( input.LA(2) ) {
				case 'n':
					{
					alt12=11;
					}
					break;
				case 'm':
					{
					alt12=16;
					}
					break;
				case 'o':
					{
					alt12=17;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 10, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'n':
				{
				int LA12_11 = input.LA(2);
				if ( (LA12_11=='p') ) {
					alt12=12;
				}
				else if ( (LA12_11=='m') ) {
					alt12=15;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 11, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:32:13: 'res'
					{
					match("res"); 

					}
					break;
				case 2 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:33:5: 'cap'
					{
					match("cap"); 

					}
					break;
				case 3 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:34:5: 'ind'
					{
					match("ind"); 

					}
					break;
				case 4 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:35:5: 'ind2'
					{
					match("ind2"); 

					}
					break;
				case 5 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:36:5: 'diode'
					{
					match("diode"); 

					}
					break;
				case 6 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:37:5: 'schottky'
					{
					match("schottky"); 

					}
					break;
				case 7 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:38:5: 'zener'
					{
					match("zener"); 

					}
					break;
				case 8 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:39:5: 'varactor'
					{
					match("varactor"); 

					}
					break;
				case 9 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:40:5: 'LED'
					{
					match("LED"); 

					}
					break;
				case 10 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:41:5: 'TVSdiode'
					{
					match("TVSdiode"); 

					}
					break;
				case 11 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:42:5: 'pnp'
					{
					match("pnp"); 

					}
					break;
				case 12 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:43:5: 'npn'
					{
					match("npn"); 

					}
					break;
				case 13 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:44:5: 'voltage'
					{
					match("voltage"); 

					}
					break;
				case 14 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:45:5: 'current'
					{
					match("current"); 

					}
					break;
				case 15 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:46:5: 'nmos'
					{
					match("nmos"); 

					}
					break;
				case 16 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:47:5: 'pmos'
					{
					match("pmos"); 

					}
					break;
				case 17 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:48:5: 'polcap'
					{
					match("polcap"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SYMBOLTYPE"

	// $ANTLR start "ROTTYPE"
	public final void mROTTYPE() throws RecognitionException {
		try {
			int _type = ROTTYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:49:9: ( 'R0' | 'R90' | 'R180' | 'R270' )
			int alt13=4;
			int LA13_0 = input.LA(1);
			if ( (LA13_0=='R') ) {
				switch ( input.LA(2) ) {
				case '0':
					{
					alt13=1;
					}
					break;
				case '9':
					{
					alt13=2;
					}
					break;
				case '1':
					{
					alt13=3;
					}
					break;
				case '2':
					{
					alt13=4;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 13, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:49:11: 'R0'
					{
					match("R0"); 

					}
					break;
				case 2 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:50:5: 'R90'
					{
					match("R90"); 

					}
					break;
				case 3 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:51:5: 'R180'
					{
					match("R180"); 

					}
					break;
				case 4 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:52:5: 'R270'
					{
					match("R270"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ROTTYPE"

	// $ANTLR start "MIRRORTYPE"
	public final void mMIRRORTYPE() throws RecognitionException {
		try {
			int _type = MIRRORTYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:53:12: ( 'M0' | 'M90' | 'M180' | 'M270' )
			int alt14=4;
			int LA14_0 = input.LA(1);
			if ( (LA14_0=='M') ) {
				switch ( input.LA(2) ) {
				case '0':
					{
					alt14=1;
					}
					break;
				case '9':
					{
					alt14=2;
					}
					break;
				case '1':
					{
					alt14=3;
					}
					break;
				case '2':
					{
					alt14=4;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 14, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:53:14: 'M0'
					{
					match("M0"); 

					}
					break;
				case 2 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:54:5: 'M90'
					{
					match("M90"); 

					}
					break;
				case 3 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:55:5: 'M180'
					{
					match("M180"); 

					}
					break;
				case 4 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:56:5: 'M270'
					{
					match("M270"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MIRRORTYPE"

	// $ANTLR start "SYMATTR"
	public final void mSYMATTR() throws RecognitionException {
		try {
			int _type = SYMATTR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:57:9: ( 'SYMATTR' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:57:11: 'SYMATTR'
			{
			match("SYMATTR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SYMATTR"

	// $ANTLR start "INSTNAME"
	public final void mINSTNAME() throws RecognitionException {
		try {
			int _type = INSTNAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:58:9: ( 'InstName' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:58:11: 'InstName'
			{
			match("InstName"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INSTNAME"

	// $ANTLR start "VALUE"
	public final void mVALUE() throws RecognitionException {
		try {
			int _type = VALUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:59:7: ( 'Value' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:59:9: 'Value'
			{
			match("Value"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VALUE"

	// $ANTLR start "SPICELINE"
	public final void mSPICELINE() throws RecognitionException {
		try {
			int _type = SPICELINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:60:11: ( 'SpiceLine' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:60:13: 'SpiceLine'
			{
			match("SpiceLine"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SPICELINE"

	// $ANTLR start "ASSIGN"
	public final void mASSIGN() throws RecognitionException {
		try {
			int _type = ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:61:8: ( '=' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:61:10: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSIGN"

	// $ANTLR start "WINDOW"
	public final void mWINDOW() throws RecognitionException {
		try {
			int _type = WINDOW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:63:9: ( 'WINDOW' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:63:11: 'WINDOW'
			{
			match("WINDOW"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WINDOW"

	// $ANTLR start "WINDOWOPTION"
	public final void mWINDOWOPTION() throws RecognitionException {
		try {
			int _type = WINDOWOPTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:64:13: ( 'Invisibile' | 'Center' | 'Left' | 'Right' | 'Top' | 'Bottom' | 'VCenter' | 'VLeft' | 'VRight' | 'VTop' | 'VBottom' )
			int alt15=11;
			switch ( input.LA(1) ) {
			case 'I':
				{
				alt15=1;
				}
				break;
			case 'C':
				{
				alt15=2;
				}
				break;
			case 'L':
				{
				alt15=3;
				}
				break;
			case 'R':
				{
				alt15=4;
				}
				break;
			case 'T':
				{
				alt15=5;
				}
				break;
			case 'B':
				{
				alt15=6;
				}
				break;
			case 'V':
				{
				switch ( input.LA(2) ) {
				case 'C':
					{
					alt15=7;
					}
					break;
				case 'L':
					{
					alt15=8;
					}
					break;
				case 'R':
					{
					alt15=9;
					}
					break;
				case 'T':
					{
					alt15=10;
					}
					break;
				case 'B':
					{
					alt15=11;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 15, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}
			switch (alt15) {
				case 1 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:64:15: 'Invisibile'
					{
					match("Invisibile"); 

					}
					break;
				case 2 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:65:5: 'Center'
					{
					match("Center"); 

					}
					break;
				case 3 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:66:5: 'Left'
					{
					match("Left"); 

					}
					break;
				case 4 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:67:5: 'Right'
					{
					match("Right"); 

					}
					break;
				case 5 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:68:5: 'Top'
					{
					match("Top"); 

					}
					break;
				case 6 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:69:5: 'Bottom'
					{
					match("Bottom"); 

					}
					break;
				case 7 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:70:5: 'VCenter'
					{
					match("VCenter"); 

					}
					break;
				case 8 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:71:5: 'VLeft'
					{
					match("VLeft"); 

					}
					break;
				case 9 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:72:5: 'VRight'
					{
					match("VRight"); 

					}
					break;
				case 10 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:73:5: 'VTop'
					{
					match("VTop"); 

					}
					break;
				case 11 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:74:5: 'VBottom'
					{
					match("VBottom"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WINDOWOPTION"

	// $ANTLR start "RATTRIBUTE"
	public final void mRATTRIBUTE() throws RecognitionException {
		try {
			int _type = RATTRIBUTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:76:11: ( 'tol' | 'pwr' )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0=='t') ) {
				alt16=1;
			}
			else if ( (LA16_0=='p') ) {
				alt16=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:76:13: 'tol'
					{
					match("tol"); 

					}
					break;
				case 2 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:77:4: 'pwr'
					{
					match("pwr"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RATTRIBUTE"

	// $ANTLR start "PARATTRIBUTE"
	public final void mPARATTRIBUTE() throws RecognitionException {
		try {
			int _type = PARATTRIBUTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:78:13: ( 'Rser' | 'Rpar' | 'Cpar' )
			int alt17=3;
			int LA17_0 = input.LA(1);
			if ( (LA17_0=='R') ) {
				int LA17_1 = input.LA(2);
				if ( (LA17_1=='s') ) {
					alt17=1;
				}
				else if ( (LA17_1=='p') ) {
					alt17=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 17, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA17_0=='C') ) {
				alt17=3;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:78:15: 'Rser'
					{
					match("Rser"); 

					}
					break;
				case 2 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:79:5: 'Rpar'
					{
					match("Rpar"); 

					}
					break;
				case 3 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:80:5: 'Cpar'
					{
					match("Cpar"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PARATTRIBUTE"

	// $ANTLR start "CAPATTRIBUTE"
	public final void mCAPATTRIBUTE() throws RecognitionException {
		try {
			int _type = CAPATTRIBUTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:81:13: ( 'V' | 'Irms' | 'Lser' | 'mfg' | 'pn' | 'type' )
			int alt18=6;
			switch ( input.LA(1) ) {
			case 'V':
				{
				alt18=1;
				}
				break;
			case 'I':
				{
				alt18=2;
				}
				break;
			case 'L':
				{
				alt18=3;
				}
				break;
			case 'm':
				{
				alt18=4;
				}
				break;
			case 'p':
				{
				alt18=5;
				}
				break;
			case 't':
				{
				alt18=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:81:15: 'V'
					{
					match('V'); 
					}
					break;
				case 2 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:82:5: 'Irms'
					{
					match("Irms"); 

					}
					break;
				case 3 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:83:5: 'Lser'
					{
					match("Lser"); 

					}
					break;
				case 4 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:84:5: 'mfg'
					{
					match("mfg"); 

					}
					break;
				case 5 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:85:5: 'pn'
					{
					match("pn"); 

					}
					break;
				case 6 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:86:5: 'type'
					{
					match("type"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CAPATTRIBUTE"

	// $ANTLR start "INDATTRIBUTE"
	public final void mINDATTRIBUTE() throws RecognitionException {
		try {
			int _type = INDATTRIBUTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:87:13: ( 'Ipk' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:87:15: 'Ipk'
			{
			match("Ipk"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INDATTRIBUTE"

	// $ANTLR start "DESCRIPTION"
	public final void mDESCRIPTION() throws RecognitionException {
		try {
			int _type = DESCRIPTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:89:12: ( 'Description' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:89:14: 'Description'
			{
			match("Description"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DESCRIPTION"

	// $ANTLR start "TYPE"
	public final void mTYPE() throws RecognitionException {
		try {
			int _type = TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:90:6: ( 'Type' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:90:8: 'Type'
			{
			match("Type"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TYPE"

	// $ANTLR start "DIODEUPPER"
	public final void mDIODEUPPER() throws RecognitionException {
		try {
			int _type = DIODEUPPER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:91:11: ( 'Diode' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:91:13: 'Diode'
			{
			match("Diode"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIODEUPPER"

	// $ANTLR start "FLAG"
	public final void mFLAG() throws RecognitionException {
		try {
			int _type = FLAG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:92:7: ( 'FLAG' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:92:9: 'FLAG'
			{
			match("FLAG"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLAG"

	// $ANTLR start "IOPIN"
	public final void mIOPIN() throws RecognitionException {
		try {
			int _type = IOPIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:93:7: ( 'IOPIN' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:93:9: 'IOPIN'
			{
			match("IOPIN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IOPIN"

	// $ANTLR start "IOPINATT"
	public final void mIOPINATT() throws RecognitionException {
		try {
			int _type = IOPINATT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:94:9: ( 'In' | 'Out' | 'BiDir' )
			int alt19=3;
			switch ( input.LA(1) ) {
			case 'I':
				{
				alt19=1;
				}
				break;
			case 'O':
				{
				alt19=2;
				}
				break;
			case 'B':
				{
				alt19=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
				case 1 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:94:11: 'In'
					{
					match("In"); 

					}
					break;
				case 2 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:95:5: 'Out'
					{
					match("Out"); 

					}
					break;
				case 3 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:96:5: 'BiDir'
					{
					match("BiDir"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IOPINATT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:99:5: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:99:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
			{
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:99:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
			int cnt20=0;
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( ((LA20_0 >= '\t' && LA20_0 <= '\n')||LA20_0=='\r'||LA20_0==' ') ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt20 >= 1 ) break loop20;
					EarlyExitException eee = new EarlyExitException(20, input);
					throw eee;
				}
				cnt20++;
			}

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:106:8: ( '\"' (~ ( '\"' ) )* '\"' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:106:10: '\"' (~ ( '\"' ) )* '\"'
			{
			match('\"'); 
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:106:14: (~ ( '\"' ) )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( ((LA21_0 >= '\u0000' && LA21_0 <= '!')||(LA21_0 >= '#' && LA21_0 <= '\uFFFF')) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop21;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:107:4: ( ( LETTER | DIGIT | '-' ) ( LETTER | DIGIT | '-' )* )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:107:6: ( LETTER | DIGIT | '-' ) ( LETTER | DIGIT | '-' )*
			{
			if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:107:28: ( LETTER | DIGIT | '-' )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0=='-'||(LA22_0 >= '0' && LA22_0 <= '9')||(LA22_0 >= 'A' && LA22_0 <= 'Z')||(LA22_0 >= 'a' && LA22_0 <= 'z')) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:
					{
					if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop22;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:8: ( VERSION | VERSIONNUM | SHEET | INTEGER | FLOAT | WIRE | SYMBOL | SYMBOLTYPE | ROTTYPE | MIRRORTYPE | SYMATTR | INSTNAME | VALUE | SPICELINE | ASSIGN | WINDOW | WINDOWOPTION | RATTRIBUTE | PARATTRIBUTE | CAPATTRIBUTE | INDATTRIBUTE | DESCRIPTION | TYPE | DIODEUPPER | FLAG | IOPIN | IOPINATT | WS | STRING | ID )
		int alt23=30;
		alt23 = dfa23.predict(input);
		switch (alt23) {
			case 1 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:10: VERSION
				{
				mVERSION(); 

				}
				break;
			case 2 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:18: VERSIONNUM
				{
				mVERSIONNUM(); 

				}
				break;
			case 3 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:29: SHEET
				{
				mSHEET(); 

				}
				break;
			case 4 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:35: INTEGER
				{
				mINTEGER(); 

				}
				break;
			case 5 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:43: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 6 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:49: WIRE
				{
				mWIRE(); 

				}
				break;
			case 7 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:54: SYMBOL
				{
				mSYMBOL(); 

				}
				break;
			case 8 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:61: SYMBOLTYPE
				{
				mSYMBOLTYPE(); 

				}
				break;
			case 9 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:72: ROTTYPE
				{
				mROTTYPE(); 

				}
				break;
			case 10 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:80: MIRRORTYPE
				{
				mMIRRORTYPE(); 

				}
				break;
			case 11 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:91: SYMATTR
				{
				mSYMATTR(); 

				}
				break;
			case 12 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:99: INSTNAME
				{
				mINSTNAME(); 

				}
				break;
			case 13 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:108: VALUE
				{
				mVALUE(); 

				}
				break;
			case 14 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:114: SPICELINE
				{
				mSPICELINE(); 

				}
				break;
			case 15 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:124: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 16 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:131: WINDOW
				{
				mWINDOW(); 

				}
				break;
			case 17 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:138: WINDOWOPTION
				{
				mWINDOWOPTION(); 

				}
				break;
			case 18 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:151: RATTRIBUTE
				{
				mRATTRIBUTE(); 

				}
				break;
			case 19 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:162: PARATTRIBUTE
				{
				mPARATTRIBUTE(); 

				}
				break;
			case 20 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:175: CAPATTRIBUTE
				{
				mCAPATTRIBUTE(); 

				}
				break;
			case 21 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:188: INDATTRIBUTE
				{
				mINDATTRIBUTE(); 

				}
				break;
			case 22 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:201: DESCRIPTION
				{
				mDESCRIPTION(); 

				}
				break;
			case 23 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:213: TYPE
				{
				mTYPE(); 

				}
				break;
			case 24 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:218: DIODEUPPER
				{
				mDIODEUPPER(); 

				}
				break;
			case 25 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:229: FLAG
				{
				mFLAG(); 

				}
				break;
			case 26 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:234: IOPIN
				{
				mIOPIN(); 

				}
				break;
			case 27 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:240: IOPINATT
				{
				mIOPINATT(); 

				}
				break;
			case 28 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:249: WS
				{
				mWS(); 

				}
				break;
			case 29 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:252: STRING
				{
				mSTRING(); 

				}
				break;
			case 30 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:259: ID
				{
				mID(); 

				}
				break;

		}
	}


	protected DFA11 dfa11 = new DFA11(this);
	protected DFA23 dfa23 = new DFA23(this);
	static final String DFA11_eotS =
		"\5\uffff";
	static final String DFA11_eofS =
		"\5\uffff";
	static final String DFA11_minS =
		"\2\56\3\uffff";
	static final String DFA11_maxS =
		"\1\71\1\145\3\uffff";
	static final String DFA11_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA11_specialS =
		"\5\uffff}>";
	static final String[] DFA11_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
			"",
			"",
			""
	};

	static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
	static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
	static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
	static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
	static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
	static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
	static final short[][] DFA11_transition;

	static {
		int numStates = DFA11_transitionS.length;
		DFA11_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
		}
	}

	protected class DFA11 extends DFA {

		public DFA11(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 11;
			this.eot = DFA11_eot;
			this.eof = DFA11_eof;
			this.min = DFA11_min;
			this.max = DFA11_max;
			this.accept = DFA11_accept;
			this.special = DFA11_special;
			this.transition = DFA11_transition;
		}
		@Override
		public String getDescription() {
			return "25:1: FLOAT : ( ( DIGIT )+ '.' ( DIGIT )* ( EXPONENT )? | '.' ( DIGIT )+ ( EXPONENT )? | ( DIGIT )+ EXPONENT );";
		}
	}

	static final String DFA23_eotS =
		"\1\uffff\1\50\1\51\2\40\1\60\1\uffff\17\40\1\uffff\7\40\3\uffff\7\40\2"+
		"\uffff\1\60\4\40\1\60\1\uffff\20\40\1\50\5\40\1\u0084\6\40\1\u008b\3\40"+
		"\1\u0091\26\40\1\6\5\40\2\u00ad\1\40\1\u00ad\5\40\1\u00ad\3\40\1\u00b8"+
		"\1\40\1\u00ad\2\40\1\u00bc\1\u00ad\1\40\1\uffff\1\u0084\5\40\1\uffff\1"+
		"\u008b\4\40\1\uffff\1\40\1\u00c8\5\40\1\u00bc\1\40\1\50\3\40\1\u0091\5"+
		"\40\1\u00b8\5\40\1\u00dc\1\40\1\uffff\1\40\1\u00ad\5\40\1\u00b8\1\50\1"+
		"\40\1\uffff\1\u00e5\1\u00ad\1\40\1\uffff\1\u00ad\2\u0084\1\40\2\u00e8"+
		"\2\u008b\2\40\1\50\1\uffff\2\40\1\u00e8\2\40\1\50\2\40\1\u00f1\1\40\1"+
		"\u00f3\1\40\1\u00b8\2\40\1\u00f7\3\40\1\uffff\2\40\1\u00ad\1\40\1\u00ad"+
		"\3\40\1\uffff\1\40\1\u00b8\1\uffff\2\40\1\u0104\2\40\1\u0091\1\40\1\u0108"+
		"\1\uffff\1\40\1\uffff\1\40\1\u00b8\1\40\1\uffff\1\u010c\2\40\1\u010f\5"+
		"\40\1\u00ad\2\40\1\uffff\2\u00b8\1\40\1\uffff\1\u0118\2\u00b8\1\uffff"+
		"\1\u0119\1\40\1\uffff\1\u00ad\2\40\1\u00ad\4\40\2\uffff\1\40\3\u00ad\1"+
		"\u0122\2\40\1\u0125\1\uffff\2\40\1\uffff\1\u00b8\1\40\1\u0129\1\uffff";
	static final String DFA23_eofS =
		"\u012a\uffff";
	static final String DFA23_minS =
		"\1\11\2\55\1\110\1\60\1\55\1\uffff\1\111\1\145\1\141\1\156\1\151\1\143"+
		"\1\145\1\141\1\105\1\126\2\155\2\60\1\117\1\uffff\1\145\1\151\1\157\1"+
		"\146\1\145\1\114\1\165\3\uffff\1\162\1\154\2\145\1\151\2\157\2\uffff\1"+
		"\55\1\53\1\105\1\115\1\151\1\55\1\uffff\1\116\1\163\1\160\1\162\1\144"+
		"\1\157\1\150\1\156\1\162\1\154\1\104\1\146\1\145\1\123\2\160\1\55\1\157"+
		"\1\154\1\162\1\156\1\157\1\55\1\60\1\70\1\67\1\147\1\145\1\141\1\55\1"+
		"\60\1\70\1\67\1\55\1\155\1\153\1\120\1\156\1\141\1\164\1\104\1\154\1\160"+
		"\1\147\1\163\1\157\1\101\1\164\1\163\1\165\1\156\1\146\1\147\1\160\1\164"+
		"\1\60\1\55\1\105\1\101\1\143\1\105\1\104\2\55\1\162\1\55\1\144\1\157\1"+
		"\145\1\141\1\164\1\55\1\164\1\162\1\144\1\55\1\145\1\55\1\163\1\143\2"+
		"\55\1\163\1\uffff\1\55\2\60\1\150\2\162\1\uffff\1\55\2\60\1\164\1\151"+
		"\1\uffff\1\163\1\55\1\111\1\164\1\162\1\164\1\151\1\55\1\145\1\55\1\143"+
		"\1\144\1\107\1\55\1\151\1\145\2\164\1\150\1\55\1\164\1\124\1\117\1\124"+
		"\1\145\1\55\1\117\1\uffff\1\145\1\55\1\145\1\164\1\162\1\143\1\141\2\55"+
		"\1\151\1\uffff\2\55\1\141\1\uffff\3\55\1\164\4\55\1\116\1\163\1\55\1\uffff"+
		"\1\116\1\145\1\55\1\157\1\162\1\55\1\162\1\145\1\55\1\157\1\55\1\145\1"+
		"\55\1\164\1\157\1\55\1\114\1\124\1\114\1\uffff\1\127\1\156\1\55\1\164"+
		"\1\55\1\164\1\147\1\157\1\uffff\1\160\1\55\1\uffff\1\141\1\151\1\55\1"+
		"\162\1\155\1\55\1\151\1\55\1\uffff\1\156\1\uffff\1\162\1\55\1\155\1\uffff"+
		"\1\55\1\122\1\151\1\55\1\164\1\153\1\157\1\145\1\144\1\55\1\155\1\142"+
		"\1\uffff\2\55\1\160\1\uffff\3\55\1\uffff\1\55\1\156\1\uffff\1\55\1\171"+
		"\1\162\1\55\2\145\1\151\1\164\2\uffff\1\145\4\55\1\154\1\151\1\55\1\uffff"+
		"\1\145\1\157\1\uffff\1\55\1\156\1\55\1\uffff";
	static final String DFA23_maxS =
		"\3\172\1\160\1\71\1\172\1\uffff\1\111\1\145\1\165\1\156\1\151\1\143\1"+
		"\145\1\157\1\163\1\171\1\167\1\160\1\163\1\71\1\162\1\uffff\1\160\1\157"+
		"\1\171\1\146\1\151\1\114\1\165\3\uffff\1\162\1\154\2\145\1\151\2\157\2"+
		"\uffff\1\172\1\71\1\105\1\115\1\151\1\172\1\uffff\1\122\1\163\1\160\1"+
		"\162\1\144\1\157\1\150\1\156\1\162\1\154\1\104\1\146\1\145\1\123\2\160"+
		"\1\172\1\157\1\154\1\162\1\156\1\157\1\172\1\60\1\70\1\67\1\147\1\145"+
		"\1\141\1\172\1\60\1\70\1\67\1\172\1\155\1\153\1\120\1\156\1\141\1\164"+
		"\1\104\1\154\1\160\1\147\1\163\1\157\1\101\1\164\1\163\1\165\1\156\1\146"+
		"\1\147\1\160\1\164\1\71\1\172\1\105\1\102\1\143\1\105\1\104\2\172\1\162"+
		"\1\172\1\144\1\157\1\145\1\141\1\164\1\172\1\164\1\162\1\144\1\172\1\145"+
		"\1\172\1\163\1\143\2\172\1\163\1\uffff\1\172\2\60\1\150\2\162\1\uffff"+
		"\1\172\2\60\1\164\1\151\1\uffff\1\163\1\172\1\111\1\164\1\162\1\164\1"+
		"\151\1\172\1\145\1\172\1\143\1\144\1\107\1\172\1\151\1\145\2\164\1\150"+
		"\1\172\1\164\1\124\1\117\1\124\1\145\1\172\1\117\1\uffff\1\145\1\172\1"+
		"\145\1\164\1\162\1\143\1\141\2\172\1\151\1\uffff\2\172\1\141\1\uffff\3"+
		"\172\1\164\4\172\1\116\1\163\1\172\1\uffff\1\116\1\145\1\172\1\157\1\162"+
		"\1\172\1\162\1\145\1\172\1\157\1\172\1\145\1\172\1\164\1\157\1\172\1\114"+
		"\1\124\1\114\1\uffff\1\127\1\156\1\172\1\164\1\172\1\164\1\147\1\157\1"+
		"\uffff\1\160\1\172\1\uffff\1\141\1\151\1\172\1\162\1\155\1\172\1\151\1"+
		"\172\1\uffff\1\156\1\uffff\1\162\1\172\1\155\1\uffff\1\172\1\122\1\151"+
		"\1\172\1\164\1\153\1\157\1\145\1\144\1\172\1\155\1\142\1\uffff\2\172\1"+
		"\160\1\uffff\3\172\1\uffff\1\172\1\156\1\uffff\1\172\1\171\1\162\1\172"+
		"\2\145\1\151\1\164\2\uffff\1\145\4\172\1\154\1\151\1\172\1\uffff\1\145"+
		"\1\157\1\uffff\1\172\1\156\1\172\1\uffff";
	static final String DFA23_acceptS =
		"\6\uffff\1\5\17\uffff\1\17\7\uffff\1\34\1\35\1\36\7\uffff\1\24\1\2\6\uffff"+
		"\1\4\123\uffff\1\11\6\uffff\1\12\5\uffff\1\33\33\uffff\1\10\12\uffff\1"+
		"\21\3\uffff\1\22\13\uffff\1\25\23\uffff\1\6\10\uffff\1\27\2\uffff\1\23"+
		"\10\uffff\1\31\1\uffff\1\15\3\uffff\1\3\14\uffff\1\32\3\uffff\1\30\3\uffff"+
		"\1\7\2\uffff\1\20\10\uffff\1\1\1\13\10\uffff\1\14\2\uffff\1\16\3\uffff"+
		"\1\26";
	static final String DFA23_specialS =
		"\u012a\uffff}>";
	static final String[] DFA23_transitionS = {
			"\2\36\2\uffff\1\36\22\uffff\1\36\1\uffff\1\37\12\uffff\1\4\1\6\1\uffff"+
			"\4\5\1\2\5\5\3\uffff\1\26\3\uffff\1\40\1\30\1\27\1\33\1\40\1\34\2\40"+
			"\1\25\2\40\1\17\1\24\1\40\1\35\2\40\1\23\1\3\1\20\1\40\1\1\1\7\3\40\6"+
			"\uffff\2\40\1\11\1\13\4\40\1\12\3\40\1\32\1\22\1\40\1\21\1\40\1\10\1"+
			"\14\1\31\1\40\1\16\3\40\1\15",
			"\1\40\2\uffff\12\40\7\uffff\1\40\1\47\1\43\10\40\1\44\5\40\1\45\1\40"+
			"\1\46\6\40\6\uffff\1\42\3\40\1\41\25\40",
			"\1\40\1\6\1\uffff\12\52\7\uffff\4\40\1\53\25\40\6\uffff\4\40\1\53\25"+
			"\40",
			"\1\54\20\uffff\1\55\26\uffff\1\56",
			"\12\57",
			"\1\40\1\6\1\uffff\12\52\7\uffff\4\40\1\53\25\40\6\uffff\4\40\1\53\25"+
			"\40",
			"",
			"\1\61",
			"\1\62",
			"\1\63\23\uffff\1\64",
			"\1\65",
			"\1\66",
			"\1\67",
			"\1\70",
			"\1\71\15\uffff\1\72",
			"\1\73\37\uffff\1\74\15\uffff\1\75",
			"\1\76\30\uffff\1\77\11\uffff\1\100",
			"\1\102\1\101\1\103\7\uffff\1\104",
			"\1\106\2\uffff\1\105",
			"\1\107\1\111\1\112\6\uffff\1\110\57\uffff\1\113\6\uffff\1\115\2\uffff"+
			"\1\114",
			"\1\116\1\120\1\121\6\uffff\1\117",
			"\1\125\36\uffff\1\122\1\uffff\1\124\1\uffff\1\123",
			"",
			"\1\126\12\uffff\1\127",
			"\1\131\5\uffff\1\130",
			"\1\132\11\uffff\1\133",
			"\1\134",
			"\1\135\3\uffff\1\136",
			"\1\137",
			"\1\140",
			"",
			"",
			"",
			"\1\141",
			"\1\142",
			"\1\143",
			"\1\144",
			"\1\145",
			"\1\146",
			"\1\147",
			"",
			"",
			"\1\40\1\6\1\uffff\12\52\7\uffff\4\40\1\53\25\40\6\uffff\4\40\1\53\25"+
			"\40",
			"\1\6\1\uffff\1\150\2\uffff\12\151",
			"\1\152",
			"\1\153",
			"\1\154",
			"\1\40\2\uffff\12\57\7\uffff\32\40\6\uffff\32\40",
			"",
			"\1\156\3\uffff\1\155",
			"\1\157",
			"\1\160",
			"\1\161",
			"\1\162",
			"\1\163",
			"\1\164",
			"\1\165",
			"\1\166",
			"\1\167",
			"\1\170",
			"\1\171",
			"\1\172",
			"\1\173",
			"\1\174",
			"\1\175",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\17\40\1\176\12\40",
			"\1\177",
			"\1\u0080",
			"\1\u0081",
			"\1\u0082",
			"\1\u0083",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\u0085",
			"\1\u0086",
			"\1\u0087",
			"\1\u0088",
			"\1\u0089",
			"\1\u008a",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\u008c",
			"\1\u008d",
			"\1\u008e",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\22\40\1\u008f\2\40\1\u0090"+
			"\4\40",
			"\1\u0092",
			"\1\u0093",
			"\1\u0094",
			"\1\u0095",
			"\1\u0096",
			"\1\u0097",
			"\1\u0098",
			"\1\u0099",
			"\1\u009a",
			"\1\u009b",
			"\1\u009c",
			"\1\u009d",
			"\1\u009e",
			"\1\u009f",
			"\1\u00a0",
			"\1\u00a1",
			"\1\u00a2",
			"\1\u00a3",
			"\1\u00a4",
			"\1\u00a5",
			"\1\u00a6",
			"\12\151",
			"\1\40\2\uffff\12\151\7\uffff\32\40\6\uffff\32\40",
			"\1\u00a7",
			"\1\u00a9\1\u00a8",
			"\1\u00aa",
			"\1\u00ab",
			"\1\u00ac",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\u00ae",
			"\1\40\2\uffff\2\40\1\u00af\7\40\7\uffff\32\40\6\uffff\32\40",
			"\1\u00b0",
			"\1\u00b1",
			"\1\u00b2",
			"\1\u00b3",
			"\1\u00b4",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\u00b5",
			"\1\u00b6",
			"\1\u00b7",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\u00b9",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\u00ba",
			"\1\u00bb",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\u00bd",
			"",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\u00be",
			"\1\u00bf",
			"\1\u00c0",
			"\1\u00c1",
			"\1\u00c2",
			"",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\u00c3",
			"\1\u00c4",
			"\1\u00c5",
			"\1\u00c6",
			"",
			"\1\u00c7",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\u00c9",
			"\1\u00ca",
			"\1\u00cb",
			"\1\u00cc",
			"\1\u00cd",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\u00ce",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\u00cf",
			"\1\u00d0",
			"\1\u00d1",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\u00d2",
			"\1\u00d3",
			"\1\u00d4",
			"\1\u00d5",
			"\1\u00d6",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\u00d7",
			"\1\u00d8",
			"\1\u00d9",
			"\1\u00da",
			"\1\u00db",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\u00dd",
			"",
			"\1\u00de",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\u00df",
			"\1\u00e0",
			"\1\u00e1",
			"\1\u00e2",
			"\1\u00e3",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\u00e4",
			"",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\u00e6",
			"",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\u00e7",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\u00e9",
			"\1\u00ea",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"",
			"\1\u00eb",
			"\1\u00ec",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\u00ed",
			"\1\u00ee",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\u00ef",
			"\1\u00f0",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\u00f2",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\u00f4",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\u00f5",
			"\1\u00f6",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\u00f8",
			"\1\u00f9",
			"\1\u00fa",
			"",
			"\1\u00fb",
			"\1\u00fc",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\u00fd",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\u00fe",
			"\1\u00ff",
			"\1\u0100",
			"",
			"\1\u0101",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"",
			"\1\u0102",
			"\1\u0103",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\u0105",
			"\1\u0106",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\u0107",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"",
			"\1\u0109",
			"",
			"\1\u010a",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\u010b",
			"",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\u010d",
			"\1\u010e",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\u0110",
			"\1\u0111",
			"\1\u0112",
			"\1\u0113",
			"\1\u0114",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\u0115",
			"\1\u0116",
			"",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\u0117",
			"",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\u011a",
			"",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\u011b",
			"\1\u011c",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\u011d",
			"\1\u011e",
			"\1\u011f",
			"\1\u0120",
			"",
			"",
			"\1\u0121",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\u0123",
			"\1\u0124",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"",
			"\1\u0126",
			"\1\u0127",
			"",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\u0128",
			"\1\40\2\uffff\12\40\7\uffff\32\40\6\uffff\32\40",
			""
	};

	static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
	static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
	static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
	static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
	static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
	static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
	static final short[][] DFA23_transition;

	static {
		int numStates = DFA23_transitionS.length;
		DFA23_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
		}
	}

	protected class DFA23 extends DFA {

		public DFA23(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 23;
			this.eot = DFA23_eot;
			this.eof = DFA23_eof;
			this.min = DFA23_min;
			this.max = DFA23_max;
			this.accept = DFA23_accept;
			this.special = DFA23_special;
			this.transition = DFA23_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( VERSION | VERSIONNUM | SHEET | INTEGER | FLOAT | WIRE | SYMBOL | SYMBOLTYPE | ROTTYPE | MIRRORTYPE | SYMATTR | INSTNAME | VALUE | SPICELINE | ASSIGN | WINDOW | WINDOWOPTION | RATTRIBUTE | PARATTRIBUTE | CAPATTRIBUTE | INDATTRIBUTE | DESCRIPTION | TYPE | DIODEUPPER | FLAG | IOPIN | IOPINATT | WS | STRING | ID );";
		}
	}

}
