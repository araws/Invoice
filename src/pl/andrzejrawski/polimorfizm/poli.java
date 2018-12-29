package pl.andrzejrawski.polimorfizm;

import pl.andrzejrawski.interfaces.Document;
import pl.andrzejrawski.interfaces.DrawDocument;
import pl.andrzejrawski.interfaces.TxtDocument;

public class poli {
    public static void main(String[] args) {

        Document draw =new DrawDocument();

        if (draw instanceof DrawDocument) {
            System.out.println(true);
        }
        if (draw instanceof TxtDocument) {
            System.out.println(false);
        }

        Box<Document> box = new Box<>();
        box.setT(new TxtDocument());
        box.setT(new DrawDocument());

//        Box<String> b2 = new Box<>();
//        b2.setT("");

        String n = "1";
        Object o = "abc";
        String s = (String) o;
        int i = Integer.valueOf(n);

        System.out.println(s + n);
        System.out.println("" + i);
    }
}
