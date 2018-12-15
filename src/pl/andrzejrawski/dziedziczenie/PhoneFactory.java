package pl.andrzejrawski.dziedziczenie;

 class PhoneFactory extends Factory {

     void testPhone () {
         System.out.println("testPhone");
    }

     @Override
     public void destroy() {
         System.out.println("phoneDestroy");
     }
 }
