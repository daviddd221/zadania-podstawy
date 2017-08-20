package Zadania2.Zadanie3;

public class Potegowanie {

    private int liczba;

    public Potegowanie(int liczba) {
        this.liczba = liczba;
    }

    public void wyswietlWszystkiePotegi() {
        int potegi = 2;
        while (potegi <= liczba) {
            potegi = potegi * 2;
            if (potegi > liczba) {
                break;
            }
            System.out.println(potegi);
        }
    }

    public int getLiczba() {
        return liczba;
    }

    public void setLiczba(int liczba) {
        this.liczba = liczba;
    }
}
