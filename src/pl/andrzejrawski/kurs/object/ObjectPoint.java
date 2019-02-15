package pl.andrzejrawski.kurs.object;

public class ObjectPoint {

    public static void main(String[] args) {

        Object[] points = new Point[4];

        points[0] = new Point(2,8);
        points[1] = new Point(3,8);
        points[2] = new Point(7,8);
        points[3] = new Point(2,68);

        for (Object point : points) {
            System.out.println(point);
        }
//        if (p.equals(p2)) {
//            System.out.println("Point are equals.");
//        }

    }
}
