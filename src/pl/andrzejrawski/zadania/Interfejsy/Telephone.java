package pl.andrzejrawski.zadania.Interfejsy;

public class Telephone implements Telefon{
    @Override
    public void phoneTo(int number) {
        System.out.println("Phone to " + number);
    }

    @Override
    public boolean writeSms(int number, String text) {
        System.out.println("Send to " + number + " text " + text);
        return true;
    }

    @Override
    public boolean sendPhoto(int number, String path) {
        System.out.println("Send to " + number + " file: " + path);
        return true;
    }
}
