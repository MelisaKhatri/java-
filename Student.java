import java.util.Scanner;
class Student {
    String name;
    int age;
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        System.out.println("Enter student name:");
        s1.name = sc.nextLine();
        System.out.println("Enter age:");
        s1.age = sc.nextInt();
        s1.displayInfo();
        sc.close();
    }
}