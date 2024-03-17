package Task3;

import java.util.List;

public class MyArrayDataException extends IllegalArgumentException {

    public MyArrayDataException(int i, int j) {
        super(String.format("The value in the sell [%s][%s] isn`t a number!", i, j));
    }
    public MyArrayDataException(List<Point2D> points) {
        super(String.format("The value in the sell %s are not numbers!", points));
    }

}
