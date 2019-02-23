package pl.andrzejrawski.kurs.collections.wildcards;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {

    public static void main(String[] args) {

        List<String> listOfStrings = new ArrayList<>();

        List<SuperClass> listOfClasses = new ArrayList<>();
        listOfClasses.add(new SuperClass());
        listOfClasses.add(new SubClass());

        SuperClass.tester(listOfClasses);

    }
}
