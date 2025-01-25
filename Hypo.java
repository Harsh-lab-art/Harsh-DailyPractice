import java.util.*;
class hypo 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number ");
        int l=sc.nextInt();
        System.out.println("enter the number");
        int b=sc.nextInt();
        System.out.println("enter the number");
        int h=sc.nextInt();
        if(Math.pow(h,2)==(Math.pow(l,2)+Math.pow(b,2)))
        {
            System.out.println("its a rightangled triangle");
        }
        else{
            System.out.println("its not rightangled triangle");
        }
    }
}
