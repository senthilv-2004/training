/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class mcq3
{
	public static void main(String[] args) {
	    int n=596;
	     int count=0;
	     
	    while(n>0)
	    {
	  int r=n%10;
	  n=n/10;
	  count++;
	    }
	    System.out.println("No of digit :" + count);
	}
}