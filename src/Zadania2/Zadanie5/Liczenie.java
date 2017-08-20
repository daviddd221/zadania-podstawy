package Zadania2.Zadanie5;

import java.util.Scanner;

public class Liczenie {

    private Scanner in;

    private int liczba;
    private int sumaNajwiekszejNajmniejszej;
    private int najwieksza;
    private int najmniejsza;
    private double sredniaArytmetyczna;
    private int iloscLiczb;
    private int sumaLiczb;

    public Liczenie(int liczba) {
        this.in = new Scanner(System.in);
        this.liczba = liczba;
        this.sumaNajwiekszejNajmniejszej = 0;
        this.najwieksza = 0;
        this.najmniejsza = 100;
        this.sredniaArytmetyczna = 0;
        this.iloscLiczb = 0;
        this.sumaLiczb = 0;
    }

    public void sumaNajwiekszejNajmniejszej() {
        while (liczba != 0) {
            if (liczba < najmniejsza) {
                najmniejsza = liczba;
            }
            else {
                najwieksza = liczba;
            }
            iloscLiczb++;
            sumaLiczb = sumaLiczb + liczba;
            System.out.println("Podaj kolejną liczbę ");
            liczba = in.nextInt();
        }
        sredniaArytmetyczna = sumaLiczb /  iloscLiczb;
        sumaNajwiekszejNajmniejszej = najmniejsza + najwieksza;
        System.out.println("Srednia arytmetyczna wynosi " + sredniaArytmetyczna);
        System.out.println("Suma najwiekszej i najmniejszej liczby wynosi " + sumaNajwiekszejNajmniejszej);
    }
}
