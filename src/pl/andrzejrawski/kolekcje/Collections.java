package pl.andrzejrawski.kolekcje;

import java.util.*;

public class Collections {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("tekst");
        list.add("tekst");
        list.add("abc");
        System.out.println(list);

        Set<String> hashSet = new HashSet<>();
        Set<String> treeSet = new TreeSet<>();
    }
}
