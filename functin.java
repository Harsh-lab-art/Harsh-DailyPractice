public class functin6 
{
    void crad(int rad)
    {
        System.out.println("area of circle is "+3.14*rad*rad);
    }
    void car(int n)
    {
      System.out.println("area is "+n*n);
    }

    public static void main(String args[])
    {
      functin6 obj=new functin6();
      obj.crad(100);
      obj.car(4);
    }
    
}
