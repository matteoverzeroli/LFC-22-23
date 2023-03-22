// $ANTLR 3.5.1 C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g 2023-03-22 09:54:31

	package compiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class Ltspice2circuitikz extends Lexer {
	public static final int EOF=-1;
	public static final int ABSTRACT=4;
	public static final int ADD=5;
	public static final int AND=6;
	public static final int AND_BIT=7;
	public static final int ASSERT=8;
	public static final int ASSIGN=9;
	public static final int AT=10;
	public static final int BASIC_TYPE=11;
	public static final int BREAK=12;
	public static final int BYTE=13;
	public static final int CASE=14;
	public static final int CATCH=15;
	public static final int CHAR=16;
	public static final int CL=17;
	public static final int CLASS=18;
	public static final int CM=19;
	public static final int COMMENT=20;
	public static final int CONTINUE=21;
	public static final int DEFAULT=22;
	public static final int DIGIT=23;
	public static final int DIV=24;
	public static final int DO=25;
	public static final int DOT=26;
	public static final int ELSE=27;
	public static final int ENUM=28;
	public static final int EQ=29;
	public static final int ESC_SEQ=30;
	public static final int EXPONENT=31;
	public static final int EXTENDS=32;
	public static final int FINAL=33;
	public static final int FINALLY=34;
	public static final int FLOAT=35;
	public static final int FOR=36;
	public static final int GE=37;
	public static final int GT=38;
	public static final int HEX_DIGIT=39;
	public static final int ID=40;
	public static final int IF=41;
	public static final int IMPLEMENTS=42;
	public static final int IMPORT=43;
	public static final int INSTANCEOF=44;
	public static final int INTEGER=45;
	public static final int INTERFACE=46;
	public static final int LB=47;
	public static final int LBR=48;
	public static final int LE=49;
	public static final int LETTER=50;
	public static final int LP=51;
	public static final int LT=52;
	public static final int MOD=53;
	public static final int NATIVE=54;
	public static final int NEQ=55;
	public static final int NEW=56;
	public static final int NOT=57;
	public static final int OCTAL_ESC=58;
	public static final int OR=59;
	public static final int OR_BIT=60;
	public static final int PACKAGE=61;
	public static final int PRIVATE=62;
	public static final int PROTECTED=63;
	public static final int PUBLIC=64;
	public static final int RB=65;
	public static final int RBR=66;
	public static final int RETURN=67;
	public static final int RP=68;
	public static final int SC=69;
	public static final int STAR=70;
	public static final int STATIC=71;
	public static final int STRING=72;
	public static final int SUB=73;
	public static final int SUPER=74;
	public static final int SWITCH=75;
	public static final int SYNCHRONIZED=76;
	public static final int THIS=77;
	public static final int THROW=78;
	public static final int THROWS=79;
	public static final int TRANSIENT=80;
	public static final int TRY=81;
	public static final int UNICODE_ESC=82;
	public static final int VOID=83;
	public static final int VOLATILE=84;
	public static final int WHILE=85;
	public static final int WS=86;
	public static final int XOR=87;



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

	// $ANTLR start "EXPONENT"
	public final void mEXPONENT() throws RecognitionException {
		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:21:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:21:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:21:22: ( '+' | '-' )?
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

			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:21:33: ( '0' .. '9' )+
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

	// $ANTLR start "HEX_DIGIT"
	public final void mHEX_DIGIT() throws RecognitionException {
		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:24:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
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
	// $ANTLR end "HEX_DIGIT"

	// $ANTLR start "ESC_SEQ"
	public final void mESC_SEQ() throws RecognitionException {
		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:28:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
			int alt3=3;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='\\') ) {
				switch ( input.LA(2) ) {
				case '\"':
				case '\'':
				case '\\':
				case 'b':
				case 'f':
				case 'n':
				case 'r':
				case 't':
					{
					alt3=1;
					}
					break;
				case 'u':
					{
					alt3=2;
					}
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
					{
					alt3=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:28:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
					{
					match('\\'); 
					if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:29:9: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:30:9: OCTAL_ESC
					{
					mOCTAL_ESC(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC_SEQ"

	// $ANTLR start "OCTAL_ESC"
	public final void mOCTAL_ESC() throws RecognitionException {
		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:35:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt4=3;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='\\') ) {
				int LA4_1 = input.LA(2);
				if ( ((LA4_1 >= '0' && LA4_1 <= '3')) ) {
					int LA4_2 = input.LA(3);
					if ( ((LA4_2 >= '0' && LA4_2 <= '7')) ) {
						int LA4_4 = input.LA(4);
						if ( ((LA4_4 >= '0' && LA4_4 <= '7')) ) {
							alt4=1;
						}

						else {
							alt4=2;
						}

					}

					else {
						alt4=3;
					}

				}
				else if ( ((LA4_1 >= '4' && LA4_1 <= '7')) ) {
					int LA4_3 = input.LA(3);
					if ( ((LA4_3 >= '0' && LA4_3 <= '7')) ) {
						alt4=2;
					}

					else {
						alt4=3;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:35:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:36:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 3 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:37:9: '\\\\' ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
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
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OCTAL_ESC"

	// $ANTLR start "UNICODE_ESC"
	public final void mUNICODE_ESC() throws RecognitionException {
		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:42:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:42:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
			{
			match('\\'); 
			match('u'); 
			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNICODE_ESC"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:46:8: ( 'a' .. 'z' | 'A' .. 'Z' )
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
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:48:7: ( '0' .. '9' )
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

	// $ANTLR start "ASSIGN"
	public final void mASSIGN() throws RecognitionException {
		try {
			int _type = ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:50:8: ( '=' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:50:10: '='
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

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:52:7: ( '==' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:52:9: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ"

	// $ANTLR start "NEQ"
	public final void mNEQ() throws RecognitionException {
		try {
			int _type = NEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:53:7: ( '!=' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:53:9: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEQ"

	// $ANTLR start "GT"
	public final void mGT() throws RecognitionException {
		try {
			int _type = GT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:54:7: ( '>' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:54:9: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GT"

	// $ANTLR start "GE"
	public final void mGE() throws RecognitionException {
		try {
			int _type = GE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:55:6: ( '>=' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:55:8: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GE"

	// $ANTLR start "LT"
	public final void mLT() throws RecognitionException {
		try {
			int _type = LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:56:7: ( '<' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:56:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LT"

	// $ANTLR start "LE"
	public final void mLE() throws RecognitionException {
		try {
			int _type = LE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:57:7: ( '<=' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:57:9: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LE"

	// $ANTLR start "AT"
	public final void mAT() throws RecognitionException {
		try {
			int _type = AT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:60:4: ( '@' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:60:6: '@'
			{
			match('@'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AT"

	// $ANTLR start "CL"
	public final void mCL() throws RecognitionException {
		try {
			int _type = CL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:61:5: ( ':' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:61:7: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CL"

	// $ANTLR start "CM"
	public final void mCM() throws RecognitionException {
		try {
			int _type = CM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:62:5: ( ',' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:62:7: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CM"

	// $ANTLR start "DOT"
	public final void mDOT() throws RecognitionException {
		try {
			int _type = DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:63:5: ( '.' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:63:7: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOT"

	// $ANTLR start "SC"
	public final void mSC() throws RecognitionException {
		try {
			int _type = SC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:64:5: ( ';' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:64:7: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SC"

	// $ANTLR start "LP"
	public final void mLP() throws RecognitionException {
		try {
			int _type = LP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:67:5: ( '(' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:67:7: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LP"

	// $ANTLR start "RP"
	public final void mRP() throws RecognitionException {
		try {
			int _type = RP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:68:5: ( ')' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:68:7: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RP"

	// $ANTLR start "LB"
	public final void mLB() throws RecognitionException {
		try {
			int _type = LB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:69:4: ( '[' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:69:6: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LB"

	// $ANTLR start "RB"
	public final void mRB() throws RecognitionException {
		try {
			int _type = RB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:70:4: ( ']' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:70:6: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RB"

	// $ANTLR start "LBR"
	public final void mLBR() throws RecognitionException {
		try {
			int _type = LBR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:71:5: ( '{' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:71:7: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LBR"

	// $ANTLR start "RBR"
	public final void mRBR() throws RecognitionException {
		try {
			int _type = RBR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:72:5: ( '}' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:72:7: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RBR"

	// $ANTLR start "ADD"
	public final void mADD() throws RecognitionException {
		try {
			int _type = ADD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:75:6: ( '+' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:75:8: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADD"

	// $ANTLR start "SUB"
	public final void mSUB() throws RecognitionException {
		try {
			int _type = SUB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:76:6: ( '-' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:76:8: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUB"

	// $ANTLR start "STAR"
	public final void mSTAR() throws RecognitionException {
		try {
			int _type = STAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:77:6: ( '*' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:77:8: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STAR"

	// $ANTLR start "DIV"
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:78:6: ( '/' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:78:8: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV"

	// $ANTLR start "MOD"
	public final void mMOD() throws RecognitionException {
		try {
			int _type = MOD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:79:6: ( '%' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:79:8: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOD"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:82:7: ( '!' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:82:9: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:83:7: ( '&&' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:83:9: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:84:6: ( '||' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:84:8: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "XOR"
	public final void mXOR() throws RecognitionException {
		try {
			int _type = XOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:85:7: ( '^' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:85:9: '^'
			{
			match('^'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "XOR"

	// $ANTLR start "AND_BIT"
	public final void mAND_BIT() throws RecognitionException {
		try {
			int _type = AND_BIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:86:9: ( '&' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:86:11: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND_BIT"

	// $ANTLR start "OR_BIT"
	public final void mOR_BIT() throws RecognitionException {
		try {
			int _type = OR_BIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:87:9: ( '|' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:87:11: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR_BIT"

	// $ANTLR start "VOID"
	public final void mVOID() throws RecognitionException {
		try {
			int _type = VOID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:90:10: ( 'void' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:90:12: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VOID"

	// $ANTLR start "BASIC_TYPE"
	public final void mBASIC_TYPE() throws RecognitionException {
		try {
			int _type = BASIC_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:92:13: ( 'int' | 'long' | 'short' | 'float' | 'double' | 'boolean' | 'char' | 'String' )
			int alt5=8;
			switch ( input.LA(1) ) {
			case 'i':
				{
				alt5=1;
				}
				break;
			case 'l':
				{
				alt5=2;
				}
				break;
			case 's':
				{
				alt5=3;
				}
				break;
			case 'f':
				{
				alt5=4;
				}
				break;
			case 'd':
				{
				alt5=5;
				}
				break;
			case 'b':
				{
				alt5=6;
				}
				break;
			case 'c':
				{
				alt5=7;
				}
				break;
			case 'S':
				{
				alt5=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:92:15: 'int'
					{
					match("int"); 

					}
					break;
				case 2 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:92:24: 'long'
					{
					match("long"); 

					}
					break;
				case 3 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:92:34: 'short'
					{
					match("short"); 

					}
					break;
				case 4 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:93:8: 'float'
					{
					match("float"); 

					}
					break;
				case 5 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:93:18: 'double'
					{
					match("double"); 

					}
					break;
				case 6 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:93:29: 'boolean'
					{
					match("boolean"); 

					}
					break;
				case 7 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:94:8: 'char'
					{
					match("char"); 

					}
					break;
				case 8 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:94:17: 'String'
					{
					match("String"); 

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
	// $ANTLR end "BASIC_TYPE"

	// $ANTLR start "ABSTRACT"
	public final void mABSTRACT() throws RecognitionException {
		try {
			int _type = ABSTRACT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:108:12: ( 'abstract' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:108:14: 'abstract'
			{
			match("abstract"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ABSTRACT"

	// $ANTLR start "ASSERT"
	public final void mASSERT() throws RecognitionException {
		try {
			int _type = ASSERT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:109:11: ( 'assert' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:109:13: 'assert'
			{
			match("assert"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSERT"

	// $ANTLR start "BREAK"
	public final void mBREAK() throws RecognitionException {
		try {
			int _type = BREAK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:110:11: ( 'break' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:110:13: 'break'
			{
			match("break"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BREAK"

	// $ANTLR start "BYTE"
	public final void mBYTE() throws RecognitionException {
		try {
			int _type = BYTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:111:10: ( 'byte' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:111:12: 'byte'
			{
			match("byte"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BYTE"

	// $ANTLR start "CASE"
	public final void mCASE() throws RecognitionException {
		try {
			int _type = CASE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:112:10: ( 'case' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:112:12: 'case'
			{
			match("case"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CASE"

	// $ANTLR start "CATCH"
	public final void mCATCH() throws RecognitionException {
		try {
			int _type = CATCH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:113:11: ( 'catch' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:113:13: 'catch'
			{
			match("catch"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CATCH"

	// $ANTLR start "CLASS"
	public final void mCLASS() throws RecognitionException {
		try {
			int _type = CLASS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:114:11: ( 'class' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:114:13: 'class'
			{
			match("class"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CLASS"

	// $ANTLR start "CONTINUE"
	public final void mCONTINUE() throws RecognitionException {
		try {
			int _type = CONTINUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:115:12: ( 'continue' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:115:14: 'continue'
			{
			match("continue"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONTINUE"

	// $ANTLR start "DEFAULT"
	public final void mDEFAULT() throws RecognitionException {
		try {
			int _type = DEFAULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:116:12: ( 'default' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:116:14: 'default'
			{
			match("default"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEFAULT"

	// $ANTLR start "DO"
	public final void mDO() throws RecognitionException {
		try {
			int _type = DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:117:9: ( 'do' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:117:11: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DO"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:118:10: ( 'else' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:118:12: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "ENUM"
	public final void mENUM() throws RecognitionException {
		try {
			int _type = ENUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:119:10: ( 'enum' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:119:12: 'enum'
			{
			match("enum"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENUM"

	// $ANTLR start "EXTENDS"
	public final void mEXTENDS() throws RecognitionException {
		try {
			int _type = EXTENDS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:120:12: ( 'extends' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:120:14: 'extends'
			{
			match("extends"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXTENDS"

	// $ANTLR start "FINAL"
	public final void mFINAL() throws RecognitionException {
		try {
			int _type = FINAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:121:11: ( 'final' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:121:13: 'final'
			{
			match("final"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FINAL"

	// $ANTLR start "FINALLY"
	public final void mFINALLY() throws RecognitionException {
		try {
			int _type = FINALLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:122:12: ( 'finally' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:122:14: 'finally'
			{
			match("finally"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FINALLY"

	// $ANTLR start "FOR"
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:123:10: ( 'for' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:123:12: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOR"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:124:9: ( 'if' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:124:11: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "IMPLEMENTS"
	public final void mIMPLEMENTS() throws RecognitionException {
		try {
			int _type = IMPLEMENTS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:125:13: ( 'implements' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:125:15: 'implements'
			{
			match("implements"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IMPLEMENTS"

	// $ANTLR start "IMPORT"
	public final void mIMPORT() throws RecognitionException {
		try {
			int _type = IMPORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:126:11: ( 'import' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:126:13: 'import'
			{
			match("import"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IMPORT"

	// $ANTLR start "INSTANCEOF"
	public final void mINSTANCEOF() throws RecognitionException {
		try {
			int _type = INSTANCEOF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:127:13: ( 'instanceof' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:127:15: 'instanceof'
			{
			match("instanceof"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INSTANCEOF"

	// $ANTLR start "INTERFACE"
	public final void mINTERFACE() throws RecognitionException {
		try {
			int _type = INTERFACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:128:13: ( 'interface' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:128:15: 'interface'
			{
			match("interface"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTERFACE"

	// $ANTLR start "NATIVE"
	public final void mNATIVE() throws RecognitionException {
		try {
			int _type = NATIVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:129:11: ( 'native' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:129:13: 'native'
			{
			match("native"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NATIVE"

	// $ANTLR start "NEW"
	public final void mNEW() throws RecognitionException {
		try {
			int _type = NEW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:130:10: ( 'new' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:130:12: 'new'
			{
			match("new"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEW"

	// $ANTLR start "PACKAGE"
	public final void mPACKAGE() throws RecognitionException {
		try {
			int _type = PACKAGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:131:12: ( 'package' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:131:14: 'package'
			{
			match("package"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PACKAGE"

	// $ANTLR start "PRIVATE"
	public final void mPRIVATE() throws RecognitionException {
		try {
			int _type = PRIVATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:132:12: ( 'private' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:132:14: 'private'
			{
			match("private"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRIVATE"

	// $ANTLR start "PROTECTED"
	public final void mPROTECTED() throws RecognitionException {
		try {
			int _type = PROTECTED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:133:13: ( 'protected' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:133:15: 'protected'
			{
			match("protected"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PROTECTED"

	// $ANTLR start "PUBLIC"
	public final void mPUBLIC() throws RecognitionException {
		try {
			int _type = PUBLIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:134:11: ( 'public' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:134:13: 'public'
			{
			match("public"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PUBLIC"

	// $ANTLR start "RETURN"
	public final void mRETURN() throws RecognitionException {
		try {
			int _type = RETURN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:135:11: ( 'return' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:135:13: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RETURN"

	// $ANTLR start "STATIC"
	public final void mSTATIC() throws RecognitionException {
		try {
			int _type = STATIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:136:11: ( 'static' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:136:13: 'static'
			{
			match("static"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STATIC"

	// $ANTLR start "SUPER"
	public final void mSUPER() throws RecognitionException {
		try {
			int _type = SUPER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:137:11: ( 'super' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:137:13: 'super'
			{
			match("super"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUPER"

	// $ANTLR start "SWITCH"
	public final void mSWITCH() throws RecognitionException {
		try {
			int _type = SWITCH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:138:11: ( 'switch' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:138:13: 'switch'
			{
			match("switch"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SWITCH"

	// $ANTLR start "SYNCHRONIZED"
	public final void mSYNCHRONIZED() throws RecognitionException {
		try {
			int _type = SYNCHRONIZED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:139:14: ( 'synchronized' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:139:16: 'synchronized'
			{
			match("synchronized"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SYNCHRONIZED"

	// $ANTLR start "THIS"
	public final void mTHIS() throws RecognitionException {
		try {
			int _type = THIS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:140:10: ( 'this' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:140:12: 'this'
			{
			match("this"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THIS"

	// $ANTLR start "THROW"
	public final void mTHROW() throws RecognitionException {
		try {
			int _type = THROW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:141:11: ( 'throw' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:141:13: 'throw'
			{
			match("throw"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THROW"

	// $ANTLR start "THROWS"
	public final void mTHROWS() throws RecognitionException {
		try {
			int _type = THROWS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:142:11: ( 'throws' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:142:13: 'throws'
			{
			match("throws"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THROWS"

	// $ANTLR start "TRANSIENT"
	public final void mTRANSIENT() throws RecognitionException {
		try {
			int _type = TRANSIENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:143:13: ( 'transient' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:143:15: 'transient'
			{
			match("transient"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRANSIENT"

	// $ANTLR start "TRY"
	public final void mTRY() throws RecognitionException {
		try {
			int _type = TRY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:144:10: ( 'try' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:144:12: 'try'
			{
			match("try"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRY"

	// $ANTLR start "VOLATILE"
	public final void mVOLATILE() throws RecognitionException {
		try {
			int _type = VOLATILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:145:12: ( 'volatile' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:145:14: 'volatile'
			{
			match("volatile"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VOLATILE"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:146:11: ( 'while' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:146:13: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:149:5: ( ( LETTER | '_' ) ( LETTER | DIGIT | '_' )* )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:149:7: ( LETTER | '_' ) ( LETTER | DIGIT | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:150:4: ( LETTER | DIGIT | '_' )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '9')||(LA6_0 >= 'A' && LA6_0 <= 'Z')||LA6_0=='_'||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INTEGER"
	public final void mINTEGER() throws RecognitionException {
		try {
			int _type = INTEGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:154:9: ( ( DIGIT )+ )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:154:11: ( DIGIT )+
			{
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:154:11: ( DIGIT )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
					alt7=1;
				}

				switch (alt7) {
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
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
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
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:158:5: ( ( DIGIT )+ '.' ( DIGIT )* ( EXPONENT )? | '.' ( DIGIT )+ ( EXPONENT )? | ( DIGIT )+ EXPONENT )
			int alt14=3;
			alt14 = dfa14.predict(input);
			switch (alt14) {
				case 1 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:158:9: ( DIGIT )+ '.' ( DIGIT )* ( EXPONENT )?
					{
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:158:9: ( DIGIT )+
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

					match('.'); 
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:158:20: ( DIGIT )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
							alt9=1;
						}

						switch (alt9) {
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
							break loop9;
						}
					}

					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:158:27: ( EXPONENT )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0=='E'||LA10_0=='e') ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:158:27: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:159:9: '.' ( DIGIT )+ ( EXPONENT )?
					{
					match('.'); 
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:159:13: ( DIGIT )+
					int cnt11=0;
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
							alt11=1;
						}

						switch (alt11) {
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
							if ( cnt11 >= 1 ) break loop11;
							EarlyExitException eee = new EarlyExitException(11, input);
							throw eee;
						}
						cnt11++;
					}

					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:159:20: ( EXPONENT )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0=='E'||LA12_0=='e') ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:159:20: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 3 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:160:9: ( DIGIT )+ EXPONENT
					{
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:160:9: ( DIGIT )+
					int cnt13=0;
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( ((LA13_0 >= '0' && LA13_0 <= '9')) ) {
							alt13=1;
						}

						switch (alt13) {
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
							if ( cnt13 >= 1 ) break loop13;
							EarlyExitException eee = new EarlyExitException(13, input);
							throw eee;
						}
						cnt13++;
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

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:164:5: ( ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' ) )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:164:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			{
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:164:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0=='/') ) {
				int LA18_1 = input.LA(2);
				if ( (LA18_1=='/') ) {
					alt18=1;
				}
				else if ( (LA18_1=='*') ) {
					alt18=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:164:10: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:164:15: (~ ( '\\n' | '\\r' ) )*
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( ((LA15_0 >= '\u0000' && LA15_0 <= '\t')||(LA15_0 >= '\u000B' && LA15_0 <= '\f')||(LA15_0 >= '\u000E' && LA15_0 <= '\uFFFF')) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
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
							break loop15;
						}
					}

					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:164:29: ( '\\r' )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0=='\r') ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:164:29: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					_channel=HIDDEN;
					}
					break;
				case 2 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:165:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:165:14: ( options {greedy=false; } : . )*
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0=='*') ) {
							int LA17_1 = input.LA(2);
							if ( (LA17_1=='/') ) {
								alt17=2;
							}
							else if ( ((LA17_1 >= '\u0000' && LA17_1 <= '.')||(LA17_1 >= '0' && LA17_1 <= '\uFFFF')) ) {
								alt17=1;
							}

						}
						else if ( ((LA17_0 >= '\u0000' && LA17_0 <= ')')||(LA17_0 >= '+' && LA17_0 <= '\uFFFF')) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:165:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop17;
						}
					}

					match("*/"); 

					}
					break;

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
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:168:5: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:168:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
			{
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:168:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
			int cnt19=0;
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( ((LA19_0 >= '\t' && LA19_0 <= '\n')||LA19_0=='\r'||LA19_0==' ') ) {
					alt19=1;
				}

				switch (alt19) {
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
					if ( cnt19 >= 1 ) break loop19;
					EarlyExitException eee = new EarlyExitException(19, input);
					throw eee;
				}
				cnt19++;
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
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:176:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:176:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:176:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
			loop20:
			while (true) {
				int alt20=3;
				int LA20_0 = input.LA(1);
				if ( (LA20_0=='\\') ) {
					alt20=1;
				}
				else if ( ((LA20_0 >= '\u0000' && LA20_0 <= '!')||(LA20_0 >= '#' && LA20_0 <= '[')||(LA20_0 >= ']' && LA20_0 <= '\uFFFF')) ) {
					alt20=2;
				}

				switch (alt20) {
				case 1 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:176:14: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:176:24: ~ ( '\\\\' | '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
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
					break loop20;
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

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:179:5: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:179:8: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
			{
			match('\''); 
			// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:179:13: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0=='\\') ) {
				alt21=1;
			}
			else if ( ((LA21_0 >= '\u0000' && LA21_0 <= '&')||(LA21_0 >= '(' && LA21_0 <= '[')||(LA21_0 >= ']' && LA21_0 <= '\uFFFF')) ) {
				alt21=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:179:15: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:179:25: ~ ( '\\'' | '\\\\' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
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

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:8: ( ASSIGN | EQ | NEQ | GT | GE | LT | LE | AT | CL | CM | DOT | SC | LP | RP | LB | RB | LBR | RBR | ADD | SUB | STAR | DIV | MOD | NOT | AND | OR | XOR | AND_BIT | OR_BIT | VOID | BASIC_TYPE | ABSTRACT | ASSERT | BREAK | BYTE | CASE | CATCH | CLASS | CONTINUE | DEFAULT | DO | ELSE | ENUM | EXTENDS | FINAL | FINALLY | FOR | IF | IMPLEMENTS | IMPORT | INSTANCEOF | INTERFACE | NATIVE | NEW | PACKAGE | PRIVATE | PROTECTED | PUBLIC | RETURN | STATIC | SUPER | SWITCH | SYNCHRONIZED | THIS | THROW | THROWS | TRANSIENT | TRY | VOLATILE | WHILE | ID | INTEGER | FLOAT | COMMENT | WS | STRING | CHAR )
		int alt22=77;
		alt22 = dfa22.predict(input);
		switch (alt22) {
			case 1 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:10: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 2 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:17: EQ
				{
				mEQ(); 

				}
				break;
			case 3 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:20: NEQ
				{
				mNEQ(); 

				}
				break;
			case 4 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:24: GT
				{
				mGT(); 

				}
				break;
			case 5 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:27: GE
				{
				mGE(); 

				}
				break;
			case 6 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:30: LT
				{
				mLT(); 

				}
				break;
			case 7 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:33: LE
				{
				mLE(); 

				}
				break;
			case 8 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:36: AT
				{
				mAT(); 

				}
				break;
			case 9 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:39: CL
				{
				mCL(); 

				}
				break;
			case 10 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:42: CM
				{
				mCM(); 

				}
				break;
			case 11 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:45: DOT
				{
				mDOT(); 

				}
				break;
			case 12 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:49: SC
				{
				mSC(); 

				}
				break;
			case 13 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:52: LP
				{
				mLP(); 

				}
				break;
			case 14 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:55: RP
				{
				mRP(); 

				}
				break;
			case 15 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:58: LB
				{
				mLB(); 

				}
				break;
			case 16 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:61: RB
				{
				mRB(); 

				}
				break;
			case 17 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:64: LBR
				{
				mLBR(); 

				}
				break;
			case 18 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:68: RBR
				{
				mRBR(); 

				}
				break;
			case 19 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:72: ADD
				{
				mADD(); 

				}
				break;
			case 20 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:76: SUB
				{
				mSUB(); 

				}
				break;
			case 21 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:80: STAR
				{
				mSTAR(); 

				}
				break;
			case 22 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:85: DIV
				{
				mDIV(); 

				}
				break;
			case 23 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:89: MOD
				{
				mMOD(); 

				}
				break;
			case 24 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:93: NOT
				{
				mNOT(); 

				}
				break;
			case 25 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:97: AND
				{
				mAND(); 

				}
				break;
			case 26 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:101: OR
				{
				mOR(); 

				}
				break;
			case 27 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:104: XOR
				{
				mXOR(); 

				}
				break;
			case 28 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:108: AND_BIT
				{
				mAND_BIT(); 

				}
				break;
			case 29 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:116: OR_BIT
				{
				mOR_BIT(); 

				}
				break;
			case 30 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:123: VOID
				{
				mVOID(); 

				}
				break;
			case 31 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:128: BASIC_TYPE
				{
				mBASIC_TYPE(); 

				}
				break;
			case 32 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:139: ABSTRACT
				{
				mABSTRACT(); 

				}
				break;
			case 33 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:148: ASSERT
				{
				mASSERT(); 

				}
				break;
			case 34 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:155: BREAK
				{
				mBREAK(); 

				}
				break;
			case 35 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:161: BYTE
				{
				mBYTE(); 

				}
				break;
			case 36 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:166: CASE
				{
				mCASE(); 

				}
				break;
			case 37 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:171: CATCH
				{
				mCATCH(); 

				}
				break;
			case 38 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:177: CLASS
				{
				mCLASS(); 

				}
				break;
			case 39 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:183: CONTINUE
				{
				mCONTINUE(); 

				}
				break;
			case 40 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:192: DEFAULT
				{
				mDEFAULT(); 

				}
				break;
			case 41 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:200: DO
				{
				mDO(); 

				}
				break;
			case 42 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:203: ELSE
				{
				mELSE(); 

				}
				break;
			case 43 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:208: ENUM
				{
				mENUM(); 

				}
				break;
			case 44 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:213: EXTENDS
				{
				mEXTENDS(); 

				}
				break;
			case 45 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:221: FINAL
				{
				mFINAL(); 

				}
				break;
			case 46 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:227: FINALLY
				{
				mFINALLY(); 

				}
				break;
			case 47 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:235: FOR
				{
				mFOR(); 

				}
				break;
			case 48 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:239: IF
				{
				mIF(); 

				}
				break;
			case 49 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:242: IMPLEMENTS
				{
				mIMPLEMENTS(); 

				}
				break;
			case 50 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:253: IMPORT
				{
				mIMPORT(); 

				}
				break;
			case 51 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:260: INSTANCEOF
				{
				mINSTANCEOF(); 

				}
				break;
			case 52 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:271: INTERFACE
				{
				mINTERFACE(); 

				}
				break;
			case 53 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:281: NATIVE
				{
				mNATIVE(); 

				}
				break;
			case 54 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:288: NEW
				{
				mNEW(); 

				}
				break;
			case 55 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:292: PACKAGE
				{
				mPACKAGE(); 

				}
				break;
			case 56 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:300: PRIVATE
				{
				mPRIVATE(); 

				}
				break;
			case 57 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:308: PROTECTED
				{
				mPROTECTED(); 

				}
				break;
			case 58 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:318: PUBLIC
				{
				mPUBLIC(); 

				}
				break;
			case 59 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:325: RETURN
				{
				mRETURN(); 

				}
				break;
			case 60 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:332: STATIC
				{
				mSTATIC(); 

				}
				break;
			case 61 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:339: SUPER
				{
				mSUPER(); 

				}
				break;
			case 62 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:345: SWITCH
				{
				mSWITCH(); 

				}
				break;
			case 63 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:352: SYNCHRONIZED
				{
				mSYNCHRONIZED(); 

				}
				break;
			case 64 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:365: THIS
				{
				mTHIS(); 

				}
				break;
			case 65 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:370: THROW
				{
				mTHROW(); 

				}
				break;
			case 66 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:376: THROWS
				{
				mTHROWS(); 

				}
				break;
			case 67 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:383: TRANSIENT
				{
				mTRANSIENT(); 

				}
				break;
			case 68 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:393: TRY
				{
				mTRY(); 

				}
				break;
			case 69 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:397: VOLATILE
				{
				mVOLATILE(); 

				}
				break;
			case 70 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:406: WHILE
				{
				mWHILE(); 

				}
				break;
			case 71 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:412: ID
				{
				mID(); 

				}
				break;
			case 72 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:415: INTEGER
				{
				mINTEGER(); 

				}
				break;
			case 73 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:423: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 74 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:429: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 75 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:437: WS
				{
				mWS(); 

				}
				break;
			case 76 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:440: STRING
				{
				mSTRING(); 

				}
				break;
			case 77 :
				// C:\\Users\\Matteo\\Desktop\\eclipse workspace\\ltspice2circuitikz\\src\\compiler\\Ltspice2circuitikz.g:1:447: CHAR
				{
				mCHAR(); 

				}
				break;

		}
	}


	protected DFA14 dfa14 = new DFA14(this);
	protected DFA22 dfa22 = new DFA22(this);
	static final String DFA14_eotS =
		"\5\uffff";
	static final String DFA14_eofS =
		"\5\uffff";
	static final String DFA14_minS =
		"\2\56\3\uffff";
	static final String DFA14_maxS =
		"\1\71\1\145\3\uffff";
	static final String DFA14_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA14_specialS =
		"\5\uffff}>";
	static final String[] DFA14_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
			"",
			"",
			""
	};

	static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
	static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
	static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
	static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
	static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
	static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
	static final short[][] DFA14_transition;

	static {
		int numStates = DFA14_transitionS.length;
		DFA14_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
		}
	}

	protected class DFA14 extends DFA {

		public DFA14(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 14;
			this.eot = DFA14_eot;
			this.eof = DFA14_eof;
			this.min = DFA14_min;
			this.max = DFA14_max;
			this.accept = DFA14_accept;
			this.special = DFA14_special;
			this.transition = DFA14_transition;
		}
		@Override
		public String getDescription() {
			return "157:1: FLOAT : ( ( DIGIT )+ '.' ( DIGIT )* ( EXPONENT )? | '.' ( DIGIT )+ ( EXPONENT )? | ( DIGIT )+ EXPONENT );";
		}
	}

	static final String DFA22_eotS =
		"\1\uffff\1\56\1\60\1\62\1\64\3\uffff\1\65\12\uffff\1\70\1\uffff\1\72\1"+
		"\74\1\uffff\20\50\1\uffff\1\142\23\uffff\2\50\1\147\12\50\1\163\27\50"+
		"\1\uffff\2\50\1\u0092\1\50\1\uffff\11\50\1\u009e\1\50\1\uffff\20\50\1"+
		"\u00b0\10\50\1\u00b9\1\50\1\u00bb\2\50\1\uffff\3\50\1\u0092\7\50\1\uffff"+
		"\4\50\1\u00cc\1\u0092\1\u00cd\6\50\1\u00d4\1\u00d5\2\50\1\uffff\5\50\1"+
		"\u00dd\2\50\1\uffff\1\50\1\uffff\5\50\1\u0092\1\50\1\u00e7\2\50\1\u0092"+
		"\1\u00eb\3\50\1\u00ef\2\uffff\1\u00f0\1\u00f1\4\50\2\uffff\7\50\1\uffff"+
		"\1\u00fe\1\50\1\u0100\4\50\1\u0105\1\u0106\1\uffff\1\u0107\2\50\1\uffff"+
		"\1\u0092\2\50\3\uffff\1\50\1\u0092\1\50\1\u010e\1\50\1\u0110\3\50\1\u0114"+
		"\1\u0115\1\u0116\1\uffff\1\50\1\uffff\4\50\3\uffff\1\50\1\u011d\1\u011e"+
		"\1\u0092\2\50\1\uffff\1\u0121\1\uffff\1\u0122\1\u0123\1\50\3\uffff\1\50"+
		"\1\u0126\4\50\2\uffff\1\u012b\1\u012c\3\uffff\2\50\1\uffff\1\u012f\3\50"+
		"\2\uffff\1\u0133\1\u0134\1\uffff\1\u0135\1\u0136\1\50\4\uffff\1\50\1\u0139"+
		"\1\uffff";
	static final String DFA22_eofS =
		"\u013a\uffff";
	static final String DFA22_minS =
		"\1\11\4\75\3\uffff\1\60\12\uffff\1\52\1\uffff\1\46\1\174\1\uffff\1\157"+
		"\1\146\1\157\1\150\1\151\1\145\1\157\1\141\1\164\1\142\1\154\2\141\1\145"+
		"\2\150\1\uffff\1\56\23\uffff\1\151\1\163\1\60\1\160\1\156\1\157\1\141"+
		"\1\160\1\151\1\156\1\157\1\156\1\162\1\60\1\146\1\157\1\145\1\164\1\141"+
		"\1\163\1\141\1\156\1\162\3\163\1\165\2\164\1\167\1\143\1\151\1\142\1\164"+
		"\1\151\1\141\1\151\1\uffff\1\144\1\141\1\60\1\164\1\uffff\1\154\1\147"+
		"\1\162\1\164\1\145\1\164\1\143\2\141\1\60\1\142\1\uffff\1\141\1\154\1"+
		"\141\1\145\1\162\1\145\1\143\1\163\1\164\1\151\1\164\2\145\1\155\1\145"+
		"\1\151\1\60\1\153\1\166\1\164\1\154\1\165\1\163\1\157\1\156\1\60\1\154"+
		"\1\60\1\164\1\162\1\uffff\1\141\1\145\1\162\1\60\1\164\1\151\1\162\1\143"+
		"\1\150\1\164\1\154\1\uffff\1\154\1\165\1\145\1\153\3\60\1\150\1\163\1"+
		"\151\1\156\2\162\2\60\1\156\1\166\1\uffff\2\141\1\145\1\151\1\162\1\60"+
		"\1\167\1\163\1\uffff\1\145\1\uffff\1\151\1\146\1\156\1\155\1\164\1\60"+
		"\1\143\1\60\1\150\1\162\2\60\1\145\1\154\1\141\1\60\2\uffff\2\60\1\156"+
		"\1\147\1\141\1\164\2\uffff\1\144\1\145\1\147\1\164\2\143\1\156\1\uffff"+
		"\1\60\1\151\1\60\1\154\1\141\1\143\1\145\2\60\1\uffff\1\60\1\157\1\171"+
		"\1\uffff\1\60\1\164\1\156\3\uffff\1\165\1\60\1\143\1\60\1\163\1\60\2\145"+
		"\1\164\3\60\1\uffff\1\145\1\uffff\1\145\1\143\1\145\1\156\3\uffff\1\156"+
		"\3\60\1\145\1\164\1\uffff\1\60\1\uffff\2\60\1\145\3\uffff\1\156\1\60\1"+
		"\145\1\157\1\164\1\151\2\uffff\2\60\3\uffff\1\144\1\164\1\uffff\1\60\1"+
		"\146\1\163\1\172\2\uffff\2\60\1\uffff\2\60\1\145\4\uffff\1\144\1\60\1"+
		"\uffff";
	static final String DFA22_maxS =
		"\1\175\4\75\3\uffff\1\71\12\uffff\1\57\1\uffff\1\46\1\174\1\uffff\1\157"+
		"\1\156\1\157\1\171\2\157\1\171\1\157\1\164\1\163\1\170\1\145\1\165\1\145"+
		"\1\162\1\150\1\uffff\1\145\23\uffff\1\154\1\164\1\172\1\160\1\156\1\157"+
		"\1\141\1\160\1\151\1\156\1\157\1\156\1\162\1\172\1\146\1\157\1\145\1\164"+
		"\1\141\1\164\1\141\1\156\1\162\3\163\1\165\2\164\1\167\1\143\1\157\1\142"+
		"\1\164\1\162\1\171\1\151\1\uffff\1\144\1\141\1\172\1\164\1\uffff\1\157"+
		"\1\147\1\162\1\164\1\145\1\164\1\143\2\141\1\172\1\142\1\uffff\1\141\1"+
		"\154\1\141\1\145\1\162\1\145\1\143\1\163\1\164\1\151\1\164\2\145\1\155"+
		"\1\145\1\151\1\172\1\153\1\166\1\164\1\154\1\165\1\163\1\157\1\156\1\172"+
		"\1\154\1\172\1\164\1\162\1\uffff\1\141\1\145\1\162\1\172\1\164\1\151\1"+
		"\162\1\143\1\150\1\164\1\154\1\uffff\1\154\1\165\1\145\1\153\3\172\1\150"+
		"\1\163\1\151\1\156\2\162\2\172\1\156\1\166\1\uffff\2\141\1\145\1\151\1"+
		"\162\1\172\1\167\1\163\1\uffff\1\145\1\uffff\1\151\1\146\1\156\1\155\1"+
		"\164\1\172\1\143\1\172\1\150\1\162\2\172\1\145\1\154\1\141\1\172\2\uffff"+
		"\2\172\1\156\1\147\1\141\1\164\2\uffff\1\144\1\145\1\147\1\164\2\143\1"+
		"\156\1\uffff\1\172\1\151\1\172\1\154\1\141\1\143\1\145\2\172\1\uffff\1"+
		"\172\1\157\1\171\1\uffff\1\172\1\164\1\156\3\uffff\1\165\1\172\1\143\1"+
		"\172\1\163\1\172\2\145\1\164\3\172\1\uffff\1\145\1\uffff\1\145\1\143\1"+
		"\145\1\156\3\uffff\1\156\3\172\1\145\1\164\1\uffff\1\172\1\uffff\2\172"+
		"\1\145\3\uffff\1\156\1\172\1\145\1\157\1\164\1\151\2\uffff\2\172\3\uffff"+
		"\1\144\1\164\1\uffff\1\172\1\146\1\163\1\172\2\uffff\2\172\1\uffff\2\172"+
		"\1\145\4\uffff\1\144\1\172\1\uffff";
	static final String DFA22_acceptS =
		"\5\uffff\1\10\1\11\1\12\1\uffff\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23"+
		"\1\24\1\25\1\uffff\1\27\2\uffff\1\33\20\uffff\1\107\1\uffff\1\113\1\114"+
		"\1\115\1\2\1\1\1\3\1\30\1\5\1\4\1\7\1\6\1\13\1\111\1\112\1\26\1\31\1\34"+
		"\1\32\1\35\45\uffff\1\110\4\uffff\1\60\13\uffff\1\51\36\uffff\1\37\13"+
		"\uffff\1\57\21\uffff\1\66\10\uffff\1\104\1\uffff\1\36\20\uffff\1\43\1"+
		"\44\6\uffff\1\52\1\53\7\uffff\1\100\11\uffff\1\75\3\uffff\1\55\3\uffff"+
		"\1\42\1\45\1\46\14\uffff\1\101\1\uffff\1\106\4\uffff\1\62\1\74\1\76\6"+
		"\uffff\1\41\1\uffff\1\65\3\uffff\1\72\1\73\1\102\6\uffff\1\56\1\50\2\uffff"+
		"\1\54\1\67\1\70\2\uffff\1\105\4\uffff\1\47\1\40\2\uffff\1\64\3\uffff\1"+
		"\71\1\103\1\63\1\61\2\uffff\1\77";
	static final String DFA22_specialS =
		"\u013a\uffff}>";
	static final String[] DFA22_transitionS = {
			"\2\52\2\uffff\1\52\22\uffff\1\52\1\2\1\53\2\uffff\1\24\1\25\1\54\1\12"+
			"\1\13\1\22\1\20\1\7\1\21\1\10\1\23\12\51\1\6\1\11\1\4\1\1\1\3\1\uffff"+
			"\1\5\22\50\1\40\7\50\1\14\1\uffff\1\15\1\27\1\50\1\uffff\1\41\1\36\1"+
			"\37\1\35\1\42\1\34\2\50\1\31\2\50\1\32\1\50\1\43\1\50\1\44\1\50\1\45"+
			"\1\33\1\46\1\50\1\30\1\47\3\50\1\16\1\26\1\17",
			"\1\55",
			"\1\57",
			"\1\61",
			"\1\63",
			"",
			"",
			"",
			"\12\66",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\67\4\uffff\1\67",
			"",
			"\1\71",
			"\1\73",
			"",
			"\1\75",
			"\1\77\6\uffff\1\100\1\76",
			"\1\101",
			"\1\102\13\uffff\1\103\1\104\1\uffff\1\105\1\uffff\1\106",
			"\1\110\2\uffff\1\107\2\uffff\1\111",
			"\1\113\11\uffff\1\112",
			"\1\114\2\uffff\1\115\6\uffff\1\116",
			"\1\120\6\uffff\1\117\3\uffff\1\121\2\uffff\1\122",
			"\1\123",
			"\1\124\20\uffff\1\125",
			"\1\126\1\uffff\1\127\11\uffff\1\130",
			"\1\131\3\uffff\1\132",
			"\1\133\20\uffff\1\134\2\uffff\1\135",
			"\1\136",
			"\1\137\11\uffff\1\140",
			"\1\141",
			"",
			"\1\66\1\uffff\12\51\13\uffff\1\66\37\uffff\1\66",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\143\2\uffff\1\144",
			"\1\146\1\145",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
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
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\24\50\1\162\5\50",
			"\1\164",
			"\1\165",
			"\1\166",
			"\1\167",
			"\1\170",
			"\1\171\1\172",
			"\1\173",
			"\1\174",
			"\1\175",
			"\1\176",
			"\1\177",
			"\1\u0080",
			"\1\u0081",
			"\1\u0082",
			"\1\u0083",
			"\1\u0084",
			"\1\u0085",
			"\1\u0086\5\uffff\1\u0087",
			"\1\u0088",
			"\1\u0089",
			"\1\u008a\10\uffff\1\u008b",
			"\1\u008c\27\uffff\1\u008d",
			"\1\u008e",
			"",
			"\1\u008f",
			"\1\u0090",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\4\50\1\u0091\25\50",
			"\1\u0093",
			"",
			"\1\u0094\2\uffff\1\u0095",
			"\1\u0096",
			"\1\u0097",
			"\1\u0098",
			"\1\u0099",
			"\1\u009a",
			"\1\u009b",
			"\1\u009c",
			"\1\u009d",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u009f",
			"",
			"\1\u00a0",
			"\1\u00a1",
			"\1\u00a2",
			"\1\u00a3",
			"\1\u00a4",
			"\1\u00a5",
			"\1\u00a6",
			"\1\u00a7",
			"\1\u00a8",
			"\1\u00a9",
			"\1\u00aa",
			"\1\u00ab",
			"\1\u00ac",
			"\1\u00ad",
			"\1\u00ae",
			"\1\u00af",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00b1",
			"\1\u00b2",
			"\1\u00b3",
			"\1\u00b4",
			"\1\u00b5",
			"\1\u00b6",
			"\1\u00b7",
			"\1\u00b8",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00ba",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00bc",
			"\1\u00bd",
			"",
			"\1\u00be",
			"\1\u00bf",
			"\1\u00c0",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00c1",
			"\1\u00c2",
			"\1\u00c3",
			"\1\u00c4",
			"\1\u00c5",
			"\1\u00c6",
			"\1\u00c7",
			"",
			"\1\u00c8",
			"\1\u00c9",
			"\1\u00ca",
			"\1\u00cb",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00ce",
			"\1\u00cf",
			"\1\u00d0",
			"\1\u00d1",
			"\1\u00d2",
			"\1\u00d3",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00d6",
			"\1\u00d7",
			"",
			"\1\u00d8",
			"\1\u00d9",
			"\1\u00da",
			"\1\u00db",
			"\1\u00dc",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00de",
			"\1\u00df",
			"",
			"\1\u00e0",
			"",
			"\1\u00e1",
			"\1\u00e2",
			"\1\u00e3",
			"\1\u00e4",
			"\1\u00e5",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00e6",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00e8",
			"\1\u00e9",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\13\50\1\u00ea\16\50",
			"\1\u00ec",
			"\1\u00ed",
			"\1\u00ee",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00f2",
			"\1\u00f3",
			"\1\u00f4",
			"\1\u00f5",
			"",
			"",
			"\1\u00f6",
			"\1\u00f7",
			"\1\u00f8",
			"\1\u00f9",
			"\1\u00fa",
			"\1\u00fb",
			"\1\u00fc",
			"",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\22\50\1\u00fd\7\50",
			"\1\u00ff",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u0101",
			"\1\u0102",
			"\1\u0103",
			"\1\u0104",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u0108",
			"\1\u0109",
			"",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u010a",
			"\1\u010b",
			"",
			"",
			"",
			"\1\u010c",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u010d",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u010f",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u0111",
			"\1\u0112",
			"\1\u0113",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"\1\u0117",
			"",
			"\1\u0118",
			"\1\u0119",
			"\1\u011a",
			"\1\u011b",
			"",
			"",
			"",
			"\1\u011c",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u011f",
			"\1\u0120",
			"",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u0124",
			"",
			"",
			"",
			"\1\u0125",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u0127",
			"\1\u0128",
			"\1\u0129",
			"\1\u012a",
			"",
			"",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"",
			"",
			"\1\u012d",
			"\1\u012e",
			"",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u0130",
			"\1\u0131",
			"\1\u0132",
			"",
			"",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u0137",
			"",
			"",
			"",
			"",
			"\1\u0138",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			""
	};

	static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
	static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
	static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
	static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
	static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
	static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
	static final short[][] DFA22_transition;

	static {
		int numStates = DFA22_transitionS.length;
		DFA22_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
		}
	}

	protected class DFA22 extends DFA {

		public DFA22(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 22;
			this.eot = DFA22_eot;
			this.eof = DFA22_eof;
			this.min = DFA22_min;
			this.max = DFA22_max;
			this.accept = DFA22_accept;
			this.special = DFA22_special;
			this.transition = DFA22_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( ASSIGN | EQ | NEQ | GT | GE | LT | LE | AT | CL | CM | DOT | SC | LP | RP | LB | RB | LBR | RBR | ADD | SUB | STAR | DIV | MOD | NOT | AND | OR | XOR | AND_BIT | OR_BIT | VOID | BASIC_TYPE | ABSTRACT | ASSERT | BREAK | BYTE | CASE | CATCH | CLASS | CONTINUE | DEFAULT | DO | ELSE | ENUM | EXTENDS | FINAL | FINALLY | FOR | IF | IMPLEMENTS | IMPORT | INSTANCEOF | INTERFACE | NATIVE | NEW | PACKAGE | PRIVATE | PROTECTED | PUBLIC | RETURN | STATIC | SUPER | SWITCH | SYNCHRONIZED | THIS | THROW | THROWS | TRANSIENT | TRY | VOLATILE | WHILE | ID | INTEGER | FLOAT | COMMENT | WS | STRING | CHAR );";
		}
	}

}
