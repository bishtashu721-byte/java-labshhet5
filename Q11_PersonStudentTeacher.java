class Person {
    String name;
    void displayName() { System.out.println("Name: " + name); }
}
class Student extends Person {
    void study() { System.out.println(name + " is studying."); }
}
class Teacher extends Person {
    String subject;
    void teach() { System.out.println(name + " teaches " + subject + "."); }
}
public class Q11_PersonStudentTeacher {
    public static void main(String[] args) {
        Student s = new Student(); s.name = "Aman";
        Teacher t = new Teacher(); t.name = "Meena"; t.subject = "Java";
        s.displayName(); s.study();
        t.displayName(); t.teach();
    }
}
