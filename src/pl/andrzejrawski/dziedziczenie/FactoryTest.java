package pl.andrzejrawski.dziedziczenie;

public class FactoryTest {
    public static void main(String[] args) {

        CarFactory carFactory = new CarFactory();
        PhoneFactory phoneFactory = new PhoneFactory();

        carFactory.testDrive();
        phoneFactory.testPhone();

        carFactory.produce();
        phoneFactory.produce();

        carFactory.checkState();
        phoneFactory.checkState();

//        Factory factory = new Factory() {
//            @Override
//            void produce() {
//                super.produce();
//            }
//
//            @Override
//            void checkState() {
//                super.checkState();
//            }
//        };

        System.out.println(phoneFactory.introduceYourself());

        CarFactory car1 = new CarFactory();
        CarFactory car2 = new CarFactory();
        car1.setName("C");
        car2.setName("D");
        System.out.println(car1.equals(car2));
    }
}
