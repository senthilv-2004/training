/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Bitwise
{
	public static void main(String[] args) {
	    int a=492;
	    int b=333;
	 
		System.out.println("integer a to binary :"+Integer.toBinaryString(a) );
		System.out.println("integer a to binary :"+Integer.toBinaryString(b) );
		System.out.println("bitwise and operator:"+(a&b));
		System.out.println("bitwise or operator:"+(a|b));
		System.out.println("bitwise ex or operator:"+(a^b));


	}
}