

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

//import org.w3c.dom.events.MouseEvent;

//import Constants.CommonConstants;

public class RegisterFormGui extends Form {
    // constructor
    public RegisterFormGui(String title) {
        super("Login");
        addguiComponents();
        
    }
    public void addguiComponents() {
    /* create a login level */
    JLabel RegisterLabel = new JLabel("Register");
    // add components
    add(RegisterLabel); // it has to be loginLabel; it can't be changed. It is an object. name of the component
    // configure components x and y position and width/height values relatively
    RegisterLabel.setBounds(0, 0, 520, 100);// it needs Layout management to be null.setLayout(null);
    // change the font color
    RegisterLabel.setForeground(CommonConstants.TEXT_COLOR);
    // change the font login font size
    RegisterLabel.setFont(new Font("Dialog", Font.BOLD, 30));// Dialog is a name of the font
    // Initially, the login text was on the left, but we make a change and make it the
    // login text to the center of the frame. For that
    RegisterLabel.setHorizontalAlignment(SwingConstants.CENTER);

    /* CREATE A USER NAME LABEL */
    JLabel usernameLabel = new JLabel("Username");
    add(usernameLabel);
    usernameLabel.setBounds(30, 150, 400, 25);
    usernameLabel.setForeground(CommonConstants.TEXT_COLOR);
    usernameLabel.setFont(new Font("Dialog", Font.PLAIN, 18));

    /* CREATE A USER NAME TEXT FILED */
    JTextField usernamtextfieldLabel = new JTextField();
    add(usernamtextfieldLabel);
    usernamtextfieldLabel.setBounds(30,185,400,50);
    usernamtextfieldLabel.setForeground(CommonConstants.TEXT_COLOR);
    usernamtextfieldLabel.setBackground(Color.WHITE);
    usernamtextfieldLabel.setFont(new Font("Dialog", Font.PLAIN, 20));

    // CREATE A PASSWORD LABEL
    JLabel passLabel = new JLabel("Password");
    add(passLabel);
    passLabel.setBounds(30, 255, 400, 25);
    passLabel.setForeground(CommonConstants.TEXT_COLOR);
    passLabel.setFont(new Font("Dialog", Font.PLAIN, 18));

    /* CREATE A PASSWORD TEXT FILED */
    JPasswordField passwordfieldLabel = new JPasswordField();
    add(passwordfieldLabel);
    passwordfieldLabel.setBounds(30,300,400,50);
    passwordfieldLabel.setForeground(CommonConstants.TEXT_COLOR);
    passwordfieldLabel.setBackground(Color.WHITE);
    passwordfieldLabel.setFont(new Font("Dialog", Font.PLAIN, 20));

   // RE-ENTER PASSWORD LABEL
    JLabel reenterPasswordLabel = new JLabel("Re-enter Password");
    add(reenterPasswordLabel);
    reenterPasswordLabel.setBounds(30, 365, 400, 25); // Adjusted the y-coordinate
    reenterPasswordLabel.setForeground(CommonConstants.TEXT_COLOR);
    reenterPasswordLabel.setFont(new Font("Dialog", Font.PLAIN, 18));

   /* CREATE A RE-ENTER PASSWORD TEXT FIELD */
   JPasswordField reenterPasswordFieldLabel = new JPasswordField();
   add(reenterPasswordFieldLabel);
   reenterPasswordFieldLabel.setBounds(30, 395, 400, 50); // Adjusted the y-coordinate
   reenterPasswordFieldLabel.setForeground(CommonConstants.TEXT_COLOR);
   reenterPasswordFieldLabel.setBackground(Color.WHITE);
   reenterPasswordFieldLabel.setFont(new Font("Dialog", Font.PLAIN, 20));

   /* CREATE A LOGIN BUTTON */
   JButton registerButton = new JButton("Register");
   add(registerButton);
   registerButton.setBounds(125, 520, 250, 50); // Corrected the variable name and set the bounds
   registerButton.setFont(new Font("Dialog", Font.PLAIN, 18));
  //loginButton.setHorizontalAlignment(SwingConstants.CENTER);
   registerButton.setBackground(CommonConstants.TEXT_COLOR);
   registerButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

   /* create a regester label (WHICH IS USED TO LOAD THE REGESTER GUI) */
   JLabel registerJLabel = new JLabel("Have an account? Login Here");
   add(registerJLabel);
   registerJLabel.setHorizontalAlignment(SwingConstants.CENTER);
   registerJLabel.setBounds(125,600,250,30);
   registerJLabel.setForeground(CommonConstants.TEXT_COLOR);
   registerJLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
   //registerJLabel.setFont(new Font("Dialog", Font.PLAIN, 18));

   /* ADD FUNCTIONALITY SO THAT WHEN CLICKED IT WILL LAUNCH THE LOGIN FORM */
    registerJLabel.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {
        // DISPOSE REGISTER GUI
        RegisterFormGui.this.dispose();
        // Launch the login GUI
        new LoginFormGui("Login").setVisible(true);
    }
});

   
}

    
}
