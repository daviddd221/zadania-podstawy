package Zadania2.Zadanie11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int liczba = in.nextInt();

        LiczbaPierwsza liczbaPierwsza = new LiczbaPierwsza(liczba);
        liczbaPierwsza.sprawdzCzyJestPierwsza();
    }
}
