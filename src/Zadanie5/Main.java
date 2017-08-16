package Zadanie5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Liczenie licz = new Liczenie();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj kwotę");
        double kwota = scanner.nextInt();

        System.out.println("Podaj liczbę rat");
        int liczbaRat = scanner.nextInt();

        System.out.println("Miesięczna kwota do spłaty wynosi " + licz.obliczRate(kwota, liczbaRat));
    }
}
