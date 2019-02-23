package pl.andrzejrawski.kurs.collections.genericMethods;

import java.util.Collection;
import java.util.List;

class Editor {

    public static void write(List<? extends  Shape> list){
        for (Shape shape : list) {
            System.out.println(shape.getName());
        }

        list.add(null);
        System.out.println("-----------------------------------------");

        for (Shape shape : list) {
            if (shape == null){
                System.out.println("null");
                break;
            }
            System.out.println(shape.getName());
        }
    }

    public static <T extends Shape> void write2 (List<T> list){
        for (T shape : list) {
            System.out.println(shape.getName());
        }

        list.add( (T) new Circle() );
        list.add( (T) new Circle() );
        list.add( (T) new Circle() );
        list.add( (T) new Circle() );
        list.add(null);
        System.out.println("-----------------------------------------");

        for (T shape : list) {
            if (shape == null){
                System.out.println("null");
                break;
            }
            System.out.println(shape.getName());
        }
    }

    public static <Type> void writeArrayIntoCollection (Type[] array, Collection<Type> collection){

        for (Type t: array) {
            collection.add(t);
        }
    }
}
