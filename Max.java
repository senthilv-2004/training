/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Max
{
	public static void main(String[] args) {
	    int a=98;
	    int b=50;
	   int c=18;
	  
		System.out.println("max using short circuit:"+ ((a>b) && (b<c))  );
		System.out.println("max using non short circuit:"+ ((a>b)&(b>c)));
	}
}