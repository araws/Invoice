package pl.andrzejrawski.dziedziczenie;

abstract class Factory {

     void produce () {
        System.out.println("Produce");
    }

     void checkState () {
        System.out.println("checkState");
    }
}
