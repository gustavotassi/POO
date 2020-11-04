
package fatec.poo.model;

/**
 *
 * @author Gustavo Tassi Souza
 */
public class Pessoa {
    
    private int codigo;
    private String nome;

    public Pessoa(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }
    
}
