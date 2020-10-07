package fatec.poo.model;

/**
 *
 * @author Gustavo
 */
public class PessoaJuridica extends Pessoa {

    private String cgc;
    private double taxaIncentivo;

    public PessoaJuridica(String nome, String cgc, int anoInscricao) {
        super(nome, anoInscricao);
        this.cgc = cgc;
    }

    public String getCgc() {
        return cgc;
    }

    public void setTaxaIncentivo(double taxaIncentivo) {
        this.taxaIncentivo = taxaIncentivo;
    }

    public double getTaxaIncentivo() {
        return taxaIncentivo;
    }

    @Override
    public double calcBonus(int ano) {
        return ((taxaIncentivo * getTotalCompras()) * (ano - getAnoInscricao()));
    }
}
