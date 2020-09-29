
import fatec.poo.model.FuncionarioHorista;
import java.text.DecimalFormat;

/**
 *
 * @author Gustavo
 */
public class Aplic {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        FuncionarioHorista funcHor = new FuncionarioHorista(1010, "Pedro Silva", "14/05/1978", 15.80);
        
        funcHor.setQtdeHoraTrab(200);
        
        System.out.println("Salário bruto: " + df.format(funcHor.calcSalBruto()));
        System.out.println("Desconto: " + df.format(funcHor.calcDesconto()));
        System.out.println("Salário líquido: " + df.format(funcHor.calcSalLiquido()));
    }
    
}
