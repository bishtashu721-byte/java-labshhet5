class Employee {
    String employeeName;
    int employeeID;
    void displayEmployee() {
        System.out.println("Name: " + employeeName);
        System.out.println("Employee ID: " + employeeID);
    }
}
class Developer extends Employee {
    String programmingLanguage;
    void writeCode() { System.out.println("Writing code in " + programmingLanguage + "."); }
}
class Manager extends Employee {
    String department;
    void conductMeeting() { System.out.println("Conducting meeting in " + department + "."); }
}
public class Q12_EmployeeDeveloperManager {
    public static void main(String[] args) {
        Developer d = new Developer();
        d.employeeName = "Aman"; d.employeeID = 11; d.programmingLanguage = "Java";
        d.displayEmployee(); d.writeCode();
        Manager m = new Manager();
        m.employeeName = "Riya"; m.employeeID = 12; m.department = "Development";
        m.displayEmployee(); m.conductMeeting();
    }
}
