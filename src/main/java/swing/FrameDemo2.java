/*
 /*
 *Yaratılan Frame sistem kaynaklarını kullanıyorsa
 * kapat düğmesine basmak yetmeyecektir.
 * Fram'i tamamen kapatmak için  WindowListener çağrılıyor
 */


// file: FrameDemo2.java
import java.awt.event.*;
import javax.swing.*;

class FrameDemo2 extends JFrame {
// Constructor:
    public FrameDemo2() {
        setTitle("İkinci Boş Frame");
        setSize(300, 200); // default size is 0,0
        setLocation(10, 200); // default is 0,0 (top left corner)
// Window Listeners
        addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent e) {
                System.exit(0);
            } //windowClosing
        });
    }

    public static void main(String[] args) {
        JFrame f = new FrameDemo2();
        f.show();
    } //main
} //class FrameDemo2

