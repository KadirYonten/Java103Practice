/*
 * *  ; simgesi negatif sayıların nasıl gösterileceğini belirler
 */
package sayıBiçemleme;

import java.text.DecimalFormat;

public class Format06 {

	public static void main(String[] args) {
		String s;
		DecimalFormat formatter = new DecimalFormat("#;(#)");
		s = formatter.format(-1234.567); // (1235)
		System.out.println(s);

	}
}