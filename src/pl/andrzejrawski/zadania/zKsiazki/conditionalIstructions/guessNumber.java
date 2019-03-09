package pl.andrzejrawski.zadania.zKsiazki.conditionalIstructions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class guessNumber {

    public static void main(String[] args) throws IOException {

        double tossNumber;
        double guessNumber;

        try (BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( System.in ) )) {

            System.out.println( "Program losuje liczbę z przedziału 0 - 9 - zgadnij tę liczbę :)" );

            Random random = new Random();
            tossNumber = Math.round( 10 * (random.nextDouble()) );
            guessNumber = Double.parseDouble( bufferedReader.readLine() );

            if (tossNumber == guessNumber) {
                System.out.println( "Super! Odgadłeś!" );
            } else {
                System.out.println( "To nie jest ta liczba! Wylosowana liczba to: " + (int) tossNumber + "." );
            }
        } catch (NumberFormatException nfe) {
            System.err.println( "Nie podałeś liczby" );
        }
    }
}
