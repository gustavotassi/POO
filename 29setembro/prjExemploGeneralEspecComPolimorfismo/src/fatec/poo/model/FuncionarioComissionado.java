
package fatec.poo.model;

/**
 *
 * @author Gustavo
 */
public class FuncionarioComissionado extends Funcionario {
    
    private double salBase;
    private double taxaComissao;
    private double totalVendas;

    public FuncionarioComissionado(int registro, String nome, String dtAdmissao, double taxaComissao) {
        super(registro, nome, dtAdmissao);
        this.taxaComissao = taxaComissao;
    }

    public void setSalBase(double salBase) {
        this.salBase = salBase;
    }

    public double getSalBase() {
        return salBase;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void addVendas(double vendas) {
        totalVendas += vendas;
    }
    
    public double calcGratificacao() {
        if (getTotalVendas() <= 5000) {
            return 0.0;
        } else if (getTotalVendas() <= 10000) {
            return (0.03 * calcSalBruto());
        } else {
            return (0.05 * calcSalBruto());
        }
    }
    
    @Override
    //aplicando polimorfismo
    public double calcSalBruto() {
       return (salBase + taxaComissao * totalVendas);
    }
    
    @Override
    //aplicando polimorfismo
    public double calcSalLiquido() {
        return (calcSalBruto() - super.calcDesconto() + calcGratificacao());
    }
    
}
