package pl.andrzejrawski.instrukcjewarunkowe;

public class InstrukcjeWarunkowe {

    public static void main(String[] args) {

        int[] ints = {2, 3, 5, 7, 6};

        for (int i : ints) {
            if (i % 2 == 0) {
                System.out.println("%2 " + i);
            } else if (i % 3 == 0) {
                System.out.println("%3 " + i);
            }
            if (i % 4 == 0) {
                System.out.println("%4 " + i);
            } else {
                System.out.println("nothing");
            }
        }
        for (int i : ints) {
            if ((i % 2 == 0 && i % 3 == 0) || i % 5 == 0) {   //&& - oraz - jedna i druga; || - lub - chociaż jedna
                System.out.println("a");
            }
        }
        // ----------------------- switch case ----------------------------

        int menu = 4;

        switch (menu) {
            case 1:
                System.out.println("main menu");
                break;
            case 2:
                System.out.println("game menu");
                break;
            case 3:
                System.out.println("end menu");
                break;
            default:
                System.out.println("invalid parameter");
        }

        //---------------------------- short if ---------------------------

        var even = (menu % 2 ==0) ? "yes": "no";
        System.out.println(even);

        // warunek ? jeśliTrue: jeśliFalse

    }
}
