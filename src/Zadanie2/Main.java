package Zadanie2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Liczenie licz = new Liczenie();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj 3 liczby");
        System.out.print("Liczba 1 : ");
        int liczba1 = scanner.nextInt();
        System.out.print("Liczba 2 : ");
        int liczba2 = scanner.nextInt();
        System.out.print("Liczba 3 : ");
        int liczba3 = scanner.nextInt();

        System.out.println(licz.wypiszNajwNajm(liczba1, liczba2, liczba3));
    }
}
