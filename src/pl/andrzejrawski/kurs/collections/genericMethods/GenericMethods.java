package pl.andrzejrawski.kurs.collections.genericMethods;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenericMethods {

    public static void main(String[] args) {

        Shape shape1 = new Circle();
        Shape shape2 = new Square();

        List<Shape> listOfShapes = new ArrayList<>();
        listOfShapes.add(shape1);
        listOfShapes.add(shape2);

        Editor.write2(listOfShapes);

        Float[] floats = new Float[50];
        Integer[] integers = new Integer[50];
        Number[] numbers = new Number[50];

        Collection<Number> numberCollection = new ArrayList<>();
        Editor.writeArrayIntoCollection(floats,numberCollection);
        Editor.writeArrayIntoCollection(integers,numberCollection);
        Editor.writeArrayIntoCollection(numbers,numberCollection);
    }
}
