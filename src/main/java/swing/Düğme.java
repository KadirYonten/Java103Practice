package swingPrg;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Düğme {

	public static void main(String[] args){
		JFrame f = new JFrame("Başkent");
		JPanel p = new JPanel();
		JButton b = new JButton("Tıkla");

		p.add(b);			// add button to panel
		f.setContentPane(p);    // add panel to frame

		f.show();
                f.setVisible(true);
	}
}
