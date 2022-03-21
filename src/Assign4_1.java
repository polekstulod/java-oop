import javax.swing.JOptionPane;

public class Assign4_1 {
    public static void main(String[] args) {
        String output = "";
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                output += " * ";
            }
        output += "\n";    
        }
        JOptionPane.showMessageDialog(null, output, "Right Angle", JOptionPane.INFORMATION_MESSAGE);
    }
}
