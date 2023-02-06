package sayýBiçemleme;

import java.text.NumberFormat;
import java.util.Locale;

class Format08 {

	public void numberFormat(Locale currentLocale) {
		Integer intNum = new Integer(123456789);
		Double doubleNum = new Double(1234.1234);

		String intNumOut, doubleNumOut;

		NumberFormat numberFormatter = NumberFormat
				.getNumberInstance(currentLocale);
		intNumOut = numberFormatter.format(intNum);
		doubleNumOut = numberFormatter.format(doubleNum);

		System.out.println();
		System.out.println("Integer num : " + intNumOut + "   "
				+ currentLocale.toString());

		System.out.println("Double  num : " + doubleNumOut + "   "
				+ currentLocale.toString());

	}

	public static void main(String args[]) {
		Locale[] locales = new Locale[] { new Locale("fr", "FR"),
				new Locale("de", "DE"),

				new Locale("ca", "CA"), new Locale("rs", "RS"),
				new Locale("en", "IN") };

		Format08[] formate = new Format08[locales.length];

		for (int i = 0; i < locales.length; i++) {
			formate[i] = new Format08();
			formate[i].numberFormat(locales[i]);

		}
	}
}
/*

Integer num : 123.456.789   de_DE
Double  num : 1.234,123   de_DE

Integer num : 123.456.789   ca_CA
Double  num : 1.234,123   ca_CA

Integer num : 123,456,789   rs_RS
Double  num : 1,234.123   rs_RS

Integer num : 123,456,789   en_IN
Double  num : 1,234.123   en_IN 
*/
