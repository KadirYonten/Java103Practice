// Button

import java.awt.*;

class ButtonTest1 extends Frame {

	Label lb = new Label("Button");

	Button b1 = new Button("K�rm�z�" );
	Button b2 = new Button("Ye�il"   );
	Button b3 = new Button("Mavi"    );
	Button b4 = new Button("Beyaz"   );

	public ButtonTest1(String ad){

		super(ad);
		setLayout( new GridLayout(8,1));

		add(b1);
		add(b2);
		add(b3);
		add(b4);
	}

	public static void main(String args[]) {
		
		ButtonTest1 t = new ButtonTest1("Button");
		t.setSize(300 ,200);
		t.show();
	}
}
