//Create a BankAccount class with account holder name and balance. Implement deposit and withdrawal methods.
class Que3 {
    String name;
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient Balance");
    }

    void display() {
        System.out.println(name + " " + balance);
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.name = "Rahul";
        b.balance = 5000;

        b.deposit(2000);
        b.withdraw(1000);
        b.display();
    }
}
