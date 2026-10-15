class Employee {
    protected double salary;
    Employee(double salary) { this.salary = salary; }
    double calculateSalary() { return salary; }
}
class Manager extends Employee {
    Manager(double salary) { super(salary); }
    @Override
    double calculateSalary() { return salary + 10000; }
}
public class Q14_EmployeeSalaryCalculation {
    public static void main(String[] args) {
        Employee e = new Employee(40000);
        Manager m = new Manager(50000);
        System.out.println("Employee salary: " + e.calculateSalary());
        System.out.println("Manager salary: " + m.calculateSalary());
    }
}
