package pl.andrzejrawski.kurs.collections.wildcards;

import java.util.List;

class SuperClass {

    static void tester (List<? extends SuperClass> list) {

        /*
        * ? - wildcard - znak wieloznaczności
        * ? extends SomeClass - znak wieloznaczności jest ograniczony klasą SomeClass - bonded wildcard
        */
    }
}
