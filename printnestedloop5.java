/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class printnestedloop5
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = in.nextInt();
       int i,j,k,l;
       for(i=1;i<=n;i++)
       {
           for(j=n-1;j>=i;j--)
           {
               System.out.print(" ");
           }
          for(k=1;k<=i;k++){
               System.out.print("1");
          }
          for(l=1;l<=j;l++){
        System.out.print("1");
       }System.out.println(" ");
           
       }}}