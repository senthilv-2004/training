/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class evenandodd
{
	public static void main(String[] args) {
	    int val=123456;
	    int count;
	    int evencount=0;
	    int oddcount=0;

	    while(val>0)
	    {
	        count=val%10;
	        val=val/10;
	       if(count%2!=0)
	       {
	           oddcount=(oddcount*10)+count;
	      }
	      else  
	       {
	          evencount=(evencount*10)+count;
	
	      }
	        
	    }
	    System.out.println("oddcount :"+oddcount);
	    System.out.println("evencount :"+evencount);
	            
	}}
	     