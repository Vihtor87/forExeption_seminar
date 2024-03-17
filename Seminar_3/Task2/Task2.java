package Task2;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Task2 {
    public static void main(String[] args) {
//        System.out.println(divide(2, 0));
        try {
            fileNotFound("123");
        } catch (NonExistedFileException e) {
            e.printStackTrace();
        }
    }

    public static double divide(int a, int b) {
        if (b == 0)
            throw new DivideByZeroException("Всё равно на ноль делить нельзя!");
        else
            return (double) a / b;
    }

    public static void fileNotFound(String path) throws NonExistedFileException {
        try {
            FileReader fr = new FileReader(path);
        } catch (FileNotFoundException e) {
            throw new NonExistedFileException();
        }
    }
}
