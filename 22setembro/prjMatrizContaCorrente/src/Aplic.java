
import fatec.poo.model.ContaCorrente;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Caio Proença //O Gustavo não copiou então passei pra ele
 */
public class Aplic {

    public static void main(String[] args) {

        int numConta, opcao, i;
        double valSaldo, valSaque, valDepo;
        Scanner entrada = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("#,##0.00");

        ContaCorrente[] banco = new ContaCorrente[2];

        for (i = 0; i < banco.length; i++) {

            System.out.println("Digite o número da conta: ");
            numConta = entrada.nextInt();

            System.out.println("Digite o valor do saldo: ");
            valSaldo = entrada.nextDouble();

            banco[i] = new ContaCorrente(numConta, valSaldo);
        }

        do {
            System.out.println("\n 1 - Depositar");
            System.out.println("\n 2 - Sacar");
            System.out.println("\n 3 - Consultar Saldo");
            System.out.println("\n 4 - Listar Contas");
            System.out.println("\n 5 - Sair");
            System.out.print("\n\t Digite sua opção: ");
            opcao = entrada.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Digite o número da conta que deseja consultar: ");
                    numConta = entrada.nextInt();
                    i = 0;
                    while (i < banco.length && banco[i].getNumero() != numConta) {
                        i++;
                    }

                    if (i == banco.length) {
                        System.out.println("Conta não cadastrada.");
                    } else {
                        System.out.println("Digite o valor do depósito: ");
                        valDepo = entrada.nextDouble();
                        banco[i].depositar(valDepo);
                        break;
                    }
                case 2:
                    System.out.println("Digite o número da conta que deseja consultar: ");
                    numConta = entrada.nextInt();
                    i = 0;
                    while (i < banco.length && banco[i].getNumero() != numConta) {
                        i++;
                    }

                    if (i == banco.length) {
                        System.out.println("Conta não cadastrada.");
                    } else {

                        System.out.println("Digite o valor do saque: ");
                        valSaque = entrada.nextDouble();

                        if (valSaque <= banco[i].getSaldo()) {
                            banco[i].sacar(valSaque);
                        } else {
                            System.out.println("Saldo insuficiente.");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Digite o número da conta que deseja consultar: ");
                    numConta = entrada.nextInt();
                    i = 0;
                    while (i < banco.length && banco[i].getNumero() != numConta) {
                        i++;
                    }

                    if (i == banco.length) {
                        System.out.println("Conta não cadastrada.");
                    } else {
                        System.out.println("Saldo em conta: R$ " + df.format(banco[i].getSaldo()));
                    }
                    break;

                case 4:
                    System.out.println("Número  \tSaldo");
                    for (i = 0; i < banco.length; i++) {
                        System.out.println(banco[i].getNumero() + "\t\t" + df.format(banco[i].getSaldo()));
                    }
                    break;
            }
        } while (opcao < 5);
    }
}
