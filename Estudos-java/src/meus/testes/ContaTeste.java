package meus.testes;

public class ContaTeste {

    public static void main (String[] args) {

        Conta conta = new Conta(); //adiciona uma nova conta
        conta.cliente = "Daniel"; //usa as variaveis dos atributos do objeto
        conta.saldo = 4000.00;
        conta.exibesaldo(); //faz a ação do objeto

        conta.saque(2000);
        conta.exibesaldo();

        conta.deposito(8000);
        conta.exibesaldo();

        Conta destino = new Conta();
        destino.cliente = "Carlos";
        destino.saldo = 5000.00;
        destino.exibesaldo();
    }
}
