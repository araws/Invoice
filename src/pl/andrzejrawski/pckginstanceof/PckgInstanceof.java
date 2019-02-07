package pl.andrzejrawski.pckginstanceof;

public class PckgInstanceof {

    public static void main(String[] args) {

        Person[] person = new Person[4];
        person[0] = new Employee("Zenon", "Laskowik", 10000);
        person[1] = new Student("Genowefa", "Pigwa");
        person[3] = new Employee("Stefek", "Burczymucha", 909);

        for (int i = 0; i < person.length; i++) {
            if (person[i] instanceof Employee) {
                ((Employee)person[i]).work();
            } else if (person[i] instanceof Student) {
                ((Student)person[i]).takeDescription();
            }
        }
    }
}

