/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class class1
{
        Scanner s=new Scanner(System.in);
   
        void output(){
                System.out.print("enter the name :");
           String  name=s.nextLine();
           System.out.println("name:"+name);
             System.out.print("enter the register no:");
           int  regno=s.nextInt();
           System.out.println("regno:"+regno);
           
        }
    


	public static void main(String[] args) {
	class1 a=new class1();
	a.output();
	}
}
