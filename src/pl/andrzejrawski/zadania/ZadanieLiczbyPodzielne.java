package pl.andrzejrawski.zadania;

//Program wypisujący wszystkie liczby podzielne przez 3 i przez 7 z przedziału 0 - 1000

public class ZadanieLiczbyPodzielne {
    public static void main(String[] args) {

        for (int i = 0; i <= 1000; i++) {
            if ((i % 3==0 && i % 7 == 0) && i == 987){
                System.out.print(i);
            }
            else if (i % 3==0 && i % 7 == 0) {
                System.out.print(i + ", ");
            }
        }

    }
}
