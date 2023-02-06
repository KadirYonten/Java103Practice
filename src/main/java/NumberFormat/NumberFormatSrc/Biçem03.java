// package sayýBiçemleme;

import java.text.NumberFormat;
import java.text.DecimalFormat;

public class Biçem03 {
	public static void main(String[] args) {
		String s;
		NumberFormat nf1 = new DecimalFormat("000000");
		s = nf1.format(-1234.567); // -001235
		System.out.println(s);

		NumberFormat nf2 = new DecimalFormat("000000.00");
		s = nf2.format(12.34567); // 000012,35
		System.out.println(s);
	}
}

/*
-001235
000012,35
*/