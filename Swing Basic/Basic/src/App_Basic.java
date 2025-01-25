import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class App_Basic extends JFrame {
    public static void main(String[] args) throws Exception {
        //"https://static.javatpoint.com/images/swingbutton.JPG"
        //JFrame = is a GUI window to add components 
        //jdk.internal.net.http.frame
        JFrame frame = new App_Basic();  
        frame.setVisible(true);//By defaultit is said to be false. We need to set it to be true so it can be visible to the user 
        frame.setTitle("Youth Career Hub");// Setting or giving a title of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Previously, when we are pressing the cross button of the frame, it was just closing. But in the terminal it was not showing that it is closed. That means it just got hide. So what we did here is Now, if we press the cross button of the frame it gives the message that it has been closed in the terminal.
        frame.setResizable(false);//(Prevent frame from being resized)We set it false because we don't want it tochange the size of the frameBut we can move the frame through our screen
        frame.setSize(800,600);//set the width(x dimention) and height(y dimention) of the frame
        // change the background colour of the frame 
       // 1. RGB(REDGREENBLUE)(0 TO 255)
       // 2. HEX CODE 
        frame.getContentPane().setBackground(new Color(186,85,185));// this colour is an instance created by us. 
       //frame.getContentPane().setBackground(new Color(0xb97455));
        
        // set image icon of the JFrame/create a image icon
        ImageIcon image = new ImageIcon("Swing Basic\\src\\image\\logo.png");//right click copy relative path of the logo present in the image file 
        frame.setIconImage(image.getImage());//it will change the original icon frame to our custom frame.The getImage is belong to ImageIncon
        
        ImageIcon imagel = new ImageIcon("Swing Basic\\src\\image\\LR.png");
        frame.setIconImage(imagel.getImage());
        //JLabel = a GUI display area for a string of text , an image or both
        JLabel label = new JLabel();
        frame.add(label);
        label.setText("I LIKE HER EVERY POSSIBLE WAY I CAN DO<3.");
        label.setForeground(new Color(0x301934)); // Text color
        label.setIcon(new ImageIcon("Swing Basic\\src\\image\\LR.png"));
        label.setHorizontalAlignment(JLabel.LEFT); // Set the image and text to move left
        label.setVerticalAlignment(JLabel.TOP); // Set the image and text to move to the top
        label.setFont(new Font("MV Boli", Font.BOLD, 19));
    }
}
