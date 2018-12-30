package pl.andrzejrawski.hermetyzacja;

public class Encapsulation {

    private static int x;
    protected int y;
    int z;

    public static void main(String[] args) {

    }
    private int getInside () {
        InsideEncapsulation insideEncapsulation = new InsideEncapsulation ();
        return insideEncapsulation.insideZ;
    }

    private class InsideEncapsulation {
        private int insideZ = 0;
    }
}
