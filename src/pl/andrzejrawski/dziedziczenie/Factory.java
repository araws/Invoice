package pl.andrzejrawski.dziedziczenie;

abstract class Factory {

     void produce () {
         System.out.println("produce");
    }

     void checkState () {
         System.out.println("checkState");
    }

    public abstract void destroy ();
}
