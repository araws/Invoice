package pl.andrzejrawski.zadania.listaPierwszych;

import pl.andrzejrawski.Utils.StrUtils;

public class Prime {
    private int x = 5;
    private int y = 15;


    public String listOfPrime (int x, int y) {
        String separator = ", ";
        StringBuilder resultBuilder = new StringBuilder();
        resultBuilder.append ("");


        for (; x <=y ; x++) {
            if (liczbaPierwsza(x)){
                resultBuilder.append(x);
                resultBuilder.append(separator);
            }
        }
        String result = resultBuilder.toString();
        return StrUtils.removeLastSeparator(result, separator);
    }



    private static boolean liczbaPierwsza(int j) {
        boolean czyPierwsza = true;
        int liczba = j - 1;
        for (; liczba > 1 ; liczba--) {
            if (j%liczba==0) {
                czyPierwsza = false;
                break;
            }
        }
        return czyPierwsza;
    }
}
