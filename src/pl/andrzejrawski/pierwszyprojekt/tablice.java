package pl.andrzejrawski.pierwszyprojekt;

public class tablice {

    public static void main(String[] args) {

        int[] ints;
        ints = new int[3];

        ints[0] = 3;
        ints[1] = 10;
        ints[2] = 300;

        String[] strings = {"element", "nowy element", "kolejny element"};

        System.out.println(ints[2]);
        System.out.println(strings[2]);

        int[] tablica = {1, 5, 10};

        System.out.println("1 + 5 + 10 = " +(tablica[0]+tablica[1]+tablica[2]));
        System.out.println("1 * 5 * 10 = " +(tablica[0]*tablica[1]*tablica[2]));

    }
}
