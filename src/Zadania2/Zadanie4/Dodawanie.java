package Zadania2.Zadanie4;

import java.util.Scanner;

public class Dodawanie {

    private int liczba;
    private int suma;
    private Scanner in;


    public Dodawanie(int liczba) {
        this.in = new Scanner(System.in);
        this.liczba = liczba;
        this.suma = 0;
    }

    public void sumaPodanychLiczb() {
        while (liczba != 0) {
            suma = suma + liczba;
            System.out.println("Podaj kolejną liczbę");
            liczba = in.nextInt();
        }
        System.out.println("Suma podanych liczb wynosi : " + suma);
    }
}
