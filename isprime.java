/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;


class isprime {
    static boolean isPrime(int n)
    {
 
        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        return true;
    }
    public static void main(String args[])
    {
        int num = 4;
        if (isPrime(num)) {
            System.out.println(num + " is prime");
        }
        else {
            System.out.println(num + " is not prime");
        }
    }
}
