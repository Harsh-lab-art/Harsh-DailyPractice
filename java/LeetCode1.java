class LeetCode1
{
    public int countPairs(int[] nums, int k)
    {
        int n=nums.length;
        int c=0;
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(nums[i]==nums[j] && i<j && (i*j)%k==0)
                {
                    c++;
                }
            }
        }
        return c;
    }
    public static void main(String args[])
    {
        LeetCode1 obj=new LeetCode1();
        int arr[]={3,1,2,2,2,1,3};
        int k=2;
        int res=obj.countPairs(arr, k);
        System.out.println(res);

    } 
}