import static javax.swing.JOptionPane.*;

public class Sarsa4_4 {
    public static void main(String[] args) {
        // * This InputDialog will ask how many values to be compared
        String val = showInputDialog(null, "how many values: ");
        // * Converting from String 'val' to int 'val'
        int valInt = Integer.parseInt(val);

        // * Creating int 'min' and 'max' and set the value to 0
        int min = 0, max = 0;

        // * This loop will iterate based on the number of values in 'valInt'
        for (int i = 1; i <= valInt; i++) {
            // * Asking the value using InputDialog and store it in int 'num'
            int num = Integer.parseInt(showInputDialog(null, "Value " + i));
            // * if the value of 'num' is greater than the value of 'max' then the value of 'num' will be the new value of 'max'
            if(num > max) {
                max = num;
            }
            // * if the value of 'num' is less than the value of 'min' then the value of 'num' will be the new value of 'min'
            if(num < min) {
                min = num;
            }
        }
        // * Creating JOptionPane MessageDialog to display the output
        showMessageDialog(null, "Min value: " + min + "\nMax value: " + max);
    }
}
