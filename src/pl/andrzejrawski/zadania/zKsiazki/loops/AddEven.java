package pl.andrzejrawski.zadania.zKsiazki.loops;

public class AddEven {
    public static void main(String[] args) {

        int a;
        int sum = 0;

        for (a = 0; a <= 100; a++) {
            if (a % 2 == 0) {
                sum += a;
            }
        }

        System.out.println("Suma parzystych liczb całkowitych od 0 do 100 wynosi " + sum);
    }
}
