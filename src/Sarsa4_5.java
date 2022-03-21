import static javax.swing.JOptionPane.*;
import javax.swing.JTextArea;

public class Sarsa4_5 {
    public static void main(String[] args) {
        // * Creating JTextArea named 'txt'
        JTextArea txt = new JTextArea();
        // * These lines will add every line to 'txt'
        txt.append("Product Number\tRetail Process\n");
        txt.append("1\t\t150\n");
        txt.append("2\t\t250\n");
        txt.append("3\t\t500\n");
        txt.append("4\t\t200\n");
        txt.append("5\t\t350\n");
        txt.append("Enter the product number: ");
        txt.append("(Enter 0 to total)");
        // * The value entered will store on input and will convert from String to int then store the integer to inputInt
        String input = showInputDialog(null, txt);
        int inputInt = Integer.parseInt(input);

        // * This variable will store the total amount calculated
        int totalAmount = 0;
        // * This loop is indefinitely iterate while the value of inputInt is not 0, if inputInt is 0 it will break the loop and proceed to the next line
        while(inputInt != 0){
            // * This switch-case will check if the value of inputInt satisfies the the cases. If it is, It will ask how many product(quantity) are sold and calculate and add to 'total' by multiplying the stated amount of each product and the quantity that are sold of the product
            switch (inputInt) {
                case 1:
                    String sold1 = showInputDialog(null, "How many product 1 are sold?");
                    int sold1Int = Integer.parseInt(sold1);
                    totalAmount += 150 * sold1Int;
                    break;
                case 2:
                    String sold2 = showInputDialog(null, "How many product 2 are sold?");
                    int sold2Int = Integer.parseInt(sold2);
                    totalAmount += 250 * sold2Int;
                    break;
                case 3:
                    String sold3 = showInputDialog(null, "How many product 3 are sold?");
                    int sold3Int = Integer.parseInt(sold3);
                    totalAmount += 500 * sold3Int;
                    break;
                case 4:
                    String sold4 = showInputDialog(null, "How many product 4 are sold?");
                    int sold4Int = Integer.parseInt(sold4);
                    totalAmount += 200 * sold4Int;
                    break;
                case 5:
                    String sold5 = showInputDialog(null, "How many product 5 are sold?");
                    int sold5Int = Integer.parseInt(sold5);
                    totalAmount += 350 * sold5Int;
                    break;
                default:
                    break;
            }
            // * This will ask again the value of 'inputInt' if there still product that are sold
            input = showInputDialog(null, txt);
            inputInt = Integer.parseInt(input);
        }
        // * Creating JOptionPane to display the output
        showMessageDialog(null, "Total amount is " + totalAmount);
    }
}
