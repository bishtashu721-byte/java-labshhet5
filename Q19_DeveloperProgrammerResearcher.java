class Employee {
    private String name;
    private int employeeId;
    Employee(String name, int employeeId) { this.name = name; this.employeeId = employeeId; }
    void displayEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }
}
interface Programmer {
    void writeCode();
}
interface Researcher {
    void conductResearch();
}
class Developer extends Employee implements Programmer, Researcher {
    Developer(String name, int id) { super(name, id); }
    @Override
    public void writeCode() { System.out.println("Developer is writing code."); }
    @Override
    public void conductResearch() { System.out.println("Developer is conducting research."); }
}
public class Q19_DeveloperProgrammerResearcher {
    public static void main(String[] args) {
        Developer d = new Developer("Aman", 301);
        d.displayEmployee(); d.writeCode(); d.conductResearch();
    }
}
