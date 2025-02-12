/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class unary
{
	public static void main(String[] args) {
	    int x=10;
	   int y=x++ + ++x + ++x + x++ + ++x ;
	   x=10;
	   int a= --x + x++ + ++x + --x + x++;
	   x=10;
	    int b = --x + --x + --x + --x;
		System.out.println("increment :"+y);
			System.out.println("operation :"+a);
				System.out.println("operation :"+b);
		

	}
}