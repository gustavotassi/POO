
package fatec.poo.model;

/**
 *
 * @author Gustavo Tassi Souza
 */
public class Equacao2Grau {
    
    private double coef_A;
    private double coef_B;
    private double coef_C;

    public Equacao2Grau(double coef_A, double coef_B, double coef_C) {
        this.coef_A = coef_A;
        this.coef_B = coef_B;
        this.coef_C = coef_C;
    }
    
    public double calcDelta() {
        return ((coef_B * coef_B) - (4 * coef_A * coef_C));
    }
    
    public double calcRaiz(int op) {
        if (op == 1) {
            return ((-coef_B + Math.sqrt(calcDelta()))) / (2 * coef_A);
        } else {
            return ((-coef_B - Math.sqrt(calcDelta()))) / (2 * coef_A);
        }
    }
    
    public String exibeEquacao() {
        
        if (coef_B < 0) {
            if (coef_C < 0) {
                return (coef_A + "x² " + coef_B + "x " + coef_C);
            } else {
                return (coef_A + "x² " + coef_B + "x + " + coef_C);
            }
        } else {
            if (coef_C < 0) {
                return (coef_A + "x² + " + coef_B + "x " + coef_C);
            } else {
                return (coef_A + "x² + " + coef_B + "x + " + coef_C);
            }
        }
    }
}
