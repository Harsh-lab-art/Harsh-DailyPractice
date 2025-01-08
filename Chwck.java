
import java.util.*;
class check 
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a character");
    char ch=sc.next().charAt(0);
    if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z'||ch>='0'&&ch<='9')
    {
        System.out.println("Its a daily use character :"+ch);
    }
    else
    {
        System.out.println("its a special character :"+ch);
    }
  }  
}
