package je11_FlowControl_Repetition;

import java.util.concurrent.ThreadLocalRandom;

public class ExampleWhile {
    public static void main(String[] args) {
        double allowance = 50.0;
        while (allowance > 0) {
            Double candyValue = randomValue();
            if(candyValue > allowance)
                candyValue = allowance;

            System.out.println("Candy of value:" + candyValue + "Add in cart.");
            allowance = allowance - candyValue;
        }

        System.out.println("Allowance:" + allowance);
        System.out.println("Anya spent her entire table on sweets.");

    }
    private static double randomValue() {
     return ThreadLocalRandom.current().nextDouble(4, 10);
    }
}
