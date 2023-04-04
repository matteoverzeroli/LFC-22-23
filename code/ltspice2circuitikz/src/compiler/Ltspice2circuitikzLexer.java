// $ANTLR 3.5.1 C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g 2023-04-04 19:07:31

package compiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class Ltspice2circuitikzLexer extends Lexer {
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
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:87:8: ( 'a' .. 'z' | 'A' .. 'Z' )
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
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:89:7: ( '0' .. '9' )
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
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:91:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:91:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:91:22: ( '+' | '-' )?
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

			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:91:33: ( '0' .. '9' )+
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
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:93:12: ( '\\u0021' .. '\\u002F' | '\\u003A' .. '\\u003C' | '\\u003E' .. '\\u0040' | '\\u005B' .. '\\u0060' | '\\u007B' .. '\\u007E' | '\\u00A1' .. '\\u017F' | '\\u0370' .. '\\u03FF' | '\\u0400' .. '\\u04FF' )
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
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:98:8: ( ( '-' )? ( DIGIT )+ )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:98:11: ( '-' )? ( DIGIT )+
			{
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:98:11: ( '-' )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='-') ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:98:12: '-'
					{
					match('-'); 
					}
					break;

			}

			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:98:17: ( DIGIT )+
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
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:100:5: ( ( DIGIT )+ '.' ( DIGIT )* ( EXPONENT )? | '.' ( DIGIT )+ ( EXPONENT )? | ( DIGIT )+ EXPONENT )
			int alt11=3;
			alt11 = dfa11.predict(input);
			switch (alt11) {
				case 1 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:100:9: ( DIGIT )+ '.' ( DIGIT )* ( EXPONENT )?
					{
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:100:9: ( DIGIT )+
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
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:100:20: ( DIGIT )*
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

					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:100:27: ( EXPONENT )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0=='E'||LA7_0=='e') ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:100:27: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:101:9: '.' ( DIGIT )+ ( EXPONENT )?
					{
					match('.'); 
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:101:13: ( DIGIT )+
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

					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:101:20: ( EXPONENT )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0=='E'||LA9_0=='e') ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:101:20: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 3 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:102:9: ( DIGIT )+ EXPONENT
					{
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:102:9: ( DIGIT )+
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
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:107:8: ( 'Version' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:107:11: 'Version'
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

	// $ANTLR start "SHEET"
	public final void mSHEET() throws RecognitionException {
		try {
			int _type = SHEET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:108:6: ( 'SHEET' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:108:9: 'SHEET'
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

	// $ANTLR start "WIRE"
	public final void mWIRE() throws RecognitionException {
		try {
			int _type = WIRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:109:5: ( 'WIRE' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:109:8: 'WIRE'
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
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:110:8: ( 'SYMBOL' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:110:10: 'SYMBOL'
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

	// $ANTLR start "SYMATTR"
	public final void mSYMATTR() throws RecognitionException {
		try {
			int _type = SYMATTR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:111:9: ( 'SYMATTR' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:111:11: 'SYMATTR'
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

	// $ANTLR start "ASSIGN"
	public final void mASSIGN() throws RecognitionException {
		try {
			int _type = ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:112:8: ( '=' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:112:10: '='
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
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:113:9: ( 'WINDOW' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:113:11: 'WINDOW'
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

	// $ANTLR start "FLAG"
	public final void mFLAG() throws RecognitionException {
		try {
			int _type = FLAG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:114:7: ( 'FLAG' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:114:9: 'FLAG'
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
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:115:7: ( 'IOPIN' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:115:9: 'IOPIN'
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

	// $ANTLR start "DESCRIPTION"
	public final void mDESCRIPTION() throws RecognitionException {
		try {
			int _type = DESCRIPTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:119:12: ( 'Description' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:119:14: 'Description'
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
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:120:6: ( 'Type' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:120:8: 'Type'
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

	// $ANTLR start "VALUE"
	public final void mVALUE() throws RecognitionException {
		try {
			int _type = VALUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:121:7: ( 'Value' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:121:9: 'Value'
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

	// $ANTLR start "INSTNAME"
	public final void mINSTNAME() throws RecognitionException {
		try {
			int _type = INSTNAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:122:9: ( 'InstName' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:122:11: 'InstName'
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

	// $ANTLR start "SPICELINE"
	public final void mSPICELINE() throws RecognitionException {
		try {
			int _type = SPICELINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:123:11: ( 'SpiceLine' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:123:13: 'SpiceLine'
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

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:125:5: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:125:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
			{
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:125:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
			int cnt12=0;
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( ((LA12_0 >= '\t' && LA12_0 <= '\n')||LA12_0=='\r'||LA12_0==' ') ) {
					alt12=1;
				}

				switch (alt12) {
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
					if ( cnt12 >= 1 ) break loop12;
					EarlyExitException eee = new EarlyExitException(12, input);
					throw eee;
				}
				cnt12++;
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
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:132:8: ( '\"' (~ ( '\"' ) )* '\"' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:132:10: '\"' (~ ( '\"' ) )* '\"'
			{
			match('\"'); 
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:132:14: (~ ( '\"' ) )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( ((LA13_0 >= '\u0000' && LA13_0 <= '!')||(LA13_0 >= '#' && LA13_0 <= '\uFFFF')) ) {
					alt13=1;
				}

				switch (alt13) {
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
					break loop13;
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
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:133:4: ( ( LETTER | DIGIT | SPECIALCHAR ) ( LETTER | DIGIT | SPECIALCHAR )* )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:133:6: ( LETTER | DIGIT | SPECIALCHAR ) ( LETTER | DIGIT | SPECIALCHAR )*
			{
			if ( (input.LA(1) >= '!' && input.LA(1) <= '<')||(input.LA(1) >= '>' && input.LA(1) <= '~')||(input.LA(1) >= '\u00A1' && input.LA(1) <= '\u017F')||(input.LA(1) >= '\u0370' && input.LA(1) <= '\u04FF') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:133:36: ( LETTER | DIGIT | SPECIALCHAR )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( ((LA14_0 >= '!' && LA14_0 <= '<')||(LA14_0 >= '>' && LA14_0 <= '~')||(LA14_0 >= '\u00A1' && LA14_0 <= '\u017F')||(LA14_0 >= '\u0370' && LA14_0 <= '\u04FF')) ) {
					alt14=1;
				}

				switch (alt14) {
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
					break loop14;
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
		// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:8: ( INTEGER | FLOAT | VERSION | SHEET | WIRE | SYMBOL | SYMATTR | ASSIGN | WINDOW | FLAG | IOPIN | DESCRIPTION | TYPE | VALUE | INSTNAME | SPICELINE | WS | STRING | ID )
		int alt15=19;
		alt15 = dfa15.predict(input);
		switch (alt15) {
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
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:83: DESCRIPTION
				{
				mDESCRIPTION(); 

				}
				break;
			case 13 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:95: TYPE
				{
				mTYPE(); 

				}
				break;
			case 14 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:100: VALUE
				{
				mVALUE(); 

				}
				break;
			case 15 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:106: INSTNAME
				{
				mINSTNAME(); 

				}
				break;
			case 16 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:115: SPICELINE
				{
				mSPICELINE(); 

				}
				break;
			case 17 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:125: WS
				{
				mWS(); 

				}
				break;
			case 18 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:128: STRING
				{
				mSTRING(); 

				}
				break;
			case 19 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:135: ID
				{
				mID(); 

				}
				break;

		}
	}


	protected DFA11 dfa11 = new DFA11(this);
	protected DFA15 dfa15 = new DFA15(this);
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
			return "99:1: FLOAT : ( ( DIGIT )+ '.' ( DIGIT )* ( EXPONENT )? | '.' ( DIGIT )+ ( EXPONENT )? | ( DIGIT )+ EXPONENT );";
		}
	}

	static final String DFA15_eotS =
		"\1\uffff\1\16\1\20\4\16\1\uffff\4\16\1\uffff\1\16\1\uffff\1\20\1\uffff"+
		"\1\20\1\45\1\16\1\45\14\16\1\42\1\uffff\1\45\1\16\1\uffff\1\16\1\45\16"+
		"\16\1\45\1\16\1\45\6\16\1\114\1\16\1\116\3\16\1\122\1\16\1\124\1\125\3"+
		"\16\1\uffff\1\16\1\uffff\1\132\2\16\1\uffff\1\16\2\uffff\1\136\2\16\1"+
		"\141\1\uffff\2\16\1\144\1\uffff\1\145\1\16\1\uffff\2\16\2\uffff\1\16\1"+
		"\152\1\16\1\154\1\uffff\1\16\1\uffff\1\16\1\157\1\uffff";
	static final String DFA15_eofS =
		"\160\uffff";
	static final String DFA15_minS =
		"\1\11\1\60\1\41\1\60\1\141\1\110\1\111\1\uffff\1\114\1\117\1\145\1\171"+
		"\1\uffff\1\0\1\uffff\1\41\1\uffff\2\41\1\53\1\41\1\162\1\154\1\105\1\115"+
		"\1\151\1\116\1\101\1\120\2\163\1\160\1\0\1\41\1\uffff\1\41\1\53\1\uffff"+
		"\1\60\1\41\1\53\1\163\1\165\1\105\1\101\1\143\1\105\1\104\1\107\1\111"+
		"\1\164\1\143\1\145\1\60\1\41\1\60\1\41\1\151\1\145\1\124\1\117\1\124\1"+
		"\145\1\41\1\117\1\41\2\116\1\162\1\41\1\157\2\41\1\114\1\124\1\114\1\uffff"+
		"\1\127\1\uffff\1\41\1\141\1\151\1\uffff\1\156\2\uffff\1\41\1\122\1\151"+
		"\1\41\1\uffff\1\155\1\160\1\41\1\uffff\1\41\1\156\1\uffff\1\145\1\164"+
		"\2\uffff\1\145\1\41\1\151\1\41\1\uffff\1\157\1\uffff\1\156\1\41\1\uffff";
	static final String DFA15_maxS =
		"\1\u04ff\1\71\1\u04ff\1\71\1\145\1\160\1\111\1\uffff\1\114\1\156\1\145"+
		"\1\171\1\uffff\1\uffff\1\uffff\1\u04ff\1\uffff\2\u04ff\1\71\1\u04ff\1"+
		"\162\1\154\1\105\1\115\1\151\1\122\1\101\1\120\2\163\1\160\1\uffff\1\u04ff"+
		"\1\uffff\1\u04ff\1\71\1\uffff\1\71\1\u04ff\1\71\1\163\1\165\1\105\1\102"+
		"\1\143\1\105\1\104\1\107\1\111\1\164\1\143\1\145\1\71\1\u04ff\1\71\1\u04ff"+
		"\1\151\1\145\1\124\1\117\1\124\1\145\1\u04ff\1\117\1\u04ff\2\116\1\162"+
		"\1\u04ff\1\157\2\u04ff\1\114\1\124\1\114\1\uffff\1\127\1\uffff\1\u04ff"+
		"\1\141\1\151\1\uffff\1\156\2\uffff\1\u04ff\1\122\1\151\1\u04ff\1\uffff"+
		"\1\155\1\160\1\u04ff\1\uffff\1\u04ff\1\156\1\uffff\1\145\1\164\2\uffff"+
		"\1\145\1\u04ff\1\151\1\u04ff\1\uffff\1\157\1\uffff\1\156\1\u04ff\1\uffff";
	static final String DFA15_acceptS =
		"\7\uffff\1\10\4\uffff\1\21\1\uffff\1\23\1\uffff\1\1\21\uffff\1\22\2\uffff"+
		"\1\2\46\uffff\1\5\1\uffff\1\12\3\uffff\1\15\1\uffff\1\16\1\4\4\uffff\1"+
		"\13\3\uffff\1\6\2\uffff\1\11\2\uffff\1\3\1\7\4\uffff\1\17\1\uffff\1\20"+
		"\2\uffff\1\14";
	static final String DFA15_specialS =
		"\15\uffff\1\1\22\uffff\1\0\117\uffff}>";
	static final String[] DFA15_transitionS = {
			"\2\14\2\uffff\1\14\22\uffff\1\14\1\16\1\15\12\16\1\1\1\3\1\16\12\2\3"+
			"\16\1\7\6\16\1\12\1\16\1\10\2\16\1\11\11\16\1\5\1\13\1\16\1\4\1\6\47"+
			"\16\42\uffff\u00df\16\u01f0\uffff\u0190\16",
			"\12\17",
			"\15\16\1\22\1\16\12\21\3\16\1\uffff\7\16\1\23\37\16\1\23\31\16\42\uffff"+
			"\u00df\16\u01f0\uffff\u0190\16",
			"\12\24",
			"\1\26\3\uffff\1\25",
			"\1\27\20\uffff\1\30\26\uffff\1\31",
			"\1\32",
			"",
			"\1\33",
			"\1\34\36\uffff\1\35",
			"\1\36",
			"\1\37",
			"",
			"\41\42\1\40\1\41\32\40\1\42\101\40\42\42\u00df\40\u01f0\42\u0190\40"+
			"\ufb00\42",
			"",
			"\17\16\12\17\3\16\1\uffff\101\16\42\uffff\u00df\16\u01f0\uffff\u0190"+
			"\16",
			"",
			"\15\16\1\22\1\16\12\21\3\16\1\uffff\7\16\1\23\37\16\1\23\31\16\42\uffff"+
			"\u00df\16\u01f0\uffff\u0190\16",
			"\17\16\12\43\3\16\1\uffff\7\16\1\44\37\16\1\44\31\16\42\uffff\u00df"+
			"\16\u01f0\uffff\u0190\16",
			"\1\46\1\uffff\1\46\2\uffff\12\47",
			"\17\16\12\24\3\16\1\uffff\7\16\1\50\37\16\1\50\31\16\42\uffff\u00df"+
			"\16\u01f0\uffff\u0190\16",
			"\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\55",
			"\1\57\3\uffff\1\56",
			"\1\60",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"\41\42\1\40\1\41\32\40\1\42\101\40\42\42\u00df\40\u01f0\42\u0190\40"+
			"\ufb00\42",
			"\34\16\1\uffff\101\16\42\uffff\u00df\16\u01f0\uffff\u0190\16",
			"",
			"\17\16\12\43\3\16\1\uffff\7\16\1\44\37\16\1\44\31\16\42\uffff\u00df"+
			"\16\u01f0\uffff\u0190\16",
			"\1\65\1\uffff\1\65\2\uffff\12\66",
			"",
			"\12\47",
			"\17\16\12\47\3\16\1\uffff\101\16\42\uffff\u00df\16\u01f0\uffff\u0190"+
			"\16",
			"\1\67\1\uffff\1\67\2\uffff\12\70",
			"\1\71",
			"\1\72",
			"\1\73",
			"\1\75\1\74",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\102",
			"\1\103",
			"\1\104",
			"\1\105",
			"\12\66",
			"\17\16\12\66\3\16\1\uffff\101\16\42\uffff\u00df\16\u01f0\uffff\u0190"+
			"\16",
			"\12\70",
			"\17\16\12\70\3\16\1\uffff\101\16\42\uffff\u00df\16\u01f0\uffff\u0190"+
			"\16",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"\34\16\1\uffff\101\16\42\uffff\u00df\16\u01f0\uffff\u0190\16",
			"\1\115",
			"\34\16\1\uffff\101\16\42\uffff\u00df\16\u01f0\uffff\u0190\16",
			"\1\117",
			"\1\120",
			"\1\121",
			"\34\16\1\uffff\101\16\42\uffff\u00df\16\u01f0\uffff\u0190\16",
			"\1\123",
			"\34\16\1\uffff\101\16\42\uffff\u00df\16\u01f0\uffff\u0190\16",
			"\34\16\1\uffff\101\16\42\uffff\u00df\16\u01f0\uffff\u0190\16",
			"\1\126",
			"\1\127",
			"\1\130",
			"",
			"\1\131",
			"",
			"\34\16\1\uffff\101\16\42\uffff\u00df\16\u01f0\uffff\u0190\16",
			"\1\133",
			"\1\134",
			"",
			"\1\135",
			"",
			"",
			"\34\16\1\uffff\101\16\42\uffff\u00df\16\u01f0\uffff\u0190\16",
			"\1\137",
			"\1\140",
			"\34\16\1\uffff\101\16\42\uffff\u00df\16\u01f0\uffff\u0190\16",
			"",
			"\1\142",
			"\1\143",
			"\34\16\1\uffff\101\16\42\uffff\u00df\16\u01f0\uffff\u0190\16",
			"",
			"\34\16\1\uffff\101\16\42\uffff\u00df\16\u01f0\uffff\u0190\16",
			"\1\146",
			"",
			"\1\147",
			"\1\150",
			"",
			"",
			"\1\151",
			"\34\16\1\uffff\101\16\42\uffff\u00df\16\u01f0\uffff\u0190\16",
			"\1\153",
			"\34\16\1\uffff\101\16\42\uffff\u00df\16\u01f0\uffff\u0190\16",
			"",
			"\1\155",
			"",
			"\1\156",
			"\34\16\1\uffff\101\16\42\uffff\u00df\16\u01f0\uffff\u0190\16",
			""
	};

	static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
	static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
	static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
	static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
	static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
	static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
	static final short[][] DFA15_transition;

	static {
		int numStates = DFA15_transitionS.length;
		DFA15_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
		}
	}

	protected class DFA15 extends DFA {

		public DFA15(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 15;
			this.eot = DFA15_eot;
			this.eof = DFA15_eof;
			this.min = DFA15_min;
			this.max = DFA15_max;
			this.accept = DFA15_accept;
			this.special = DFA15_special;
			this.transition = DFA15_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( INTEGER | FLOAT | VERSION | SHEET | WIRE | SYMBOL | SYMATTR | ASSIGN | WINDOW | FLAG | IOPIN | DESCRIPTION | TYPE | VALUE | INSTNAME | SPICELINE | WS | STRING | ID );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA15_32 = input.LA(1);
						s = -1;
						if ( (LA15_32=='\"') ) {s = 33;}
						else if ( (LA15_32=='!'||(LA15_32 >= '#' && LA15_32 <= '<')||(LA15_32 >= '>' && LA15_32 <= '~')||(LA15_32 >= '\u00A1' && LA15_32 <= '\u017F')||(LA15_32 >= '\u0370' && LA15_32 <= '\u04FF')) ) {s = 32;}
						else if ( ((LA15_32 >= '\u0000' && LA15_32 <= ' ')||LA15_32=='='||(LA15_32 >= '\u007F' && LA15_32 <= '\u00A0')||(LA15_32 >= '\u0180' && LA15_32 <= '\u036F')||(LA15_32 >= '\u0500' && LA15_32 <= '\uFFFF')) ) {s = 34;}
						else s = 14;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA15_13 = input.LA(1);
						s = -1;
						if ( (LA15_13=='!'||(LA15_13 >= '#' && LA15_13 <= '<')||(LA15_13 >= '>' && LA15_13 <= '~')||(LA15_13 >= '\u00A1' && LA15_13 <= '\u017F')||(LA15_13 >= '\u0370' && LA15_13 <= '\u04FF')) ) {s = 32;}
						else if ( (LA15_13=='\"') ) {s = 33;}
						else if ( ((LA15_13 >= '\u0000' && LA15_13 <= ' ')||LA15_13=='='||(LA15_13 >= '\u007F' && LA15_13 <= '\u00A0')||(LA15_13 >= '\u0180' && LA15_13 <= '\u036F')||(LA15_13 >= '\u0500' && LA15_13 <= '\uFFFF')) ) {s = 34;}
						else s = 14;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 15, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
