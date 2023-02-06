import javax.swing.*;
import javax.swing.JFrame;
public class HelloWorldSwing {
   public static void main(String[] args) {
      JFrame frame = new JFrame("HelloWorldSwing");
      final JLabel label = new JLabel("Hello World");
      frame.getContentPane().add(label);
      //frame.setDefaultCloseOperation(frame.EXIT_on_CLOSE);
      frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
      frame.pack();
      frame.setVisible(true);
   }
}

