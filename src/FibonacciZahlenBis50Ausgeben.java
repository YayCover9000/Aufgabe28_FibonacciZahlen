public class FibonacciZahlenBis50Ausgeben {
    public static int main(int f) {
        System.out.println("Hello world!");
        int laenge = 50;
        long[] fibonacci = new long[laenge];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for(int i = 2; i < laenge; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }

        for(int i = 0; i < fibonacci.length; i++) {
            System.out.println(fibonacci[i] + ", ");
        }
        return laenge;
    }
}