import java.text.NumberFormat;
import java.util.Locale;

public class Locale02 {
	public static void main(String args[]) throws Exception {

		NumberFormat numberFormat = NumberFormat.getInstance();
		numberFormat.setParseIntegerOnly(false);
		double dSayý = 1234.0567;

		numberFormat = NumberFormat.getNumberInstance(Locale.US);
		System.out.println("ABD Gösterimi (US)        : "
				+ numberFormat.format(dSayý));

		numberFormat = NumberFormat.getNumberInstance(Locale.FRANCE);
		System.out.println("Fransýz gösterimi (FRANCE): "
				+ numberFormat.format(dSayý));

		numberFormat = NumberFormat.getNumberInstance(Locale.GERMAN);
		System.out.println("Alman gösterimi (GERMAN)  : "
				+ numberFormat.format(dSayý));

		NumberFormat nakýþ = NumberFormat.getNumberInstance(Locale.ITALY);

		try {
			String number = nakýþ.format(1234.0567);
			System.out.println("Ýtalyan gösterimi (ITALY) : " + number);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

		nakýþ = NumberFormat.getNumberInstance(Locale.JAPAN);
		try {
			String number = nakýþ.format(1234.0567);
			System.out.println("Japon gösterimi (JAPAN)   : " + number);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
