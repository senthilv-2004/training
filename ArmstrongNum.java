/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class ArmstrongNum
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = in.nextInt();
        int count = num;
        int Sum = 0;
        
        while (num > 0) {
            int digit = num % 10;
            Sum = Sum + (digit * digit * digit);
            num /= 10;
        }
        
        if (Sum == count)
            System.out.println(count + " is an Armstrong number");
        else
            System.out.println(count + " is not an Armstrong number");
    }
} 