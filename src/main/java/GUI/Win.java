import java.awt.*;
import java.awt.event.*;

public class Win extends Frame implements WindowListener, ActionListener {
	Button b;

	public Win() {
		setLayout(new FlowLayout());
		addWindowListener(this);
		setSize(300,300);
		b = new Button("ok");
		b.addActionListener(this);
		add(b);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent evt){
		dispose();
	}

	public void windowClosing(WindowEvent e) {
		dispose();
	}
	public void windowActivated(WindowEvent e) {
	}
	public void windowClosed(WindowEvent e) {
	}
	public void windowDeactivated(WindowEvent e) {
	}
	public void windowDeiconified(WindowEvent e) {
	}
	public void windowIconified(WindowEvent e) {
	}
	public void windowOpened(WindowEvent e) {
	}

	public static void main(String[] args){
		Frame x = new Win();
	}

}
