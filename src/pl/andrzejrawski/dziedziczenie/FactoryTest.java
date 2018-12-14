package pl.andrzejrawski.dziedziczenie;

public class FactoryTest {
    public static void main(String[] args) {

        CarFactory carFactory = new CarFactory();
        PhoneFactory phoneFactory = new PhoneFactory();

        carFactory.testDrive();
        phoneFactory.testPhone();

        carFactory.produce();
        phoneFactory.checkState();
    }
}
