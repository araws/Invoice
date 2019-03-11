package pl.andrzejrawski.zadania.zKsiazki.loops;

import java.util.Random;

public class TossAdd {
    public static void main(String[] args) {
        int quantity = 5, i;
        double min, max, number, sum = 0, average;
        
        System.out.println("Program wyznacza liczbę maksymalną, minimalną, sumę i średnią dla " + quantity + " wylosowanych liczb całkowitych 0 - 100.");
        Random random = new Random(  );
        min = Math.round( 100 * random.nextDouble() );
        System.out.print("Wylosowano liczby: " + min + ", ");
        max = min;
        sum += max;

        for (i = 1; i <= quantity - 1 ; i++) {
            number = Math.round( 100 * random.nextDouble() );
            System.out.print(number + ", ");
            if (number > max) max = number;
            if (number < min) min = number;
            sum += number;
        }
        average = sum / quantity;

        System.out.println("");
        System.out.println("");
        System.out.println("Dla wylosowanych liczb max = " + max + ", min = " + min + ", suma = " + sum + ", średnia = " + average + ".");
    }
}
