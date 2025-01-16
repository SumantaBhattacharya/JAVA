import javax.swing.*;

import java.awt.*;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;


public class APPL extends JFrame {

    public APPL() {
        // Set the title of the window
        this.setTitle("Testing");

        // Create a panel to hold the components
        JPanel pan = new JPanel();

        // Create a text field for input
        JTextField test = new JTextField();
        test.setColumns(20);

        // Create an array of options to autocomplete from
        String[] data = {"one", "two", "three", "four"};

        // Create a list of options from the array
        JList<String> dataList = new JList<>(data);

        // Decorate the text field with autocomplete functionality based on the list of options
        AutoCompleteDecorator.decorate(dataList, test);

        // Add the text field to the panel
        pan.add(test);

        // Set the content pane of the window to be the panel
        this.setContentPane(pan);

        // Set the default close operation to exit when the window is closed
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the window visible and set its size
        this.setVisible(true);
        this.setBounds(280, 150, 500, 200);
    }

    public static void main(String[] args) {
        // Create a new instance of the GUI
        APPL app = new APPL();
    }//http://www.java2s.com/Code/Jar/s/Downloadswingxall164jar.htm
}
/* The default runner will not work Instead, use this in the terminal
 # Compile the Java code
javac -cp ".;..\lib\swingx-all-1.6.4.jar" APPL.java

# Run the Java program
java -cp ".;..\lib\swingx-all-1.6.4.jar" APPL
 */
