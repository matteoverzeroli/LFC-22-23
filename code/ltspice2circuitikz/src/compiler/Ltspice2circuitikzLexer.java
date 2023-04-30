// $ANTLR 3.5.1 C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g 2023-04-30 18:34:19

package compiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class Ltspice2circuitikzLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public Ltspice2circuitikzLexer() {} 
	public Ltspice2circuitikzLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public Ltspice2circuitikzLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g"; }

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:146:8: ( 'a' .. 'z' | 'A' .. 'Z' )
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
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:148:7: ( '0' .. '9' )
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
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:150:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:150:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:150:22: ( '+' | '-' )?
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

			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:150:33: ( '0' .. '9' )+
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

	// $ANTLR start "SPECIALCHAR"
	public final void mSPECIALCHAR() throws RecognitionException {
		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:152:12: ( '\\u0021' .. '\\u002F' | '\\u003A' .. '\\u003C' | '\\u003E' .. '\\u0040' | '\\u005B' .. '\\u0060' | '\\u007B' .. '\\u007E' | '\\u00A1' .. '\\u017F' | '\\u0370' .. '\\u03FF' | '\\u0400' .. '\\u04FF' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:
			{
			if ( (input.LA(1) >= '!' && input.LA(1) <= '/')||(input.LA(1) >= ':' && input.LA(1) <= '<')||(input.LA(1) >= '>' && input.LA(1) <= '@')||(input.LA(1) >= '[' && input.LA(1) <= '`')||(input.LA(1) >= '{' && input.LA(1) <= '~')||(input.LA(1) >= '\u00A1' && input.LA(1) <= '\u017F')||(input.LA(1) >= '\u0370' && input.LA(1) <= '\u04FF') ) {
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
	// $ANTLR end "SPECIALCHAR"

	// $ANTLR start "INTEGER"
	public final void mINTEGER() throws RecognitionException {
		try {
			int _type = INTEGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:157:8: ( ( '-' )? ( DIGIT )+ )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:157:11: ( '-' )? ( DIGIT )+
			{
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:157:11: ( '-' )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='-') ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:157:12: '-'
					{
					match('-'); 
					}
					break;

			}

			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:157:17: ( DIGIT )+
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
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:159:5: ( ( DIGIT )+ '.' ( DIGIT )* ( EXPONENT )? | '.' ( DIGIT )+ ( EXPONENT )? | ( DIGIT )+ EXPONENT )
			int alt11=3;
			alt11 = dfa11.predict(input);
			switch (alt11) {
				case 1 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:159:9: ( DIGIT )+ '.' ( DIGIT )* ( EXPONENT )?
					{
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:159:9: ( DIGIT )+
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
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:159:20: ( DIGIT )*
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

					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:159:27: ( EXPONENT )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0=='E'||LA7_0=='e') ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:159:27: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:160:9: '.' ( DIGIT )+ ( EXPONENT )?
					{
					match('.'); 
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:160:13: ( DIGIT )+
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

					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:160:20: ( EXPONENT )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0=='E'||LA9_0=='e') ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:160:20: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 3 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:161:9: ( DIGIT )+ EXPONENT
					{
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:161:9: ( DIGIT )+
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

	// $ANTLR start "VERSION"
	public final void mVERSION() throws RecognitionException {
		try {
			int _type = VERSION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:166:8: ( 'Version' | 'version' )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0=='V') ) {
				alt12=1;
			}
			else if ( (LA12_0=='v') ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:166:11: 'Version'
					{
					match("Version"); 

					}
					break;
				case 2 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:166:23: 'version'
					{
					match("version"); 

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
	// $ANTLR end "VERSION"

	// $ANTLR start "SHEET"
	public final void mSHEET() throws RecognitionException {
		try {
			int _type = SHEET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:167:6: ( 'SHEET' | 'sheet' )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0=='S') ) {
				alt13=1;
			}
			else if ( (LA13_0=='s') ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:167:9: 'SHEET'
					{
					match("SHEET"); 

					}
					break;
				case 2 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:167:19: 'sheet'
					{
					match("sheet"); 

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
	// $ANTLR end "SHEET"

	// $ANTLR start "WIRE"
	public final void mWIRE() throws RecognitionException {
		try {
			int _type = WIRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:168:5: ( 'WIRE' | 'wire' )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0=='W') ) {
				alt14=1;
			}
			else if ( (LA14_0=='w') ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:168:8: 'WIRE'
					{
					match("WIRE"); 

					}
					break;
				case 2 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:168:17: 'wire'
					{
					match("wire"); 

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
	// $ANTLR end "WIRE"

	// $ANTLR start "SYMBOL"
	public final void mSYMBOL() throws RecognitionException {
		try {
			int _type = SYMBOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:169:8: ( 'SYMBOL' | 'symbol' )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0=='S') ) {
				alt15=1;
			}
			else if ( (LA15_0=='s') ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:169:10: 'SYMBOL'
					{
					match("SYMBOL"); 

					}
					break;
				case 2 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:169:21: 'symbol'
					{
					match("symbol"); 

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
	// $ANTLR end "SYMBOL"

	// $ANTLR start "SYMATTR"
	public final void mSYMATTR() throws RecognitionException {
		try {
			int _type = SYMATTR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:170:9: ( 'SYMATTR' | 'symattr' )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0=='S') ) {
				alt16=1;
			}
			else if ( (LA16_0=='s') ) {
				alt16=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:170:11: 'SYMATTR'
					{
					match("SYMATTR"); 

					}
					break;
				case 2 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:170:23: 'symattr'
					{
					match("symattr"); 

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
	// $ANTLR end "SYMATTR"

	// $ANTLR start "ASSIGN"
	public final void mASSIGN() throws RecognitionException {
		try {
			int _type = ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:171:8: ( '=' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:171:10: '='
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
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:172:9: ( 'WINDOW' | 'windows' )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0=='W') ) {
				alt17=1;
			}
			else if ( (LA17_0=='w') ) {
				alt17=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:172:11: 'WINDOW'
					{
					match("WINDOW"); 

					}
					break;
				case 2 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:172:22: 'windows'
					{
					match("windows"); 

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
	// $ANTLR end "WINDOW"

	// $ANTLR start "FLAG"
	public final void mFLAG() throws RecognitionException {
		try {
			int _type = FLAG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:173:7: ( 'FLAG' | 'flag' )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0=='F') ) {
				alt18=1;
			}
			else if ( (LA18_0=='f') ) {
				alt18=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:173:9: 'FLAG'
					{
					match("FLAG"); 

					}
					break;
				case 2 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:173:18: 'flag'
					{
					match("flag"); 

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
	// $ANTLR end "FLAG"

	// $ANTLR start "IOPIN"
	public final void mIOPIN() throws RecognitionException {
		try {
			int _type = IOPIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:174:7: ( 'IOPIN' | 'iopin' )
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0=='I') ) {
				alt19=1;
			}
			else if ( (LA19_0=='i') ) {
				alt19=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:174:9: 'IOPIN'
					{
					match("IOPIN"); 

					}
					break;
				case 2 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:174:19: 'iopin'
					{
					match("iopin"); 

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
	// $ANTLR end "IOPIN"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:176:5: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:176:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
			{
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:176:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:183:8: ( '\"' (~ ( '\"' ) )* '\"' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:183:10: '\"' (~ ( '\"' ) )* '\"'
			{
			match('\"'); 
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:183:14: (~ ( '\"' ) )*
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
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:185:4: ( ( LETTER | DIGIT | SPECIALCHAR ) ( LETTER | DIGIT | SPECIALCHAR )* )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:185:6: ( LETTER | DIGIT | SPECIALCHAR ) ( LETTER | DIGIT | SPECIALCHAR )*
			{
			if ( (input.LA(1) >= '!' && input.LA(1) <= '<')||(input.LA(1) >= '>' && input.LA(1) <= '~')||(input.LA(1) >= '\u00A1' && input.LA(1) <= '\u017F')||(input.LA(1) >= '\u0370' && input.LA(1) <= '\u04FF') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:185:36: ( LETTER | DIGIT | SPECIALCHAR )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( ((LA22_0 >= '!' && LA22_0 <= '<')||(LA22_0 >= '>' && LA22_0 <= '~')||(LA22_0 >= '\u00A1' && LA22_0 <= '\u017F')||(LA22_0 >= '\u0370' && LA22_0 <= '\u04FF')) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:
					{
					if ( (input.LA(1) >= '!' && input.LA(1) <= '<')||(input.LA(1) >= '>' && input.LA(1) <= '~')||(input.LA(1) >= '\u00A1' && input.LA(1) <= '\u017F')||(input.LA(1) >= '\u0370' && input.LA(1) <= '\u04FF') ) {
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

	// $ANTLR start "ERROR_TK"
	public final void mERROR_TK() throws RecognitionException {
		try {
			int _type = ERROR_TK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:187:11: ( . )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:187:13: .
			{
			matchAny(); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ERROR_TK"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:8: ( INTEGER | FLOAT | VERSION | SHEET | WIRE | SYMBOL | SYMATTR | ASSIGN | WINDOW | FLAG | IOPIN | WS | STRING | ID | ERROR_TK )
		int alt23=15;
		alt23 = dfa23.predict(input);
		switch (alt23) {
			case 1 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:10: INTEGER
				{
				mINTEGER(); 

				}
				break;
			case 2 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:18: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 3 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:24: VERSION
				{
				mVERSION(); 

				}
				break;
			case 4 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:32: SHEET
				{
				mSHEET(); 

				}
				break;
			case 5 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:38: WIRE
				{
				mWIRE(); 

				}
				break;
			case 6 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:43: SYMBOL
				{
				mSYMBOL(); 

				}
				break;
			case 7 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:50: SYMATTR
				{
				mSYMATTR(); 

				}
				break;
			case 8 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:58: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 9 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:65: WINDOW
				{
				mWINDOW(); 

				}
				break;
			case 10 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:72: FLAG
				{
				mFLAG(); 

				}
				break;
			case 11 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:77: IOPIN
				{
				mIOPIN(); 

				}
				break;
			case 12 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:83: WS
				{
				mWS(); 

				}
				break;
			case 13 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:86: STRING
				{
				mSTRING(); 

				}
				break;
			case 14 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:93: ID
				{
				mID(); 

				}
				break;
			case 15 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:96: ERROR_TK
				{
				mERROR_TK(); 

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
			return "158:1: FLOAT : ( ( DIGIT )+ '.' ( DIGIT )* ( EXPONENT )? | '.' ( DIGIT )+ ( EXPONENT )? | ( DIGIT )+ EXPONENT );";
		}
	}

	static final String DFA23_eotS =
		"\1\uffff\1\24\1\25\7\24\1\uffff\4\24\1\uffff\1\24\2\uffff\1\25\2\uffff"+
		"\1\25\1\55\1\24\1\55\10\24\1\uffff\4\24\1\uffff\1\24\1\52\1\uffff\1\55"+
		"\1\24\1\uffff\1\24\1\55\20\24\1\55\1\24\1\55\10\24\1\133\1\24\1\133\1"+
		"\24\2\136\4\24\1\143\2\24\1\143\2\24\1\uffff\2\24\1\uffff\2\152\2\24\1"+
		"\uffff\1\155\1\24\1\155\1\24\1\160\1\24\1\uffff\2\162\1\uffff\2\163\1"+
		"\uffff\1\160\2\uffff";
	static final String DFA23_eofS =
		"\164\uffff";
	static final String DFA23_minS =
		"\1\0\1\60\1\41\1\60\2\145\1\110\1\150\1\111\1\151\1\uffff\1\114\1\154"+
		"\1\117\1\157\1\uffff\1\0\2\uffff\1\41\2\uffff\2\41\1\53\1\41\2\162\1\105"+
		"\1\115\1\145\1\155\1\116\1\156\1\uffff\1\101\1\141\1\120\1\160\1\uffff"+
		"\1\0\1\41\1\uffff\1\41\1\53\1\uffff\1\60\1\41\1\53\2\163\1\105\1\101\1"+
		"\145\1\141\1\105\1\104\1\145\1\144\1\107\1\147\1\111\1\151\1\60\1\41\1"+
		"\60\1\41\2\151\1\124\1\117\1\124\1\164\1\157\1\164\1\41\1\117\1\41\1\157"+
		"\2\41\1\116\1\156\2\157\1\41\1\114\1\124\1\41\1\154\1\164\1\uffff\1\127"+
		"\1\167\1\uffff\2\41\2\156\1\uffff\1\41\1\122\1\41\1\162\1\41\1\163\1\uffff"+
		"\2\41\1\uffff\2\41\1\uffff\1\41\2\uffff";
	static final String DFA23_maxS =
		"\1\uffff\1\71\1\u04ff\1\71\2\145\1\131\1\171\1\111\1\151\1\uffff\1\114"+
		"\1\154\1\117\1\157\1\uffff\1\uffff\2\uffff\1\u04ff\2\uffff\2\u04ff\1\71"+
		"\1\u04ff\2\162\1\105\1\115\1\145\1\155\1\122\1\162\1\uffff\1\101\1\141"+
		"\1\120\1\160\1\uffff\1\uffff\1\u04ff\1\uffff\1\u04ff\1\71\1\uffff\1\71"+
		"\1\u04ff\1\71\2\163\1\105\1\102\1\145\1\142\1\105\1\104\1\145\1\144\1"+
		"\107\1\147\1\111\1\151\1\71\1\u04ff\1\71\1\u04ff\2\151\1\124\1\117\1\124"+
		"\1\164\1\157\1\164\1\u04ff\1\117\1\u04ff\1\157\2\u04ff\1\116\1\156\2\157"+
		"\1\u04ff\1\114\1\124\1\u04ff\1\154\1\164\1\uffff\1\127\1\167\1\uffff\2"+
		"\u04ff\2\156\1\uffff\1\u04ff\1\122\1\u04ff\1\162\1\u04ff\1\163\1\uffff"+
		"\2\u04ff\1\uffff\2\u04ff\1\uffff\1\u04ff\2\uffff";
	static final String DFA23_acceptS =
		"\12\uffff\1\10\4\uffff\1\14\1\uffff\1\16\1\17\1\uffff\1\16\1\1\14\uffff"+
		"\1\10\4\uffff\1\14\2\uffff\1\15\2\uffff\1\2\55\uffff\1\5\2\uffff\1\12"+
		"\4\uffff\1\4\6\uffff\1\13\2\uffff\1\6\2\uffff\1\11\1\uffff\1\3\1\7";
	static final String DFA23_specialS =
		"\1\0\17\uffff\1\1\27\uffff\1\2\113\uffff}>";
	static final String[] DFA23_transitionS = {
			"\11\22\2\17\2\22\1\17\22\22\1\17\1\21\1\20\12\21\1\1\1\3\1\21\12\2\3"+
			"\21\1\12\10\21\1\13\2\21\1\15\11\21\1\6\2\21\1\4\1\10\16\21\1\14\2\21"+
			"\1\16\11\21\1\7\2\21\1\5\1\11\7\21\42\22\u00df\21\u01f0\22\u0190\21\ufb00"+
			"\22",
			"\12\23",
			"\15\24\1\27\1\24\12\26\3\24\1\uffff\7\24\1\30\37\24\1\30\31\24\42\uffff"+
			"\u00df\24\u01f0\uffff\u0190\24",
			"\12\31",
			"\1\32",
			"\1\33",
			"\1\34\20\uffff\1\35",
			"\1\36\20\uffff\1\37",
			"\1\40",
			"\1\41",
			"",
			"\1\43",
			"\1\44",
			"\1\45",
			"\1\46",
			"",
			"\41\52\1\50\1\51\32\50\1\52\101\50\42\52\u00df\50\u01f0\52\u0190\50"+
			"\ufb00\52",
			"",
			"",
			"\17\24\12\23\3\24\1\uffff\101\24\42\uffff\u00df\24\u01f0\uffff\u0190"+
			"\24",
			"",
			"",
			"\15\24\1\27\1\24\12\26\3\24\1\uffff\7\24\1\30\37\24\1\30\31\24\42\uffff"+
			"\u00df\24\u01f0\uffff\u0190\24",
			"\17\24\12\53\3\24\1\uffff\7\24\1\54\37\24\1\54\31\24\42\uffff\u00df"+
			"\24\u01f0\uffff\u0190\24",
			"\1\56\1\uffff\1\56\2\uffff\12\57",
			"\17\24\12\31\3\24\1\uffff\7\24\1\60\37\24\1\60\31\24\42\uffff\u00df"+
			"\24\u01f0\uffff\u0190\24",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\65",
			"\1\66",
			"\1\70\3\uffff\1\67",
			"\1\72\3\uffff\1\71",
			"",
			"\1\73",
			"\1\74",
			"\1\75",
			"\1\76",
			"",
			"\41\52\1\50\1\51\32\50\1\52\101\50\42\52\u00df\50\u01f0\52\u0190\50"+
			"\ufb00\52",
			"\34\24\1\uffff\101\24\42\uffff\u00df\24\u01f0\uffff\u0190\24",
			"",
			"\17\24\12\53\3\24\1\uffff\7\24\1\54\37\24\1\54\31\24\42\uffff\u00df"+
			"\24\u01f0\uffff\u0190\24",
			"\1\77\1\uffff\1\77\2\uffff\12\100",
			"",
			"\12\57",
			"\17\24\12\57\3\24\1\uffff\101\24\42\uffff\u00df\24\u01f0\uffff\u0190"+
			"\24",
			"\1\101\1\uffff\1\101\2\uffff\12\102",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\107\1\106",
			"\1\110",
			"\1\112\1\111",
			"\1\113",
			"\1\114",
			"\1\115",
			"\1\116",
			"\1\117",
			"\1\120",
			"\1\121",
			"\1\122",
			"\12\100",
			"\17\24\12\100\3\24\1\uffff\101\24\42\uffff\u00df\24\u01f0\uffff\u0190"+
			"\24",
			"\12\102",
			"\17\24\12\102\3\24\1\uffff\101\24\42\uffff\u00df\24\u01f0\uffff\u0190"+
			"\24",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\126",
			"\1\127",
			"\1\130",
			"\1\131",
			"\1\132",
			"\34\24\1\uffff\101\24\42\uffff\u00df\24\u01f0\uffff\u0190\24",
			"\1\134",
			"\34\24\1\uffff\101\24\42\uffff\u00df\24\u01f0\uffff\u0190\24",
			"\1\135",
			"\34\24\1\uffff\101\24\42\uffff\u00df\24\u01f0\uffff\u0190\24",
			"\34\24\1\uffff\101\24\42\uffff\u00df\24\u01f0\uffff\u0190\24",
			"\1\137",
			"\1\140",
			"\1\141",
			"\1\142",
			"\34\24\1\uffff\101\24\42\uffff\u00df\24\u01f0\uffff\u0190\24",
			"\1\144",
			"\1\145",
			"\34\24\1\uffff\101\24\42\uffff\u00df\24\u01f0\uffff\u0190\24",
			"\1\146",
			"\1\147",
			"",
			"\1\150",
			"\1\151",
			"",
			"\34\24\1\uffff\101\24\42\uffff\u00df\24\u01f0\uffff\u0190\24",
			"\34\24\1\uffff\101\24\42\uffff\u00df\24\u01f0\uffff\u0190\24",
			"\1\153",
			"\1\154",
			"",
			"\34\24\1\uffff\101\24\42\uffff\u00df\24\u01f0\uffff\u0190\24",
			"\1\156",
			"\34\24\1\uffff\101\24\42\uffff\u00df\24\u01f0\uffff\u0190\24",
			"\1\157",
			"\34\24\1\uffff\101\24\42\uffff\u00df\24\u01f0\uffff\u0190\24",
			"\1\161",
			"",
			"\34\24\1\uffff\101\24\42\uffff\u00df\24\u01f0\uffff\u0190\24",
			"\34\24\1\uffff\101\24\42\uffff\u00df\24\u01f0\uffff\u0190\24",
			"",
			"\34\24\1\uffff\101\24\42\uffff\u00df\24\u01f0\uffff\u0190\24",
			"\34\24\1\uffff\101\24\42\uffff\u00df\24\u01f0\uffff\u0190\24",
			"",
			"\34\24\1\uffff\101\24\42\uffff\u00df\24\u01f0\uffff\u0190\24",
			"",
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
			return "1:1: Tokens : ( INTEGER | FLOAT | VERSION | SHEET | WIRE | SYMBOL | SYMATTR | ASSIGN | WINDOW | FLAG | IOPIN | WS | STRING | ID | ERROR_TK );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA23_0 = input.LA(1);
						s = -1;
						if ( (LA23_0=='-') ) {s = 1;}
						else if ( ((LA23_0 >= '0' && LA23_0 <= '9')) ) {s = 2;}
						else if ( (LA23_0=='.') ) {s = 3;}
						else if ( (LA23_0=='V') ) {s = 4;}
						else if ( (LA23_0=='v') ) {s = 5;}
						else if ( (LA23_0=='S') ) {s = 6;}
						else if ( (LA23_0=='s') ) {s = 7;}
						else if ( (LA23_0=='W') ) {s = 8;}
						else if ( (LA23_0=='w') ) {s = 9;}
						else if ( (LA23_0=='=') ) {s = 10;}
						else if ( (LA23_0=='F') ) {s = 11;}
						else if ( (LA23_0=='f') ) {s = 12;}
						else if ( (LA23_0=='I') ) {s = 13;}
						else if ( (LA23_0=='i') ) {s = 14;}
						else if ( ((LA23_0 >= '\t' && LA23_0 <= '\n')||LA23_0=='\r'||LA23_0==' ') ) {s = 15;}
						else if ( (LA23_0=='\"') ) {s = 16;}
						else if ( (LA23_0=='!'||(LA23_0 >= '#' && LA23_0 <= ',')||LA23_0=='/'||(LA23_0 >= ':' && LA23_0 <= '<')||(LA23_0 >= '>' && LA23_0 <= 'E')||(LA23_0 >= 'G' && LA23_0 <= 'H')||(LA23_0 >= 'J' && LA23_0 <= 'R')||(LA23_0 >= 'T' && LA23_0 <= 'U')||(LA23_0 >= 'X' && LA23_0 <= 'e')||(LA23_0 >= 'g' && LA23_0 <= 'h')||(LA23_0 >= 'j' && LA23_0 <= 'r')||(LA23_0 >= 't' && LA23_0 <= 'u')||(LA23_0 >= 'x' && LA23_0 <= '~')||(LA23_0 >= '\u00A1' && LA23_0 <= '\u017F')||(LA23_0 >= '\u0370' && LA23_0 <= '\u04FF')) ) {s = 17;}
						else if ( ((LA23_0 >= '\u0000' && LA23_0 <= '\b')||(LA23_0 >= '\u000B' && LA23_0 <= '\f')||(LA23_0 >= '\u000E' && LA23_0 <= '\u001F')||(LA23_0 >= '\u007F' && LA23_0 <= '\u00A0')||(LA23_0 >= '\u0180' && LA23_0 <= '\u036F')||(LA23_0 >= '\u0500' && LA23_0 <= '\uFFFF')) ) {s = 18;}
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA23_16 = input.LA(1);
						s = -1;
						if ( (LA23_16=='!'||(LA23_16 >= '#' && LA23_16 <= '<')||(LA23_16 >= '>' && LA23_16 <= '~')||(LA23_16 >= '\u00A1' && LA23_16 <= '\u017F')||(LA23_16 >= '\u0370' && LA23_16 <= '\u04FF')) ) {s = 40;}
						else if ( (LA23_16=='\"') ) {s = 41;}
						else if ( ((LA23_16 >= '\u0000' && LA23_16 <= ' ')||LA23_16=='='||(LA23_16 >= '\u007F' && LA23_16 <= '\u00A0')||(LA23_16 >= '\u0180' && LA23_16 <= '\u036F')||(LA23_16 >= '\u0500' && LA23_16 <= '\uFFFF')) ) {s = 42;}
						else s = 20;
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA23_40 = input.LA(1);
						s = -1;
						if ( (LA23_40=='\"') ) {s = 41;}
						else if ( (LA23_40=='!'||(LA23_40 >= '#' && LA23_40 <= '<')||(LA23_40 >= '>' && LA23_40 <= '~')||(LA23_40 >= '\u00A1' && LA23_40 <= '\u017F')||(LA23_40 >= '\u0370' && LA23_40 <= '\u04FF')) ) {s = 40;}
						else if ( ((LA23_40 >= '\u0000' && LA23_40 <= ' ')||LA23_40=='='||(LA23_40 >= '\u007F' && LA23_40 <= '\u00A0')||(LA23_40 >= '\u0180' && LA23_40 <= '\u036F')||(LA23_40 >= '\u0500' && LA23_40 <= '\uFFFF')) ) {s = 42;}
						else s = 20;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 23, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
