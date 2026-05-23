public class Product {
    String productName;
    double price;
    double discountPercentage;
    Product(String productName, double price, double discountPercentage) {
        this.productName = productName;
        this.price = price;
        this.discountPercentage = discountPercentage;
    }
    void calculateFinalPrice() {
        double discountAmount = price * (discountPercentage / 100);
        double finalPrice = price - discountAmount;
        System.out.println("Product: " + productName);
        System.out.println("Original Price: " + price);
        System.out.println("Discount: " + discountPercentage + "%");
        System.out.println("Final Price: " + finalPrice);
        
    }
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 80000, 10);
        Product p2 = new Product("Mobile", 50000, 5);
        Product p3 = new Product("Headphones", 5000, 20);
        p1.calculateFinalPrice();
        p2.calculateFinalPrice();
        p3.calculateFinalPrice();
    }
}