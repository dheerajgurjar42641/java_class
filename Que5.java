class Que5 {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Bank b = new Bank();
        b.deposit(5000);
        System.out.println(b.getBalance());
    }
}
