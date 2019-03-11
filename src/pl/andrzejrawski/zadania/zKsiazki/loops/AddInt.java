package pl.andrzejrawski.zadania.zKsiazki.loops;

public class AddInt {
    public static void main(String[] args) {

        int a;
        int sum = 0;

        for (a = 0; a <= 100; a++) {
            sum += a;
        }

        System.out.println("Suma liczb całkowitych od 0 do 100 wynosi " + sum);
    }
}
