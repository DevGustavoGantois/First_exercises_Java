package je10_FlowControl_Conditional;

public class Atm {
    public static void main(String[] args) {
        double balance = 25.0;
        double requestedAmount = 17.0;

        if(requestedAmount <= balance) {
            balance = balance - requestedAmount;

            System.out.println("Withdrawal successful !!");
        } else {
            System.out.println("Insufficient balance");
        }

        System.out.println(balance);
    }
}
