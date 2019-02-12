package pl.andrzejrawski.zadania.zKsiazki.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ObjetoscKuli {
    public static void main(String[] args) throws IOException {

        double r;
        double objetosc;

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {


            System.out.println("Program oblicza objętość kuli.");
            System.out.println();
            System.out.println("Podaj promień kuli.");
            r = Double.parseDouble(bufferedReader.readLine());
            objetosc = (4 * Math.PI * r * r * r) / 3;

            System.out.print("Objętość kuli o promieniu r = ");
            System.out.printf("%.2f", r);
            System.out.print(" wynosi ");
            System.out.printf("%.2f", objetosc);
            System.out.println();
        } catch (IllegalArgumentException nfe){
            System.out.println("Nie podano liczby.");
        }
    }
}
