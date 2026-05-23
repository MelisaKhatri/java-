public class Std {
    String name;
    int marks;
    Std(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    void calculateGrade() {
        char grade;
        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 80) {
            grade = 'B';
        } else if (marks >= 70) {
            grade = 'C';
        } else if (marks >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println(name + " : Grade " + grade);
    }
    public static void main(String[] args) {
        Std s1 = new Std("Aarav", 95);
        Std s2 = new Std("Sita", 76);
        Std s3 = new Std("Ramesh", 45);
        s1.calculateGrade();
        s2.calculateGrade();
        s3.calculateGrade();
    }
}