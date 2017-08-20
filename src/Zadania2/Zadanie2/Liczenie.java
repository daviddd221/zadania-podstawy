package Zadania2.Zadanie2;

import java.util.Scanner;

public class Liczenie {

    private int liczba1;
    private int liczba2;
    private int liczba3;

    private Scanner in = new Scanner(System.in);


    public Liczenie(int liczba1, int liczba2) {
        while (liczba1 > liczba2) {
            System.out.println("Pierwsza liczba mniejsza o drugiej: ");
            System.out.print("1:");
            liczba1 = in.nextInt();
            System.out.println();
            System.out.print("2:");
            liczba2 = in.nextInt();
        }
        this.liczba1 = liczba1;
        this.liczba2 = liczba2;
        this.liczba3 = liczba1;
    }


    public void wyznaczSumeFor() {
            int suma = 0;
            for (int i = liczba1; i <= liczba2; i++) {
                suma = suma + i;
            }
            System.out.println("Suma podanego ciągu wynosi " + suma);

    }

    public void wyznaczSumeWhile() {
            int suma = 0;
            while (liczba1 <= liczba2) {
                suma = suma + liczba1;
                liczba1++;
            }
            System.out.println("Suma podanego ciągu wynosi " + suma);

    }

    public void wyznaczSumeDoWhile() {
            int suma = 0;
            do {
                suma = suma + liczba3;
                liczba3++;
            } while (liczba3 <= liczba2);

            System.out.println("Suma podanego ciągu wynosi " + suma);

    }
}
