public class Car {
   String brand;
   int year;
   Car(String b , int y )
{ 
    this.brand = b;
    this.year = y;
}
void showDetails(){
    System.out.println("Brand : "+brand);
    System.out.println("Year : "+year);
}
public static void main(String[] args) {
    Car c1 =new Car("Toyota", 2020);
    Car c2 =new Car("Honda", 2022);
    c1.showDetails();
    c2.showDetails();
}
}