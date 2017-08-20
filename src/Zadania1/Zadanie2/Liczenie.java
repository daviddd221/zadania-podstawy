package Zadania1.Zadanie2;

public class Liczenie {

    public String wypiszNajwNajm(int liczba1, int liczba2, int liczba3) {
        int tab[] = {liczba1,liczba2,liczba3};
        int liczbaNajwieksza = 0;
        int liczbaNajmniejsza = 100;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < liczbaNajmniejsza) {
                liczbaNajmniejsza = tab[i];
            }
            else {
                liczbaNajwieksza = tab[i];
            }
        }
        return "Liczba najwieksza to " + liczbaNajwieksza + ", a liczba najmniejsza to " + liczbaNajmniejsza;
    }

}
