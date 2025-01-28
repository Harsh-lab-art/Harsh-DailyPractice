import java.lang.*;
import java.util.*;
class Armstrong
{
 public static void main(String args[])
 {
  int l,m,s=0;
  Scanner sc=new Scanner (System.in);

  System.out.println("enter a number");
  int n=sc.nextInt();
  m=n;
  while(m>0)
  {
    l=m%10;
    s=s+l*l*l;
    m=m/10;
  }
  if(s==n)
  {
    System.out.println("its armstrong");

  }
  else
  {
    System.out.println("its not armstrong");
  }
  sc.close();
 }
}       
