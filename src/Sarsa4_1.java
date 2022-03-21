import static javax.swing.JOptionPane.*;

public class Sarsa4_1 {
    public static void main(String[] args) {
        // * Empty string that will store the triangle
        String out = "";

        // * This loop will iterate 5 times(the number of horizontal lines or rows)
        for (int i = 0; i <= 5; i++) {
            // * This loop will iterate based on what is the current value of loop above it
            for (int j = 0; j < i; j++) {
                // * Will concatenate the string "out"
                out += " * ";
            }
        // * Printing new line every iteration of loop 
        out += "\n";    
        }
        // * Creating JOptionPane MessageDialog to display the output
        showMessageDialog(null, out, "Right Angle", INFORMATION_MESSAGE);
    }
}
