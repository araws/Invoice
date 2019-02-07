package pl.andrzejrawski.IO;

import java.util.Scanner;

public class IO2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            String line = in.nextLine();
            if (line.equals("quit"))
                System.exit(0);
            System.out.println(line);
        }
    }
}