
import fatec.poo.model.PessoaFisica;
import fatec.poo.model.PessoaJuridica;
import java.text.DecimalFormat;

/**
 *
 * @author Gustavo
 */
public class Aplic {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("$#,##0.00");

        PessoaFisica pesFis = new PessoaFisica("Romildo Santos", "32819937423", 2000);
        PessoaJuridica pesJus = new PessoaJuridica("Sônia Pedroso", "48981234920", 2002);

        pesFis.setBase(499.90);
        pesFis.addCompras(5000);
        pesFis.addCompras(10000);

        System.out.println("\nNome: " + pesFis.getNome() + " | CPF: " + pesFis.getCpf() + " | Ano de inscrição: " + pesFis.getAnoInscricao());
        System.out.println("Base: " + df.format(pesFis.getBase()));
        System.out.println("Total em compras: " + df.format(pesFis.getTotalCompras()));
        System.out.println("Bônus: " + df.format(pesFis.calcBonus(2019)));

        pesJus.setTaxaIncentivo(40);
        pesJus.addCompras(5000);
        pesJus.addCompras(10000);

        System.out.println("\nNome: " + pesJus.getNome() + " | CPF: " + pesJus.getCgc() + " | Ano de inscrição: " + pesJus.getAnoInscricao());
        System.out.println("Base: " + df.format(pesJus.getTaxaIncentivo()));
        System.out.println("Total em compras: " + df.format(pesFis.getTotalCompras()));
        System.out.println("Bônus: " + df.format(pesFis.calcBonus(2016)));
    }

}
