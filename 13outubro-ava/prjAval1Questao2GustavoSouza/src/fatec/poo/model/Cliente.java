
package fatec.poo.model;

/**
 *
 * @author Gustavo Tassi Souza
 */
public class Cliente extends Pessoa {
    
    private double limiteCredito;
    private double totalCompras;

    public Cliente(int codigo, String nome, double limiteCredito) {
        super(codigo, nome);
        this.limiteCredito = limiteCredito;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public double getTotalCompras() {
        return totalCompras;
    }
    
    public void addCompra(double valor) {
        totalCompras += valor;
    }
    
    public double calcLimiteDisponivel() {
        return (limiteCredito - totalCompras);
    }
}
