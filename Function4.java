class function4 
{
    int fact(int n)
    {
        int a=1;
        for(int i=1;i<=n;i++)
        {
            a*=i;
        }
        return a;
      
    }
    public static void main(String args[])
    {
        function4 obj=new function4();
        int res=obj.fact(5);
        System.out.println(res);
    }
    
}
