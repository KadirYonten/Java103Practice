//TextArea
import java.awt.*;

public class TextAreaDemo extends Frame {

    Label lbl = new Label("Konular");
    TextArea ta = new TextArea();

    public TextAreaDemo(String ad) {
        super(ad);
        setLayout(new FlowLayout());
        add(lbl);
        add(ta);
    }

    public static void main(String[] args) {
        TextAreaDemo t = new TextAreaDemo("TextArea");
        t.setSize(300, 200);
        t.setVisible(true);
    }
}
