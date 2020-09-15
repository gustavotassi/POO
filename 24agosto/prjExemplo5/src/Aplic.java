/**
 *
 * @author Gustavo
 */
public class Aplic {
    public static void main(String[] args) {
        int cont = 1, x;
        
        x = (int)(Math.random() * 100);
        
        System.out.println("\nTabuada do " + x + "\n");
        while (cont <= 10) {
            System.out.println(x + " x " + cont + " = " + cont * x);
            cont++;
        }
    }
}
