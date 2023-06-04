package com.omega.unittest;
import static org.junit.Assert.*;

import org.junit.Test;

import com.omega.tester.ParserTester;

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
		String path = ".\\resources\\Test3 - Ponte Diodi.asc";
		
		assertEquals(parser.runParser(path), "Parsing terminato con successo");
	}
}
