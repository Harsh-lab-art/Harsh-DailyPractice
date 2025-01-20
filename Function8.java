class function8 
{
   double farTOcel(double far)
   {
    double temInCel=(far-32)/1.8;
    return temInCel;

   }
   double celToFar(double cel)
   {
    double tempInFar=(cel*1.8)+32;
    return tempInFar;
   }
    public static void main(String args[])
    {
      function8 obj=new function8();
      double a=obj.farTOcel(212);
      double b= obj.celToFar(100);
      System.out.println("temp in cel is "+a);
      System.out.println("temp in far is "+b);
    }
    
}
