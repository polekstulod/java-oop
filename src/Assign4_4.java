import javax.swing.JOptionPane;

public class Assign4_4 {
    public static void main(String[] args) {
        int occur = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number: "));
        int min = 0, max = 0;
        for (int i = 1; i <= occur; i++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Value " + i));
            if(num > max) max = num;
            if(num < min) min = num;
        }
        JOptionPane.showMessageDialog(null, "Min value: " + min + "\nMax value: " + max);
    }
}
