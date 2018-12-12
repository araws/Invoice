package pl.andrzejrawski.zadania;

public class Product {

    private String productName;
    private int quantity;
    private double bruttoPrice;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getBruttoPrice() {
        return bruttoPrice;
    }

    public void setBruttoPrice(double bruttoPrice) {
        this.bruttoPrice = bruttoPrice;
    }

    public Product(String productName, int quantity, double bruttoPrice) {
        this.productName = productName;
        this.quantity = quantity;
        this.bruttoPrice = bruttoPrice;
    }

    public void productLine() {
        System.out.println(productName + ", " + quantity + " psc, " + bruttoPrice + " PLN");
    }

    public void sumLine() {
        System.out.println("Sum: " + sum ());
    }

    public void calculateTax() {
        System.out.println("VAT: " + tax ());
    }

    private double sum () {
        return quantity * bruttoPrice;
    }
    private double tax () {
        return sum() - (sum ()/1.23);
    }
}
