// CheckboxGroup = RadioButtons 

import java.awt.*;

class CheckboxGroupFrameTest extends Frame {

	Label lb = new Label("CheckboxGroup = RadioButtons");

	CheckboxGroup cbg = new CheckboxGroup();

	Checkbox cb1 = new Checkbox("Kýrmýzý" , cbg , false);
	Checkbox cb2 = new Checkbox("Yeþil"   , cbg , true );
	Checkbox cb3 = new Checkbox("Mavi"    , cbg , false);
	Checkbox cb4 = new Checkbox("Beyaz"   , cbg , false);

	public CheckboxGroupFrameTest(String ad){

		super(ad);
		setLayout( new GridLayout(8 ,1));
		add(lb);
		add(cb1);
		add(cb2);
		add(cb3);
		add(cb4);
	}

	public static void main(String args[]) {
		
		CheckboxGroupFrameTest t = new CheckboxGroupFrameTest("Checkbox");
		t.setSize(300 ,200);
		t.show();
	}
}
