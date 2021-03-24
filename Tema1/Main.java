package temeSDA;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int nr1, nr2;
        Scanner stdin = new Scanner(System.in);

        System.out.println("Introduceti primul numar: ");
        nr1 = stdin.nextInt();
        System.out.println("Introduceti al doilea numar: ");
        nr2 = stdin.nextInt();

        System.out.println("Suma numerelor este: " + (nr1 + nr2));
        System.out.println("Diferenta numerelor este: " + (nr1 - nr2));
        System.out.println("Produsul celor doua numere este: " + (nr1 * nr2));
        System.out.println("Impartirea celor doua numere este: " + ((float) nr1 / (float) nr2));
        System.out.println("Distanta dintre cele doua numere este: " + (Math.abs(nr1 - nr2)));

    }
}