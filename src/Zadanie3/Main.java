package Zadanie3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Liczenie licz = new Liczenie();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wagę");
        double waga = scanner.nextDouble();

        System.out.println("Podaj wzrost");
        double wzrost = scanner.nextDouble();
        System.out.println(licz.obliczBMI(waga, wzrost));
    }
}
