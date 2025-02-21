import java.util.*;
class calculator{
    Scanner s=new Scanner(System.in);
    public void add(){
        int a,b,c;
          System.out.print("enter the a value:");
          a=s.nextInt();
          System.out.print("enter the b value:");
          b=s.nextInt();
        c=a+b;
        System.out.println(" sum :" + c);
    }
    public int sub(){
        int d,e,f;
         System.out.print("enter the d value:");
          d=s.nextInt();
          System.out.print("enter the e value:");
          e=s.nextInt();
          f=d-e;
         return f;
        
    }
    public void mul(int g,int h){

        int i=g*h;
        System.out.print("product :" + i);
        
    }
    public double div(double x,double y){
        double z=x/y;
        return z;
    }
}
    class sum3
    {
        public static  void main(String args[])
        {
      calculator s=new calculator();
            calculator p=new calculator();
             calculator m=new calculator();
                 calculator n =new calculator();
      s.add();
     System.out.println ("diff :" +p.sub());
     m.mul(5,8);
     
     System.out.println ("div :" +p.div(16,8));
     
        } 
    }