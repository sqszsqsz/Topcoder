package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class squaretest {
	
	@Test
	public void test() {
		Junit_testing test1=new Junit_testing();
		int output=test1.square(5);
		assertEquals(output,25);
	}
	
	@Test
	public void test1() {
		Junit_testing test1=new Junit_testing();
		int output=test1.square(6);
		assertEquals(output,36);
	}
	
	@Test
	public void test2() {
		Junit_testing test1=new Junit_testing();
		int output=test1.countA("ABCDABCD");
		assertEquals(output,2);
	}

}
