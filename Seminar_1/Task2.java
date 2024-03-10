/*
Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
Метод ищет в массиве заданное значение и возвращает его индекс.
При этом, например:
1. если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
3. если вместо массива пришел null, метод вернет -3
 */

public class Task2 {
    public static void main(String[] args) {
        System.out.println(findInArray(new int[]{1, 3, 2, 7}, 2, 2));
    }
    public static int findInArray(int[] arr, int min, int numToFind) {
        if (arr == null) {
            System.out.println("Вместо массива пришел null");
            return -3;
        }
        else if (arr.length < min) {
            System.out.println("Массива меньше некоторого заданного минимума");
            return -1;
        }
        else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == numToFind)
                    return i;
            }
        }
        System.out.println("Искомый элемент не найден");
        return -2;
    }
}