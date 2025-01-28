package gui;

//import java.awt.Color;

import javax.swing.JFrame;

import Constants.CommonConstants;

public class Form extends JFrame {
    // CREATED A CONSTRUCTOR
    public Form(String title) {
        super(title);//set the title of the jFrame bar
        setSize(520,680);//set the size of the GUI
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);// configure GUI to end process after closing
        // set layout to null to dissable layout management
        // to place the components whatever we want 
        setLayout(null);
        //login GUI IN THE CENTER OF THE SCREEN
        //Initially, the frame was showing on the left side of the screen. So we want it on the centre of the screen
        setLocationRelativeTo(null); 

    //CREATE THE BACKGROUND COLOR OF THE GUI
              // change the background colour of the frame 
       // 1. RGB(REDGREENBLUE)(0 TO 255)
       // 2. HEX CODE 
       getContentPane().setBackground(CommonConstants.PRIMARY_COLOR);// this colour is an instance created by us. 
       //frame.getContentPane().setBackground(new Color(0xb97455));

    }

}
