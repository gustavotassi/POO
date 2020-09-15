/**
 *
 * @author Gustavo
 */
public class Aplic {
    public static void main(String[] args) {
        int[] tabNum;
        tabNum = new int[3];
        
        tabNum[0] = 30;
        tabNum[1] = 40;
        tabNum[2] = 50;
        
        for (int cont = 0; cont < 3; cont++) {
            System.out.println("tabNum[" + cont + "] = " + tabNum[cont]);
        }
    }
}
