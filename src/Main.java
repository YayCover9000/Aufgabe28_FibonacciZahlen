import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        int ausgebe50 = 0;
        ausgebe50 = FibonacciZahlenBis50Ausgeben.main(ausgebe50);
        System.out.println("Bitte Arrayposition Rekursiv die angezeigt werden soll eingeben: ");
        long ausgabeAuswahl = sc.nextLong();
        ausgabeAuswahl = RecursiveFibonacciSequence.main(ausgabeAuswahl);
        System.out.println("Bitte Arrayposition Iterativ die angezeigt werden soll eingeben: ");
        int ausgabeIterativ = sc.nextInt();
    }
}
