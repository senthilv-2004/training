import java.util.*;
abstract class Circle
{
   static double area,circum;
   static Scanner in =new Scanner(System.in);
   static void area(){
       double r;
       System.out.print("enter the value:");
       r=in.nextDouble();
       area=3.14*r*r;
        System.out.println("Area = " + area);
   }
   static void circum(){
       double r;
        System.out.print("enter the value:");
       r=in.nextDouble();
       circum=2*3.14*r;
        System.out.println("Circumference = " + circum);
       
   }
}
   public class Circumference{
       public static void main(String arrgs[]){
           Circle.area();
           Circle.circum();
       }
   }