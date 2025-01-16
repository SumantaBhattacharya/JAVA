import javax.swing.*;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import java.awt.*;
public class App {

    JFrame frame = new JFrame("");
    AutoCompleteDecorator decorator;
    JComboBox combobox;

    public App() {
        combobox = new JComboBox(new Object[]{"","Ester", "Jordi",
            "Jordina", "Jorge", "Sergi"});
        AutoCompleteDecorator.decorate(combobox);
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        frame.add(combobox);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        App app = new App();
    }
 }//# Compile the Java code
// javac -cp ".;..\lib\swingx-all-1.6.4.jar" App.java

// # Run the Java program
// java -cp ".;..\lib\swingx-all-1.6.4.jar" App