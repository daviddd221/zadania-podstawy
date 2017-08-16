package Zadanie6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Liczenie licz = new Liczenie();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe pierwszą ");
        double liczba1 = scanner.nextDouble();

        System.out.println("Podaj znak");
        char znak = scanner.next().charAt(0);

        System.out.println("Podaj liczbę drugą");
        double liczba2 = scanner.nextDouble();

        System.out.println("Wynik wynosi " + licz.kalkulator(liczba1, znak,liczba2));
    }
}
