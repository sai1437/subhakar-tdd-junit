package junitstrings;

import static org.junit.Assert.*;

import org.junit.Test;

public class Junit_StringsTest {

	@Test
	public void test() {
		Junit_Strings j=new Junit_Strings();
		assertEquals("BCAAD",j.Check("ABCAAD"));
	}

}
