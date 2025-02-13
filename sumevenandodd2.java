/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class sumevenandodd2
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
	            oddcount=oddcount+count;
	            
	        }
	        else
	        {
	            evencount=evencount+count;
	        }
	        
	        
	    }System.out.println("evencount is :" + evencount);
	         System.out.println("oddcount is :" + oddcount);

	}
}