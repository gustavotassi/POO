/**
 *
 * @author Gustavo
 */

import java.util.Scanner;

public class Aplic {
    public static void main(String[] args) {
        int codProd;
        double precUnit, qtdeVend, valComp, offProd, valPagar;
        String descProd;
        
        Scanner entrada = new Scanner(System.in); //inicializar o objeto de entrada da classe Scanner
        
        System.out.println("Digite o código: ");
        codProd = entrada.nextInt(); //scanf("%d", &codProd);
        
        while (codProd > 0) {
            System.out.println("Digite a descrição: ");
            descProd = entrada.next(); //scanf("%s", &descProd) | sequência de caracteres sem espaço
            System.out.println("Digite o preço unitário do produto: ");
            precUnit = entrada.nextDouble(); //scanf("%lf", &precUnit);
            System.out.println("Digite a quantidade vendida: ");
            qtdeVend = entrada.nextDouble(); //scanf("%lf", &qtdeVend);

            valComp = precUnit * qtdeVend;

            if (valComp <= 800) {
                offProd = 0;
            }
            else {
                offProd = 0.1 * valComp;
            }

            valPagar = valComp - offProd;

            System.out.println("Informações [cod: " + codProd + " desc: " + descProd + "]\n");
            System.out.println("Valor da compra: " + valComp);
            System.out.println("Valor do desconto: " + offProd);
            System.out.println("Valor a pagar: " + valPagar);
            
            System.out.println("\nDigite o código: ");
            codProd = entrada.nextInt(); //scanf("%d", &codProd);
        }
    }
}
