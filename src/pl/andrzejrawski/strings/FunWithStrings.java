package pl.andrzejrawski.strings;

import pl.andrzejrawski.Utils.StrUtils;
import pl.andrzejrawski.zadania.Product;

public class FunWithStrings {

    public static void main(String[] args) {

        Product product3 = new Product("q", 1, 4.9);

        System.out.println(product3.toString());
        System.out.println(product3);

        String text = "a" + "b";
        String text2 = "a" .concat("b");

        System.out.println(text);
        System.out.println(text2);

//        if (text == text2) {                 - nie porównujemy w ten sposób!!!
//            System.out.println("equals");
//        }

        if (text.equals(text2)) {
            System.out.println("equals");
        }

        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());

        String s = "a,b,c,d,e";
        String[] strings = s.split(",");

        for (String w:strings) {
            System.out.println(w);
        }

        String result = "";
        for (String str:strings) {
            result = result + str + ", ";
        }
        System.out.println(StrUtils.removeLastSeparator(result, ","));

//        String res = "";
//        for (int i = 0; i < 1000000; i++) {
//            res += "a";
//        }
//        System.out.println(res);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            sb.append("a");
        }
        System.out.println(sb.toString());
    }
}
