import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Assign4_5 {
    public static void main(String[] args) {
        JTextArea txt = new JTextArea();
        txt.append("Product Number\tRetail Process\n");
        txt.append("1\t\t150\n");
        txt.append("2\t\t250\n");
        txt.append("3\t\t500\n");
        txt.append("4\t\t200\n");
        txt.append("5\t\t350\n");
        txt.append("Enter the product number: ");
        txt.append("(Enter 0 to total)");
        int input = Integer.parseInt(JOptionPane.showInputDialog(null, txt));

        int total = 0;
        while(input != 0){
            switch (input) {
                case 1:
                    int sold1 = Integer.parseInt(JOptionPane.showInputDialog(null, "How many product 1 are sold?"));
                    total += 150 * sold1;
                    break;
                case 2:
                    int sold2 = Integer.parseInt(JOptionPane.showInputDialog(null, "How many product 2 are sold?"));
                    total += 250 * sold2;
                    break;
                case 3:
                    int sold3 = Integer.parseInt(JOptionPane.showInputDialog(null, "How many product 3 are sold?"));
                    total += 500 * sold3;
                    break;
                case 4:
                    int sold4 = Integer.parseInt(JOptionPane.showInputDialog(null, "How many product 4 are sold?"));
                    total += 200 * sold4;
                    break;
                case 5:
                    int sold5 = Integer.parseInt(JOptionPane.showInputDialog(null, "How many product 5 are sold?"));
                    total += 350 * sold5;
                    break;
                default:
                    break;
            }
            input = Integer.parseInt(JOptionPane.showInputDialog(null, txt));
        }
        JOptionPane.showMessageDialog(null, "Total amount is " + total);
    }
}
