class Student {
    private String name;
    private int rollNo;
    private double marks;

    public void setName(String name) { this.name = name; }
    public void setRollNo(int rollNo) { this.rollNo = rollNo; }
    public void setMarks(double marks) { this.marks = marks; }

    public String getName() { return name; }
    public int getRollNo() { return rollNo; }
    public double getMarks() { return marks; }

    public void displayDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Roll No: " + getRollNo());
        System.out.println("Marks: " + getMarks());
    }
}

public class Q01_StudentEncapsulation {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Aman");
        s.setRollNo(101);
        s.setMarks(88.5);
        s.displayDetails();
    }
}
