import java.lang.*;
import java.util.*;
class consecutive
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range");
        int r=sc.nextInt();
       for(int i=0;i<=r;i++)
       {
        System.out.println(i+"*"+(i+1)+"="+i*(i+1));
       }
}
}
