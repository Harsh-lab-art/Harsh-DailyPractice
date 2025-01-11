import java.util.*;
class Factsum
{
    public static void main(String args[])
    {
        int f=1;
        double sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        double n=sc.nextDouble();
        for(int i=1;i<=n;i++)
        {
            f=f*i;
            sum=sum+f;
           
        }
        System.out.println("factorial sum is "+ sum);
    }
}
