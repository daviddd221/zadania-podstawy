package Zadania2.Zadanie7;

public class Rysowanie {

    private char znakWypełnienia;
    private int x;
    private int y;
    private int a;
    private int b;

    public Rysowanie(char znakWypełnienia, int x, int y, int a, int b) {
        this.znakWypełnienia = znakWypełnienia;
        this.x = x;
        this.y = y;
        this.a = a;
        this.b = b;
    }

    public void rysuj() {
        while (y > 0) {
            System.out.println(">");
            y--;
        }
        while (x > 0) {

        }
    }
}
