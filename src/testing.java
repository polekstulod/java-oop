import javax.swing.JOptionPane;

// This program will transfer the last letter
// of a word to the beginning of the word
// and add the word "AVA" at the end of each
// word in the sentence
public class testing {
    public static void main(String args[]) {
        int index = 0, wordlen = 0, nofchar = 0;
        String sentence = "", word = "", newsent = "";
        sentence = JOptionPane.showInputDialog("Enter a sentence");
        nofchar = sentence.length();
        while (index < nofchar) {
            while (index < nofchar && sentence.charAt(index) == ' ') {
                index++;
                word = "";
            }
            while (index < nofchar && sentence.charAt(index) != ' ') {
                word += sentence.charAt(index);
                index++;
            }
            wordlen = word.length();
            newsent += word.charAt(wordlen - 1) + word.substring(0, wordlen - 1) + "AVA" + " ";
        }
        JOptionPane.showMessageDialog(null, newsent);
        System.exit(0);
    }
}