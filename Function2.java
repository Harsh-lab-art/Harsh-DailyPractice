class function2 
{
    int sub(int x,int y)
    {
        int n=x-y;
        return n;
    }
    int div(int x,int y)
    {
        int n=y/x;
        return n;
    }
    public static void main(String args[])
    {
        function2 obj=new function2();
        int m=obj.sub(10,5);
        System.out.println("diff is "+m);
        m=obj.div(3,12);
        System.out.println("div is "+m);
    }
    
}
