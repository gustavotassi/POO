
import fatec.poo.model.GameShop;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Aplic {

    public static void main(String[] args) {
        //Instanciando o objeto da classe Scanner
        Scanner entrada = new Scanner(System.in);

        int codigo, idade, opcao;
        double horas;

        System.out.println("Digite o código do jogador:");
        codigo = entrada.nextInt();

        System.out.println("Digite a idade do jogador:");
        idade = entrada.nextInt();

        //Instanciando o objeto da classe GameShop
        //Fazendo a chamada do método construtor
        GameShop objGameShop = new GameShop(codigo, idade);

        do {
            System.out.println("\n1 - Comprar Horas");
            System.out.println("2 - Jogar");
            System.out.println("3 - Brinde");
            System.out.println("4 - Consultar Saldo de Horas");
            System.out.println("5 - Sair");
            System.out.print("\tDigite sua opção: ");
            opcao = entrada.nextInt();

            System.out.printf("\nCódigo do jogador: %d\n", objGameShop.getCodigo());

            switch (opcao) {
                case 1:
                    System.out.println("Digite a quantidade de horas a comprar:");
                    horas = entrada.nextDouble();
                    while (horas <= 0.0) {
                        System.out.println("\n* Você não pode comprar valores nulos ou negativos!");
                        System.out.println("Digite novamente a quantidade de horas a comprar:");
                        horas = entrada.nextDouble();
                    }
                    objGameShop.comprar(horas);
                    break;
                case 2:
                    System.out.println("Digite a quantidade de horas que deseja jogar:");
                    horas = entrada.nextDouble();
                    while (horas <= 0.0) {
                        System.out.println("\n* Você não pode jogar valores nulos ou negativos!");
                        System.out.println("Digite novamente a quantidade de horas que deseja jogar:");
                        horas = entrada.nextDouble();
                    }
                    if (horas <= objGameShop.getQtdeHoras()) {
                        objGameShop.jogar(horas);
                    } else {
                        System.out.println("\n* Saldo de horas insuficiente!");
                    }
                    break;
                case 3:
                    System.out.printf("Você brindou o jogador %d com sucesso!\n", objGameShop.getCodigo());
                    System.out.printf("Saldo de horas anterior: %.2f\n", objGameShop.getQtdeHoras());
                    objGameShop.brinde();
                    System.out.printf("Saldo de horas atual: %.2f", objGameShop.getQtdeHoras());
                    break;
                case 4:
                    System.out.printf("Saldo de horas: %.2f\n", objGameShop.getQtdeHoras());
                    break;
            }

        } while (opcao < 5);

    }

}
