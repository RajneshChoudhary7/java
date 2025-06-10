package lemdaexpression;
import java.util.*;

// Transaction class to store details of each deposit/withdraw
class Transaction {
    String type;
    double amount;
    Date timestamp;

    Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.timestamp = new Date();
    }

    public String toString() {
        return type + " of ₹" + amount + " on " + timestamp;
    }
}

// Account class to store user data and handle operations
class Account {
    String name;
    int accountNumber;
    double balance;
    List<Transaction> transactions;

    Account(String name, int accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("❌ Invalid deposit amount.");
            return;
        }
        balance += amount;
        transactions.add(new Transaction("Deposit", amount));
        System.out.println("✅ ₹" + amount + " deposited successfully.");
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("❌ Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("⚠ Insufficient balance.");
        } else {
            balance -= amount;
            transactions.add(new Transaction("Withdraw", amount));
            System.out.println("✅ ₹" + amount + " withdrawn successfully.");
        }
    }

    void checkBalance() {
        System.out.println("💰 Current Balance: ₹" + balance);
    }

    void showTransactionHistory() {
        if (transactions.isEmpty()) {
            System.out.println("📭 No transactions yet.");
        } else {
            System.out.println("📜 Transaction History:");
            for (Transaction t : transactions) {
                System.out.println(" - " + t);
            }
        }
    }
}

// Main class to run the program
public class BankAppATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("👤 Enter your name: ");
        String name = sc.nextLine();
        int accNumber = 100000 + rand.nextInt(900000);

        Account acc = new Account(name, accNumber);

        System.out.println("🏦 Account created successfully!");
        System.out.println("👤 Name: " + acc.name);
        System.out.println("🔢 Account Number: " + acc.accountNumber);
        System.out.println("💰 Initial Balance: ₹" + acc.balance);

        int choice;
        do {
            System.out.println("\n===== ATM Menu =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. View Transaction History");
            System.out.println("5. Exit");
            System.out.print("👉 Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ₹");
                    double dep = sc.nextDouble();
                    acc.deposit(dep);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ₹");
                    double wd = sc.nextDouble();
                    acc.withdraw(wd);
                    break;
                case 3:
                    acc.checkBalance();
                    break;
                case 4:
                    acc.showTransactionHistory();
                    break;
                case 5:
                    System.out.println("👋 Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("❌ Invalid option. Try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}