package Zadania2.Zadanie10;

public class Dzielniki {

    private int liczba;

    public Dzielniki(int liczba) {
        this.liczba = liczba;
    }

    public void wyswietlDzielniki() {
        for (int i = 1; i <= liczba; i++) {
            if (liczba % i == 0) {
                System.out.println("Dzielniki liczby " + liczba + " to " + i);
            }
        }
    }
}
