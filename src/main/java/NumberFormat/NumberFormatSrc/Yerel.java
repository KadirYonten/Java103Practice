import java.text.NumberFormat;
//import java.text.DecimalFormat;
import java.util.Locale;

public class Yerel {
	public static void main(String args[]) throws Exception {
		NumberFormat numberFormat = NumberFormat.getInstance();
		numberFormat.setParseIntegerOnly(false);
		double dSay� = 9876.0123;

		numberFormat = NumberFormat.getNumberInstance(Locale.US);
		System.out.println("Yerel bi�im  (US)     : "
				+ numberFormat.format(dSay�));

		numberFormat = NumberFormat.getNumberInstance(Locale.FRANCE);
		System.out.println("Yerel bi�im   (FRANCE): "
				+ numberFormat.format(dSay�));

		numberFormat = NumberFormat.getNumberInstance(Locale.GERMAN);
		System.out.println("Yerel bi�im   (GERMAN): "
				+ numberFormat.format(dSay�));
	}
}

 