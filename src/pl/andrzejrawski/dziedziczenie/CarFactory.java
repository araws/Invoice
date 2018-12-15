package pl.andrzejrawski.dziedziczenie;

 class CarFactory extends Factory {

     void testDrive () {
        System.out.println("testDrive");
    }

     @Override
     public void destroy() {
         System.out.println("carDestroy");
     }
 }
