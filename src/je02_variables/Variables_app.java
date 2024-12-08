package je02_variables;

public class Variables_app {
    public static void main(String[] args) {
        String name = "Gustavo";
        name = "Gustavo Gantois";

        String BR = "Brasil";
        double PI = 3.14;
        int BRAZILIAN_STATES = 27;
        int YEAR_2000 = 2000;

        //não pode alterar a variável, pois p final impossibilita isso (vai dar erro).
        final String CAKE = "Chocolate";

        CAKE = "Red Velvet";

        //Declaração válida de variáveis:
        int numero_um = 1;
        int n123213 = 1;
        int numeroUm = 1;
        int longo = 1;
    }
}
