import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to choose Methodes: ");
        int choose = sc.nextInt();
        if (choose > 4) {
            System.out.println("Diese Methode existiert nicht! /t Bitte wählen Sie eine andere Methode mithilfe einer Zahl!");
        } else {
            switch (choose) {
                case 1 :
                    int ausgebe50 = 0;
                    ausgebe50 = FibonacciZahlenBis50Ausgeben.main(ausgebe50);
                    break;
                case 2 :
                    System.out.println("Bitte Arrayposition Rekursiv die angezeigt werden soll eingeben: ");
                    long ausgabeAuswahl = sc.nextLong();
                    ausgabeAuswahl = RecursiveFibonacciSequence.mainR(ausgabeAuswahl);
                    break;
                case 3 :
                    System.out.println("Bitte Arrayposition Iterativ die angezeigt werden soll eingeben: ");
                    int ausgabeIterativ = sc.nextInt();
                    ausgabeIterativ = RecursiveFibonacciSequence.getFibonacciNumbersAtI(ausgabeIterativ);
                    break;
                default:
                    System.out.println("Diese Methode existiert nicht! /t Bitte wählen Sie eine andere Methode mithilfe einer Zahl!");
                    break;
            }
        }
    }
}