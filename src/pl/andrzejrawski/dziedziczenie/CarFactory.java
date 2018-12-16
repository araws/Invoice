package pl.andrzejrawski.dziedziczenie;

 class CarFactory extends Factory {

     @Override
     void checkState() {
         super.checkState();
         System.out.println("checkStateInCarFactory");
     }

     void testDrive () {
        System.out.println("testDrive");
    }

     @Override
     public void destroy() {
         System.out.println("carDestroy");
     }
 }
