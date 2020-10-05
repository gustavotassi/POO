
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import java.text.DecimalFormat;

/**
 *
 * @author Gustavo
 */
public class Aplic {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");

        FuncionarioHorista funcHor = new FuncionarioHorista(1010, "Pedro Silva", "14/05/1978", 7.80);
        FuncionarioMensalista funcMen = new FuncionarioMensalista(1020, "Osmar Nogueira", "08/11/1993", 600.80);

        funcHor.setQtdeHoraTrab(200);
        funcHor.setCargo("Programador");

        System.out.println("Registro: " + funcHor.getRegistro() + " | Nome: " + funcHor.getNome() + " | Data de admissão: " + funcHor.getDtAdmissao() + " | Cargo: " + funcHor.getCargo());
        System.out.println("Salário bruto: " + df.format(funcHor.calcSalBruto()));
        System.out.println("Desconto: " + df.format(funcHor.calcDesconto()));
        System.out.println("Gratificação: " + df.format(funcHor.calcGratificacao()));
        System.out.println("Salário líquido: " + df.format(funcHor.calcSalLiquido()));

        funcMen.setNumSalMin(2);
        funcMen.setCargo("Auxiliar Administrativo");

        System.out.println("\nRegistro: " + funcMen.getRegistro() + " | Nome: " + funcMen.getNome() + " | Data de admissão: " + funcMen.getDtAdmissao() + " | Cargo: " + funcMen.getCargo());
        System.out.println("Salário bruto: " + df.format(funcMen.calcSalBruto()));
        System.out.println("Desconto: " + df.format(funcMen.calcDesconto()));
        System.out.println("Salário líquido: " + df.format(funcMen.calcSalLiquido()));
    }

}
