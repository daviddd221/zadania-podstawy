package Zadania2.Zadanie9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int liczba = in.nextInt();
        Obliczenia oblicz = new Obliczenia(liczba);
        oblicz.obliczSumeLiczb();

    }
}
