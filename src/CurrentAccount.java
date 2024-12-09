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

/*
public class ContaCorrente {
    Integer numero;
    Integer agencia;
    String nomeCliente;
    LocalDate dataNascimento;
    Double saldo;
    boolean ativo = true;

    Double consultarSaldo() {

        return saldo;
    }

    List consultarExtrato (LocalDate dataInicial, LocaaDate dataFinal ) { //Esse mét0do possui o tipo de retorno list. Se o mét0do fosse declarado com o tipo de retorno void, ele não precisaría retornar nada.

        return ?
    }

    void cancelar(String justificativa) {
        algoritmo irá manipular o atributo
        ativo para que se torne false
    }

    void transferir( ContaCorrente contaDestino,
                     Double valorTransferio ) {
                     }


}
 */