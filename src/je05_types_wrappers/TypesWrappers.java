package je05_types_wrappers;

public class TypesWrappers {
    public static void main(String[] args) {
        double numberDouble = 123.56;
        int numberInt = (int) numberDouble; //Expressão de conversão | Conversão Explicita.

        //Podemos realizar a conversão da forma abaixo, wrappers dão métodos de conversão de tipos para utilizar de uma forma mais declarativa:
        Double d = 100.0;
        Integer i = d.intValue();
        System.out.println(i);

        //Para converter a String em um número automáticamente preciso ter o mét0do parseInt.
        String num_one = "100";

        int b = Integer.parseInt(num_one);
        System.out.println(b); // 100


        //Exemplo de conversão para double
        String num_two = "100.123";

        double c = Double.parseDouble(num_two);
        System.out.println(c); //100


        //Se você quiser comparar 2 objetos fará da seguinte forma:
        Integer obj1 = Integer.valueOf("100");
        Integer obj2 = Integer.valueOf("101");

        System.out.println(obj1.equals(obj2));

        System.out.println(obj1.compareTo(obj2));

        //Podemos utilizar operadores lógicos:
        System.out.print(obj1 > obj2);
        //Obs: Sempre é recomendado que use o compareTo para comparações mais precisas.

        int fabricationYear = 2021;
        //reatribuir

        fabricationYear = 2022;

    }
}
