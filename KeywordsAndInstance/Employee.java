
public class Employee {
    static String companyName = "Tech Corp";
    static int totalEmployees = 0;

    final int id;
    String name, designation;

    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("Employee Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Designation: " + designation);
            System.out.println("Company: " + companyName);
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Raj", 101, "Manager");
        Employee e2 = new Employee("Simran", 102, "Developer");

        e1.displayDetails();
        System.out.println();
        e2.displayDetails();

        Employee.displayTotalEmployees();
    }
}
