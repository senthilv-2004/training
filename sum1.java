/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
class add{
    public  int a,b,c;
   public void display(){
       
        System.out.println("sum=" + c);
       
   }}
   public class sum1 {
   
       public static void main(String args[]){
           add obj=new add();
           Scanner s=new Scanner(System.in);
           System.out.print("enter the a value:");
         obj.a=s.nextInt();
            System.out.print("enter the b value:" );
         obj.b=s.nextInt();
         obj.c=obj.a+obj.b;
         obj.display();
       }
   }
   
   