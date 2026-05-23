public class Contact {
    String name;
    String phoneNumber;
    String emailAddress;
    Contact(String name, String phoneNumber, String emailAddress) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }
    void displayContact() {
        if (emailAddress != "") {
            System.out.println("Name: " + name);
            System.out.println("Phone: " + phoneNumber);
            System.out.println("Email: " + emailAddress);
        }
    }
    public static void main(String[] args) {
        Contact c1 = new Contact("Ram", "9812345678", "ram@gmail.com");
        Contact c2 = new Contact("Sita", "9800000000", "");
        Contact c3 = new Contact("Hari", "9811111111", "hari@yahoo.com");
        c1.displayContact();
        c2.displayContact();
        c3.displayContact();
    }
}