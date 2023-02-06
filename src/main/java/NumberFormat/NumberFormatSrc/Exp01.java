package sayıBiçemleme;

import java.text.*;

public class Exp01 {

	public static void main(String[] args) {
		double d = -12345.6789;
		DecimalFormat nf1 = new DecimalFormat("0000E00");
		String f1 = nf1.format(d);
		System.out.println(f1);
		DecimalFormat nf2 = new DecimalFormat("0000000E0");
		String f2 = nf2.format(d);
		System.out.println(f2);
		DecimalFormat nf3 = new DecimalFormat("0.0E0");
		String f3 = nf3.format(d);
		System.out.println(f3);
		DecimalFormat nf4 = new DecimalFormat("00.00E0");
		String f4 = nf4.format(d);
		System.out.println(f4);
		DecimalFormat nf5 = new DecimalFormat("###E0");
		String f5 = nf5.format(d);
		System.out.println(f5);
	}
}
/*
-1235E01
-1234568E-2
-1,2E4
-12,35E3
-12,3E3
*/