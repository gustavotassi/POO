
package fatec.poo.model;

/**
 *
 * @author Gustavo
 */
public class Circulo {
    private double raio;
    
    public void setRaio(double a) {
        raio = a;
    }
    public double getRaio() {
        return raio;
    }
    public double calcArea() {
        return (Math.PI * Math.pow(raio, 2));
    }
    public double calcPerimetro() {
        return (2 * Math.PI * raio);
    }
    public double calcDiametro() {
        return (2 * raio);
    }
}
