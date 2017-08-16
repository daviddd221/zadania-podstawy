package Zadanie3;

public class Liczenie {

    public String obliczBMI(double waga, double wzrost) {
        double bmi = waga / ((wzrost * wzrost) / 10000);

        if (bmi > 18.5 && bmi > 24.9) {
            return "Twoje BMI wynosi " + bmi + " czyli masz wage prawidłową";
        }
        else if (bmi < 18.5) {
            return "Twoje BMI wynosi " + bmi + " czyli masz niedowagę";
        }
        else {
            return "Twoje BMI wynosi " + bmi + " czyli masz nadwage";
        }
    }
}
