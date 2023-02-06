import java.awt.FlowLayout;
import java.awt.Font;
import java.text.Format;
import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.BoxLayout;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FormatF {
	public static void main(String args[]) throws Exception {

		JFrame frame = new JFrame("Sayý Giriþi");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Font font = new Font("SansSerif", Font.BOLD, 16);

		JLabel label;
		JFormattedTextField input;
		JPanel panel;

		BoxLayout layout = new BoxLayout(frame.getContentPane(),
				BoxLayout.Y_AXIS);
		frame.setLayout(layout);

		Format general = NumberFormat.getInstance();
		label = new JLabel("Genel/Anlýk:");
		input = new JFormattedTextField(general);
		input.setValue(79546.639);
		input.setColumns(20);
		input.setFont(font);
		panel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		panel.add(label);
		panel.add(input);
		frame.add(panel);

		frame.pack();
		frame.setVisible(true);
	}
}
