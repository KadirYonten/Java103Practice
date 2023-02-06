/*
 * Bu program kesirli sayıları Türkçe standardına göre yazar
 */

package sayıBiçemleme;

import java.text.NumberFormat;
import java.text.DecimalFormat;

public class Format04 {

	public static void main(String[] args) {
		// The . symbol indicates the decimal point
		String s;
		NumberFormat formatter = new DecimalFormat(".00");
		s = formatter.format(-.567);
		System.out.println(s);// -.57
		
		formatter = new DecimalFormat("0.00");
		s = formatter.format(-.567);
		System.out.println(s);// -0.57
		
		formatter = new DecimalFormat("#.#");
		s = formatter.format(-1234.567);
		System.out.println(s);// -1234.6
		
		formatter = new DecimalFormat("#.######");
		s = formatter.format(-1234.567); // -1234.567
		System.out.println(s);
	}
}
/*
-,57
-0,57
-1234,6
-1234,567
 */