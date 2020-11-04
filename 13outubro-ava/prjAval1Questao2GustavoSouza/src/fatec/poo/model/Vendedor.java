
package fatec.poo.model;

/**
 *
 * @author Gustavo Tassi Souza
 */
public class Vendedor extends Pessoa {
    
    private double taxaComissao;
    private double totalVendas;

    public Vendedor(int codigo, String nome, double taxaComissao) {
        super(codigo, nome);
        this.taxaComissao = taxaComissao;
    }

    public double getTaxaComissao() {
        return (taxaComissao/100);
    }

    public double getTotalVendas() {
        return totalVendas;
    }
    
    public void addVenda(double valor) {
        totalVendas += valor;
    }
    
    public double calcValorComissao() {
        return ((taxaComissao/100) * totalVendas);
    }
}
