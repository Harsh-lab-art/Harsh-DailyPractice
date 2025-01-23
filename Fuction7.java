class function7 
{
    float salary(float s)
    {
        float bonus=(s*20)/100;
        return bonus;
    }

    public static void main(String args[])
    {
        function7 obj=new function7();
        float sal=84000;
        float res=obj.salary(sal);
        System.out.println("Bonus is "+ res);
        System.out.println("Salary is "+sal);
        System.out.println("Total is "+(sal+res));

    }
    
}
