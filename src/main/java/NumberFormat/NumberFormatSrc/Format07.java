/*
 * *  ' simgesi literal sembolleri işaretlemek için kullanılır
 */
package sayıBiçemleme;

import java.text.DecimalFormat;

public class Format07 {

	public static void main(String[] args) {
		String s;
		DecimalFormat formatter = new DecimalFormat("'#'#");
		s = formatter.format(-1234.567); // -#1235
		System.out.println(s);
		
		formatter = new DecimalFormat("'abc'#");
		s = formatter.format(-1234.567); // -abc1235
		System.out.println(s);

		formatter = new DecimalFormat("'YTL '#");
		s = formatter.format(1234.567); // -abc1235
		System.out.println(s);

		formatter = new DecimalFormat("#' YTL'");
		s = formatter.format(1234.567); // -abc1235
		System.out.println(s);
	}
}
/*
-#1235
-abc1235
YTL 1235
1235 YTL
*/