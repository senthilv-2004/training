/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class palindrome
{
    public static void main(String [] args)
    {
        System.out.println("Enter The Number:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(reverse(a));
        System.out.println("The Next Pal="+pal(a));
    }
    public static int reverse(int a)
    {
        int r=0;
        while(a!=0)
        {
            int b=a%10;
            r=r*10+b;
            a=a/10;
        }
        return r;
    }
    public static int pal(int a)
    {
        a++;
        while(a!=reverse(a))
        {
            a++;
        }
        return a;
    }
}