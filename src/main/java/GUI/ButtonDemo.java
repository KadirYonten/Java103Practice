//BottonDemo
import java.awt.*;

public class ButtonDemo extends Frame {

    Button b1 = new Button("Kırmızı");
    Button b2 = new Button("Yeşil");
    Button b3 = new Button("Mavi");

    public ButtonDemo(String ad) {
        super(ad);
        setLayout(new FlowLayout());
        add(b1);
        add(b2);
        add(b3);
    }

    public static void main(String[] args) {
        ButtonDemo bd = new ButtonDemo("Düğme");
        bd.setSize(300, 200);
        bd.setVisible(true);
    }
}