package pl.andrzejrawski.zadania.zKsiazki.loops;

public class SimpleEquation3 {

    public static void main(String[] args) {
        int y;
        int x = 0;

        System.out.println( "Program oblicza równanie y = 3x dla x zmieniającego się od 0 do 10." );

        while (x <= 10){
            y = 3 * x;
            System.out.println( "x = " + x + '\t' + "y = " + y );
            x++;
        }
    }
}
