package Zadania2.Zadanie9;

public class Obliczenia {

    private int liczba;
    private int sumaLiczb;
    private double sredniaArytmetycznaParzyste;
    private double sredniaArytmetycznaNieParzyste;
    private int sumaLiczbParzystych;
    private int sumaLiczbNieParzystych;
    private int liczbyParzyste;
    private int liczbyNieparzyste;

    public Obliczenia(int liczba) {
        this.liczba = liczba;
        this.sumaLiczb = 0;
        this.sredniaArytmetycznaParzyste = 0;
        this.sredniaArytmetycznaNieParzyste = 0;
        this.sumaLiczbParzystych = 0;
        this.sumaLiczbNieParzystych = 0;
        this.liczbyParzyste = 0;
        this.liczbyNieparzyste = 0;
    }

    public void obliczSumeLiczb() {
        for (int i = 0; i < liczba; i++) {
            sumaLiczb = sumaLiczb + i;
            if (i % 2 == 0) {
                liczbyParzyste++;
                sumaLiczbParzystych = sumaLiczbParzystych + i;
            }
            else {
                liczbyNieparzyste++;
                sumaLiczbNieParzystych = sumaLiczbNieParzystych + i;
            }
        }
        sredniaArytmetycznaParzyste = sumaLiczbParzystych / liczbyParzyste;
        sredniaArytmetycznaNieParzyste = sumaLiczbNieParzystych / liczbyNieparzyste;

        System.out.println("Suma liczb wynosi " + sumaLiczb);
        System.out.println("Stosunek liczb parzystych do nie parzystych wynosi " +sredniaArytmetycznaParzyste + " : " + sredniaArytmetycznaNieParzyste);
    }
}
