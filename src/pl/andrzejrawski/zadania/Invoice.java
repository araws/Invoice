package pl.andrzejrawski.zadania;

public class Invoice {
    public static void main(String[] args) {

        Product product1 = new Product("Carabiner", 10, 12.3);

        product1.productLine();
        product1.sumLine();
        product1.calculateTax();
    }
}