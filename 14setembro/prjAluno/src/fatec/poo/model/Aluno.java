package fatec.poo.model;

/**
 *
 * @author Gustavo
 */
public class Aluno {

    private String ra;
    private double ntPrv1, ntPrv2;
    private double ntTrab1, ntTrab2;

    public void setRA(String a) {
        ra = a;
    }

    public String getRA() {
        return ra;
    }

    public void setNtPrv(int id, double nota) {
        switch (id) {
            case 1:
                ntPrv1 = nota;
                break;
            case 2:
                ntPrv2 = nota;
                break;
        }
    }

    public double getNtPrv1() {
        return ntPrv1;
    }

    public double getNtPrv2() {
        return ntPrv2;
    }

    public double calcMediaProva() {
        return (0.75 * ((ntPrv1 + (2 * ntPrv2)) / 3));
    }

    public void setNtTrab(int id, double nota) {
        switch (id) {
            case 1:
                ntTrab1 = nota;
                break;
            case 2:
                ntTrab2 = nota;
                break;
        }
    }

    public double getNtTrab1() {
        return ntTrab1;
    }

    public double getNtTrab2() {
        return ntTrab2;
    }

    public double calcMediaTrab() {
        return (0.25 * ((ntTrab1 + ntTrab2) / 2));
    }

    public double calcMediaFinal() {
        return (calcMediaTrab() + calcMediaProva());
    }
    
    public boolean isAprovado() {
        if (calcMediaFinal() >= 6) {
            return (true);
        } else {
            return (false);
        }
    }
}
