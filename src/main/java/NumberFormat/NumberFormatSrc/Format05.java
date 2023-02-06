/*
 * *  Sayıyı binliklerine ayırma
 */
package sayıBiçemleme;

import java.text.NumberFormat;
import java.text.DecimalFormat;

public class Format05 {

	public static void main(String[] args) {
		String s;
		DecimalFormat formatter = new DecimalFormat("#,###,###");
		s = formatter.format(-1234.567); // -1,235
		System.out.println(s);
		s = formatter.format(-1234567.890); // -1,234,568
		System.out.println(s);
	}
}
/*
-1.235
-1.234.568
*/