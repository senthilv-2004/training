/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class array3{
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int max=arr[0];
          int max1=max;
          int max2=max;
        
        for( int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
            max=arr[i];
            }
        }
  System.out.println(max);
  for( int i=1;i<arr.length;i++)
{
    if(arr[i]>max1 && arr[i]!=max)
    {
        max1=arr[i];
    }
}
        System.out.println(max1);
         for( int i=1;i<arr.length;i++)
{
    if(arr[i]>max2 && arr[i]!=max && arr[i]!=max1)
    {
        max2=arr[i];
    }
}
        System.out.println(max2);
    
}
}
