package Zadania2.Zadanie4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę ");
        int liczba = in.nextInt();
        Dodawanie dodaj = new Dodawanie(liczba);
        dodaj.sumaPodanychLiczb();
    }
}
