package fatec.poo.model;

/**
 *
 * @author Gustavo
 */
public class QuartoHotel {

    private int numQuarto;
    private double valorDiaria;
    private int numRG;
    private boolean situacao; //false - livre | true - ocupado
    private double totalFaturado;

    public QuartoHotel(int numQuarto, double valorDiaria) {
        this.numQuarto = numQuarto;
        this.valorDiaria = valorDiaria;
        //Instruções redundantes
        //situacao = false;
        //totalFaturado = 0;
    }

    public void reservar(int numRG) {
        this.numRG = numRG;
        situacao = true;
    }

    public double liberar(int numDias) {
        double valFatura;

        numRG = 0;
        situacao = false;

        valFatura = numDias * valorDiaria;
        totalFaturado += valFatura;

        return valFatura;
    }

    public boolean getSituacao() {
        return situacao;
    }

    public double getTotalFaturado() {
        return totalFaturado;
    }

}
