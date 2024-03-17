import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Введите данные через пробел: ");
            String enterUser = sc.nextLine();
            String[] du = enterUser.split(" ");

            if (du.length != 6)
                throw new RuntimeException("Данных недостаточно! Проверьте ввод!");
            else {
                String firstName = du[0];
                String lastName = du[1];
                String middleName = du[2];
                String bd = du[3];
                String phone = du[4];
                String sex = du[5];

                String fileName = du[0] + ".txt";

                try (FileWriter fw = new FileWriter(fileName, true)) {
                    fw.write(String.valueOf(new DataUser(firstName, lastName, middleName, bd, phone, sex)) + '\n');
                    fw.flush();
                } catch (IOException e) {
                    e.getStackTrace();
                }
            }
        }
    }
}