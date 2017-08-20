package Zadania1.Zadanie4;

public class Liczenie {

    public double obliczPodatek(double dochod) {
        double podatek = 0;
        if (dochod <= 85528) {
            podatek = (dochod * 0.18) - 556.02;
            if (podatek < 0) {
                return 0;
            }
            return podatek;
        }
        else {
            return podatek = (dochod * 0.32) + 14839.02;
        }
    }
}
