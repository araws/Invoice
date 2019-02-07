package pl.andrzejrawski.pckginstanceof;

class Student extends Person {
    Student(String name, String lastName) {
        super(name, lastName);
    }

    @Override
    void takeDescription() {
        System.out.println("Jestem studentem");
        System.out.println("Imię: " + name);
        System.out.println("Nazwisko: " + lastName);
    }
}
