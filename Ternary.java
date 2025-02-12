/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Ternary
{
	public static void main(String[] args) {
	    int a=98;
	    int b=50;
	   int c=18;
	 int  d;
	 d=(((a>b) && (c>a))?a:b);
 	  
		System.out.println("max using ternary operator :"+d );

	}
}