class Leetcode4
{
    public int distributeCandies(int[] candyType) 
    {
        int n=candyType.length;
        if(n>0)
        {
            return n/2;
        }
        return 1;
    }
    public static void main(String[]args)
    {
        Leetcode4 obj=new Leetcode4();
        int []arr={1,1,2,2,3,3};
        int res=obj.distributeCandies(arr);
        System.err.println(res);

        int []arr2={1,1,2,3};
        int res2=obj.distributeCandies(arr2);
        System.err.println(res2);
        
        int []arr3={6,6,6,6};
        int res3=obj.distributeCandies(arr3);
        System.err.println(res3);

    }
}