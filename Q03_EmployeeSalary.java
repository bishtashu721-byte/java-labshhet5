class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;

    public void setEmployeeId(int id) { employeeId = id; }
    public void setEmployeeName(String name) { employeeName = name; }
    public void setSalary(double salary) {
        if (salary < 0 || salary > 1000000)
            System.out.println("Invalid salary. Salary must be between 0 and 1000000.");
        else this.salary = salary;
    }
    public int getEmployeeId() { return employeeId; }
    public String getEmployeeName() { return employeeName; }
    public double getSalary() { return salary; }
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + salary);
    }
}
public class Q03_EmployeeSalary {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmployeeId(1);
        e.setEmployeeName("Riya");
        e.setSalary(45000);
        e.displayDetails();
        e.setSalary(-5000);
        e.setSalary(1500000);
    }
}
