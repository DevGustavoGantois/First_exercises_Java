package je12_flux_control_exception;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Enter your name");
        String name = scanner.next();
        System.out.println("Enter your surname");
        String surname = scanner.next();
        System.out.println("Enter your age");
        int age  = scanner.nextInt();
        System.out.println("Enter your height");
        double height = 0;
        try {
             height = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.err.println("Height must be entered in American standard 0.00 .");
        }
        System.out.println("Hello, my name is" + name.toUpperCase() + " " + surname.toUpperCase());
        System.out.println("My age is" + age + "years");
        System.out.println("My height is" + height + "cm");

    }
}
