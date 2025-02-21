class pattern{
    static class innerpattern{
   static int n=5;  
    void display(){
       for(int i=1;i<=n;i++)
       {
           for(int j=1;j<=i;j++){
               if(j%2==0){
                   System.out.print("# ");
               }
               else{
                   System.out.print("* ");
               }
           } 
           System.out.println(" ");
       }
    }
}
}
public class hashstar{
    public static void main(String args[])
{
    pattern.innerpattern a=new pattern.innerpattern();
    a.display();
} }