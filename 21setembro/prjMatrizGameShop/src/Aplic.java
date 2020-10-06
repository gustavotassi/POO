
import fatec.poo.model.GameShop;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Dimas
 */
public class Aplic {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        GameShop[] matGame = new GameShop[10];

        int opcao, cont, cod, idade;
        double qtdeHor;

        for (cont = 0; cont < matGame.length; cont++) {
            System.out.println("Informe o codigo: ");
            cod = entrada.nextInt();
            System.out.println("Informe a idade: ");
            idade = entrada.nextInt();

            matGame[cont] = new GameShop(cod, idade);
        }

        do {
            System.out.println("\n\n1 - Comprar Horas");
            System.out.println("2 - Jogar");
            System.out.println("3 - Brinde");
            System.out.println("4 - Consultar Saldo de Horas");
            System.out.println("5 - Sair");
            System.out.print("\n\t Digite a opcao: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nDigite o código: ");
                    cod = entrada.nextInt();

                    cont = 0;
                    while (cont < matGame.length && matGame[cont].getCodigo() != cod) {
                        cont++;
                    }
                    if (cont < matGame.length) {
                        System.out.println("\nDigite a qtde. de horas compradas: ");
                        qtdeHor = entrada.nextDouble();
                        matGame[cont].comprar(qtdeHor);
                    } else {
                        System.out.println("\nGameShop não cadastrado");
                    }
                    break;

                case 2:
                    System.out.println("\nDigite o código: ");
                    cod = entrada.nextInt();

                    cont = 0;
                    while (cont < matGame.length && matGame[cont].getCodigo() != cod) {
                        cont++;
                    }
                    if (cont < matGame.length) {
                        System.out.println("\nDigite a qtde. de horas jogadas: ");
                        qtdeHor = entrada.nextDouble();
                        if (qtdeHor <= matGame[cont].getQtdeHoras()) {
                            matGame[cont].jogar(qtdeHor);
                        } else {
                            System.out.println("Saldo de horas insuficiente");
                        }
                    } else {
                        System.out.println("\nGameShop não cadastrado");
                    }
                    break;

                case 3:
                    System.out.println("\nDigite o código: ");
                    cod = entrada.nextInt();

                    cont = 0;
                    while (cont < matGame.length && matGame[cont].getCodigo() != cod) {
                        cont++;
                    }
                    if (cont < matGame.length) {
                        matGame[cont].brinde();
                    } else {
                        System.out.println("\nGameShop não cadastrado");
                    }
                    break;

                case 4:
                    System.out.println("\nDigite o código: ");
                    cod = entrada.nextInt();

                    cont = 0;
                    while (cont < matGame.length && matGame[cont].getCodigo() != cod) {
                        cont++;
                    }
                    if (cont < matGame.length) {
                        System.out.println("\nSaldo de horas: " + df.format(matGame[cont].getQtdeHoras()));
                    } else {
                        System.out.println("\nGameShop não cadastrado");
                    }
                    break;
            }
        } while (opcao < 5);
    }
}
