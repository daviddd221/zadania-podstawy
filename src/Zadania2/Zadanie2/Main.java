package Zadania2.Zadanie2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj 2 liczby");
        System.out.println("Liczba 1: ");
        int liczba1 = in.nextInt();
        System.out.println("Liczba 2: ");
        int liczba2 = in.nextInt();

        Liczenie licz = new Liczenie(liczba1,liczba2);
        licz.wyznaczSumeFor();
        licz.wyznaczSumeWhile();
        licz.wyznaczSumeDoWhile();

    }
}
