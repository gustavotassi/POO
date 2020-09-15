package fatec.poo.model;

/**
 *
 * @author Gustavo
 */
public class ContaCorrente {

    private int numero;
    private double saldo;

    public ContaCorrente(int numero, double saldo) {
        this.numero = numero;
        if(saldo < 0.0) { //Se o usuário começar uma conta com um valor de saldo negativo
            saldo = this.saldo; //Substituir o saldo por 0.0 (valor padrão do atributo saldo
        } else { //Se não
            this.saldo = saldo; //Começar com o valor informado
        }
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double saque) {
        saldo -= saque;
    }

    public void depositar(double deposito) {
        saldo += deposito;
    }
}
