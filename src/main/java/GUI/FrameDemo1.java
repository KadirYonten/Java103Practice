
import javax.swing.*;

public class FrameDemo1 extends JFrame {

    public FrameDemo1() {
        setTitle("Boş Frame");
        setSize(300, 200); // default size is 0,0
        setLocation(10, 200); // default is 0,0 (top left corner)
    }

    public static void main(String[] args) {
        JFrame f = new FrameDemo1();
        f.show();
    }
}
