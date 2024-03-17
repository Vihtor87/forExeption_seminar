public class DataUser {
    String lastName;
    String firstName;
    String middleName;
    String bd;
    String phone;
    String sex;

    public DataUser(String firstName, String lastName, String middleName, String bd, String phone, String sex) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.bd = bd;
        this.phone = phone;
        this.sex = sex;
    }
    @Override
    public String toString() {
        return String.format("<%s> <%s> <%s> <%s> <%s> <%s>", firstName, lastName, middleName, bd, phone, sex);
    }
}