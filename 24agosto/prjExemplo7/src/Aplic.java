/**
 *
 * @author Gustavo
 */
public class Aplic {
    public static void main(String[] args) {
        int[] tabNum;
        tabNum = new int[10];
        
        for (int cont = 0; cont < tabNum.length; cont++) {
            tabNum[cont] = (int)(Math.random() * 100);
        }
        
        for (int cont = 0; cont < tabNum.length; cont++) {
            System.out.println("tabNum[" + cont + "] = " + tabNum[cont]);
        }
    }
}
