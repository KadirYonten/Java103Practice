//package sayýBiçemleme;
import java.text.DecimalFormat;
public class Biçem04 {
	public static void main(String[] args) {
		String s;

		DecimalFormat nakýþ = new DecimalFormat("##");
		s = nakýþ.format(-1234.567);         // -1235
		System.out.println(s);
		
		s = nakýþ.format(0);                 // 0
		System.out.println(s);
		
		s = nakýþ.format(12345);             // 12345
		System.out.println(s);
		
		nakýþ = new DecimalFormat("##00");
		s = nakýþ.format(0);                 // 00
		System.out.println(s);
	}
}

/*
-1235
0
12345
00
*/