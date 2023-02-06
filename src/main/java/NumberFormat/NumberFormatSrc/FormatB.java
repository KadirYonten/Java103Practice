
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class FormatB {

	public static void main(String[] args) {
		// (.) simgesi girdi için kesir ayracýdýr
		String s;
		NumberFormat nakýþ = new DecimalFormat(".00");
		s = nakýþ.format(-.567);
		System.out.println(s);                 // -,57
		
		nakýþ = new DecimalFormat("0.00");
		s = nakýþ.format(-.567);
		System.out.println(s);                // -0,57
		
		nakýþ = new DecimalFormat("#.#");
		s = nakýþ.format(-1234.567);
		System.out.println(s);                // -1234,6
		
		nakýþ = new DecimalFormat("#.######");
		s = nakýþ.format(-1234.567);          // -1234,567
		System.out.println(s);
	}
}

/*
-,57
-0,57
-1234,6
-1234,567
*/