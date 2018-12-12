package pl.andrzejrawski.interfaces;

public class DocumentTest {

    public static void main(String[] args) {
        TxtDocument txt = new TxtDocument();
        DrawDocument draw = new DrawDocument();

        System.out.println(txt.open("txt.path"));
        System.out.println(draw.save());

        draw.introduceYourself();

        Document calc = new Document() {
            @Override
            public boolean save() {
                return false;
            }

            @Override
            public String open(String path) {
                return null;
            }
        };

        // OnClickListner


//        draw.draw(new OnClickListener() {          Zastąpione "Lambdą" poniżej
//            @Override
//            public void onClick() {
//
//            }
//        });
        draw.draw(() -> {
            System.out.println("on click");
        });
    }
}
