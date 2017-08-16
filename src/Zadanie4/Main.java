package Zadanie4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Liczenie licz = new Liczenie();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj kwotę dochodu");
        double dochod = scanner.nextDouble();

        System.out.println("Podatek do zapłacenia to " + licz.obliczPodatek(dochod));
    }

}
