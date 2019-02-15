package pl.andrzejrawski.kurs.object;

public class Point {

    private int x;
    private int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean equals(Object o){

        if (this == o)
            return true;
        if (o == null)
            return false;
        if (this.getClass() != o.getClass())
            return false;

        Point comingPoint = (Point) o;

        return this.x == comingPoint.x && this.y == comingPoint.y;
    }
    public String toString(){
        return "x = " + getX() + ", y = " + getY();
    }
}
