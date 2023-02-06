			// Choice Lists 

import java.awt.*;

class ChoiceTest1 extends Frame {

	Label  lb = new Label("Hangi rengi seversiniz?");
	Choice r = new Choice();
	

	public ChoiceTest1(String ad){

		super(ad);
		setLayout( new FlowLayout());
		r.addItem("Kýrmýzý");
		r.addItem("Yeþil");
		r.addItem("Mavi");
		r.addItem("Turuncu");
		r.addItem("Turkuaz");
		r.addItem("Beyaz");
		add(r);
	}

	public static void main(String args[]) {
		
		ChoiceTest1 t = new ChoiceTest1("FlowLayout");
		t.setSize(300 ,200);
		t.show();
	}
}

