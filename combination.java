/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class combination
{
	public static void main(String[] args) {
int arr[]={5,10};
String greater=arr[0]+""+arr[1];
String smaller=arr[1]+""+arr[0];
int r1=Integer.parseInt(greater);
int r2=Integer.parseInt(smaller);
if(r1>r2){
    System.out.println(r1);
}
else{
    System.out.println(r2);
}

}
}