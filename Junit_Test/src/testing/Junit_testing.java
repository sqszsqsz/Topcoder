package testing;

/**
 * 
 * @author zhesun3
 *
 */
public class Junit_testing {
	/**
	 * Test a square method
	 * @param an integer a
	 * @return pow(a,2)
	 */
	public int square(int a){
		return a*a;
	}
	
	/**
	 * Test a count number of 'a's method
	 * @param string X
	 * @return number of A's
	 */
	public int countA(String X){
		int count=0;
		for (int i=0;i<X.length();i++){
			if (X.charAt(i)=='a' || X.charAt(i)=='A') count++;
		}
		return count;
	}
}
