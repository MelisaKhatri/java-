public class Employee {
    String name;
    double salary;
    int yearsOfExperience;
    Employee(String name, double salary, int yearsOfExperience) {
        this.name = name;
        this.salary = salary;
        this.yearsOfExperience = yearsOfExperience;
    }
    void calculateBonus() {
        double bonus;
        if (yearsOfExperience > 5) {
            bonus = salary * 0.20;   
        } else {
            bonus = salary * 0.10;  
        }
        System.out.println("Employee: " + name);
        System.out.println("Bonus: " + bonus);
    }
    public static void main(String[] args) {
        Employee e1 = new Employee("Ram", 50000, 6);
        Employee e2 = new Employee("Sita", 40000, 3);
        Employee e3 = new Employee("Hari", 60000, 8);
        e1.calculateBonus();
        e2.calculateBonus();
        e3.calculateBonus();
    }
}