

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

//import Constants.CommonConstants;

public class loginformgui extends Form{//we dont need to extend JFrame because form already entended with JFrame 
// constructor
    public loginformgui(String title) {
        super("Login");
        addguiComponents();
        
    }
    public void addguiComponents() {
    /* create a login level */
    JLabel loginLabel = new JLabel("Login");
    // add components
    add(loginLabel); // it has to be loginLabel; it can't be changed. It is an object. name of the component
    // configure components x and y position and width/height values relatively
    loginLabel.setBounds(0, 0, 520, 100);// it needs Layout management to be null.setLayout(null);
    // change the font color
    loginLabel.setForeground(CommonConstants.TEXT_COLOR);
    // change the font login font size
    loginLabel.setFont(new Font("Dialog", Font.BOLD, 30));// Dialog is a name of the font
    // Initially, the login text was on the left, but we make a change and make it the
    // login text to the center of the frame. For that
    loginLabel.setHorizontalAlignment(SwingConstants.CENTER);

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
    passLabel.setBounds(30, 335, 400, 25);
    passLabel.setForeground(CommonConstants.TEXT_COLOR);
    passLabel.setFont(new Font("Dialog", Font.PLAIN, 18));

    /* CREATE A PASSWORD TEXT FILED */
    JPasswordField passwordfieldLabel = new JPasswordField();
    add(passwordfieldLabel);
    passwordfieldLabel.setBounds(30,365,400,50);
    passwordfieldLabel.setForeground(CommonConstants.TEXT_COLOR);
    passwordfieldLabel.setBackground(Color.WHITE);
    passwordfieldLabel.setFont(new Font("Dialog", Font.PLAIN, 20));

   /* CREATE A LOGIN BUTTON */
   JButton loginButton = new JButton("Login");
   add(loginButton);
   loginButton.setBounds(125, 520, 250, 50); // Corrected the variable name and set the bounds
   loginButton.setFont(new Font("Dialog", Font.PLAIN, 18));
  //loginButton.setHorizontalAlignment(SwingConstants.CENTER);
   loginButton.setBackground(CommonConstants.TEXT_COLOR);
   loginButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

   /* create a regester label w(WHICH IS USED TO LOAD THE REGESTER GUI) */
   JLabel registerJLabel = new JLabel("Not a User? Register Here");
   add(registerJLabel);
   registerJLabel.setHorizontalAlignment(SwingConstants.CENTER);
   registerJLabel.setBounds(125,600,250,30);
   registerJLabel.setForeground(CommonConstants.TEXT_COLOR);
   registerJLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
   //registerJLabel.setFont(new Font("Dialog", Font.PLAIN, 18));

  /* ADD FUCTIONALITY SO THAT WHEN CLICKED IT WILL LAUNCH THE REGESTER FROM GUI */
  registerJLabel.addMouseListener(new MouseAdapter() {

    @Override
    public void mouseClicked(MouseEvent e) {
        // DISPOSE LOGIN GUI(We want whenever we click on the register button.We want it to switch from the login FORM to register form.)
        loginformgui.this.dispose();//This line was implemented because we are.clicking the register button it swiched to the Register Frame.But keep opening the login form without closing it. So it will.be a bug in our program, so we want the login page to close when we click.in the register buttons. So we are applying this line of method
        //lauch the regester gui
        new RegisterFormGui("Register").setVisible(true);


    }
    
  } );// To make text clickable we use this method

}

}
