import static javax.swing.JOptionPane.*;
import java.util.ArrayList;

public class ArrayListsGui {
    public static void main(String[] args) {
        int arrListSize = Integer.parseInt(showInputDialog(null, "Enter ArrayLists size"));
        ArrayList <Integer> myArrLists = new ArrayList<>(arrListSize);
        for (int i = 0; i < arrListSize; i++) {
            myArrLists.add(Integer.parseInt(showInputDialog(null, "Enter a number")));
        }
        showMessageDialog(null, myArrLists);
    }
}
