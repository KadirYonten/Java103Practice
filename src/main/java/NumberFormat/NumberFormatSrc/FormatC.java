import java.text.NumberFormat;

public class FormatC {

	public static void main(String[] av) {
		double data[] = { 0, 3, 11d / 3, 2000.9876543 };
		NumberFormat form = NumberFormat.getInstance();

		//   999.99[99] biçimine koyar
		form.setMinimumIntegerDigits(3);
		form.setMinimumFractionDigits(2);
		form.setMaximumFractionDigits(4);

		// Now print using it.
		for (int i = 0; i < data.length; i++)
			System.out.println(data[i] + "\tsayýsýnýn Çýktýsý: "
					+ form.format(data[i]));
	}
}
/*
0.0	sayýsýnýn Çýktýsý: 000,00
3.0	sayýsýnýn Çýktýsý: 003,00
3.6666666666666665	sayýsýnýn Çýktýsý: 003,6667
2000.9876543	sayýsýnýn Çýktýsý: 2.000,9877
*/