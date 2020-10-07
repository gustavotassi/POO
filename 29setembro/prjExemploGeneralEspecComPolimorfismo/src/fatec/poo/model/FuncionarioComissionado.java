
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
        if (totalVendas <= 5000) {
            return 0;
        } else if (totalVendas > 5000 && totalVendas <= 10000) { // !important
            return (0.035 * calcSalBruto());
        } else {
            return (0.05 * calcSalBruto());
        }
    }
    
    @Override
    //aplicando polimorfismo
    public double calcSalBruto() {
       return (salBase + (taxaComissao/100 * totalVendas));
    }
    
    @Override
    //aplicando polimorfismo
    public double calcSalLiquido() {
        return (super.calcSalLiquido() + calcGratificacao());
    }
    
}
