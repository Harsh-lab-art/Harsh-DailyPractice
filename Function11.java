import java.util.*;
class function11 
{
    String name,accNo,add,sub;
    long ph,sal;
    double tax;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the customer");
        name =sc.nextLine();
        System.out.println("enter the account number of the customer");
         accNo=sc.next();
        System.out.println("enter the address of the customer");
        add=sc.nextLine();
        System.out.println("Enter the Subject Spercilization of the customer");
        sub=sc.nextLine();
        System.out.println("Enter the Montly salary of the customer");
        sal=sc.nextLong();
        System.out.println("enter the phone number of the customer");
        ph=sc.nextLong();
    }
    double calculate()
    { 
        if(sal>175000)
        {
          tax=sal*5/100;
          
        }
        return tax;
    }
    void display()
    {
        System.out.println(" name of the customer is "+name);
        System.out.println("Account number of the customer is "+accNo);
        System.out.println("Address of the customer is "+add);
        System.out.println("Subject Spercilization of the customer is "+sub);
        System.out.println("Montly salary of the customer is "+sal);
        System.out.println("phone number of the customer is "+ph);
        System.out.println("Tax payable of the customer is "+ tax);
    }
    public static void main(String args[])
    {
        
        function11 obj=new function11();
        obj.input();
        double a =obj.calculate();
        obj.display();
       
    }
}

