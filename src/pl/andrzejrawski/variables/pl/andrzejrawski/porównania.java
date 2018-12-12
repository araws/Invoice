package pl.andrzejrawski.variables.pl.andrzejrawski;

public class porównania {
    public static void main(String[] args) {
        double a = 1.0;
        double b = 2.0;
        double c = 3.0;

        boolean prawda = a<b;
        boolean fałsz = a>b;
        boolean porownanie = a==b;
        boolean koniunkcja = (a<b)&&(a!=b);

        System.out.println(prawda);
        System.out.println(fałsz);
        System.out.println(porownanie);
        System.out.println(koniunkcja);

        System.out.println("(a+b)*c = " +(a+b)*c);
        System.out.println("a-b/c = " +(a-b/c));

        a++;
        b++;
        c++;

        System.out.println("Czy (a+b)>c? " +((a+b)>c));
        System.out.println("Czy a=b? " +(a==b));
    }
}
