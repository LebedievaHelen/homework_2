package employee;

public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Majstrenko Anton Fedorovich", "chef",
                "majstrenko@gmail.com", "+380976534450", 44);
        Employee employee2 = new Employee("Burko Hanna Ivanivna", "designer",
                "burko@gmail.com", "+380506534450", 26);

        employeeData(employee1, employee2);
    }

    public static void employeeData(Employee employee1, Employee employee2) {
        System.out.println("employee1: " + employee1.getFullName() + ", " + employee1.getPosition() + ", " + employee1.getEmail() +
                ", " + employee1.getPhonenumber() + ", " + employee1.getAge());
        System.out.println("employee2: " + employee2.getFullName() + ", " + employee2.getPosition() + ", " + employee2.getEmail() +
                ", " + employee2.getPhonenumber() + ", " + employee2.getAge());
    }
}