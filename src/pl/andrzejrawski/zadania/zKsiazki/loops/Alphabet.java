package pl.andrzejrawski.zadania.zKsiazki.loops;

public class Alphabet {
    public static void main(String[] args) {
        char character;

        for (character = 'A'; character <= 'Z' ; character++) {
            if (character < 'Z') {
                System.out.print(character + ", ");
            }
            if (character == 'Z') {
                System.out.println(character + ".");
                System.out.println();
            }                                                                                                                                                                                                                                                                                                   
        }
        for (character = 'Z'; character >= 'A' ; character--) {
            if (character > 'A') {
                System.out.print(character + ", ");
            }
            if (character == 'A') {
                System.out.println(character + ".");
            }
        }
    }
}
