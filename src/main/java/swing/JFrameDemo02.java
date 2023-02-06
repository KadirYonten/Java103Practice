
import javax.swing.JFrame;
import javax.swing.JLabel;

//import statements
//Check if window closes automatically. Otherwise add suitable code
public class JFrameDemo02 extends JFrame {

    public static void main(String args[]) {
        new JFrameDemo02();
    }

    JFrameDemo02() {
        JLabel jlbHelloWorld = new JLabel("Hello World");
        add(jlbHelloWorld);
        this.setSize(100, 100);
        // pack();
        setVisible(true);
    }
}
