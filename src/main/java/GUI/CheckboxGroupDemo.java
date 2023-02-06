//RadyoDüğmeleri
import java.awt.*;

public class CheckboxGroupDemo extends Frame {
Label lbl = new Label("CheckboxGroup\'lar");
    CheckboxGroup c1 = new CheckboxGroup("Kırmızı", c1, true);
    CheckboxGroup c2 = new CheckboxGroup("Yeşil", c2, false);
    CheckboxGroup c3 = new CheckboxGroup();
    CheckboxGroup c4 = new CheckboxGroup();
    CheckboxGroup c5 = new CheckboxGroup();
    CheckboxGroup c6 = new CheckboxGroup();

    public CheckboxGroupDemo(String ad) {
        super(ad);
        setLayout(new FlowLayout());
        add(c1);
        add(c2);
        add(c3);
        add(c4);
        add(c5);
        add(c6);
    }

    public static void main(String[] args) {
        CheckboxGroupDemo cd = new CheckboxGroupDemo("CheckboxGroup");
        cd.setSize(300, 200);
        cd.setVisible(true);
    }
}

