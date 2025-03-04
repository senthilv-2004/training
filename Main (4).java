import java.util.*;
public class Main 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the String :");
     String n=in.nextLine();
     String rev="";
     for (int i=n.length()-1; i>=0; i--) 
     {
         rev+=n.charAt(i);
     }
     if((n.equals(rev)))
     {
         System.out.println("Given String is a Palindrome");
     }
     else{
          System.out.println("Given String is  not a Palindrome");
     }
     System.out.println("enter the String :");
     String m=in.nextLine();
     StringBuffer s=new StringBuffer(m);
     String rev1=s.reverse().toString();
      if((m.equals(rev1)))
     {
         System.out.println("Given String is a Palindrome");
     }
     else{
          System.out.println("Given String is  not a Palindrome");
     }
      System.out.println("enter the String :");
     String l=in.nextLine();
     StringBuilder o=new StringBuilder(l);
     String rev2=o.reverse().toString();
      if((l.equals(rev2)))
     {
         System.out.println("Given String is a Palindrome");
     }
     else{
          System.out.println("Given String is  not a Palindrome");
     }
    }
}