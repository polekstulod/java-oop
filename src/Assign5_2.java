import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Assign5_2 {
    public static void main(String[] args) {
        int base = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the base"));
        JTextArea text = new JTextArea("Table for base " + base + " raised from 0 - 10");
        text.append("\nPOWER\tRESULT");
        for (int i = 0; i <= 10; i++) {
            text.append("\n" + i + "\t" + (long)Math.pow(base, i));
        }

        JOptionPane.showMessageDialog(null, text);

    }
}
