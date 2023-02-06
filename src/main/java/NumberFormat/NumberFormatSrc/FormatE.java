import java.text.NumberFormat;
import java.util.Locale;

public class FormatE {
	public static void main(String args[]) throws Exception {
		NumberFormat numberFormat = NumberFormat.getInstance();
		numberFormat.setParseIntegerOnly(false);
		double dSayý = 12345.07938;

		numberFormat = NumberFormat.getNumberInstance(Locale.US);
		System.out.println("Yerel (US)    : " + numberFormat.format(dSayý));
		
		numberFormat = NumberFormat.getNumberInstance(Locale.FRANCE);
		System.out.println("Yerel (FRANCE): " + numberFormat.format(dSayý));


	}
}
/*
Yerel (US)    : 12,345.079
Yerel (FRANCE): 12 345,079
*/