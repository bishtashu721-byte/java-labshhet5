class Shape {
    double calculateArea() { return 0; }
}
class Circle extends Shape {
    double radius;
    Circle(double radius) { this.radius = radius; }
    @Override
    double calculateArea() { return Math.PI * radius * radius; }
}
class Rectangle extends Shape {
    double length, width;
    Rectangle(double length, double width) { this.length = length; this.width = width; }
    @Override
    double calculateArea() { return length * width; }
}
public class Q15_ShapeAreaOverriding {
    public static void main(String[] args) {
        Shape c = new Circle(3);
        Shape r = new Rectangle(4, 5);
        System.out.printf("Circle area: %.2f%n", c.calculateArea());
        System.out.println("Rectangle area: " + r.calculateArea());
    }
}
