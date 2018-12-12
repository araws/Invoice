package pl.andrzejrawski.zadania.Interfejsy;

public class Smartphone implements Telefon {
    @Override
    public void phoneTo(int number) {

    }

    @Override
    public boolean writeSms(int number, String text) {
        return false;
    }

    @Override
    public boolean sendPhoto(int number, String path) {
        return false;
    }
}