package pl.andrzejrawski.zadania.Interfejsy;

public class TestTelefonu {
    public static void main(String[] args) {

        Telephone telephone = new Telephone();
        Smartphone smartphone = new Smartphone();

        smartphone.phoneTo(999999999);
        telephone.sendPhoto(999999999, "c:/obrazy");
        telephone.writeSms(999999999, "Cześć");
    }
}
