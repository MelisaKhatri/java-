public class Rectangle {
    double length;
    double width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    void calculateArea() {
        double area = length * width;
        System.out.println("Area of rectangle : "+area);
    }
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 5);
        Rectangle r2 = new Rectangle(7, 3);
        Rectangle r3 = new Rectangle(12, 4);
        r1.calculateArea();
        r2.calculateArea();
        r3.calculateArea();
    }
}