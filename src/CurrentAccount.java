import java.util.Date;

public class CurrentAccount {
    // Attributes
    private String accountNumber;
    private String agencyNumber;
    private String clientName;
    private Date birthDate;
    private double balance;

    // Constructor
    public CurrentAccount(String accountNumber, String agencyNumber, String clientName, Date birthDate, double initialBalance) {
        this.accountNumber = accountNumber;
        this.agencyNumber = agencyNumber;
        this.clientName = clientName;
        this.birthDate = birthDate;
        this.balance = initialBalance;
    }

    public double withdrawAmount(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return amount;
        } else {
            System.out.println("Insufficient balance for withdrawal.");
            return 0;
        }
    }

    public boolean transferAmount(CurrentAccount destinationAccount, double amount) {
        if (amount <= balance) {
            balance -= amount;
            destinationAccount.depositAmount(amount);
            return true;
        } else {
            System.out.println("Insufficient balance for transfer.");
            return false;
        }
    }

    public String cancelAccount() {
        this.accountNumber = null;
        this.agencyNumber = null;
        this.clientName = null;
        this.birthDate = null;
        this.balance = 0;
        return "Account successfully canceled.";
    }

    public String viewStatement() {
        return "Account Statement: \nAccount Number: " + accountNumber + "\nCurrent Balance: " + balance;
    }

    public void depositAmount(double amount) {
        balance += amount;
    }

    // Getters
    public String getAccountNumber() { return accountNumber; }
    public String getAgencyNumber() { return agencyNumber; }
    public String getClientName() { return clientName; }
    public Date getBirthDate() { return birthDate; }
    public double getBalance() { return balance; }
}
