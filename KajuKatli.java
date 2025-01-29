import java.util.*;
class kajukati
{
    public static void main(String args[])
    {

        Scanner sc =new Scanner(System.in);
        System.out.println("enteer the range of loop");
        int n=sc.nextInt();
        for(int i=1;i<n;i++)
        {
            int spaces=n-i;
            for(int k=0;k<spaces;k++)
            {
                System.out.print(" ");
            }
            int chara=((2*i)-1);
            for(int j=0;j<chara;j++)
            {
                char ch=(char)('A'+j);
                System.out.print(ch);
            }
            System.out.println("");
        }
        for(int i=n+1;i<=2*n-1;i++)
        {
            int spaces=i-n;
            for(int k=0;k<spaces;k++)
            {
                System.out.print(" ");
            }
            int chara=(2*(2*n-i)-1);
            for(int j=0;j<chara;j++)
            {
               // System.out.print((char)('A')+j);
               System.out.print((char)('A'+j));
            }
            System.out.println("");
        }
    }
 }
