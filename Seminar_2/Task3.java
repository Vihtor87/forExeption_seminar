import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Запишите в файл следующие строки:
 *
 * Анна=4
 * Елена=5
 * Марина=6
 * Владимир=?
 * Полина=?
 * Константин=?
 * Иван=4
 *
 * Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив (либо HashMap,
 * если студенты с ним знакомы). В отдельном методе нужно будет пройти по структуре данных,
 * если сохранено значение ?, заменить его на соответствующее число. Если на каком-то месте
 * встречается символ, отличный от числа или ?, бросить подходящее исключение.
 * Записать в тот же файл данные с замененными символами ?.
 */
public class Task3 {
    private static final List<String> strings = List.of
            ("Анна=4", "Елена=5", "Марина=6", "Полина=?", "Владимир=?", "Константин=?", "Иван=4");
//для проверки, заменить какое-то из значений на null

    public static void main(String[] args) {
        String path = "task3.txt";
        writeToFile(path, strings);
        System.out.println(readFromFile(path));
        rewrite(path);
    }

    public static void writeToFile(String path, List<String> args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter(path);
            for (String arg : args) {
                fw.write(arg + '\n');
            }
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


    public static Map<String, Integer> readFromFile(String path) {
        Map<String, Integer> map = new HashMap<>();
        BufferedReader bf = null;
        String line;
        try {
            bf = new BufferedReader(new FileReader(path));
            while ((line = bf.readLine()) != null) {
//                Map.Entry<String, Integer> entry = getEntry(line);
//                map.put(entry.getKey(), entry.getValue());

                String[] strings = line.split("=");
                String key = strings[0];
                int value;
                if (strings[1].equals("?")) {
                    value = key.length();
                } else {
                    try {
                        value = Integer.parseInt(strings[1]);
                    } catch (NumberFormatException e) {
                        throw new NumberFormatException("Non-valid data!!!");
                    }
                }
                map.put(key, value);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bf.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return map;
    }

    public static void rewrite(String path) {
        Map<String, Integer> map = readFromFile(path);
        List<String> data = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            data.add(entry.toString());
        }
        writeToFile(path, data);
    }

    private static Map.Entry<String, Integer> getEntry(String string) {
        String[] data = string.split("=");
        String key = data[0];
        Integer value;
        if (isNumber(data[1])) {
            value = Integer.parseInt(data[1]);
        } else if (data[1].equals("?")) {
            value = key.length();
        } else {
            throw new NumberFormatException("Non-valid data!!!");
        }
        return new Map.Entry<>() {
            @Override
            public String getKey() {
                return key;
            }

            @Override
            public Integer getValue() {
                return value;
            }

            @Override
            public Integer setValue(Integer value) {
                return null;
            }
        };
    }

    private static boolean isNumber(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}