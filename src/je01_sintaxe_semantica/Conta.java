package je01_sintaxe_semantica;

public class Conta {

    double saldo = 10.0;
    double novoSaldo; // Adicionando um atributo para armazenar o novo saldo

    public void sacar(Double valor) {
        // Atualizando o atributo novoSaldo
        novoSaldo = saldo - valor;
    }

    public void imprimirSaldo() {
        System.out.println("Saldo inicial: " + saldo);
        System.out.println("Novo saldo: " + novoSaldo);
    }
}
