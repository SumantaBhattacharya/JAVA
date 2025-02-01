import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Swing2 {
    JFrame window;
    JTextArea textArea;
    JScrollPane scrollPane;
    JMenuBar menuBar;
    JMenu menuFile;
    JMenu menuEdit;
    JMenu menuFormat;
    JMenu menuColor;
    JMenu menuView;
    JMenuItem iNew, iOpen;
    JMenuItem iSave;
    JMenuItem iSaveAs;
    JMenuItem iExit;

    // Constructor
    public Swing2() {
        // JFrame calling all the methods
        createWindow();
        // JTextArea calling all the methods
        createTextArea();
        createMenuBar();
        createFileMenu();
        // Add the "View" functionality
        addViewFunctionality();
        // Set custom icon
        ImageIcon image = new ImageIcon("notepad.png");
        window.setIconImage(image.getImage());
    }

    // Define the create window method
    public void createWindow() {
        window = new JFrame("Notepad Clone");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(800, 600);
        window.setLocationRelativeTo(null);
    }

    public void createTextArea() {
        textArea = new JTextArea();
        scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        window.add(scrollPane);
    }

    // create menu bar which creates the menu for our GUI
    public void createMenuBar() {
        menuBar = new JMenuBar();
        window.setJMenuBar(menuBar);

        // File menu
        menuFile = new JMenu("File");
        menuBar.add(menuFile);

        // Edit menu
        menuEdit = new JMenu("Edit");
        menuBar.add(menuEdit);

        // Format menu
        menuFormat = new JMenu("Format");
        menuBar.add(menuFormat);

        // Color menu
        menuColor = new JMenu("Color");
        menuBar.add(menuColor);

        // View menu
        menuView = new JMenu("View");
        menuBar.add(menuView);
    }

    // create menu items
    public void createFileMenu() {
        iNew = new JMenuItem("New tab");
        menuFile.add(iNew);
        iOpen = new JMenuItem("Open");
        menuFile.add(iOpen);
        iSave = new JMenuItem("Save");
        menuFile.add(iSave);
        iSaveAs = new JMenuItem("Save as");
        menuFile.add(iSaveAs);
        iExit = new JMenuItem("Exit");
        menuFile.add(iExit);

        // Add action listeners
        iNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                newFile();
            }
        });

        iExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    // Add functionality for the menu
    public void addFunctionality() {
        JMenuItem toggleFullScreenItem = new JMenuItem("Toggle");
        menuView.add(toggleFullScreenItem);

        toggleFullScreenItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toggleFullScreen();
            }
        });
    

    // Function to create a new file
    public void newFile() {
        textArea.setText(""); // erase the current text
        window.setTitle("Untitled"); // set the default name of the new file
    }

    // Function to toggle full-screen mode
    public void toggleFullScreen() {
        if (window.getExtendedState() == JFrame.MAXIMIZED_BOTH) {
            window.setExtendedState(JFrame.NORMAL);
        } else {
            window.setExtendedState(JFrame.MAXIMIZED_BOTH);
        }
    }}

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Swing2();
            }
        });
    }
}
