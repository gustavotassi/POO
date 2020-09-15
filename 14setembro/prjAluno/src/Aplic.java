
import fatec.poo.model.Aluno;
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

        //Instanciando o objeto da classe Retangulo
        Aluno objAluno = new Aluno();
        
        //Instanciando o objeto da classe DecimalFormat, para formatar números em duas casas
        DecimalFormat df = new DecimalFormat("0.0");  

        System.out.println("Digite o RA do aluno: ");
        objAluno.setRA(entrada.nextLine());

        System.out.println("Digite a nota da prova 1: ");
        objAluno.setNtPrv(1, entrada.nextDouble());

        System.out.println("Digite a nota da prova 2: ");
        objAluno.setNtPrv(2, entrada.nextDouble());

        System.out.println("Digite a nota do trabalho 1: ");
        objAluno.setNtTrab(1, entrada.nextDouble());

        System.out.println("Digite a nota do trabalho 2: ");
        objAluno.setNtTrab(2, entrada.nextDouble());

        int opcao;

        do {
            System.out.println("\n1 - Consultar provas | trabalhos");
            System.out.println("2 - Consultar média provas | trabalhos");
            System.out.println("3 - Consultar média final");
            System.out.println("4 - Sair");
            System.out.print("-> Digite a opção desejada: ");
            opcao = entrada.nextInt();

            System.out.println("\nRA: " + objAluno.getRA());

            switch (opcao) {
                case 1:
                    System.out.printf("Prova 1: %.2f | Prova 2: %.2f\n", objAluno.getNtPrv1(), objAluno.getNtPrv2());
                    System.out.printf("Trabalho 1: %.2f | Trabalho 2: %.2f\n", objAluno.getNtTrab1(), objAluno.getNtTrab2());
                    break;

                case 2:
                    System.out.printf("Média das provas: %.2f\n", objAluno.calcMediaProva());
                    System.out.printf("Média dos trabalhos: %.2f\n", objAluno.calcMediaTrab());
                    break;
                case 3:
                    System.out.println("Média final: " + df.format(objAluno.calcMediaFinal())); //deixei aqui para exemplo
                    System.out.println(objAluno.isAprovado() ? "Aprovado(a)!" : "Reprovado(a)!");
                    break;
            }
        } while (opcao < 4);
    }
}
