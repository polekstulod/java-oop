import javax.swing.JOptionPane;

public class Assign5_4 {
    public static void main(String[] args) {
        String sentence = JOptionPane.showInputDialog(null, "Enter a sentence");
        String[] arr = sentence.split(" ");
        String output = "";
        for (String string : arr) {
            int middleIndex = string.length() / 2;
            output += string.substring(0, middleIndex) + string.substring(middleIndex + 1) + string.charAt(middleIndex) + "AVA ";
        }
        JOptionPane.showMessageDialog(null, output);
    }
}
