package pl.andrzejrawski.zadania;

public class ZadanieLiczbyPierwsze {

    public static void main(String[] args) {

        System.out.println (liczbaPierwsza(197));
    }

    private static boolean liczbaPierwsza(int i) {
        boolean czyPierwsza = true;
        int liczba = i - 1;
        for (; liczba > 1 ; liczba--) {
            if (i%liczba==0) {
                czyPierwsza = false;
                break;
            }
        }
        return czyPierwsza;
    }
}
