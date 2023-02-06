//CheckboxDemo
import java.awt.*;

public class CheckboxDemo extends Frame {
Label lbl = new Label("Checkbox\'lar");
    Checkbox c1 = new Checkbox("Kırmızı", true);
    Checkbox c2 = new Checkbox("Yeşil", false);
    Checkbox c3 = new Checkbox("Mavi", false);
    Checkbox c4 = new Checkbox("Mavi", false);
    Checkbox c5 = new Checkbox("Mavi", false);
    Checkbox c6 = new Checkbox("Mavi", false);

    public CheckboxDemo(String ad) {
        super(ad);
        setLayout(new GridLayout());
        add(c1);
        add(c2);
        add(c3);
        add(c4);
        add(c5);
        add(c6);
    }

    public static void main(String[] args) {
        CheckboxDemo cd = new CheckboxDemo("Checkbox");
        cd.setSize(300, 200);
        cd.setVisible(true);
    }
}
