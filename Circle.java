public class Circle {
    double radius;
    final double PI = 3.14159;
    Circle(double radius) {
        this.radius = radius;
    }
    void calculateArea() {
        double area = PI * radius * radius;
        System.out.println("Area: " + area);
    }
    void calculateCircumference() {
        double circumference = 2 * PI * radius;
        System.out.println("Circumference: " + circumference);
    }
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(7);
        System.out.println("Circle 1:");
        c1.calculateArea();
        c1.calculateCircumference();
        System.out.println("Circle 2:");
        c2.calculateArea();
        c2.calculateCircumference();
    }
}