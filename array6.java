/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class array6
{
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5};
	int	n=3;
		for(int i=n-1;i>=0;i--){
		    System.out.print(arr[i]);
		}
		for(int i=arr.length-1;i>=n;i--)
		{
		    System.out.print(arr[i]);
		}
	}
}