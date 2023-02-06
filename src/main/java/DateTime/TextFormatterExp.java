import java.awt.BorderLayout;
import java.text.NumberFormat;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TextFormatterExp extends JFrame {

    public TextFormatterExp() {

        setTitle("My First Swing Prog.");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Number :");
        JFormattedTextField tf = new JFormattedTextField(NumberFormat
                .getIntegerInstance());

        tf.setColumns(10);
        panel.add(label);
        panel.add(tf);
        JButton button = new JButton();
        button.setLabel("Click Me");
        panel.add(button);
        getContentPane().add(panel, BorderLayout.SOUTH);
        pack();
    }
    public static void main(String[] args) {
        TextFormatterExp tfe = new TextFormatterExp();
        tfe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tfe.setVisible(true);
    }
}