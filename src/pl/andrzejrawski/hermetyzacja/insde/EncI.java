package pl.andrzejrawski.hermetyzacja.insde;

public interface EncI {

    void hi ();

    EncI enci = new EncI() {
        @Override
        public void hi() {
            System.out.println("hi");
        }
    };
}
