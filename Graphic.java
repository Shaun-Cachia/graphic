import javax.swing.JFrame;
import java.awt.Color;

public class Graphic {
    static JFrame window;
    public static void main (String args[]) {
        new Graphic();
    }
    public Graphic() {
        window = new JFrame();
        window .setSize(800,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.red);
        window.setLayout(null);
        window.setVisible(true);
        window.setTitle("Niggers");
    }
}