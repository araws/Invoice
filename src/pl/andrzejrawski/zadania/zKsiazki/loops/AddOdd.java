package pl.andrzejrawski.zadania.zKsiazki.loops;

public class AddOdd {
    public static void main(String[] args) {

        int a = 0;
        int sum = 0;

        do {
            if (a % 2 != 0) {
                sum += a;
            }
            a++;
        } while (a <= 100);

        System.out.println("Suma nieparzystych liczb całkowitych od 0 do 100 wynosi " + sum);
    }
}
