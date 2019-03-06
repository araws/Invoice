package pl.andrzejrawski.zadania.zKsiazki.conditionalIstructions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfRectangular {

    public static void main(String[] args) throws IOException {

        int a;
        int b;
        int c;

        try (BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( System.in ) )) {

            System.out.println( "Program sprawdza czy trójkąt o bokach a, b, c jest prostąkątny." );
            System.out.println( "Podaj bok a:" );
            a = Integer.parseInt( bufferedReader.readLine() );
            System.out.println( "Podaj bok b:" );
            b = Integer.parseInt( bufferedReader.readLine() );
            System.out.println( "Podaj bok c:" );
            c = Integer.parseInt( bufferedReader.readLine() );

            if ((a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a)) {
                System.out.println( "Trójkąt o bokach a = " + a + ", b = " + b + ", c = " + c + " jest prostokątny." );
            } else {
                System.out.println( "Trójkąt o bokach a = " + a + ", b = " + b + ", c = " + c + " nie jest prostokątny." );
            }
        } catch (NumberFormatException nfe) {
            System.err.println( "Nie podano liczby/ liczby całkowitej." );
        }
    }
}
