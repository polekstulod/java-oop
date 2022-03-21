import javax.swing.JOptionPane;

public class Assign4_3 {
    public static void main(String[] args) {
        int product = 1;
        for (int i = 1; i <= 15; i++) {
            if(i % 2 != 0) product *= i;
        }
        JOptionPane.showMessageDialog(null, "Product is " + product);
    }
}
