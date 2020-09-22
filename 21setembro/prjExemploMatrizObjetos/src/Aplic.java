
import fatec.poo.model.Retangulo;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Dimas
 */
public class Aplic {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0");
        Scanner entrada = new Scanner(System.in);
        String unidade;

        //definição de uma matriz de objetos 
        //para classe Retangulo
        Retangulo[] matRet = new Retangulo[3];
        
        double medAlt, medBas;
        int i;

        for (i = 0; i < 3; i++) {
            System.out.println("\n\nDigite a unidade de medida: ");
            unidade = entrada.next();

            //instanciação do objeto da classe Retangulo
            //e chamada do método construtor
            matRet[i] = new Retangulo(unidade);
            
            System.out.println("Digite a medida da altura: ");
            medAlt = entrada.nextDouble();
            System.out.println("Digite a medida da base: ");
            medBas = entrada.nextDouble();

            //passagem de mensagens
            matRet[i].setAltura(medAlt);
            matRet[i].setBase(medBas);
        }

        //acessando matriz de objetos
        for (i = 0; i < 3; i++) {
            System.out.println("\n\nObjeto Retangulo " + (i + 1));
            System.out.println("\nAltura: " + matRet[i].getAltura() + matRet[i].getUnidadeMedida());
            System.out.println("Base: " + matRet[i].getBase() + matRet[i].getUnidadeMedida());
            System.out.println("Perímetro: " + matRet[i].calcPerimetro() + matRet[i].getUnidadeMedida());
            System.out.println("Área: " + matRet[i].calcArea() + matRet[i].getUnidadeMedida() + "²");
            System.out.println("Diagonal: " + matRet[i].calcDiagonal() + matRet[i].getUnidadeMedida());
        }

    }
}
