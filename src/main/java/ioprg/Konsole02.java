import javax.swing.*;

public class Konsole02 {

    public static void main(String[] args) {
        String ad;  

        ad = JOptionPane.showInputDialog(null, "Ad�n�z :");

        JOptionPane.showMessageDialog(null, "Bana g�ven, " + ad);
    }

}
