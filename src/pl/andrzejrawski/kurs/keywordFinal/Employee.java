package pl.andrzejrawski.kurs.keywordFinal;

import java.util.Date;

public class Employee extends Person {

    Employee() {

        this.employmentDate = new Date();
    }

    Employee(Date date) {
        this.employmentDate = date;
    }

    final Date getEmploymentDate() {  // nie można dziedziczyć metody final

        return this.employmentDate;
    }

    final Date employmentDate;
}
