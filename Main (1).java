class book
{
    String a;
    Double prize;
   book()
    {
        a= "java programming";
         prize=100.0;
        
    }
}
    public class Main{
        public static void main(String args[]){
            book obj=new book();
        
        System.out.println("book title :" + obj.a);
         System.out.println("book prize :" + obj.prize);
    }
}