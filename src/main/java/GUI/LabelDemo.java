//Label 
import java.awt.*;

public class LabelDemo extends Frame {

    Label ptr1 = new Label("Bu bir Labeldir.");
public LabelDemo(String ad){
    super(ad);
    add(ptr1);
}

    public static void main(String[] args) {
        LabelDemo ld = new LabelDemo("Label");
        ld.setSize(300, 200);
        ld.setVisible(true);
    }
}
