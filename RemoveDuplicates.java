/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] a = {3, 2, 3, 1, 2, 9};
        int n = a.length;
  int j=0;
        int c= 0;
       
        for (int i = 0; i < n; i++)
            {
                  for ( j = 0; j < c; j++)
                  {
                       if (a[i]==a[j]) {
                           break;
                       }}
                
                if (j==c) 
                {
                   a[c++] = a[i];
                }
            }
            
    
        System.out.print("Array without duplicates: ");
        for (int i = 0; i < c; i++) {
            System.out.print(a[i] + " ");
        }
    }
}


