package Zadania2.Zadanie6;

import java.util.Random;
import java.util.Scanner;

public class Gra {

    private Random rnd;
    private Scanner in = new Scanner(System.in);

    private int liczba;
    private int wylosowanaLiczba;

    public Gra(int liczba) {
        this.rnd = new Random();
        this.in = new Scanner(System.in);
        this.liczba = liczba;
        this.wylosowanaLiczba = rnd.nextInt(99)+1;
    }

    public void zgadnijLiczbe() {
        while (liczba != wylosowanaLiczba) {
            if (liczba < wylosowanaLiczba) {
                System.out.println("Podałeś za małą liczbę!");
            }
            else {
                System.out.println("Podałeś za dużą liczbę");
            }
            System.out.println("Podaj liczbę");
            liczba = in.nextInt();

            if (liczba == wylosowanaLiczba) {
                System.out.println("Trafiłeś! Gratulacje!");
                break;
            }
        }
    }
}
