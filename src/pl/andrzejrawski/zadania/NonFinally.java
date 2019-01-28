package pl.andrzejrawski.zadania;

public class NonFinally {
    public static void main(String[] args) {

        int x = 4;
        int y = 0;

        try {
            System.out.println(x / y);
        } catch (ArithmeticException e) {
            System.err.println("Divided by zero: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Unknown error");
        } try {
            if (y == 0)
                System.exit(0);
        } finally {
            System.out.println("finally");
        }
    }
}
