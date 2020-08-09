import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculatoron {
    public Calculatoron() {//create a constructor
        JFrame jf=new JFrame("CALCULATOR");//create a frame/window "constructor"
        jf.setLayout(null);//no need of layout so keep it null
        jf.setSize(400, 600);//set size
        jf.setLocation(300, 150);//set location of frame
        JLabel display=new JLabel("hello !");//label in calculator
        display.setHorizontalAlignment(SwingConstants.RIGHT);//horizontal allignment
        display.setBounds(30, 50, 330, 40);
        display.setFont(new Font("Helvetica Neue", Font.PLAIN, 40));//font size
      
        display.setOpaque(true);

        jf.add(display);
        display.setBackground(Color.ORANGE);//background color
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit after closing the calculator

    }

    public static void main(String[] args) {
        new Calculatoron();
}
}