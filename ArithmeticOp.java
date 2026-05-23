class ArithmeticOp{
    public static void main(String[] args){
        int a=20;
        int b=5;
        System.out.println("First Number: "+a);
        System.out.println("Second Number: "+b);
        System.out.println("Sum = "+(a+b));
        System.out.println("Difference = "+(a-b));
        System.out.println("Product = "+(a*b));
        if(b!=0){
            System.out.println("Quotient = "+(a/b));
        }
        else{
            System.out.println("Division by zero is not possible.");
        }
    }
}