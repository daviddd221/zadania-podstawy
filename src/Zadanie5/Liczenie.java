package Zadanie5;

public class Liczenie {


    public double obliczRate(double cenaTowaru, int liczbaRat) {
        double miesiecznaRata = 0;

        if (liczbaRat < 12) {

            return miesiecznaRata = (cenaTowaru * 1.025) / liczbaRat;

        }
        else if (liczbaRat < 24 && liczbaRat > 13) {

            return  miesiecznaRata = (cenaTowaru* 1.05) / liczbaRat;

        }
        else {
            return miesiecznaRata =(cenaTowaru * 1.1) / liczbaRat;
        }
    }
}
