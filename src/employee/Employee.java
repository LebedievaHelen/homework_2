package employee;

public class Employee {

    private String fullName;
    private String position;
    private String email;
    private String phonenumber;
    private int age;

    protected Employee(String fullName, String position, String email, String phonenumber, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phonenumber = phonenumber;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public int getAge() {
        return age;
    }
}