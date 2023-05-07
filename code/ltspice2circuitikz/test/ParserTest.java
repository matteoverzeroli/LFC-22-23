import static org.junit.Assert.*;

import org.junit.Test;

import tester.ParserTester;

public class ParserTest {

	@Test
	public void testParser1() {
		ParserTester parser = new ParserTester();
		String path = ".\\resources\\Test1 - RC.asc";
		
		assertEquals(parser.runParser(path), "Parsing terminato con successo");
	}
	
	
	@Test
	public void testParser2() {
		ParserTester parser = new ParserTester();
		String path = ".\\resources\\Test2 - RLC.asc";
		
		assertEquals(parser.runParser(path), "Parsing terminato con successo");
	}

	
	@Test
	public void testParser3() {
		ParserTester parser = new ParserTester();
		String path = ".\\resources\\Test3 - Emitter Follower.asc";
		
		assertEquals(parser.runParser(path), "Parsing terminato con successo");
	}

	
	@Test
	public void testParser4() {
		ParserTester parser = new ParserTester();
		String path = ".\\resources\\Test4 - Ponte Diodi.asc";
		
		assertEquals(parser.runParser(path), "Parsing terminato con successo");
	}

	
	@Test
	public void testParser5() {
		ParserTester parser = new ParserTester();
		String path = ".\\resources\\Test5 - opamp.asc";
		
		assertEquals(parser.runParser(path), "Parsing terminato con successo");
	}

}
