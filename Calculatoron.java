import javax.swing.JFrame;

public class Calculatoron {
    public Calculatoron() {
        JFrame jf=new JFrame("CALCULATOR");
        jf.setLayout(null);
        jf.setSize(500, 600);


        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new Calculatoron();
}
}