import java.util.*;
class Leetcode5
{
    public int mostfrequent(int[] nums)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int freq=0;
        int res=-1;
        for(int num:nums)
        {
            if(num%2==0)
            {
                map.put(num,map.getOrDefault(num,0)+1);
                int curr=map.get(num);
                if(curr>freq)
                {
                    freq=curr;
                    res=num;
                }
                else if(curr==freq && num<res)
                {
                    res=num;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        {
            Leetcode5 obj=new Leetcode5();
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the size of array");
            int n=sc.nextInt();
            int arr[]=new int[n];
            System.out.println("enter the elemrnt in the array");
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            int res=obj.mostfrequent(arr);
            System.out.println("result is :"+res); 
        }
    }
}