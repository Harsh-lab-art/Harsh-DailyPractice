class Leetcode3 
{
    public int findGCD(int[] nums) 
    {
        int x=Integer.MAX_VALUE;
        int y=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]<x)
            {
                x=nums[i];
            }
            else if(nums[i]>y)
            {
                y=nums[i];
            }
        }
        int z=y%x;
        while(z!=0)
        {
            x=z;
            y=x;
        }
        return x;
    }
    public static void main(String args[])
    {
        Leetcode3 obj=new Leetcode3();
        int []arr={7,5,6,8,3};
        int res=obj.findGCD(arr);
        System.out.println(res);
        
        //int []arr2={};
        //int res2=obj.findGCD(arr2);
        //System.out.println(res2);
    }
}