package pl.andrzejrawski.interfaces;

public interface Document {

    public String d = "d";

    public boolean save();

    public String open (String path);

    public default void introduceYourself () {
        System.out.println("interface Document");
    }
}
