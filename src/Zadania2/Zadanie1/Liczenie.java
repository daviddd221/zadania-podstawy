package Zadania2.Zadanie1;

public class Liczenie {

    private int liczba;

    public Liczenie(int liczba) {
        this.liczba = liczba;
    }

    public void wyswietlNiePazyste() {
        for (int i = 0; i < liczba; i++) {
            if (i % 2 != 0) {
                System.out.println("Nieparzyste liczby to " + i);
            }
        }
    }

    public int getLiczba() {
        return liczba;
    }

    public void setLiczba(int liczba) {
        this.liczba = liczba;
    }
}
