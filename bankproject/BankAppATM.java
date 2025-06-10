package bankproject;

import java.text.SimpleDateFormat;
import java.util.*;

class Transaction {
    private String type;
    private double amount;
    private String timestamp;

    Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.timestamp = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
    }

    public String toString() {
        return String.format("%-10s ₹%-10.2f %s", type, amount, timestamp);
    }
}

class Account {
    private String name;
    private int accountNumber;
    private double balance;
    private List<Transaction> transactions;
    private double loanAmount = 0.0;
    private double fixedDepositAmount = 0.0;

    Account(String name, int accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    public String getName() { return name; }
    public int getAccountNumber() { return accountNumber; }
    public double getBalance() { return balance; }
    public List<Transaction> getTransactions() { return transactions; }

    void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("❌ Invalid deposit amount. Amount must be positive.");
            return;
        }
        balance += amount;
        transactions.add(new Transaction("Deposit", amount));
        System.out.printf("++✅ ₹%.2f deposited successfully.%n", amount);
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("❌ Invalid withdrawal amount. Amount must be positive.");
        } else if (amount > balance) {
            System.out.println("⚠ Insufficient balance.");
        } else {
            balance -= amount;
            transactions.add(new Transaction("Withdrawal", amount));
            System.out.printf("--✅ ₹%.2f withdrawn successfully.%n", amount);
        }
    }

    void checkBalance() {
        System.out.printf("💰 Current Balance: ₹%.2f%n", balance);
    }

    void showTransactionHistory() {
        if (transactions.isEmpty()) {
            System.out.println("📬 No transactions yet.");
        } else {
            System.out.println("\n📜 Transaction History:");
            System.out.println("---------------------------------------------");
            System.out.printf("%-10s %-12s %s%n", "Type", "Amount", "Timestamp");
            System.out.println("---------------------------------------------");
            for (Transaction t : transactions) {
                System.out.println(t);
            }
            System.out.println("---------------------------------------------");
        }
    }

    void applyLoan(double amount) {
        loanAmount = amount;
    }

    void applyFixedDeposit(double amount) {
        fixedDepositAmount = amount;
    }

    double getLoanAmount() {
        return loanAmount;
    }

    double getFixedDepositAmount() {
        return fixedDepositAmount;
    }
}

public class BankAppATM {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\n🏦 Welcome to Rajnesh King Bank ATM System");
        System.out.println("=================================");

        String name = getInputName();
        int accNumber = generateAccountNumber();
        Account acc = new Account(name, accNumber);

        System.out.println("\n🎉 Account created successfully!");
        System.out.println("---------------------------------");
        System.out.println("👤 Name: " + acc.getName());
        System.out.println("🔢 Account Number: " + acc.getAccountNumber());
        System.out.printf("💰 Initial Balance: ₹%.2f%n", acc.getBalance());
        System.out.println("---------------------------------");

        int choice;
        do {
            displayMenu();
            choice = getValidChoice();

            switch (choice) {
                case 1 -> performDeposit(acc);
                case 2 -> performWithdrawal(acc);
                case 3 -> acc.checkBalance();
                case 4 -> acc.showTransactionHistory();
                case 5 -> applyForLoan(acc);
                case 6 -> applyForFixedDeposit(acc);
                case 7 -> viewLoanDetails(acc);
                case 8 -> viewFixedDepositDetails(acc);
                case 9 -> System.out.println("\n👋 Thank you for using Rajnesh King ATM. Goodbye!");
                default -> System.out.println("❌ Invalid choice. Please try again.");
            }
        } while (choice != 9);

        sc.close();
    }

    private static String getInputName() {
        System.out.print("\n👤 Enter your full name: ");
        while (true) {
            String name = sc.nextLine().trim();
            if (!name.isEmpty()) {
                return name;
            }
            System.out.print("❌ Name cannot be empty. Please enter your name: ");
        }
    }

    private static int generateAccountNumber() {
        return 100000 + new Random().nextInt(900000);
    }

    private static void displayMenu() {
        System.out.println("\n===== ATM Menu =====");
        System.out.println("1. Deposit Money");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Check Balance");
        System.out.println("4. View Transaction History");
        System.out.println("5. Apply for Loan");
        System.out.println("6. Apply for Fixed Deposit");
        System.out.println("7. View Loan Details");
        System.out.println("8. View Fixed Deposit Details");
        System.out.println("9. Exit");
        System.out.print("\ud83d\udd0e Choose an option: ");
    }

    private static int getValidChoice() {
        while (true) {
            try {
                int choice = Integer.parseInt(sc.nextLine());
                if (choice >= 1 && choice <= 9) {
                    return choice;
                }
                System.out.print("❌ Invalid option. Choose between 1 and 9: ");
            } catch (NumberFormatException e) {
                System.out.print("❌ Invalid input. Enter a number: ");
            }
        }
    }

    private static double getValidAmount(String prompt) {
        System.out.print(prompt);
        while (true) {
            try {
                double amount = Double.parseDouble(sc.nextLine());
                if (amount > 0) {
                    return amount;
                }
                System.out.print("❌ Amount must be positive. Try again: ");
            } catch (NumberFormatException e) {
                System.out.print("❌ Invalid input. Enter a valid number: ");
            }
        }
    }

    private static void performDeposit(Account acc) {
        double amount = getValidAmount("Enter amount to deposit: ₹");
        acc.deposit(amount);
    }

    private static void performWithdrawal(Account acc) {
        double amount = getValidAmount("Enter amount to withdraw: ₹");
        acc.withdraw(amount);
    }

    private static void applyForLoan(Account acc) {
        System.out.println("\n🚀 Loan Application Section");
        double loanAmount = getValidAmount("Enter loan amount: ₹");
        acc.applyLoan(loanAmount);
        System.out.println("✅ Loan of ₹" + loanAmount + " applied successfully.");
    }

    private static void applyForFixedDeposit(Account acc) {
        System.out.println("\n💰 Fixed Deposit Section");
        double fdAmount = getValidAmount("Enter fixed deposit amount: ₹");
        acc.applyFixedDeposit(fdAmount);
        System.out.println("✅ Fixed Deposit of ₹" + fdAmount + " created successfully.");
    }

    private static void viewLoanDetails(Account acc) {
        System.out.println("\n🚀 Loan Details:");
        if (acc.getLoanAmount() == 0.0) {
            System.out.println("📄 No active loans at the moment.");
        } else {
            System.out.printf("💳 Loan Amount: ₹%.2f%n", acc.getLoanAmount());
        }
    }

    private static void viewFixedDepositDetails(Account acc) {
        System.out.println("\n💰 Fixed Deposit Details:");
        if (acc.getFixedDepositAmount() == 0.0) {
            System.out.println("📄 No active fixed deposits at the moment.");
        } else {
            System.out.printf("💳 Fixed Deposit Amount: ₹%.2f%n", acc.getFixedDepositAmount());
        }
    }
}
