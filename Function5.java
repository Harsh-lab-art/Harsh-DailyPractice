
class function5 
{
static void fact(int n)
{
    int f=1;
    for(int i=1;i<=n;i++)
    {
        f*=i;
       
    }
    System.out.println(f);
}
public static void main(String args[])
{
  fact(5);
}
}
