import javax.swing.JOptionPane;

public class Assign5_3 {
    public static void main(String[] args) {
        String sentence = JOptionPane.showInputDialog(null, "Enter a sentence");
        String[] arr = sentence.split(" ");
        int count = 0;
        for (String string : arr) {
            if(string.equalsIgnoreCase("java")) count++;
        }
        JOptionPane.showMessageDialog(null, "There are " + count + " word/s in the sentence.");
    }
}
