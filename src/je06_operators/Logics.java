package je06_operators;

public class Logics {
    public static void main(String[] args) {
        boolean condition1 = false;
        boolean condition2 = true;

        if (condition1 && condition2)
            System.out.println("Two values is true.");
        if (condition1 || condition2)
            System.out.println("One value is true.");

        if ((1==1 && 2 < 3) || 4 < 5)
            System.out.println("lógica complexa, porém verdadeira.");

        int number1 = 1;
        int number2 = 2;

        if(number1==2 & number2 ++ == 2) //Dessa forma ele vai fazer a comparação das duas variáveis. é mais apropriado você utilizar em vez de 1 simbolo | ou &, utilize 2 simbolos && ||.
            System.out.println("Two conditions is true.");

        System.out.println("The number is =" + number1);
        System.out.println("The number is =" + number2);

    }
}
