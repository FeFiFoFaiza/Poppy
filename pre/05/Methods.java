public class Methods {

    public static boolean isDivisible(int n, int m) {
       return n%m == 0;
    }

    public static boolean isTriangle(int a, int b, int c) {
       if ((a + b > c) && (a + c > b) && (b + c > a)) {
           return true;
       } else {
           return false;
       }
    }

    public static int ack (int m, int n) {
       if (m == 0)
        {
            return n + 1;
        }
        else if((m > 0) && (n == 0))
        {
            return ack(m - 1, 1);
        }
        else if((m > 0) && (n > 0))
        {
            return ack(m - 1, ack(m, n - 1));
        } else {
            return n + 1;
        }
   }

    public static void main(String[] args) {
       System.out.println(ack(1, 2));
    }
}