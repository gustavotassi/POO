
import fatec.poo.model.Cliente;
import fatec.poo.model.Vendedor;
import java.text.DecimalFormat;

/**
 *
 * @author Gustavo Tassi Souza
 */
public class Aplic {

    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        int i;
        
        Vendedor vendedor = new Vendedor(100, "Carlos Silva", 5.0);
        vendedor.addVenda(300);
        vendedor.addVenda(500);
        vendedor.addVenda(600);
        vendedor.addVenda(700);
        
        Cliente[] cliente = new Cliente[3];
        
        cliente[0] = new Cliente(111, "Amelia Souza", 1000.00);
        cliente[0].addCompra(300);
        
        cliente[1] = new Cliente(222, "Antonio Vieira", 2000.00);
        cliente[1].addCompra(500);
        cliente[1].addCompra(600);
        
        cliente[2] = new Cliente(333, "Fabio Silva", 3000.00);
        cliente[2].addCompra(700);
        
        
        System.out.println("|---- VENDEDOR ----|");
        System.out.println("Código: " + vendedor.getCodigo());
        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Taxa de comissão: " + vendedor.getTaxaComissao());
        System.out.println("Total de vendas: " + df.format(vendedor.getTotalVendas()));
        System.out.println("Comissão: " + df.format(vendedor.calcValorComissao()));
        
        for (i = 0; i < cliente.length; i++) {
            System.out.println("\n|---- CLIENTE " + (i+1) + " ----|");
            System.out.println("Código: " + cliente[i].getCodigo());
            System.out.println("Nome: " + cliente[i].getNome());
            System.out.println("Limite de crédito: " + df.format(cliente[i].getLimiteCredito()));
            System.out.println("Total de compras: " + df.format(cliente[i].getTotalCompras()));
            System.out.println("Limite disponível " + df.format(cliente[i].calcLimiteDisponivel()));
        }
    }  
}
