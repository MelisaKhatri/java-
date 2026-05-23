public class BankAccount {
    String accountHolderName;
    String accountNumber;
    double balance;
    BankAccount(String name, String accNo, double bal) {
       this.accountHolderName  = name;
        this.accountNumber = accNo;
        this.balance = bal;
    }
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("New Balance: " + balance);
    }
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance! ");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Remaining Balance: " + balance);
        }
    }
    void showdetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Ram Sharma", "ACC101", 5000);
        b1.showdetails();
        b1.deposit(2000);
        b1.withdraw(3000);
    }
}