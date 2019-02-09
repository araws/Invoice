package pl.andrzejrawski.zadania.zKsiazki;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PoleProstokata {

    public static void main(String[] args) throws IOException{

        double a;
        double b;
        double pole;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Program oblicza pole prostokąta.");
        System.out.println("Podaj długość boku a:");
        a = Double.parseDouble(br.readLine());
        System.out.println("Podaj długość boku b:");
        b = Double.parseDouble(br.readLine());

        pole = a * b;

        System.out.println("Pole prosokąta o bokach a = " + a + " oraz b = " + b + " wynosi: " + pole);
    }
}
