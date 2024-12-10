package je05_types_wrappers;

public class TypesWrappers {
    public static void main(String[] args) {
        double numberDouble = 123.56;
        int numberInt = (int) numberDouble; //Expressão de conversão | Conversão Explicita.

        //Podemos realizar a conversão da forma abaixo, wrappers dão métodos de conversão de tipos para utilizar de uma forma mais declarativa:
        Double d = 100.0;
        Integer i = d.intValue();
        System.out.println(i);
    }
}
