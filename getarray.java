import java.util.*;
public class getarray
{
 public static void main(String args[])
 {
  System.out.println("Enter the elements :");
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int arr[]=new int[6];
  System.out.println("Enter the array numbers:");
  for(int i=0;i<arr.length;i++)
  {
   arr[i]=sc.nextInt();
  }
  for(int i=0;i<arr.length;i++)
  {
    System.out.print(arr[i]);
  }
 
 }
}