import java.text.NumberFormat;
import java.util.Locale;

public class Locale02 {
	public static void main(String args[]) throws Exception {

		NumberFormat numberFormat = NumberFormat.getInstance();
		numberFormat.setParseIntegerOnly(false);
		double dSay� = 1234.0567;

		numberFormat = NumberFormat.getNumberInstance(Locale.US);
		System.out.println("ABD G�sterimi (US)        : "
				+ numberFormat.format(dSay�));

		numberFormat = NumberFormat.getNumberInstance(Locale.FRANCE);
		System.out.println("Frans�z g�sterimi (FRANCE): "
				+ numberFormat.format(dSay�));

		numberFormat = NumberFormat.getNumberInstance(Locale.GERMAN);
		System.out.println("Alman g�sterimi (GERMAN)  : "
				+ numberFormat.format(dSay�));

		NumberFormat nak�� = NumberFormat.getNumberInstance(Locale.ITALY);

		try {
			String number = nak��.format(1234.0567);
			System.out.println("�talyan g�sterimi (ITALY) : " + number);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

		nak�� = NumberFormat.getNumberInstance(Locale.JAPAN);
		try {
			String number = nak��.format(1234.0567);
			System.out.println("Japon g�sterimi (JAPAN)   : " + number);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
