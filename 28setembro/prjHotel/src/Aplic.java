
import fatec.poo.model.QuartoHotel;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author Dimas
 */
public class Aplic {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");

        QuartoHotel[] hotel = new QuartoHotel[3];

        int opcao, cont, numQuarto, rg, qtdeDias;
        double valDiaria, fatHotel;

        for (cont = 0; cont < hotel.length; cont++) {
            System.out.println("Informe o Numero do quarto: ");
            numQuarto = entrada.nextInt();
            System.out.println("Informe o valor da diaria: ");
            valDiaria = entrada.nextDouble();

            hotel[cont] = new QuartoHotel(numQuarto, valDiaria);
        }

        do {
            System.out.println("\n\n\t  Hotel Recanto do Sossego");
            System.out.println("\t1 - Consultar quarto");
            System.out.println("\t2 - Reservar Quarto");
            System.out.println("\t3 - Liberar Quarto");
            System.out.println("\t4 - Consultar Faturamento");
            System.out.println("\t5 - Sair");

            System.out.print("\t\tDigite a opção: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o numero do quarto: ");
                    numQuarto = entrada.nextInt();
                    cont = 0;
                    while (cont < hotel.length && hotel[cont].getNumQuarto() != numQuarto) {
                        cont++;
                    }
                    if (cont == hotel.length) {
                        System.out.println("Quarto não cadastrado");
                    } else if (hotel[cont].getSituacao()) {
                        System.out.println("Quarto Ocupado");
                    } else {
                        System.out.println("Quarto Livre");
                    }
                    break;

                case 2:
                    System.out.println("Informe o numero do quarto: ");
                    numQuarto = entrada.nextInt();
                    cont = 0;
                    while (cont < hotel.length && hotel[cont].getNumQuarto() != numQuarto) {
                        cont++;
                    }
                    if (cont == hotel.length) {
                        System.out.println("Quarto não cadastrado");
                    } else if (hotel[cont].getSituacao()) {
                        System.out.println("Quarto Ocupado");
                    } else {
                        System.out.println("Digite o RG: ");
                        rg = entrada.nextInt();
                        hotel[cont].reservar(rg);
                    }
                    break;
                case 3:
                    System.out.println("Informe o numero do quarto: ");
                    numQuarto = entrada.nextInt();
                    cont = 0;
                    while (cont < hotel.length && hotel[cont].getNumQuarto() != numQuarto) {
                        cont++;
                    }
                    if (cont == hotel.length) {
                        System.out.println("Quarto não cadastrado");
                    } else if (hotel[cont].getSituacao()) {
                        System.out.println("Informe a qtde. de dias: ");
                        qtdeDias = entrada.nextInt();
                        System.out.println("Valor da hospedagem: " + df.format(hotel[cont].liberar(qtdeDias)));
                    } else {
                        System.out.println("Quarto Livre");
                    }
                    break;
                case 4:
                    fatHotel = 0;
                    for (cont = 0; cont < hotel.length; cont++) {
                        fatHotel += hotel[cont].getTotalFaturado();
                    }
                    System.out.println("Faturamento do Hotel: " + df.format(fatHotel));
            }
        } while (opcao < 5);
    }
}
