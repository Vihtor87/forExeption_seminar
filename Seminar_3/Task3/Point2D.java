package Task3;

public class Point2D {
    int x;
    int y;


    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(%s; %s)", x, y);
    }
}
