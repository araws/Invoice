package pl.andrzejrawski.klasyiobiekty;

public class Test {

    public static void main(String[] args) {
//        int x = 1;
//        String s = " ";
//
//        Client client1 = new Client();
//        client1.name = "Andrzej";
//        s = client1.COMPANY_NAME;
//
//        System.out.println(client1.name);
//        System.out.println(s);
//
//        Client client2 = null;
//
//        System.out.println(client1);
//
//        if(client2!=null) {
//            System.out.println(client2.name);
//        }

        Client clientAndrzej = new Client();

        clientAndrzej.setFirstName("Andrzej");
        clientAndrzej.setLastName("Rawski");

        Address andrzejAddress = new Address("44-100", "Gliwice");
//        andrzejAddress.setPostCode("44-100");
//        andrzejAddress.setPostOffice("Gliwice");

        clientAndrzej.setAddress(andrzejAddress);

        System.out.println(clientAndrzej.getLastName());
        System.out.println(Client.COMPANY_NAME);
    }
}
