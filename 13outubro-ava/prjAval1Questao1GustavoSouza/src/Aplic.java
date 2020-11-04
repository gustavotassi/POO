
import fatec.poo.model.Equacao2Grau;
import java.util.Scanner;

/**
 *
 * @author Gustavo Tassi Souza
 */
public class Aplic {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        Equacao2Grau[] eq2g = new Equacao2Grau[5];

        double coefA, coefB, coefC, delta;
        int i;

        for (i = 0; i < eq2g.length; i++) {
            System.out.println("\nDigite o valor do coeficiente A:");
            coefA = entrada.nextDouble();
            System.out.println("Digite o valor do coeficiente B:");
            coefB = entrada.nextDouble();
            System.out.println("Digite o valor do coeficiente C:");
            coefC = entrada.nextDouble();

            eq2g[i] = new Equacao2Grau(coefA, coefB, coefC);

            System.out.println("Equação: " + eq2g[i].exibeEquacao());

            delta = eq2g[i].calcDelta();
            if (delta > 0) {
                System.out.println("Raíz 1: " + eq2g[i].calcRaiz(1) + "\nRaíz 2: " + eq2g[i].calcRaiz(2));
            } else if (delta == 0) {
                System.out.println("Raíz: " + eq2g[i].calcRaiz(1));
            } else {
                System.out.println("Não tem raíz real.");
            }
        }
    }
}
