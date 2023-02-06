/*
 * Bu program kesirli sayıları tamsayıya yuvarlar
 * 0 simgesi sayının bir hanesi yerine geçer.
 * Yeterince hane yoksa, 0 ların konumu 0 ile doldurulur
 */
package sayıBiçemleme;

import java.text.NumberFormat;
import java.text.DecimalFormat;

public class Format02 {
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