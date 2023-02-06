/*
 * Bu program kesirli sayıları farklı kültürlere göre yazar
 */
package sayıBiçemleme;

import java.text.NumberFormat;
import java.util.Locale;

public class Locale01 {
	public static void main(String args[]) throws Exception {

		NumberFormat numberFormat = NumberFormat.getInstance();
		numberFormat.setParseIntegerOnly(false);
		double usersNumber = 1976.0826;

		numberFormat = NumberFormat.getNumberInstance(Locale.US);
		System.out.println("ABD Gösterimi (US)        : "
				+ numberFormat.format(usersNumber));

		numberFormat = NumberFormat.getNumberInstance(Locale.FRANCE);
		System.out.println("Fransız gösterimi (FRANCE): "
				+ numberFormat.format(usersNumber));

		numberFormat = NumberFormat.getNumberInstance(Locale.GERMAN);
		System.out.println("Alman gösterimi (GERMAN)  : "
				+ numberFormat.format(usersNumber));

		NumberFormat formatter = NumberFormat.getNumberInstance(Locale.ITALY);
		try {
			String number = formatter.format(195325.75);
			System.out.println("İtalyan gösterimi (ITALY) : " + number);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

		formatter = NumberFormat.getNumberInstance(Locale.JAPAN);
		try {
			String number = formatter.format(195325.75);
			System.out.println("Japon gösterimi (JAPAN)   : " + number);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
/*
ABD Gösterimi (US)        : 1,976.083
Fransız gösterimi (FRANCE): 1 976,083
Alman gösterimi (GERMAN)  : 1.976,083
İtalyan gösterimi (ITALY) : 195.325,75
Japon gösterimi (JAPAN)   : 195,325.75
 */