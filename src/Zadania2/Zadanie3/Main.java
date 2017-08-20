package Zadania2.Zadanie3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę ");
        int liczba = in.nextInt();
        Potegowanie pot = new Potegowanie(liczba);
        pot.wyswietlWszystkiePotegi();

    }

}
