
import fatec.poo.model.QuartoHotel;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Aplic {

    public static void main(String[] args) {
        //Instanciando o objeto da classe Scanner
        Scanner entrada = new Scanner(System.in);

        int numQuarto, numRG;
        double valDiaria;

        System.out.println("Digite o número do quarto:");
        numQuarto = entrada.nextInt();

        System.out.println("Digite o valor da diária:");
        valDiaria = entrada.nextDouble();

        //Instanciando a array de objetos da classe QuartoHotel
        //Passando o tamanho da array
        QuartoHotel[] objQuarto = new QuartoHotel[3];

        int i;
        for (i = 0; i < objQuarto.length; i++) {
            //...
        }
    }

}
