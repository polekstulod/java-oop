import static javax.swing.JOptionPane.*;

public class Sarsa4_3 {
    public static void main(String[] args) {
        // * Creating integer prod and set the value to 1
        int prod = 1;
        // * This loop will iterate from 1 to 15
        for (int i = 1; i <= 15; i++) {
            // * This will check if the value is odd by using modulo operator and if the condition is true then the value 'i' is multiplied to 'pro
            if(i % 2 == 1){
                prod *= i;
            }             
        }
        // * Creating JOptionPane MessageDialog to display the output
        showMessageDialog(null, "Product is " + prod);
    }
}
