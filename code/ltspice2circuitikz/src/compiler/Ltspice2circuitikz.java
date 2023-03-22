// $ANTLR 3.5.1 C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g 2023-03-22 12:44:45

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
	public static final int DIGIT=6;
	public static final int EXPONENT=7;
	public static final int FLOAT=8;
	public static final int ID=9;
	public static final int INSTNAME=10;
	public static final int LETTER=11;
	public static final int MIRRORTYPE=12;
	public static final int NEGINTEGER=13;
	public static final int POSINTEGER=14;
	public static final int PWR=15;
	public static final int ROTTYPE=16;
	public static final int SHEET=17;
	public static final int SPICELINE=18;
	public static final int SYMATTR=19;
	public static final int SYMBOL=20;
	public static final int SYMBOLTYPE=21;
	public static final int TOL=22;
	public static final int VALUE=23;
	public static final int VERSION=24;
	public static final int VERSIONNUM=25;
	public static final int WINDOW=26;
	public static final int WINDOWOPITON=27;
	public static final int WIRE=28;
	public static final int WS=29;



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

	// $ANTLR start "POSINTEGER"
	public final void mPOSINTEGER() throws RecognitionException {
		try {
			int _type = POSINTEGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:24:11: ( ( DIGIT )+ )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:24:13: ( DIGIT )+
			{
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:24:13: ( DIGIT )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
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
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POSINTEGER"

	// $ANTLR start "NEGINTEGER"
	public final void mNEGINTEGER() throws RecognitionException {
		try {
			int _type = NEGINTEGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:25:11: ( '-' ( DIGIT )+ )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:25:13: '-' ( DIGIT )+
			{
			match('-'); 
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:25:16: ( DIGIT )+
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
	// $ANTLR end "NEGINTEGER"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:27:5: ( ( DIGIT )+ '.' ( DIGIT )* ( EXPONENT )? | '.' ( DIGIT )+ ( EXPONENT )? | ( DIGIT )+ EXPONENT )
			int alt11=3;
			alt11 = dfa11.predict(input);
			switch (alt11) {
				case 1 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:27:9: ( DIGIT )+ '.' ( DIGIT )* ( EXPONENT )?
					{
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:27:9: ( DIGIT )+
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
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:27:20: ( DIGIT )*
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

					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:27:27: ( EXPONENT )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0=='E'||LA7_0=='e') ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:27:27: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:28:9: '.' ( DIGIT )+ ( EXPONENT )?
					{
					match('.'); 
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:28:13: ( DIGIT )+
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

					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:28:20: ( EXPONENT )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0=='E'||LA9_0=='e') ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:28:20: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 3 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:29:9: ( DIGIT )+ EXPONENT
					{
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:29:9: ( DIGIT )+
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
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:31:5: ( 'WIRE' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:31:8: 'WIRE'
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
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:32:8: ( 'SYMBOL' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:32:10: 'SYMBOL'
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
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:33:11: ( 'res' | 'cap' | 'ind' | 'nmos' | 'pmos' )
			int alt12=5;
			switch ( input.LA(1) ) {
			case 'r':
				{
				alt12=1;
				}
				break;
			case 'c':
				{
				alt12=2;
				}
				break;
			case 'i':
				{
				alt12=3;
				}
				break;
			case 'n':
				{
				alt12=4;
				}
				break;
			case 'p':
				{
				alt12=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:33:13: 'res'
					{
					match("res"); 

					}
					break;
				case 2 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:34:5: 'cap'
					{
					match("cap"); 

					}
					break;
				case 3 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:35:5: 'ind'
					{
					match("ind"); 

					}
					break;
				case 4 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:36:5: 'nmos'
					{
					match("nmos"); 

					}
					break;
				case 5 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:37:5: 'pmos'
					{
					match("pmos"); 

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
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:38:9: ( 'R0' | 'R90' | 'R180' | 'R270' )
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
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:38:11: 'R0'
					{
					match("R0"); 

					}
					break;
				case 2 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:39:5: 'R90'
					{
					match("R90"); 

					}
					break;
				case 3 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:40:5: 'R180'
					{
					match("R180"); 

					}
					break;
				case 4 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:41:5: 'R270'
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
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:42:12: ( 'M0' | 'M90' | 'M180' | 'M270' )
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
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:42:14: 'M0'
					{
					match("M0"); 

					}
					break;
				case 2 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:43:5: 'M90'
					{
					match("M90"); 

					}
					break;
				case 3 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:44:5: 'M180'
					{
					match("M180"); 

					}
					break;
				case 4 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:45:5: 'M270'
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
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:46:9: ( 'SYMATTR' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:46:11: 'SYMATTR'
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
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:47:9: ( 'InstName' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:47:11: 'InstName'
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
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:48:7: ( 'Value' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:48:9: 'Value'
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
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:49:11: ( 'SpiceLine' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:49:13: 'SpiceLine'
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

	// $ANTLR start "TOL"
	public final void mTOL() throws RecognitionException {
		try {
			int _type = TOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:50:5: ( 'tol' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:50:7: 'tol'
			{
			match("tol"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TOL"

	// $ANTLR start "PWR"
	public final void mPWR() throws RecognitionException {
		try {
			int _type = PWR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:51:5: ( 'pwr' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:51:7: 'pwr'
			{
			match("pwr"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PWR"

	// $ANTLR start "ASSIGN"
	public final void mASSIGN() throws RecognitionException {
		try {
			int _type = ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:52:8: ( '=' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:52:10: '='
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
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:54:9: ( 'WINDOW' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:54:11: 'WINDOW'
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

	// $ANTLR start "WINDOWOPITON"
	public final void mWINDOWOPITON() throws RecognitionException {
		try {
			int _type = WINDOWOPITON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:55:13: ( 'Invisibile' | 'Center' | 'Left' | 'Right' | 'Top' | 'Bottom' | 'VCenter' | 'VLeft' | 'VRight' | 'VTop' | 'VBottom' )
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
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:55:15: 'Invisibile'
					{
					match("Invisibile"); 

					}
					break;
				case 2 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:56:5: 'Center'
					{
					match("Center"); 

					}
					break;
				case 3 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:57:5: 'Left'
					{
					match("Left"); 

					}
					break;
				case 4 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:58:5: 'Right'
					{
					match("Right"); 

					}
					break;
				case 5 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:59:5: 'Top'
					{
					match("Top"); 

					}
					break;
				case 6 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:60:5: 'Bottom'
					{
					match("Bottom"); 

					}
					break;
				case 7 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:61:5: 'VCenter'
					{
					match("VCenter"); 

					}
					break;
				case 8 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:62:5: 'VLeft'
					{
					match("VLeft"); 

					}
					break;
				case 9 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:63:5: 'VRight'
					{
					match("VRight"); 

					}
					break;
				case 10 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:64:5: 'VTop'
					{
					match("VTop"); 

					}
					break;
				case 11 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:65:5: 'VBottom'
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
	// $ANTLR end "WINDOWOPITON"

	// $ANTLR start "CAPATTRIBUTE"
	public final void mCAPATTRIBUTE() throws RecognitionException {
		try {
			int _type = CAPATTRIBUTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:66:13: ( 'V' | 'Irms' | 'Rser' | 'Lser' | 'Rpar' | 'Cpar' | 'mfg' | 'pn' | 'type' )
			int alt16=9;
			switch ( input.LA(1) ) {
			case 'V':
				{
				alt16=1;
				}
				break;
			case 'I':
				{
				alt16=2;
				}
				break;
			case 'R':
				{
				int LA16_3 = input.LA(2);
				if ( (LA16_3=='s') ) {
					alt16=3;
				}
				else if ( (LA16_3=='p') ) {
					alt16=5;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 16, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'L':
				{
				alt16=4;
				}
				break;
			case 'C':
				{
				alt16=6;
				}
				break;
			case 'm':
				{
				alt16=7;
				}
				break;
			case 'p':
				{
				alt16=8;
				}
				break;
			case 't':
				{
				alt16=9;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:66:15: 'V'
					{
					match('V'); 
					}
					break;
				case 2 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:67:5: 'Irms'
					{
					match("Irms"); 

					}
					break;
				case 3 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:68:5: 'Rser'
					{
					match("Rser"); 

					}
					break;
				case 4 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:69:5: 'Lser'
					{
					match("Lser"); 

					}
					break;
				case 5 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:70:5: 'Rpar'
					{
					match("Rpar"); 

					}
					break;
				case 6 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:71:5: 'Cpar'
					{
					match("Cpar"); 

					}
					break;
				case 7 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:72:5: 'mfg'
					{
					match("mfg"); 

					}
					break;
				case 8 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:73:5: 'pn'
					{
					match("pn"); 

					}
					break;
				case 9 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:74:5: 'type'
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

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:77:5: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:77:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
			{
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:77:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
			int cnt17=0;
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( ((LA17_0 >= '\t' && LA17_0 <= '\n')||LA17_0=='\r'||LA17_0==' ') ) {
					alt17=1;
				}

				switch (alt17) {
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
					if ( cnt17 >= 1 ) break loop17;
					EarlyExitException eee = new EarlyExitException(17, input);
					throw eee;
				}
				cnt17++;
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

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:85:4: ( ( LETTER | DIGIT ) ( LETTER | DIGIT )* )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:85:6: ( LETTER | DIGIT ) ( LETTER | DIGIT )*
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:85:22: ( LETTER | DIGIT )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( ((LA18_0 >= '0' && LA18_0 <= '9')||(LA18_0 >= 'A' && LA18_0 <= 'Z')||(LA18_0 >= 'a' && LA18_0 <= 'z')) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
					break loop18;
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
		// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:8: ( VERSION | VERSIONNUM | SHEET | POSINTEGER | NEGINTEGER | FLOAT | WIRE | SYMBOL | SYMBOLTYPE | ROTTYPE | MIRRORTYPE | SYMATTR | INSTNAME | VALUE | SPICELINE | TOL | PWR | ASSIGN | WINDOW | WINDOWOPITON | CAPATTRIBUTE | WS | ID )
		int alt19=23;
		alt19 = dfa19.predict(input);
		switch (alt19) {
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
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:35: POSINTEGER
				{
				mPOSINTEGER(); 

				}
				break;
			case 5 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:46: NEGINTEGER
				{
				mNEGINTEGER(); 

				}
				break;
			case 6 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:57: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 7 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:63: WIRE
				{
				mWIRE(); 

				}
				break;
			case 8 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:68: SYMBOL
				{
				mSYMBOL(); 

				}
				break;
			case 9 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:75: SYMBOLTYPE
				{
				mSYMBOLTYPE(); 

				}
				break;
			case 10 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:86: ROTTYPE
				{
				mROTTYPE(); 

				}
				break;
			case 11 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:94: MIRRORTYPE
				{
				mMIRRORTYPE(); 

				}
				break;
			case 12 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:105: SYMATTR
				{
				mSYMATTR(); 

				}
				break;
			case 13 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:113: INSTNAME
				{
				mINSTNAME(); 

				}
				break;
			case 14 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:122: VALUE
				{
				mVALUE(); 

				}
				break;
			case 15 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:128: SPICELINE
				{
				mSPICELINE(); 

				}
				break;
			case 16 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:138: TOL
				{
				mTOL(); 

				}
				break;
			case 17 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:142: PWR
				{
				mPWR(); 

				}
				break;
			case 18 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:146: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 19 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:153: WINDOW
				{
				mWINDOW(); 

				}
				break;
			case 20 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:160: WINDOWOPITON
				{
				mWINDOWOPITON(); 

				}
				break;
			case 21 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:173: CAPATTRIBUTE
				{
				mCAPATTRIBUTE(); 

				}
				break;
			case 22 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:186: WS
				{
				mWS(); 

				}
				break;
			case 23 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:189: ID
				{
				mID(); 

				}
				break;

		}
	}


	protected DFA11 dfa11 = new DFA11(this);
	protected DFA19 dfa19 = new DFA19(this);
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
			return "26:1: FLOAT : ( ( DIGIT )+ '.' ( DIGIT )* ( EXPONENT )? | '.' ( DIGIT )+ ( EXPONENT )? | ( DIGIT )+ EXPONENT );";
		}
	}

	static final String DFA19_eotS =
		"\1\uffff\1\40\1\41\1\30\1\47\2\uffff\12\30\1\uffff\5\30\2\uffff\7\30\2"+
		"\uffff\1\47\4\30\1\uffff\7\30\1\40\1\131\6\30\1\140\25\30\1\6\5\30\3\175"+
		"\2\30\1\u0080\1\uffff\1\131\5\30\1\uffff\1\140\5\30\1\u008b\5\30\1\u0091"+
		"\1\30\1\40\5\30\1\u0091\5\30\1\u009d\1\30\1\uffff\2\175\1\uffff\2\131"+
		"\1\30\2\40\2\140\2\30\1\40\1\uffff\1\40\1\30\1\40\1\u0091\1\40\1\uffff"+
		"\2\30\1\u00a5\1\30\1\u0091\2\30\1\u00a9\3\30\1\uffff\1\30\1\u0091\5\30"+
		"\1\uffff\1\30\1\u0091\1\30\1\uffff\1\u00b5\2\30\1\u00b8\2\30\2\u0091\1"+
		"\u00bb\2\u0091\1\uffff\1\u00bc\1\30\1\uffff\2\30\2\uffff\1\30\1\u00c1"+
		"\1\30\1\u00c3\1\uffff\1\30\1\uffff\1\u0091";
	static final String DFA19_eofS =
		"\u00c5\uffff";
	static final String DFA19_minS =
		"\1\11\1\60\1\56\1\110\1\56\2\uffff\1\111\1\145\1\141\1\156\2\155\2\60"+
		"\1\156\1\157\1\uffff\2\145\2\157\1\146\2\uffff\1\162\1\154\2\145\1\151"+
		"\2\157\2\uffff\1\56\1\53\1\105\1\115\1\151\1\uffff\1\116\1\163\1\160\1"+
		"\144\2\157\1\162\3\60\1\70\1\67\1\147\1\145\1\141\2\60\1\70\1\67\1\163"+
		"\1\155\1\154\1\160\1\156\1\141\1\146\1\145\1\160\1\164\1\147\1\163\1\165"+
		"\1\156\1\146\1\147\1\160\1\164\1\60\1\105\1\101\1\143\1\105\1\104\3\60"+
		"\2\163\1\60\1\uffff\3\60\1\150\2\162\1\uffff\3\60\1\164\1\151\1\163\1"+
		"\60\1\145\1\164\1\162\1\164\1\162\1\60\1\164\1\60\1\151\1\145\2\164\1"+
		"\150\1\60\1\164\1\124\1\117\1\124\1\145\1\60\1\117\1\uffff\2\60\1\uffff"+
		"\2\60\1\164\4\60\1\116\1\163\1\60\1\uffff\1\60\1\145\3\60\1\uffff\2\157"+
		"\1\60\1\145\1\60\1\164\1\157\1\60\1\114\1\124\1\114\1\uffff\1\127\1\60"+
		"\1\141\1\151\1\162\1\155\1\156\1\uffff\1\162\1\60\1\155\1\uffff\1\60\1"+
		"\122\1\151\1\60\1\155\1\142\5\60\1\uffff\1\60\1\156\1\uffff\1\145\1\151"+
		"\2\uffff\1\145\1\60\1\154\1\60\1\uffff\1\145\1\uffff\1\60";
	static final String DFA19_maxS =
		"\3\172\1\160\1\172\2\uffff\1\111\1\145\1\141\1\156\1\155\1\167\1\163\1"+
		"\71\1\162\1\171\1\uffff\1\160\1\163\2\157\1\146\2\uffff\1\162\1\154\2"+
		"\145\1\151\2\157\2\uffff\1\172\1\71\1\105\1\115\1\151\1\uffff\1\122\1"+
		"\163\1\160\1\144\2\157\1\162\2\172\1\60\1\70\1\67\1\147\1\145\1\141\1"+
		"\172\1\60\1\70\1\67\1\166\1\155\1\154\1\160\1\156\1\141\1\146\1\145\1"+
		"\160\1\164\1\147\1\163\1\165\1\156\1\146\1\147\1\160\1\164\1\172\1\105"+
		"\1\102\1\143\1\105\1\104\3\172\2\163\1\172\1\uffff\1\172\2\60\1\150\2"+
		"\162\1\uffff\1\172\2\60\1\164\1\151\1\163\1\172\1\145\1\164\1\162\1\164"+
		"\1\162\1\172\1\164\1\172\1\151\1\145\2\164\1\150\1\172\1\164\1\124\1\117"+
		"\1\124\1\145\1\172\1\117\1\uffff\2\172\1\uffff\2\172\1\164\4\172\1\116"+
		"\1\163\1\172\1\uffff\1\172\1\145\3\172\1\uffff\2\157\1\172\1\145\1\172"+
		"\1\164\1\157\1\172\1\114\1\124\1\114\1\uffff\1\127\1\172\1\141\1\151\1"+
		"\162\1\155\1\156\1\uffff\1\162\1\172\1\155\1\uffff\1\172\1\122\1\151\1"+
		"\172\1\155\1\142\5\172\1\uffff\1\172\1\156\1\uffff\1\145\1\151\2\uffff"+
		"\1\145\1\172\1\154\1\172\1\uffff\1\145\1\uffff\1\172";
	static final String DFA19_acceptS =
		"\5\uffff\1\5\1\6\12\uffff\1\22\5\uffff\1\26\1\27\7\uffff\1\25\1\2\5\uffff"+
		"\1\4\61\uffff\1\12\6\uffff\1\13\34\uffff\1\11\2\uffff\1\21\12\uffff\1"+
		"\20\5\uffff\1\24\13\uffff\1\7\7\uffff\1\16\3\uffff\1\3\13\uffff\1\10\2"+
		"\uffff\1\23\2\uffff\1\1\1\14\4\uffff\1\15\1\uffff\1\17\1\uffff";
	static final String DFA19_specialS =
		"\u00c5\uffff}>";
	static final String[] DFA19_transitionS = {
			"\2\27\2\uffff\1\27\22\uffff\1\27\14\uffff\1\5\1\6\1\uffff\4\4\1\2\5\4"+
			"\3\uffff\1\21\3\uffff\1\30\1\25\1\22\5\30\1\17\2\30\1\23\1\16\4\30\1"+
			"\15\1\3\1\24\1\30\1\1\1\7\3\30\6\uffff\2\30\1\11\5\30\1\12\3\30\1\26"+
			"\1\13\1\30\1\14\1\30\1\10\1\30\1\20\6\30",
			"\12\30\7\uffff\1\30\1\37\1\33\10\30\1\34\5\30\1\35\1\30\1\36\6\30\6"+
			"\uffff\1\32\3\30\1\31\25\30",
			"\1\6\1\uffff\12\42\7\uffff\4\30\1\43\25\30\6\uffff\4\30\1\43\25\30",
			"\1\44\20\uffff\1\45\26\uffff\1\46",
			"\1\6\1\uffff\12\42\7\uffff\4\30\1\43\25\30\6\uffff\4\30\1\43\25\30",
			"",
			"",
			"\1\50",
			"\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\55\1\57\10\uffff\1\56",
			"\1\60\1\62\1\63\6\uffff\1\61\57\uffff\1\64\6\uffff\1\66\2\uffff\1\65",
			"\1\67\1\71\1\72\6\uffff\1\70",
			"\1\73\3\uffff\1\74",
			"\1\75\11\uffff\1\76",
			"",
			"\1\77\12\uffff\1\100",
			"\1\101\15\uffff\1\102",
			"\1\103",
			"\1\104",
			"\1\105",
			"",
			"",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"\1\114",
			"",
			"",
			"\1\6\1\uffff\12\42\7\uffff\4\30\1\43\25\30\6\uffff\4\30\1\43\25\30",
			"\1\6\1\uffff\1\6\2\uffff\12\115",
			"\1\116",
			"\1\117",
			"\1\120",
			"",
			"\1\122\3\uffff\1\121",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\126",
			"\1\127",
			"\1\130",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"\1\132",
			"\1\133",
			"\1\134",
			"\1\135",
			"\1\136",
			"\1\137",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"\1\141",
			"\1\142",
			"\1\143",
			"\1\144\2\uffff\1\145",
			"\1\146",
			"\1\147",
			"\1\150",
			"\1\151",
			"\1\152",
			"\1\153",
			"\1\154",
			"\1\155",
			"\1\156",
			"\1\157",
			"\1\160",
			"\1\161",
			"\1\162",
			"\1\163",
			"\1\164",
			"\1\165",
			"\1\166",
			"\12\115\7\uffff\32\30\6\uffff\32\30",
			"\1\167",
			"\1\171\1\170",
			"\1\172",
			"\1\173",
			"\1\174",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"\1\176",
			"\1\177",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"\1\u0081",
			"\1\u0082",
			"\1\u0083",
			"\1\u0084",
			"\1\u0085",
			"",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"\1\u0086",
			"\1\u0087",
			"\1\u0088",
			"\1\u0089",
			"\1\u008a",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"\1\u008c",
			"\1\u008d",
			"\1\u008e",
			"\1\u008f",
			"\1\u0090",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"\1\u0092",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"\1\u0093",
			"\1\u0094",
			"\1\u0095",
			"\1\u0096",
			"\1\u0097",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"\1\u0098",
			"\1\u0099",
			"\1\u009a",
			"\1\u009b",
			"\1\u009c",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"\1\u009e",
			"",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"\1\u009f",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"\1\u00a0",
			"\1\u00a1",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"\1\u00a2",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"",
			"\1\u00a3",
			"\1\u00a4",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"\1\u00a6",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"\1\u00a7",
			"\1\u00a8",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"\1\u00aa",
			"\1\u00ab",
			"\1\u00ac",
			"",
			"\1\u00ad",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"\1\u00ae",
			"\1\u00af",
			"\1\u00b0",
			"\1\u00b1",
			"\1\u00b2",
			"",
			"\1\u00b3",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"\1\u00b4",
			"",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"\1\u00b6",
			"\1\u00b7",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"\1\u00b9",
			"\1\u00ba",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"\1\u00bd",
			"",
			"\1\u00be",
			"\1\u00bf",
			"",
			"",
			"\1\u00c0",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"\1\u00c2",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"",
			"\1\u00c4",
			"",
			"\12\30\7\uffff\32\30\6\uffff\32\30"
	};

	static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
	static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
	static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
	static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
	static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
	static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
	static final short[][] DFA19_transition;

	static {
		int numStates = DFA19_transitionS.length;
		DFA19_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
		}
	}

	protected class DFA19 extends DFA {

		public DFA19(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 19;
			this.eot = DFA19_eot;
			this.eof = DFA19_eof;
			this.min = DFA19_min;
			this.max = DFA19_max;
			this.accept = DFA19_accept;
			this.special = DFA19_special;
			this.transition = DFA19_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( VERSION | VERSIONNUM | SHEET | POSINTEGER | NEGINTEGER | FLOAT | WIRE | SYMBOL | SYMBOLTYPE | ROTTYPE | MIRRORTYPE | SYMATTR | INSTNAME | VALUE | SPICELINE | TOL | PWR | ASSIGN | WINDOW | WINDOWOPITON | CAPATTRIBUTE | WS | ID );";
		}
	}

}
