import java.lang.*;
import java.util.*;
class Encounter
{
    public static void main(String args[])
    {
        long sq;
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the range");
        int r=sc.nextInt();
        for(int i=1;i<r;i++)
        {
            sq=i*i;
            System.out.println(sq);
            if(sq%2==0&&sq%5==0)
            {
                break;
            }
        }
    }
}
