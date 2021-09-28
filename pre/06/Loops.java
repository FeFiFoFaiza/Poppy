public class Loops {
    
    public static double power (double x, int n) {
      double result = 1;
      for (int i=0;i<n;i++){
         result *= x;
      }
      return result;
   }

   public static int factorial (int n) {
      int result = 1;
      for (int i = 1; i <= n; i++) {
         result *= i;
      }
      return result;
    }

}