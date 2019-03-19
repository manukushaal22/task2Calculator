/**
 * 
 */

/**
 * @author Kushaal
 * This can add, subtract, multiply, and divide two integers
 *
 */
public class Calculator {
	
	
	/**
	 * To add a and b
	 * @param a first number
	 * @param b second number
	 * @return
	 */
	public int add(int a,int b)
	{
		return a+b;
	}
	
	
	/**
	 * To Subtract b from a
	 * @param a
	 * @param b
	 * @return
	 */
	public int subtract(int a,int b)
	{
		return a-b;
	}
	
	
	/**
	 * To multiply a and b
	 * @param a
	 * @param b
	 * @return
	 */
	public int multiply(int a,int b)
	{
		return a*b;
	}
	
	
	/**
	 * To divide a by b
	 * If denominator is zero, exception is thrown and -1 is returned
	 * @param a
	 * @param b
	 * @return
	 */
	public int divide(int a,int b)
	{
		try {
			return a/b;
		} 
		catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

}
