import javax.swing.*;

public class Konsole02 {

    public static void main(String[] args) {
        String ad;  

        ad = JOptionPane.showInputDialog(null, "Adýnýz :");

        JOptionPane.showMessageDialog(null, "Bana güven, " + ad);
    }

}
