package je06_operators;

public class Unaries {
    public static void main(String[] args) {
        int number = +5;
        System.out.print(number);
        System.out.println(- number);

        number++;
        //number = number + 1;
        System.out.println(number++);
        System.out.println(number);
        //Se quiser fazer essa atribuição de forma antecipada, coloca a esquerda:
        System.out.println(++number);

        //Verdadeiro e falso
        boolean verdadeiro = true;
        boolean falsa = !verdadeiro;
        System.out.println(falsa);

        //Também podemos negar expressões
        //boolean falsa = ! (1==1);

        //Podemos fazer verificação
        if (!verdadeiro) {
            System.out.println("False");
        }
    }
}
