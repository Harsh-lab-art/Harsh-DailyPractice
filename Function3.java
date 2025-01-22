class function3 
{
    int input(int x,int y)
    {
       int c=(x+y)/2;
       return c;
    }

    public static void main(String args[])
    {
        
        function3 obj=new function3();
        

        System.out.println(obj.input(10,20));
        
    }
    
}
