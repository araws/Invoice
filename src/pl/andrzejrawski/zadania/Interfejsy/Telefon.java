package pl.andrzejrawski.zadania.Interfejsy;

public interface Telefon {

    void phoneTo(int number);

    boolean writeSms (int number, String text);

    boolean sendPhoto (int number, String path);
}