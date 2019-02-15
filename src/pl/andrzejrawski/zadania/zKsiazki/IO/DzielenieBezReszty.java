package pl.andrzejrawski.zadania.zKsiazki.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DzielenieBezReszty {
    public static void main(String[] args) {

        System.out.println("Program podaje wynik z dzielenia bez reszty dwóch liczb całkowitych.");

        int a, b, wynik;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Podaj pierwszą liczbę a:");
        try {
            a = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Podaj drugą liczbę b:");
            b = Integer.parseInt(bufferedReader.readLine());
            wynik = a / b;

            System.out.println("Wynik dzielenia bez reszty a/b = " + wynik);
        } catch (NumberFormatException nfe) {
            System.out.println("Nie podano liczby!s");
        } catch (ArithmeticException ae) {
            System.out.println("Nie można dzielić przez 0!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}