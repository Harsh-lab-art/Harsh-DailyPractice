import java.util.*;
class buzz 
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a nummber");
    int n=sc.nextInt();
    if(n%10==7||n%7==10)
    {
        System.out.println("Its buzz");
    }
    else
    {
       System.out.println("Its not buzz");
    }
 }
}   

