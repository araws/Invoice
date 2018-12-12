package pl.andrzejrawski.variables;

public class variables {
    public static void main(String[] args) {
        byte b = 127;
        byte b1 = -128;
        short s = Short.MAX_VALUE;
        short s1 = Short.MIN_VALUE;
        int i = Integer.MAX_VALUE;
        Integer integer = 2;
        int sum = i + 1;
        long l = Long.MAX_VALUE;
        Long l1 = 21L;

        float f = Float.MAX_VALUE;
        double d = Double.MAX_VALUE;

        char c = 'a';
        String str = "Hello, how are you?";

        boolean boo = true;

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(str);
        System.out.println(boo);


        //-------------------------------------------//

        System.out.println("Sum: " + b + b1);
        System.out.println("Sum: " + (b + b1));

        int x = 3;
        int y = 10;
        int z = y/x;
        double z1 = y/x;
        double xx = 3;
        double yy = 10;
        double zz = yy/xx;

        System.out.println(z);
        System.out.println(z1);
        System.out.println(zz);

    }
}
