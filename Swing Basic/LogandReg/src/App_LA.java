import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class App_LA {
    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(() -> new LoginFormGui("Login").setVisible(true));
    }
}

class CommonConstants {
    public static final Color PRIMARY_COLOR = Color.decode("#191E29");
    public static final Color SECONDARY_COLOR = Color.decode("#132046");
    public static final Color TEXT_COLOR = Color.decode("#010C38D");
}

class Form extends JFrame {
    public Form(String title) {
        super(title);
        setSize(520, 680);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        getContentPane().setBackground(CommonConstants.PRIMARY_COLOR);
    }
}

class LoginFormGui extends Form {
    public LoginFormGui(String title) {
        super(title);
        addGuiComponents();
    }

    public void addGuiComponents() {
        JLabel loginLabel = new JLabel("Login");
        add(loginLabel);
        loginLabel.setBounds(0, 0, 520, 100);
        loginLabel.setForeground(CommonConstants.TEXT_COLOR);
        loginLabel.setFont(new Font("Dialog", Font.BOLD, 30));
        loginLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel usernameLabel = new JLabel("Username");
        add(usernameLabel);
        usernameLabel.setBounds(30, 150, 400, 25);
        usernameLabel.setForeground(CommonConstants.TEXT_COLOR);
        usernameLabel.setFont(new Font("Dialog", Font.PLAIN, 18));

        JTextField usernameTextField = new JTextField();
        add(usernameTextField);
        usernameTextField.setBounds(30, 185, 400, 50);
        usernameTextField.setForeground(CommonConstants.TEXT_COLOR);
        usernameTextField.setBackground(Color.WHITE);
        usernameTextField.setFont(new Font("Dialog", Font.PLAIN, 20));

        JLabel passLabel = new JLabel("Password");
        add(passLabel);
        passLabel.setBounds(30, 335, 400, 25);
        passLabel.setForeground(CommonConstants.TEXT_COLOR);
        passLabel.setFont(new Font("Dialog", Font.PLAIN, 18));

        JPasswordField passwordField = new JPasswordField();
        add(passwordField);
        passwordField.setBounds(30, 365, 400, 50);
        passwordField.setForeground(CommonConstants.TEXT_COLOR);
        passwordField.setBackground(Color.WHITE);
        passwordField.setFont(new Font("Dialog", Font.PLAIN, 20));

        JButton loginButton = new JButton("Login");
        add(loginButton);
        loginButton.setBounds(125, 520, 250, 50);
        loginButton.setFont(new Font("Dialog", Font.PLAIN, 18));
        loginButton.setBackground(CommonConstants.TEXT_COLOR);
        loginButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        JLabel registerLabel = new JLabel("Not a User? Register Here");
        add(registerLabel);
        registerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        registerLabel.setBounds(125, 600, 250, 30);
        registerLabel.setForeground(CommonConstants.TEXT_COLOR);
        registerLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        registerLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                LoginFormGui.this.dispose();
                new RegisterFormGui("Register").setVisible(true);
            }
        });
    }
}

class RegisterFormGui extends Form {
    public RegisterFormGui(String title) {
        super(title);
        addGuiComponents();
    }

    public void addGuiComponents() {
        JLabel registerLabel = new JLabel("Register");
        add(registerLabel);
        registerLabel.setBounds(0, 0, 520, 100);
        registerLabel.setForeground(CommonConstants.TEXT_COLOR);
        registerLabel.setFont(new Font("Dialog", Font.BOLD, 30));
        registerLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel usernameLabel = new JLabel("Username");
        add(usernameLabel);
        usernameLabel.setBounds(30, 150, 400, 25);
        usernameLabel.setForeground(CommonConstants.TEXT_COLOR);
        usernameLabel.setFont(new Font("Dialog", Font.PLAIN, 18));

        JTextField usernameTextField = new JTextField();
        add(usernameTextField);
        usernameTextField.setBounds(30, 185, 400, 50);
        usernameTextField.setForeground(CommonConstants.TEXT_COLOR);
        usernameTextField.setBackground(Color.WHITE);
        usernameTextField.setFont(new Font("Dialog", Font.PLAIN, 20));

        JLabel passLabel = new JLabel("Password");
        add(passLabel);
        passLabel.setBounds(30, 255, 400, 25);
        passLabel.setForeground(CommonConstants.TEXT_COLOR);
        passLabel.setFont(new Font("Dialog", Font.PLAIN, 18));

        JPasswordField passwordField = new JPasswordField();
        add(passwordField);
        passwordField.setBounds(30, 300, 400, 50);
        passwordField.setForeground(CommonConstants.TEXT_COLOR);
        passwordField.setBackground(Color.WHITE);
        passwordField.setFont(new Font("Dialog", Font.PLAIN, 20));

        JLabel reenterPasswordLabel = new JLabel("Re-enter Password");
        add(reenterPasswordLabel);
        reenterPasswordLabel.setBounds(30, 365, 400, 25);
        reenterPasswordLabel.setForeground(CommonConstants.TEXT_COLOR);
        reenterPasswordLabel.setFont(new Font("Dialog", Font.PLAIN, 18));

        JPasswordField reenterPasswordField = new JPasswordField();
        add(reenterPasswordField);
        reenterPasswordField.setBounds(30, 395, 400, 50);
        reenterPasswordField.setForeground(CommonConstants.TEXT_COLOR);
        reenterPasswordField.setBackground(Color.WHITE);
        reenterPasswordField.setFont(new Font("Dialog", Font.PLAIN, 20));

        JButton registerButton = new JButton("Register");
        add(registerButton);
        registerButton.setBounds(125, 520, 250, 50);
        registerButton.setFont(new Font("Dialog", Font.PLAIN, 18));
        registerButton.setBackground(CommonConstants.TEXT_COLOR);
        registerButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        JLabel loginLabel = new JLabel("Have an account? Login Here");
        add(loginLabel);
        loginLabel.setHorizontalAlignment(SwingConstants.CENTER);
        loginLabel.setBounds(125, 600, 250, 30);
        loginLabel.setForeground(CommonConstants.TEXT_COLOR);
        loginLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        loginLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                RegisterFormGui.this.dispose();
                new LoginFormGui("Login").setVisible(true);
            }
        });
    }
}


