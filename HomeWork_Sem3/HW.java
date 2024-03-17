import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Введите данные через пробел: ");
            String dataEnter = sc.nextLine();
            String[] data = dataEnter.split(" ");

            if (data.length < 6) {
                throw new RuntimeException("Проверьте правильность данных!");
            } else {
                String lastName = data[0];
                String firstName = data[1];
                String middleName = data[2];
                String bfDay = data[3];
                String phone = data[4];
                String sex = data[5];

                String fileName = data[0] + ".txt";

                try (FileWriter fw = new FileWriter(fileName, true)) {
                    fw.write(String.valueOf(new DataUser(lastName, firstName, middleName, bfDay, phone, sex)) + '\n');
                    fw.flush();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}