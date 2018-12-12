package pl.andrzejrawski.zadania;

public class zadanieTablice {
    public static void main(String[] args) {

        int [] ints = {1, 3, 5, 7, 11};
        int wynik = 0;

        for (int i: ints) {
            wynik +=i;
            System.out.print(+ i +" ");
        }
        System.out.println();
        System.out.println(wynik);

    }
}
