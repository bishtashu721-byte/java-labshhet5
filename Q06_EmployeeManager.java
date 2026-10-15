class Employee {
    private String name;
    private double salary;
    public void setName(String name) { this.name = name; }
    public void setSalary(double salary) {
        if (salary >= 0) this.salary = salary;
        else System.out.println("Salary cannot be negative.");
    }
    public String getName() { return name; }
    public double getSalary() { return salary; }
}
class Manager extends Employee {
    private String department;
    public void setDepartment(String department) { this.department = department; }
    public String getDepartment() { return department; }
    void displayManager() {
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("Department: " + department);
    }
}
public class Q06_EmployeeManager {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.setName("Neha"); m.setSalary(65000); m.setDepartment("IT");
        m.displayManager();
    }
}
