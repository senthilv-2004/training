import java.util.*;

public class Main
{
    static void string()
    {
        int start=0;
        int end=0;
        String s="t6hj7ui";
        int n=s.length();
        int num=0;
        for(int i=0;i<n;i++)
        {
            if(Character.isLetter(s.charAt(i)))
            {
                continue;
            }
            else if(Character.isDigit(s.charAt(i)))
            {
                num=s.charAt(i)-'0';
                end=i;
                for(int k=0;k<num;k++)
                {
                    System.out.print(s.substring(start,end));
                }
                start=i+1;
               
            }
            
        }
        System.out.print(s.substring(start,n));
    }
    public static void main(String args[])
    {
       string(); 
    }
}
