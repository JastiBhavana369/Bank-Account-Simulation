import java.util.ArrayList;

class Account {
    private String accountHolder;
    private double balance;
    private ArrayList<String> transactions;

    public Account(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            transactions.add("Withdrawn: " + amount);
        } else {
            transactions.add("Failed Withdrawal: " + amount);
            System.out.println("Insufficient Balance!");
        }
    }

    public void showBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public void showTransactions() {
        System.out.println("Transaction History:");
        for (String t : transactions) {
            System.out.println(t);
        }
    }
}
