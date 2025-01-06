class Ari
{
    int sub(int n1,int n2)
    {
        int n3=n1-n2;
        return n3;
    }
    int div(int n1,int n2)
    {
        int n3=n1/n2;
        return n3;
    }
    public static void main(String args[])
    {
        int n3=0;
        Ari obj=new Ari();
        n3=obj.sub(10,5);
        n3=obj.div(15,5);
        System.out.println(n3);
        System.out.println(n3);

    }
}
