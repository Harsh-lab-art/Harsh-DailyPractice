import java.util.*;
class Intrest
{
        double a;
        double p;
        double t;
        double A;
        void input()
        {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your principle amount");
         p=sc.nextInt();
        System.out.println("Enter your time in years");
         t=sc.nextInt();
        }
        void calculate()
        {  
          if(t<1)
          {
             a=(Math.pow((1+(9/100)),t));
          }
          else if(t<=2)
          {
            a=(Math.pow((1+(10/100)),t));
          }
          else if(t<=3)
          {
            a=(Math.pow((1+(11/100)),t));
          }
          else 
          {
            a=(Math.pow((1+(12/100)),t));
          }
         A=a*p;
        }
        void display()
        {
            System.out.println("Principle amount is :"+p);
            System.out.println("Time is :"+t);
            System.out.println("Intrest is :"+a);
            System.out.println("Amount is :"+A);
        }
        public static void main(String args[])
        {
          Intrest obj=new Intrest();
          obj.input();
          obj.calculate();
          obj.display();
        }
}
