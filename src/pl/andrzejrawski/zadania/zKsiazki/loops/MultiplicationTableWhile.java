package pl.andrzejrawski.zadania.zKsiazki.loops;

public class MultiplicationTableWhile {
    public static void main(String[] args) {
        int i = 10;
        int column, line;

        System.out.println("Program wyświetla tabliczkę mnożenia.");

        line = 1;

        while (line <= i){

            column = 1;
            while (column <= i) {
                System.out.print(line * column + "\t");
                column++;
            }
            System.out.println();
            line++;
        }
    }
}
