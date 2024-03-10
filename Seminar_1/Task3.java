import com.sun.source.tree.BreakTree;

/*
Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
Необходимо посчитать и вернуть сумму элементов этого массива.
При этом накладываем на метод 2 ограничения:
метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов),
и в каждой ячейке может лежать только значение 0 или 1.
Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.
 */
public class Task3 {
    public static void main(String[] args) {
        int[][] array = {
                {0,1,1,0,1},
                {0,1,1,0,1},
                {0,1,1,0,1},
                {0,1,1,0,1},
                {0,1,1,0,1},
        };
        System.out.println(checkSumArr(array));
    }
    public static int checkSumArr(int[][] arr) {
        int height = arr.length;
        int sum = 0;
        for (int[] ints : arr) {
            if (ints.length != height)
                throw new RuntimeException("Массив не квадратный");
            for (int anInt : ints) {
                if (anInt == 0 || anInt == 1)
                    sum += anInt;
                else
                    throw new RuntimeException("Значение отличается от 0 и 1");
            }
            
        }
        return sum;
    }
}