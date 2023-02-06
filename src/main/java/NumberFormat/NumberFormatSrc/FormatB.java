
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class FormatB {

	public static void main(String[] args) {
		// (.) simgesi girdi i�in kesir ayrac�d�r
		String s;
		NumberFormat nak�� = new DecimalFormat(".00");
		s = nak��.format(-.567);
		System.out.println(s);                 // -,57
		
		nak�� = new DecimalFormat("0.00");
		s = nak��.format(-.567);
		System.out.println(s);                // -0,57
		
		nak�� = new DecimalFormat("#.#");
		s = nak��.format(-1234.567);
		System.out.println(s);                // -1234,6
		
		nak�� = new DecimalFormat("#.######");
		s = nak��.format(-1234.567);          // -1234,567
		System.out.println(s);
	}
}

/*
-,57
-0,57
-1234,6
-1234,567
*/