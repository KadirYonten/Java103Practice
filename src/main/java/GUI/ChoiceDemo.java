import java.awt.*;

public class ChoiceDemo extends Frame {
    Label lbl = new Label("Hangi yazarı beğenirsiniz? ");
    Choice  yazarlar = new Choice();

    public ChoiceDemo(String ad) {
        super(ad);
        setLayout(new FlowLayout());
        add(lbl);

        yazarlar.addItem("Yaşar Kemal");
        yazarlar.addItem("Orhan Kemal");
        yazarlar.addItem("Melih Cevdet Anday");
        yazarlar.addItem("Orhan Pamuk");
        yazarlar.addItem("İlhan Selçuk");
        yazarlar.addItem("Bekir Coşkun");
        yazarlar.addItem("Yılmaz Özdil");
        add(yazarlar);
    }

    public static void main(String[] args) {
        ChoiceDemo  c = new ChoiceDemo("Seçenekler Listesi");
        c.setSize(300, 200);
        c.setVisible(true);
    }
}