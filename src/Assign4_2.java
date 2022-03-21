import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Assign4_2 {
    public static void main(String[] args) {
        
        int start = Integer.parseInt(JOptionPane.showInputDialog(null, "Starting number: "));
        int end = Integer.parseInt(JOptionPane.showInputDialog(null, "End number: "));
        String s = "    starting num: " + start + "\n    ending num: " + end;
        JTextArea txt = new JTextArea(s);

        for (int i = start; i <= end; i++) {
            long total = 1;
            String num = "= ";
            for (int j = i; j > 0; j--) {
                total *= j;
                num += "(" + j + ")";
            }
            txt.append("\n    " + total + "\t" + num);
        }

        JOptionPane.showMessageDialog(null, txt);
    }
}
