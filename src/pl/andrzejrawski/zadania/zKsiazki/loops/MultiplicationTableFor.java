package pl.andrzejrawski.zadania.zKsiazki.loops;

public class MultiplicationTableFor {
    public static void main(String[] args) {
        int i = 10;
        int column, line;

        System.out.println("Program wyświetla tabliczkę mnożenia.");

        for (line = 1; line <= i; line++) {
            for (column = 1; column <= i ; column++) {
                {
                    System.out.print(line * column + "\t");
                }
            }
            System.out.println();
        }

    }
}
