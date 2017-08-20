package Zadania2.Zadanie6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int liczba = in.nextInt();
        Gra gra = new Gra(liczba);
        gra.zgadnijLiczbe();
    }
}
