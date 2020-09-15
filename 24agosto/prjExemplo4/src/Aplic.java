/**
 *
 * @author Gustavo
 */
public class Aplic {
    public static void main(String[] args) {
        int cont, x;
        
        x = (int)(Math.random() * 100);
        
        System.out.println("\nTabuada do " + x + "\n");
        for (cont = 1; cont <= 10; cont++) {
            System.out.println(x + " x " + cont + " = " + cont * x);
        }
    }
}
