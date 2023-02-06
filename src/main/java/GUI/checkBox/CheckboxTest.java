// Checkbox

import java.awt.*;

class CheckboxTest extends Frame {

	Label lb = new Label("CheckBoxes");

	Checkbox cb1 = new Checkbox("Kýrmýzý" , false);
	Checkbox cb2 = new Checkbox("Yeþil"   , true );
	Checkbox cb3 = new Checkbox("Mavi"    , false);
	Checkbox cb4 = new Checkbox("Beyaz"   , false);

	public CheckboxTest(String ad){

		super(ad);
		setLayout( new GridLayout(8 ,1));
		add(lb);
		add(cb1);
		add(cb2);
		add(cb3);
		add(cb4);
	}

	public static void main(String args[]) {
		
		CheckboxTest t = new CheckboxTest("Checkbox");
		t.setSize(300 ,200);
		t.show();
	}
}
