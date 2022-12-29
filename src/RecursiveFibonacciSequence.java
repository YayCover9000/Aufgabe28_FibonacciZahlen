public class RecursiveFibonacciSequence {
    public static long mainR(long ausgabeAuswahl) {
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
    public static int mainI(int ausgabeIterativ) {
        int x = getFibonacciNumbersAtI(ausgabeIterativ);
        System.out.println(x);
        return x;
    }
    public static int getFibonacciNumbersAtI(int n) {
        int last = 0;
        int next = 1;
        for (int i = 0; i < n; i++) {
            int old_last = last;
            last = next;
            next = old_last + next;
        }
        return next;
    }
}
