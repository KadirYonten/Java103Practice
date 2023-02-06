import java.text.NumberFormat;

public class FormatC {

	public static void main(String[] av) {
		double data[] = { 0, 3, 11d / 3, 2000.9876543 };
		NumberFormat form = NumberFormat.getInstance();

		//   999.99[99] bi�imine koyar
		form.setMinimumIntegerDigits(3);
		form.setMinimumFractionDigits(2);
		form.setMaximumFractionDigits(4);

		// Now print using it.
		for (int i = 0; i < data.length; i++)
			System.out.println(data[i] + "\tsay�s�n�n ��kt�s�: "
					+ form.format(data[i]));
	}
}
/*
0.0	say�s�n�n ��kt�s�: 000,00
3.0	say�s�n�n ��kt�s�: 003,00
3.6666666666666665	say�s�n�n ��kt�s�: 003,6667
2000.9876543	say�s�n�n ��kt�s�: 2.000,9877
*/