
import fatec.poo.model.Circulo;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Aplic {

    public static void main(String[] args) {
        //Instanciando o objeto da classe Scanner
        Scanner entrada = new Scanner(System.in);

        //Instanciando o objeto da classe Retangulo
        Circulo objCirc = new Circulo();

        double medRaio;
        int opcao;

        System.out.println("Digite o raio do círculo: ");
        medRaio = entrada.nextDouble();

        //Fazer a interação com o objeto da classe Retangulo
        objCirc.setRaio(medRaio);
        
        //ou
        //objCirc.setRaio(entrada.nextDouble());

        do {
            System.out.println("\n1 - Calcular a área");
            System.out.println("2 - Calcular o perímetro");
            System.out.println("3 - Calcular o diâmetro");
            System.out.println("4 - Sair");
            System.out.println("\tDigite a opção desejada: ");
            opcao = entrada.nextInt();

            System.out.println("Medida do raio: " + objCirc.getRaio());

            switch (opcao) {
                case 1:
                    System.out.println("A área é: " + objCirc.calcArea());
                    break;
                case 2:
                    System.out.println("O perímetro é: " + objCirc.calcPerimetro());
                    break;
                case 3:
                    System.out.println("O diâmetro é: " + objCirc.calcDiametro());
                    break;
            }
        } while (opcao < 4);
    }
}
