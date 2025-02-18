/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
public class similararray3
{
	public static void main(String[] args) {
	int a[]={1,1,0,0,1,1,1,1};
	int	b[]={1,1,1,0,1,1};
	
	int count=0; 
	for(int i=0;i<b.length;i++)
	{
	    if(a[i]== b[i] ) 
	    {
	       count++; 
	    }
	    
	    }
	
	    System.out.println(count);
	}
	}
	
