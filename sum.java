/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
class add{
    private  int a,b,c;
    public void sum(){
        Scanner s=new Scanner(System.in);
         System.out.print("Enter the a value:");
        a=s.nextInt();
         System.out.print("Enter the a value:");
        b=s.nextInt();
        c=a+b;
        System.out.println("sum="+ c);
    }
}
class sum 
    {
    public static void main(String args[]){
            add s=new add();
            s.sum();
        }
    }
