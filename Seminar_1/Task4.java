/*
Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
Метод должен пройтись по каждому элементу и проверить что он не равен null. Реализуйте следующую логику:
1. Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
2. Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”
 */

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        checkArray(new Integer[]{1, null, 7, 6, null, 78, null});
    }
    public static void checkArray(Integer[] arr) {
        List<Integer> cash = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null)
                cash.add(i);
        }
        if (!cash.isEmpty())
            throw new RuntimeException(String.format("В ячейках с индексами %s значение null%n", cash));
        else
            System.out.println("null не встретилось");
    }
}