import static javax.swing.JOptionPane.*;
import javax.swing.JTextArea;

public class Sarsa4_2 {
    public static void main(String[] args) {
        
        // * Creating two inputDialog and storing it on 'start' and 'end' variable
        String start = showInputDialog(null, "Starting number: ");
        String end = showInputDialog(null, "End number: ");

        // * Converting the start and end variable from String to Integer
        int startInt = Integer.parseInt(start);
        int endInt = Integer.parseInt(end);
        
        // * Creating JTextArea named 'text' and string 's' that will display on first line of 'text'
        String s = "    starting number: " + start + "\n    ending number: " + end;
        JTextArea text = new JTextArea(s);

        // * This loop will only iterate from starting value(startInt) to ending value(endInt)
        for (int i = startInt; i <= endInt; i++) {
            // * Creating long 'totalFactorial' to store the factorial
            long totalFactorial = 1;
            // * Creating String 'out' to store the solution of factorial((n)*(n-1)*...)
            String out = "= ";

            // * Loop where iterate from the value of 'i' to 1 factorial((n)*(n-1)*...) 
            for (int j = i; j > 0; j--) {
                // * every iteration will assign the value to totalFactorial
                totalFactorial *= j;
                // * Will concatenate the value to String 'out'
                out += "(" + j + ")";
            }
            // * This will add the 'totalFactorial' and 'out' every line to JTextArea 'text'
            text.append("\n    " + totalFactorial + "\t" + out);
        }
        // * Creating JOptionPane MessageDialog to display the output
        showMessageDialog(null, text);
    }
}
