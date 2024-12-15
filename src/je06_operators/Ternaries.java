package je06_operators;

public class Ternaries {
    public static void main(String[] args) {
        String name = "Iza";
        int age = 1;
        final int BIGGER_AGE = 18;
        boolean biggerAge =  age >= BIGGER_AGE;
        String message = name + "é" + (biggerAge ? "é de maior" : "não é de maior");
        System.out.println(message);

        if(age > BIGGER_AGE)
            System.out.println(name + "é de maior.");
        else
            System.out.print(name + "Não é de maior.");
    }
}
