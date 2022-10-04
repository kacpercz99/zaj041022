import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void zad1() {
        int n;
        do {
            System.out.println("podaj długość wiersza:");
            n = scanner.nextInt();
        } while (n <= 0);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void zad3() {
        int a, b;
        do {
            System.out.println("Podaj pierwszy rozmiar macierzy");
            a = scanner.nextInt();
        } while (a <= 0);
        do {
            System.out.println("Podaj drugi rozmiar macierzy");
            b = scanner.nextInt();
        } while (b <= 0);
        int matrix[][] = new int[a][b];
        double evenSum = 0;
        int evenCount = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.println("Podaj liczbę:");
                matrix[i][j] = scanner.nextInt();
                if (matrix[i][j] % 2 == 0) {
                    evenSum += matrix[i][j];
                    evenCount++;
                }
            }
        }
        if (evenCount > 0) {
            System.out.println("Średnia liczb parzystych w macierzy to: " + (evenSum / evenCount));
        }
    }

    public static void main(String[] args) {
        // zad1();
        Seans seans = new Seans(
                "Kevin sam w Nowym Jorku",
                "Chris Columbus",
                120,
                30.5,
                75
        );
        seans.wyswietlInformacje();
        seans.zarezerwujMiejsce();
        seans.zarezerwujMiejsce();
        seans.zarezerwujMiejsce();
        seans.wyswietlZarezerwoawane();

        zad3();
    }
}