package meus.testes;

public class Conta{

    String cliente;  //caracteristicas(variaveis)
    double saldo;

    void exibesaldo() { //metodo(açao)
        System.out.println(cliente + " seu saldo é " + saldo);
    }

    void saque(double valor) {
        saldo -= valor;
    }

    void deposito(double valor) {
        saldo += valor;
    }

    void transferenciaValor (Conta destino, double valor) {
        this.saque(valor);
        destino.deposito(valor);
    }
}
