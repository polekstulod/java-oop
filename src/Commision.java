import javax.swing.JOptionPane;

public class Commision {
    public static void main(String[] args) {
        double salesFigure = 10.56;
        double doubleCommisionRate = 69.1;
        int intCommisionRate = 69;

        computeCommission(salesFigure, doubleCommisionRate);
        computeCommission(salesFigure, intCommisionRate);
    }

    public static void computeCommission(double salesFigure, double doubleCommisionRate){
        JOptionPane.showMessageDialog(null, salesFigure * doubleCommisionRate);
    }

    public static void computeCommission(double salesFigure, int intCommisionRate){
        JOptionPane.showMessageDialog(null, ((double)intCommisionRate / 100) * salesFigure);
    }
}
