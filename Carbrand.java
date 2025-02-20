/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
class Car{
    String brand="unknown";
    Car(){
        System.out.println("Intial Brand Name :"+brand);
    }
    void SetBrand(String S)
    {
        brand=S;
        System.out.println("User Brand :"+brand);
    }
}

public class Carbrand
{
	public static void main(String[] args) {
	    
	    Car c=new Car();
	    Scanner scan =new Scanner(System.in);
	    System.out.print("Enter the Brand Name :");
	    String b=scan.nextLine(); 
	    c.SetBrand(b);
    
	}
}