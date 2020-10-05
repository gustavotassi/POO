package fatec.poo.model;

/**
 *
 * @author Gustavo
 */
public class FuncionarioMensalista extends Funcionario {

    private double numSalMin;
    private double valSalMin;

    public FuncionarioMensalista(int registro, String nome, String dtAdmissao, String cargo,double valSalMin) {
        super(registro, nome, dtAdmissao, cargo);
        this.valSalMin = valSalMin;
    }

    public void setNumSalMin(double numSalMin) {
        this.numSalMin = numSalMin;
    }

    @Override
    public double calcSalBruto() {
        return (valSalMin * numSalMin);
    }

}
