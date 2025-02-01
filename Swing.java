
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
public class Swing {

    public static void main(String[] args) {
        new MyFrame();
    }
}

class MyFrame extends JFrame {

    MyFrame() {
        this.setVisible(true);
        this.setTitle("Youth Career Hub");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(800, 600);
        this.getContentPane().setBackground(new Color(186, 85, 185));

        ImageIcon image = new ImageIcon("Swing Basic\\bin\\image\\logo.png");
        this.setIconImage(image.getImage());

        ImageIcon imagel = new ImageIcon("Swing Basic\\src\\image\\LR.png");
        this.setIconImage(imagel.getImage());

        JLabel label = new JLabel();
        this.add(label);
        label.setText("I LIKE HER EVERY POSSIBLE WAY I CAN DO<3.");
        label.setForeground(new Color(0x301934));
        label.setIcon(imagel);
        label.setHorizontalAlignment(JLabel.LEFT);
        label.setVerticalAlignment(JLabel.TOP);
        label.setFont(new Font("MV Boli", Font.BOLD, 19));
    }
}


