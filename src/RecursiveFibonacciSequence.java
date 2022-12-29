public class RecursiveFibonacciSequence {
    public static long main(long ausgabeAuswahl) {
        long x = getFibonacciNumbersAt(ausgabeAuswahl);
        System.out.println(x);
        return x;
    }
    public static long getFibonacciNumbersAt(long n) {
        if (n < 2) {
            return n;
        }else{
            return getFibonacciNumbersAt(n - 1) + getFibonacciNumbersAt(n - 2);
        }
    }
    public static int main(I){

    }
}
