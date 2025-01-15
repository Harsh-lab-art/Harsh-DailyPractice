class functin9 {
   functin9() {
   }

   double bill(double var1) {
      double var3 = var1 * 10.0 / 100.0;
      return var3;
   }

   public static void main(String[] var0) {
      double var1 = 1200.0;
      functin9 var3 = new functin9();
      double var4 = var3.bill(var1);
      System.out.println("Bill is " + var1);
      System.out.println("Discount is " + var4);
   }
}
