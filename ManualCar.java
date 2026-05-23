public class ManualCar {
    String brand;
    String model;
    double price;
    ManualCar(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public static void main(String[] args) {
        ManualCar c1 = new ManualCar("Toyota", "Corolla", 1800000);
        ManualCar c2 = new ManualCar("BMW", "X5", 7500000);
        ManualCar c3 = new ManualCar("Hyundai", "Creta", 2500000);
        ManualCar c4 = new ManualCar("Tata", "Nexon", 1900000);
        ManualCar c5 = new ManualCar("Mercedes", "C-Class", 9000000);
        System.out.println("Cars above 20,00,000:");
        if (c1.price > 2000000) {
            System.out.println(c1.brand + " " + c1.model + " " + c1.price);
        }
        if (c2.price > 2000000) {
            System.out.println(c2.brand + " " + c2.model + " " + c2.price);
        }
        if (c3.price > 2000000) {
            System.out.println(c3.brand + " " + c3.model + " " + c3.price);
        }
        if (c4.price > 2000000) {
            System.out.println(c4.brand + " " + c4.model + " " + c4.price);
        }
        if (c5.price > 2000000) {
            System.out.println(c5.brand + " " + c5.model + " " + c5.price);
        }
    }
}