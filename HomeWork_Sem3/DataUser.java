public class DataUser {
    String lastName;
    String firstName;
    String middleName;
    String bfDay;
    String phone;
    String sex;
    public DataUser (String lastName, String firstName, String middleName, String bfDay, String phone, String sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.bfDay = bfDay;
        this.phone = phone;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return String.format("<%s> <%s> <%s> <%s> <%s> <%s>", lastName, firstName, middleName, bfDay, phone, sex);

    }
}
