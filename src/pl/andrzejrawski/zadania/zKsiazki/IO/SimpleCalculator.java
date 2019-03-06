package pl.andrzejrawski.zadania.zKsiazki.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleCalculator {

    public static void main(String[] args) throws IOException {

        float a,b;
        float addition, substraction, multiplication, division;

        try (BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( System.in ) )) {

            System.out.println( "Program oblicza sumę, różnicę, iloczyn oraz iloraz " );
            System.out.println( "dla dwóch liczb rzeczywistych a oraz b." );

            System.out.println( "Podaj pierwszą liczbę a:" );

            a = Float.parseFloat( bufferedReader.readLine() );
            System.out.println( "Podaj drugą liczbę b:" );

            b = Float.parseFloat( bufferedReader.readLine() );


        addition = a + b;
        substraction = a - b;
        multiplication = a * b;
        division = a / b;


        System.out.printf("Dla liczb a = %.2f i b = %.2f", a, b);
        System.out.println();
        System.out.printf("Suma = %.2f \n", addition);
        System.out.printf("Różnica = %.2f \n", substraction);
        System.out.printf("Iloczyn = %.2f \n", multiplication);
        System.out.printf("Iloraz = %.2f \n", division);

        } catch (NumberFormatException nfe) {
            System.out.println( "Nie podano liczby!" );
        }
    }
}
