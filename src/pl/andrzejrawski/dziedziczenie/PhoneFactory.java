package pl.andrzejrawski.dziedziczenie;

 public final class PhoneFactory extends Factory {

     void testPhone () {
         System.out.println("testPhone");
    }

     @Override
     public void destroy() {
         System.out.println("phoneDestroy");
     }
 }
