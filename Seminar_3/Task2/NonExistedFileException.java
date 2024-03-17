package Task2;

import java.io.FileNotFoundException;

/**
 * Задание 3.2
 * Создайте класс исключения, которое будет возникать при попытке открыть несуществующий файл.
 * Исключение должно отображать понятное для пользователя сообщение об ошибке.
 */
public class NonExistedFileException extends FileNotFoundException {

    public NonExistedFileException() {
        super("Файл не существует!");
    }

    public NonExistedFileException(String s) {
        super(s);
    }
}