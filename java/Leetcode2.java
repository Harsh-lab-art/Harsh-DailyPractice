class Leetcode2 
{
    public int findFinalValue(int[] nums, int original) 
    {
       int n=nums.length;
       for(int i=0;i<n;i++)
       {
            if(nums[i]==original)
            {
                original=2*original;
            }
       }
       return original;  
    }
    public static void main(String args[])
    {
        Leetcode2 obj=new Leetcode2();
        int arr[]={5,3,6,1,12};
        int k=3;
        int res=obj.findFinalValue(arr, k);
        System.out.println(res);

        int ar[]={8,19,4,2,15,3};
        int m=2;
        int re=obj.findFinalValue(ar, m);
        System.out.println(re);
    }
}
