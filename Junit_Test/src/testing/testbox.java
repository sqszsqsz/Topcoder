package testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class testbox {
	 protected test solution;
	
	@Before
	public void setUp() throws Exception {
		
	       solution = new test();
	    
	}

	@Test
	public void test() {
		int[] a = new int[]{1, 2, 3, 4, 5, 6};
        int[] b = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] c = new int[]{1, 2, 3, 4, 5, 6};
        int[] d = new int[]{0, 1, 2};
        int[] e = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

        int expected = 6;
        int actual = solution.maxCredit(a, b, c, d, e);

        assertEquals(expected, actual);
	}

}
