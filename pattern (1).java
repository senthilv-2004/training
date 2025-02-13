/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;

public class pattern {

 public static void main(String args[])    {
        int i, j,n=5;
        int num = 1;
        for (i = 2; i <= n; i++) {
            for (j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (i = n-1; i >= 1; i--) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i- 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

   