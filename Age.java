import java.util.*;
public class age 
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter your age");
    int a=sc.nextInt();
    if(a>18)
    {
        System.out.println("you are addult");
    }
    else
    {
        System.out.println("you are just a kid");
    }
  }    
}
