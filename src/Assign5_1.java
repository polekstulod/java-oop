import javax.swing.JOptionPane;

public class Assign5_1 {
    public static void main(String[] args) {
        int[] val = new int[5];

        for (int i = 0; i < 5; i++) {
            val[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number"));
        }
        int min = val[0];
        int max = val[0];

        for (int i : val) {
            min = Math.min(i, min);
            max = Math.max(i, max);
        }
        JOptionPane.showMessageDialog(null, "min: " + min + "\nmax: " + max);
    }
}
