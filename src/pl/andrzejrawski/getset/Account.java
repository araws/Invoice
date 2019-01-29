package pl.andrzejrawski.getset;

public class Account {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        account.wplac(5000);

        if (account.wyplac (4247)) {
            System.out.println("Wypłacono");
        }
        else
            System.out.println("Nie ma kasy");


        System.out.println(account.getBallance());
    }

}

class BankAccount {

    private int ballance = 1000;

    int getBallance() {
        return ballance;
    }

    private boolean setBallance(int ballance) {
        this.ballance = ballance;

        return true;
    }

    boolean wyplac (int howMuch) {
        if (ballance < howMuch)
            return false;
        else
            setBallance(ballance - howMuch);

        return true;
    }

    boolean wplac (int howMuch) {
        setBallance(ballance + howMuch);

        return true;
    }
}
