package je11_FlowControl_Repetition;

import java.util.Random;

public class ExampleDoWhile {
    private static int numberOfAttempts = 0;
    public static void main(String[] args) {
        System.out.println("Dialing...");
        do {
            System.out.println("Phone answered - trim trim");
        } while (playing());
        if(numberOfAttempts < 5) {
            System.out.println("Hello");
        }
        else
            System.out.println("No answered");

        System.out.println("Hello!!");
    }
    private static boolean playing() {
        numberOfAttempts++;
        boolean answsered = new Random().nextInt(5)==1;
            if(numberOfAttempts == 5)
                return false;
            else
                return !answsered;
    }
}
