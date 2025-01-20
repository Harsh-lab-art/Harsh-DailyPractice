class function10 
{
    int accno;
    int accbal;
    String acchol;
    void detail()
    {
        System.out.println("Name of the account holder is "+ acchol);
        System.out.println("Account number is "+accno);
        System.out.println("Account balance is "+accbal);
    }
    void updateacc(int withamt)
    {
        System.out.println("Balance before withdrawl is "+accbal);
        System.out.println(" withdrawl amount is "+withamt);
        accbal=accbal-withamt;
        System.out.println("Balance after withdrawl is "+accbal);
    }

    public static void main(String args[])
    {
        function10 obj=new function10();
        obj.accno=12354543;
        obj.accbal=50000;
        obj.acchol="Harsh kumar verma";
        obj.detail();
        obj.updateacc(3276);

    }
    
}
