package pl.andrzejrawski.pckginstanceof;

class Employee extends Person {
    private double salary;

    Employee(String name, String lastName, double salary) {
        super(name, lastName);
        this.salary = salary;
    }

    @Override
    void takeDescription() {
        System.out.println("Jestem pracownikiem");
        System.out.println("Imię: " + name);
        System.out.println("Nazwisko: " + lastName);
        System.out.println("Wynagrodzenie: " + salary);

    }

    void work () {
        System.out.println("Ja pracuję");
    }
}
