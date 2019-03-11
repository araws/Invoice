package pl.andrzejrawski.zadania.zKsiazki.loops;

public class SimpleEquation {

    public static void main(String[] args) {
        int y;
        int x;

        System.out.println("Program oblicza równanie y = 3x dla x zmieniającego się od 0 do 10.");

        for (x = 0; x <= 10; x++) {
            y = 3 * x;
            System.out.println("x = " + x + '\t' + "y = " + y);
        }
    }
}
