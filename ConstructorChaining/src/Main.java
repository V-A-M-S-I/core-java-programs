class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        System.out.println("BankAccount Constructor Called");
        System.out.println("Initializing BankAccount with accountNumber: " + accountNumber + ", balance: " + balance);
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void showAccountDetails() {
        System.out.println("---- Showing Bank Account Details ----");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount() {
        // Calls the parameterized constructor of SavingsAccount
        this("ABC12CH", 1300, 4);
        System.out.println("Default SavingsAccount Constructor Called");
    }

    SavingsAccount(String accNo, double bal, double interestRate) {
        // Calls the constructor of BankAccount using super()
        super(accNo, bal);
        System.out.println("SavingsAccount Constructor Called");
        System.out.println("Initializing SavingsAccount with interestRate: " + interestRate + "%");
        this.interestRate = interestRate;
    }

    void display() {
        System.out.println("---- Displaying SavingsAccount Details ----");
        super.showAccountDetails(); // show BankAccount details
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("---- Program Started ----");
        SavingsAccount s = new SavingsAccount(); // Constructor chain starts here
        s.display();
        System.out.println("---- Program Ended ----");
    }
}
