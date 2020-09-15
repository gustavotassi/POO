
import fatec.poo.model.Retangulo;
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
        Retangulo objRet = new Retangulo();

        double medBase, medAlt;
        int opcao;

        System.out.println("Digite a altura: ");
        medAlt = entrada.nextDouble();
        System.out.println("Digite a base: ");
        medBase = entrada.nextDouble();

        //Fazer a interação com o objeto da classe Retangulo
        objRet.setAltura(medAlt);
        objRet.setBase(medBase);

        do {
            System.out.println("\n1 - Calcular a área");
            System.out.println("2 - Calcular o perímetro");
            System.out.println("3 - Calcular a diagonal");
            System.out.println("4 - Sair");
            opcao = entrada.nextInt();
            
            System.out.println("Medida da altura: " + objRet.getAltura());
            System.out.println("Medida da base: " + objRet.getBase());

            switch (opcao) {
                case 1:
                    System.out.println("A área é: " + objRet.calcArea());
                    break;
                case 2:
                    System.out.println("O perímetro é: " + objRet.calcPerimetro());
                    break;
                case 3:
                    System.out.println("A diagonal é: " + objRet.calcDiagonal());
                    break;
            }
        } while (opcao < 4);
    }
}
