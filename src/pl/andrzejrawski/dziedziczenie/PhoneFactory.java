package pl.andrzejrawski.dziedziczenie;

 public final class PhoneFactory extends Factory {

     public void testPhone () {
         System.out.println("testPhone");
    }

     @Override
     public void destroy() {
         System.out.println("phoneDestroy");
     }

     @Override
     public String introduceYourself() {
         super.checkState();
         return super.introduceYourself();
     }
 }
