public class function1 
{
    void findsq(int x)
    {
        int sq=x;
        System.out.println(Math.pow(sq,2));
    }
    public static void main(String args[])
    {
        function1 obj=new function1();
        obj.findsq(10);
    }
    
}
