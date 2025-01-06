
import java.util.*;
class arr1skip
 {
    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. rows");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                System.out.print("  ");
            }
            else
            {
              System.out.print(arr[i]);
            }
            System.out.print("");
        }
    }    
}
