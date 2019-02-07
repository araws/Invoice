package pl.andrzejrawski.pckginstanceof;

abstract class Person {

    String name;                                                                                            ;
    String lastName;

    Person (String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    abstract void takeDescription ();

}
