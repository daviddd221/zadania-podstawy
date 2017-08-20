package Zadania2.Zadanie11;

public class LiczbaPierwsza {

    private int liczba;
    private int liczbaDzielnikow;

    public LiczbaPierwsza(int liczba) {
        this.liczba = liczba;
        this.liczbaDzielnikow = 0;
    }

    public void sprawdzCzyJestPierwsza() {
        for (int i = 1; i < liczba; i++) {
            if (liczba % i == 0) {
                liczbaDzielnikow++;
            }
        }
        if (liczbaDzielnikow > 2) {
            System.out.println("Liczba " + liczba + " nie jest liczbą pierwszą");
        }
        else {
            System.out.println("Liczba " + liczba + " jest jest liczbą pierwszą");
        }
    }
}
