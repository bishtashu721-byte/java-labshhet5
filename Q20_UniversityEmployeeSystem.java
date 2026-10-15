class Employee {
    private int employeeID;
    private String employeeName;
    private double salary;

    public void setEmployeeID(int id) { employeeID = id; }
    public void setEmployeeName(String name) { employeeName = name; }
    public void setSalary(double salary) {
        if (salary >= 0) this.salary = salary;
        else System.out.println("Salary cannot be negative.");
    }
    public int getEmployeeID() { return employeeID; }
    public String getEmployeeName() { return employeeName; }
    public double getSalary() { return salary; }
    void displayDetails() {
        System.out.println("ID: " + employeeID + ", Name: " + employeeName + ", Salary: " + salary);
    }
    double calculateSalary() { return salary; }
}
interface Researcher {
    void conductResearch();
}
class Teacher extends Employee implements Researcher {
    private String subject;
    public void setSubject(String subject) { this.subject = subject; }
    void teach() { System.out.println(getEmployeeName() + " teaches " + subject + "."); }
    @Override
    public void conductResearch() { System.out.println(getEmployeeName() + " conducts research."); }
    @Override
    double calculateSalary() { return getSalary() + 5000; }
}
class VisitingTeacher extends Teacher {
    private int hoursWorked;
    public void setHoursWorked(int hours) { hoursWorked = Math.max(0, hours); }
    @Override
    double calculateSalary() { return getSalary() * hoursWorked; }
}
class Admin extends Employee {
    private String department;
    public void setDepartment(String department) { this.department = department; }
    void manageDepartment() { System.out.println("Managing department: " + department); }
}
public class Q20_UniversityEmployeeSystem {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setEmployeeID(1); t.setEmployeeName("Meena"); t.setSalary(40000); t.setSubject("Java");
        t.displayDetails(); t.teach(); t.conductResearch();
        System.out.println("Teacher salary: " + t.calculateSalary());

        VisitingTeacher v = new VisitingTeacher();
        v.setEmployeeID(2); v.setEmployeeName("Ravi"); v.setSalary(500); v.setSubject("Python"); v.setHoursWorked(20);
        v.displayDetails(); v.teach();
        System.out.println("Visiting teacher salary: " + v.calculateSalary());

        Admin a = new Admin();
        a.setEmployeeID(3); a.setEmployeeName("Kiran"); a.setSalary(35000); a.setDepartment("Accounts");
        a.displayDetails(); a.manageDepartment();
    }
}
