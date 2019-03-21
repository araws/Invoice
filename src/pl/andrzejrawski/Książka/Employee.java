package pl.andrzejrawski.Książka;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {

    private String name;
    private double salary;
    private LocalDate hireDate;

    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        hireDate = LocalDate.of(year,month,day);
    }

    public String getName() {
        return name;
    }

        public double getSalary() {
        return salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void raiseSalary (double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public boolean equals (Object otherObject) {
        if (this == otherObject)
            return true;
        if (otherObject == null)
            return false;
        if (getClass() != otherObject.getClass())
            return false;
        Employee other = (Employee) otherObject;

        return Objects.equals(hireDate, other.hireDate);
    }

    public int hashCode () {
        return Objects.hash(name, salary, hireDate);
    }

    public  String toString () {
        return getClass().getName() + "[name= " + name + ", salary= " + salary + ", hireDay= " + hireDate + "]";
    }
}