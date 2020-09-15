
import fatec.poo.model.ContaCorrente;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Aplic {

    public static void main(String[] args) {
        //Instanciando o objeto da classe Scanner
        Scanner entrada = new Scanner(System.in);

        //Instanciando o objeto da classe DecimalFormat
        DecimalFormat df = new DecimalFormat("#,##0.00");

        int num, opcao;
        double valSaldo, valSaq, valDep;

        System.out.println("Digite o número da conta:");
        num = entrada.nextInt();

        System.out.println("Digite o valor do saldo inicial:");
        valSaldo = entrada.nextDouble();

        //Instanciando o objeto da classe ContaCorrente
        //Fazendo a chamada do método construtor
        ContaCorrente objConta = new ContaCorrente(num, valSaldo);

        do {
            System.out.println("\n1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar Saldo");
            System.out.println("4 - Sair");
            System.out.print("\tDigite sua opção: ");
            opcao = entrada.nextInt();

            System.out.printf("\nNúmero da conta: %d\n", objConta.getNumero());

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor do depósito:");
                    valDep = entrada.nextDouble();
                    while (valDep <= 0.0) {
                        System.out.println("\n* Você não pode depositar valores nulos ou negativos!");
                        System.out.println("Digite novamente o valor do depósito:");
                        valDep = entrada.nextDouble();
                    }
                    objConta.depositar(valDep);
                    break;
                case 2:
                    System.out.println("Digite o valor do saque:");
                    valSaq = entrada.nextDouble();
                    while (valSaq <= 0.0) {
                        System.out.println("\n* Você não pode sacar valores nulos ou negativos!");
                        System.out.println("Digite novamente o valor do saque:");
                        valSaq = entrada.nextDouble();
                    }
                    if (valSaq <= objConta.getSaldo()) {
                        objConta.sacar(valSaq);
                    } else {
                        System.out.println("\n* Saldo insuficiente!");
                    }
                    break;
                case 3:
                    System.out.printf("Valor do saldo em conta: %s\n", df.format(objConta.getSaldo()));
                    break;
            }
        } while (opcao < 4);
    }

}
