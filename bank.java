class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}


class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance! Available: ₹" + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
}

public class bank {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000);

        account.displayBalance();
        account.deposit(2000);
        account.displayBalance();

        try {
            account.withdraw(8000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }

        account.displayBalance();
    }
}
