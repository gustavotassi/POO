
package fatec.poo.model;

/**
 *
 * @author Gustavo
 */
public class FuncionarioHorista extends Funcionario {
    
    private double valHoraTrab;
    private int qtdeHoraTrab;

    public FuncionarioHorista(int registro, String nome, String dtAdmissao, double valHoraTrab) {
        super(registro, nome, dtAdmissao); //chamada do método construtor da classe funcionário
        this.valHoraTrab = valHoraTrab;
    }

    public void setQtdeHoraTrab(int qtdeHoraTrab) {
        this.qtdeHoraTrab = qtdeHoraTrab;
    }
    
    public double calcGratificacao() {
        return (0.075 * calcSalBruto());
    }

    @Override
    //aplicando polimorfismo
    public double calcSalBruto() {
       return (valHoraTrab * qtdeHoraTrab);
    }
    
    @Override
    //aplicando polimorfismo
    public double calcSalLiquido() {
        return (calcSalBruto() + calcGratificacao() - calcDesconto());
    }

}
