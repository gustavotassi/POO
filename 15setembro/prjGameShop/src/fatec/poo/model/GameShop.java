
package fatec.poo.model;

/**
 *
 * @author Gustavo
 */
public class GameShop {
    private int codigo;
    private int idade;
    private double qtdeHoras;

    public GameShop(int codigo, int idade) {
        this.codigo = codigo;
        this.idade = idade;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public int getIdade() {
        return idade;
    }

    public double getQtdeHoras() {
        return qtdeHoras;
    }
    
    public void comprar(double horas) {
        qtdeHoras += horas;
    }
    
    public void jogar(double horas) {
        qtdeHoras -= horas;
    }
    
    public void brinde() {
        comprar(qtdeHoras);
    }
    
}
