/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class printnestedloop3
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = in.nextInt();
       int i,j,k=1;
       for(i=1;i<=n;i++)
       {
           for(j=1;j<=i;j++)
           {
               System.out.print(k+" ");
                k++;
           }
           System.out.println();
       }}}