import java.io.IOException;

/**
 Создайте класс Счетчик, у которого есть метод add(), увеличивающий значение
 внутренней int переменной на 1. Сделайте так, чтобы с объектом такого типа
 можно было работать в блоке try-with-resources. Подумайте, что должно происходить
 при закрытии этого ресурса? Напишите метод для проверки, закрыт ли ресурс.
 При попытке вызвать add() у закрытого ресурса, должен выброситься IOException
 */
public class Counter implements AutoCloseable {
    public int count = 0;
    public boolean closed = false;
    public void add() throws IOException {
        if (!closed)
            count++;
        else
            throw new IOException("Resource is closed!");
    }

    @Override
    public void close() throws Exception {
        closed = true;
    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Counter counter = new Counter();

//        System.out.println(counter.count);
//        counter.add();
//        System.out.println(counter.count);
//        counter.close();
//        counter.add();

        try (counter) {
            System.out.println(counter.count);
            counter.add();
        }
//        System.out.println(counter.count);
        counter.add();
    }
}