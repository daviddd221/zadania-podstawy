package Zadania1.Zadanie6;

public class Liczenie {

    public double kalkulator(double liczba1, char znak, double liczba2) {
        double wynik = 0;

        if (liczba1 != 0 && liczba2 != 0) {
            if (znak == '*' || znak == '/' || znak == '-' || znak == '+') {
                switch (znak) {
                    case '*':
                        return wynik = liczba1 * liczba2;

                    case '/':
                        return wynik = liczba1 / liczba2;
                    case '-':
                        return wynik = liczba1 - liczba2;
                    case '+':
                        return wynik = liczba1 + liczba2;
                }

            }
            else {
                System.out.println("Wprowadzono zły znak");
                return 0;
            }
        }
        else {
            System.out.println("Jedna z podanych liczb wynosi 0");
            return 0;
        }
        return 0;
    }

}
