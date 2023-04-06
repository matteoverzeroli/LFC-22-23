// $ANTLR 3.5.1 C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g 2023-04-06 16:25:22

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
	public static final int ERROR_TK=7;
	public static final int EXPONENT=8;
	public static final int FLAG=9;
	public static final int FLOAT=10;
	public static final int ID=11;
	public static final int INSTNAME=12;
	public static final int INTEGER=13;
	public static final int IOPIN=14;
	public static final int LETTER=15;
	public static final int SHEET=16;
	public static final int SPECIALCHAR=17;
	public static final int SPICELINE=18;
	public static final int STRING=19;
	public static final int SYMATTR=20;
	public static final int SYMBOL=21;
	public static final int TYPE=22;
	public static final int VALUE=23;
	public static final int VERSION=24;
	public static final int WINDOW=25;
	public static final int WIRE=26;
	public static final int WS=27;

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
	@Override public String getGrammarFileName() { return "C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g"; }

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:118:8: ( 'a' .. 'z' | 'A' .. 'Z' )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:
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
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:120:7: ( '0' .. '9' )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:
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
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:122:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:122:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:122:22: ( '+' | '-' )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='+'||LA1_0=='-') ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:
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

			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:122:33: ( '0' .. '9' )+
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
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:
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
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:124:12: ( '\\u0021' .. '\\u002F' | '\\u003A' .. '\\u003C' | '\\u003E' .. '\\u0040' | '\\u005B' .. '\\u0060' | '\\u007B' .. '\\u007E' | '\\u00A1' .. '\\u017F' | '\\u0370' .. '\\u03FF' | '\\u0400' .. '\\u04FF' )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:
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
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:129:8: ( ( '-' )? ( DIGIT )+ )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:129:11: ( '-' )? ( DIGIT )+
			{
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:129:11: ( '-' )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='-') ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:129:12: '-'
					{
					match('-'); 
					}
					break;

			}

			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:129:17: ( DIGIT )+
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
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:
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
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:131:5: ( ( DIGIT )+ '.' ( DIGIT )* ( EXPONENT )? | '.' ( DIGIT )+ ( EXPONENT )? | ( DIGIT )+ EXPONENT )
			int alt11=3;
			alt11 = dfa11.predict(input);
			switch (alt11) {
				case 1 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:131:9: ( DIGIT )+ '.' ( DIGIT )* ( EXPONENT )?
					{
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:131:9: ( DIGIT )+
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
							// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:
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
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:131:20: ( DIGIT )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:
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

					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:131:27: ( EXPONENT )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0=='E'||LA7_0=='e') ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:131:27: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:132:9: '.' ( DIGIT )+ ( EXPONENT )?
					{
					match('.'); 
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:132:13: ( DIGIT )+
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
							// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:
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

					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:132:20: ( EXPONENT )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0=='E'||LA9_0=='e') ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:132:20: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 3 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:133:9: ( DIGIT )+ EXPONENT
					{
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:133:9: ( DIGIT )+
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
							// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:
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
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:138:8: ( 'Version' )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:138:11: 'Version'
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
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:139:6: ( 'SHEET' )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:139:9: 'SHEET'
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
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:140:5: ( 'WIRE' )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:140:8: 'WIRE'
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
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:141:8: ( 'SYMBOL' )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:141:10: 'SYMBOL'
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
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:142:9: ( 'SYMATTR' )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:142:11: 'SYMATTR'
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
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:143:8: ( '=' )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:143:10: '='
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
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:144:9: ( 'WINDOW' )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:144:11: 'WINDOW'
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
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:145:7: ( 'FLAG' )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:145:9: 'FLAG'
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
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:146:7: ( 'IOPIN' )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:146:9: 'IOPIN'
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
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:150:12: ( 'Description' )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:150:14: 'Description'
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
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:151:6: ( 'Type' )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:151:8: 'Type'
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
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:152:7: ( 'Value' )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:152:9: 'Value'
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
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:153:9: ( 'InstName' )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:153:11: 'InstName'
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
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:154:11: ( 'SpiceLine' )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:154:13: 'SpiceLine'
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
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:156:5: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:156:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
			{
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:156:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:
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
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:163:8: ( '\"' (~ ( '\"' ) )* '\"' )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:163:10: '\"' (~ ( '\"' ) )* '\"'
			{
			match('\"'); 
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:163:14: (~ ( '\"' ) )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( ((LA13_0 >= '\u0000' && LA13_0 <= '!')||(LA13_0 >= '#' && LA13_0 <= '\uFFFF')) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:
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
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:165:4: ( ( LETTER | DIGIT | SPECIALCHAR ) ( LETTER | DIGIT | SPECIALCHAR )* )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:165:6: ( LETTER | DIGIT | SPECIALCHAR ) ( LETTER | DIGIT | SPECIALCHAR )*
			{
			if ( (input.LA(1) >= '!' && input.LA(1) <= '<')||(input.LA(1) >= '>' && input.LA(1) <= '~')||(input.LA(1) >= '\u00A1' && input.LA(1) <= '\u017F')||(input.LA(1) >= '\u0370' && input.LA(1) <= '\u04FF') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:165:36: ( LETTER | DIGIT | SPECIALCHAR )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( ((LA14_0 >= '!' && LA14_0 <= '<')||(LA14_0 >= '>' && LA14_0 <= '~')||(LA14_0 >= '\u00A1' && LA14_0 <= '\u017F')||(LA14_0 >= '\u0370' && LA14_0 <= '\u04FF')) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:
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

	// $ANTLR start "ERROR_TK"
	public final void mERROR_TK() throws RecognitionException {
		try {
			int _type = ERROR_TK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:167:11: ( . )
			// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:167:13: .
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
		// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:8: ( INTEGER | FLOAT | VERSION | SHEET | WIRE | SYMBOL | SYMATTR | ASSIGN | WINDOW | FLAG | IOPIN | DESCRIPTION | TYPE | VALUE | INSTNAME | SPICELINE | WS | STRING | ID | ERROR_TK )
		int alt15=20;
		alt15 = dfa15.predict(input);
		switch (alt15) {
			case 1 :
				// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:10: INTEGER
				{
				mINTEGER(); 

				}
				break;
			case 2 :
				// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:18: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 3 :
				// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:24: VERSION
				{
				mVERSION(); 

				}
				break;
			case 4 :
				// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:32: SHEET
				{
				mSHEET(); 

				}
				break;
			case 5 :
				// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:38: WIRE
				{
				mWIRE(); 

				}
				break;
			case 6 :
				// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:43: SYMBOL
				{
				mSYMBOL(); 

				}
				break;
			case 7 :
				// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:50: SYMATTR
				{
				mSYMATTR(); 

				}
				break;
			case 8 :
				// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:58: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 9 :
				// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:65: WINDOW
				{
				mWINDOW(); 

				}
				break;
			case 10 :
				// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:72: FLAG
				{
				mFLAG(); 

				}
				break;
			case 11 :
				// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:77: IOPIN
				{
				mIOPIN(); 

				}
				break;
			case 12 :
				// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:83: DESCRIPTION
				{
				mDESCRIPTION(); 

				}
				break;
			case 13 :
				// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:95: TYPE
				{
				mTYPE(); 

				}
				break;
			case 14 :
				// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:100: VALUE
				{
				mVALUE(); 

				}
				break;
			case 15 :
				// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:106: INSTNAME
				{
				mINSTNAME(); 

				}
				break;
			case 16 :
				// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:115: SPICELINE
				{
				mSPICELINE(); 

				}
				break;
			case 17 :
				// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:125: WS
				{
				mWS(); 

				}
				break;
			case 18 :
				// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:128: STRING
				{
				mSTRING(); 

				}
				break;
			case 19 :
				// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:135: ID
				{
				mID(); 

				}
				break;
			case 20 :
				// C:\\Users\\Davide\\Desktop\\UniBG\\Studio\\5_Anno\\Linguaggi Formali E Compilatori\\progetto\\LFC-22-23\\code\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:138: ERROR_TK
				{
				mERROR_TK(); 

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
			return "130:1: FLOAT : ( ( DIGIT )+ '.' ( DIGIT )* ( EXPONENT )? | '.' ( DIGIT )+ ( EXPONENT )? | ( DIGIT )+ EXPONENT );";
		}
	}

	static final String DFA15_eotS =
		"\1\uffff\1\21\1\22\4\21\1\uffff\4\21\1\uffff\1\21\2\uffff\1\22\2\uffff"+
		"\1\22\1\51\1\21\1\51\6\21\1\uffff\5\21\1\uffff\1\21\1\46\1\uffff\1\51"+
		"\1\21\1\uffff\1\21\1\51\16\21\1\51\1\21\1\51\6\21\1\120\1\21\1\122\3\21"+
		"\1\126\1\21\1\130\1\131\3\21\1\uffff\1\21\1\uffff\1\136\2\21\1\uffff\1"+
		"\21\2\uffff\1\142\2\21\1\145\1\uffff\2\21\1\150\1\uffff\1\151\1\21\1\uffff"+
		"\2\21\2\uffff\1\21\1\156\1\21\1\160\1\uffff\1\21\1\uffff\1\21\1\163\1"+
		"\uffff";
	static final String DFA15_eofS =
		"\164\uffff";
	static final String DFA15_minS =
		"\1\0\1\60\1\41\1\60\1\141\1\110\1\111\1\uffff\1\114\1\117\1\145\1\171"+
		"\1\uffff\1\0\2\uffff\1\41\2\uffff\2\41\1\53\1\41\1\162\1\154\1\105\1\115"+
		"\1\151\1\116\1\uffff\1\101\1\120\2\163\1\160\1\uffff\1\0\1\41\1\uffff"+
		"\1\41\1\53\1\uffff\1\60\1\41\1\53\1\163\1\165\1\105\1\101\1\143\1\105"+
		"\1\104\1\107\1\111\1\164\1\143\1\145\1\60\1\41\1\60\1\41\1\151\1\145\1"+
		"\124\1\117\1\124\1\145\1\41\1\117\1\41\2\116\1\162\1\41\1\157\2\41\1\114"+
		"\1\124\1\114\1\uffff\1\127\1\uffff\1\41\1\141\1\151\1\uffff\1\156\2\uffff"+
		"\1\41\1\122\1\151\1\41\1\uffff\1\155\1\160\1\41\1\uffff\1\41\1\156\1\uffff"+
		"\1\145\1\164\2\uffff\1\145\1\41\1\151\1\41\1\uffff\1\157\1\uffff\1\156"+
		"\1\41\1\uffff";
	static final String DFA15_maxS =
		"\1\uffff\1\71\1\u04ff\1\71\1\145\1\160\1\111\1\uffff\1\114\1\156\1\145"+
		"\1\171\1\uffff\1\uffff\2\uffff\1\u04ff\2\uffff\2\u04ff\1\71\1\u04ff\1"+
		"\162\1\154\1\105\1\115\1\151\1\122\1\uffff\1\101\1\120\2\163\1\160\1\uffff"+
		"\1\uffff\1\u04ff\1\uffff\1\u04ff\1\71\1\uffff\1\71\1\u04ff\1\71\1\163"+
		"\1\165\1\105\1\102\1\143\1\105\1\104\1\107\1\111\1\164\1\143\1\145\1\71"+
		"\1\u04ff\1\71\1\u04ff\1\151\1\145\1\124\1\117\1\124\1\145\1\u04ff\1\117"+
		"\1\u04ff\2\116\1\162\1\u04ff\1\157\2\u04ff\1\114\1\124\1\114\1\uffff\1"+
		"\127\1\uffff\1\u04ff\1\141\1\151\1\uffff\1\156\2\uffff\1\u04ff\1\122\1"+
		"\151\1\u04ff\1\uffff\1\155\1\160\1\u04ff\1\uffff\1\u04ff\1\156\1\uffff"+
		"\1\145\1\164\2\uffff\1\145\1\u04ff\1\151\1\u04ff\1\uffff\1\157\1\uffff"+
		"\1\156\1\u04ff\1\uffff";
	static final String DFA15_acceptS =
		"\7\uffff\1\10\4\uffff\1\21\1\uffff\1\23\1\24\1\uffff\1\23\1\1\12\uffff"+
		"\1\10\5\uffff\1\21\2\uffff\1\22\2\uffff\1\2\46\uffff\1\5\1\uffff\1\12"+
		"\3\uffff\1\15\1\uffff\1\16\1\4\4\uffff\1\13\3\uffff\1\6\2\uffff\1\11\2"+
		"\uffff\1\3\1\7\4\uffff\1\17\1\uffff\1\20\2\uffff\1\14";
	static final String DFA15_specialS =
		"\1\0\14\uffff\1\2\26\uffff\1\1\117\uffff}>";
	static final String[] DFA15_transitionS = {
			"\11\17\2\14\2\17\1\14\22\17\1\14\1\16\1\15\12\16\1\1\1\3\1\16\12\2\3"+
			"\16\1\7\6\16\1\12\1\16\1\10\2\16\1\11\11\16\1\5\1\13\1\16\1\4\1\6\47"+
			"\16\42\17\u00df\16\u01f0\17\u0190\16\ufb00\17",
			"\12\20",
			"\15\21\1\24\1\21\12\23\3\21\1\uffff\7\21\1\25\37\21\1\25\31\21\42\uffff"+
			"\u00df\21\u01f0\uffff\u0190\21",
			"\12\26",
			"\1\30\3\uffff\1\27",
			"\1\31\20\uffff\1\32\26\uffff\1\33",
			"\1\34",
			"",
			"\1\36",
			"\1\37\36\uffff\1\40",
			"\1\41",
			"\1\42",
			"",
			"\41\46\1\44\1\45\32\44\1\46\101\44\42\46\u00df\44\u01f0\46\u0190\44"+
			"\ufb00\46",
			"",
			"",
			"\17\21\12\20\3\21\1\uffff\101\21\42\uffff\u00df\21\u01f0\uffff\u0190"+
			"\21",
			"",
			"",
			"\15\21\1\24\1\21\12\23\3\21\1\uffff\7\21\1\25\37\21\1\25\31\21\42\uffff"+
			"\u00df\21\u01f0\uffff\u0190\21",
			"\17\21\12\47\3\21\1\uffff\7\21\1\50\37\21\1\50\31\21\42\uffff\u00df"+
			"\21\u01f0\uffff\u0190\21",
			"\1\52\1\uffff\1\52\2\uffff\12\53",
			"\17\21\12\26\3\21\1\uffff\7\21\1\54\37\21\1\54\31\21\42\uffff\u00df"+
			"\21\u01f0\uffff\u0190\21",
			"\1\55",
			"\1\56",
			"\1\57",
			"\1\60",
			"\1\61",
			"\1\63\3\uffff\1\62",
			"",
			"\1\64",
			"\1\65",
			"\1\66",
			"\1\67",
			"\1\70",
			"",
			"\41\46\1\44\1\45\32\44\1\46\101\44\42\46\u00df\44\u01f0\46\u0190\44"+
			"\ufb00\46",
			"\34\21\1\uffff\101\21\42\uffff\u00df\21\u01f0\uffff\u0190\21",
			"",
			"\17\21\12\47\3\21\1\uffff\7\21\1\50\37\21\1\50\31\21\42\uffff\u00df"+
			"\21\u01f0\uffff\u0190\21",
			"\1\71\1\uffff\1\71\2\uffff\12\72",
			"",
			"\12\53",
			"\17\21\12\53\3\21\1\uffff\101\21\42\uffff\u00df\21\u01f0\uffff\u0190"+
			"\21",
			"\1\73\1\uffff\1\73\2\uffff\12\74",
			"\1\75",
			"\1\76",
			"\1\77",
			"\1\101\1\100",
			"\1\102",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\111",
			"\12\72",
			"\17\21\12\72\3\21\1\uffff\101\21\42\uffff\u00df\21\u01f0\uffff\u0190"+
			"\21",
			"\12\74",
			"\17\21\12\74\3\21\1\uffff\101\21\42\uffff\u00df\21\u01f0\uffff\u0190"+
			"\21",
			"\1\112",
			"\1\113",
			"\1\114",
			"\1\115",
			"\1\116",
			"\1\117",
			"\34\21\1\uffff\101\21\42\uffff\u00df\21\u01f0\uffff\u0190\21",
			"\1\121",
			"\34\21\1\uffff\101\21\42\uffff\u00df\21\u01f0\uffff\u0190\21",
			"\1\123",
			"\1\124",
			"\1\125",
			"\34\21\1\uffff\101\21\42\uffff\u00df\21\u01f0\uffff\u0190\21",
			"\1\127",
			"\34\21\1\uffff\101\21\42\uffff\u00df\21\u01f0\uffff\u0190\21",
			"\34\21\1\uffff\101\21\42\uffff\u00df\21\u01f0\uffff\u0190\21",
			"\1\132",
			"\1\133",
			"\1\134",
			"",
			"\1\135",
			"",
			"\34\21\1\uffff\101\21\42\uffff\u00df\21\u01f0\uffff\u0190\21",
			"\1\137",
			"\1\140",
			"",
			"\1\141",
			"",
			"",
			"\34\21\1\uffff\101\21\42\uffff\u00df\21\u01f0\uffff\u0190\21",
			"\1\143",
			"\1\144",
			"\34\21\1\uffff\101\21\42\uffff\u00df\21\u01f0\uffff\u0190\21",
			"",
			"\1\146",
			"\1\147",
			"\34\21\1\uffff\101\21\42\uffff\u00df\21\u01f0\uffff\u0190\21",
			"",
			"\34\21\1\uffff\101\21\42\uffff\u00df\21\u01f0\uffff\u0190\21",
			"\1\152",
			"",
			"\1\153",
			"\1\154",
			"",
			"",
			"\1\155",
			"\34\21\1\uffff\101\21\42\uffff\u00df\21\u01f0\uffff\u0190\21",
			"\1\157",
			"\34\21\1\uffff\101\21\42\uffff\u00df\21\u01f0\uffff\u0190\21",
			"",
			"\1\161",
			"",
			"\1\162",
			"\34\21\1\uffff\101\21\42\uffff\u00df\21\u01f0\uffff\u0190\21",
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
			return "1:1: Tokens : ( INTEGER | FLOAT | VERSION | SHEET | WIRE | SYMBOL | SYMATTR | ASSIGN | WINDOW | FLAG | IOPIN | DESCRIPTION | TYPE | VALUE | INSTNAME | SPICELINE | WS | STRING | ID | ERROR_TK );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA15_0 = input.LA(1);
						s = -1;
						if ( (LA15_0=='-') ) {s = 1;}
						else if ( ((LA15_0 >= '0' && LA15_0 <= '9')) ) {s = 2;}
						else if ( (LA15_0=='.') ) {s = 3;}
						else if ( (LA15_0=='V') ) {s = 4;}
						else if ( (LA15_0=='S') ) {s = 5;}
						else if ( (LA15_0=='W') ) {s = 6;}
						else if ( (LA15_0=='=') ) {s = 7;}
						else if ( (LA15_0=='F') ) {s = 8;}
						else if ( (LA15_0=='I') ) {s = 9;}
						else if ( (LA15_0=='D') ) {s = 10;}
						else if ( (LA15_0=='T') ) {s = 11;}
						else if ( ((LA15_0 >= '\t' && LA15_0 <= '\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 12;}
						else if ( (LA15_0=='\"') ) {s = 13;}
						else if ( (LA15_0=='!'||(LA15_0 >= '#' && LA15_0 <= ',')||LA15_0=='/'||(LA15_0 >= ':' && LA15_0 <= '<')||(LA15_0 >= '>' && LA15_0 <= 'C')||LA15_0=='E'||(LA15_0 >= 'G' && LA15_0 <= 'H')||(LA15_0 >= 'J' && LA15_0 <= 'R')||LA15_0=='U'||(LA15_0 >= 'X' && LA15_0 <= '~')||(LA15_0 >= '\u00A1' && LA15_0 <= '\u017F')||(LA15_0 >= '\u0370' && LA15_0 <= '\u04FF')) ) {s = 14;}
						else if ( ((LA15_0 >= '\u0000' && LA15_0 <= '\b')||(LA15_0 >= '\u000B' && LA15_0 <= '\f')||(LA15_0 >= '\u000E' && LA15_0 <= '\u001F')||(LA15_0 >= '\u007F' && LA15_0 <= '\u00A0')||(LA15_0 >= '\u0180' && LA15_0 <= '\u036F')||(LA15_0 >= '\u0500' && LA15_0 <= '\uFFFF')) ) {s = 15;}
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA15_36 = input.LA(1);
						s = -1;
						if ( (LA15_36=='\"') ) {s = 37;}
						else if ( (LA15_36=='!'||(LA15_36 >= '#' && LA15_36 <= '<')||(LA15_36 >= '>' && LA15_36 <= '~')||(LA15_36 >= '\u00A1' && LA15_36 <= '\u017F')||(LA15_36 >= '\u0370' && LA15_36 <= '\u04FF')) ) {s = 36;}
						else if ( ((LA15_36 >= '\u0000' && LA15_36 <= ' ')||LA15_36=='='||(LA15_36 >= '\u007F' && LA15_36 <= '\u00A0')||(LA15_36 >= '\u0180' && LA15_36 <= '\u036F')||(LA15_36 >= '\u0500' && LA15_36 <= '\uFFFF')) ) {s = 38;}
						else s = 17;
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA15_13 = input.LA(1);
						s = -1;
						if ( (LA15_13=='!'||(LA15_13 >= '#' && LA15_13 <= '<')||(LA15_13 >= '>' && LA15_13 <= '~')||(LA15_13 >= '\u00A1' && LA15_13 <= '\u017F')||(LA15_13 >= '\u0370' && LA15_13 <= '\u04FF')) ) {s = 36;}
						else if ( (LA15_13=='\"') ) {s = 37;}
						else if ( ((LA15_13 >= '\u0000' && LA15_13 <= ' ')||LA15_13=='='||(LA15_13 >= '\u007F' && LA15_13 <= '\u00A0')||(LA15_13 >= '\u0180' && LA15_13 <= '\u036F')||(LA15_13 >= '\u0500' && LA15_13 <= '\uFFFF')) ) {s = 38;}
						else s = 17;
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
