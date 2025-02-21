/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class LeftAngledTriangle{
    public int n=5;
    public void printleft(){
        System.out.print("Left Angled Triangle:");
    for(int i=0;i<=n;i++){
        for(int j=i;j<=n;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
}
class RightAngledTriangle{
    public int n=5;
    public void printright(){
        System.out.println("Right Angled Triangle:");
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
}
public class Triangles{
    public static void main(String[] args){
        LeftAngledTriangle obj=new LeftAngledTriangle();
        obj.printleft();
        RightAngledTriangle obj1=new RightAngledTriangle();
        obj1.printright();
    }
}