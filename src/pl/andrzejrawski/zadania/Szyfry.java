package pl.andrzejrawski.zadania;

import pl.andrzejrawski.Utils.StrUtils;

public class Szyfry {
    public static void main(String[] args) {
        String str = "kasia i andrzej";

        char[] arr = new char[str.length()];

        str.getChars(0, str.length(),arr, 0);

        for (char a: arr) {
            if (a == 'a') {
                System.out.print("ZX11");
            } else if (a == 'e') {
                System.out.print("ZX22");
            } else if (a == 'i') {
                System.out.print("ZX33");
            } else if (a == 'o') {
                System.out.print("ZX44");
            } else if (a == 'u') {
                System.out.print("ZX55");
            } else if (a == 'y') {
                System.out.print("ZX66");
            } else if (a == 'ó') {
                System.out.print("ZX77");
            } else if (a == ' ') {
                System.out.print("ZX88");
            } else System.out.print(a);
        }

    }
}
