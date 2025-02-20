/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class class2
{
    String name;
        Scanner s=new Scanner(System.in);
   
        void output(){
            System.out.print("enter the number of elements:");
              int n=s.nextInt();
              s.nextLine();
                System.out.print("enter the name:");
           for(int i=0;i<n;i++)
             
           {
               name=s.nextLine();
                       
           }  System.out.print("enter the reg.no:");
           for(int i=0;i<n;i++)
             
           {
             int  regno=s.nextInt();
                       
           }
        }
    


	public static void main(String[] args) {
	class2 a=new class2();
	a.output();
	}
}
