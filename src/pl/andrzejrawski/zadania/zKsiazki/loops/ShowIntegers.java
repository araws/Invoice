package pl.andrzejrawski.zadania.zKsiazki.loops;

public class ShowIntegers {
    public static void main(String[] args) {

        int i = 0;

        while (i < 20) {
            i++;
            if (i < 20) {
                System.out.println("i = " + i + ",");
            } else {
                System.out.println("i = " + i + ".");
            }
        }
    }
}
