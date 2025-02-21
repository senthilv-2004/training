class counter{
    static int count=0;
    void counder(){
        count++;
    }
}
public class counting{
    public static void main(String args[])
{
    for(int i=1;i<=3;i++)
    {
        counter obj=new counter();
        obj.counder();
    
    System.out.println("the object has been created :" + obj.count);
}}}