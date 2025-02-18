/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
public class addarrays
{
	public static void main(String[] args) {
        int arrA[]={5,1,3};
        int arrB[]={9,7,7,7};
        int temp[]=new int[5];
        int n=arrA.length;
        int m=arrB.length;
        int carry=0;
        int i=0;int j=0;int k=0;
        while( i<n|| j<m ||carry!=0)
        {
            int sum=carry;
            if(i<n)
            {
                sum+=arrA[i++];
            }
            if(j<m)
            {
                sum+=arrB[j++];
            }
            temp[k++]=sum%10;
            carry=sum/10;
        }
        for(int l=0;l<k;l++)
        {
            System.out.print(temp[l]+" ");
        }
        
        
	}
}