package je06_operators;

import java.util.Date;

public class Duties {
    public static void main(String[] args) {
        String name = "Gustavo";
        int age = 21;
        double weight = 75.00;
        char sex = 'M';
        boolean juicer = false;
        Date birthDate = new Date();

        //Podemos fazer atribuições dessa maneira aqui:
        String name_v1 = "Gustavo" + "Gantois";  //Ele vai tentar fazer uma concatenação, caso fosse um número ele iria somar.
        String name_v2 = "Gustavo".concat("Gantois");
        System.out.println(name_v1);
        System.out.println(name_v2);

        int number = 1 + 1 * 2;
        System.out.println(number);

        boolean bol = 1 > 2;
        System.out.println(bol);
    }
}
