import java.util.*;
class Fibo
{
    public static void main(String args[])
    {
        int n,a=0,b=1,c=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the range of fibonacci");
        n=sc.nextInt();
        System.out.println(a+","+b);
        for(int i=0;i<=n;i++)
        {
          c=a+b;
          System.out.println(c);
          a=b;
          b=c;
        }
    }
}
