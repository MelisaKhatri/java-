import java.util.Scanner;
class Greatest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        if (a > b) {
            System.out.println("Greater number is: " + a);
        } 
        else if (b > a) {
            System.out.println("Greater number is: " + b);
        } 
        else {
            System.out.println("Both numbers are equal.");
        }
        input.close();
    }
}