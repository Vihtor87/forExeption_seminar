package Task3;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException {

    public MyArraySizeException() {
        super("Размер масива не 3х3!");
    }
}
