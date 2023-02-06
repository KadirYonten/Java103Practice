class Test {
	public static void main(String[] args) {
		// An example of overflow:
		double d = 1e308;
		System.out.print("overflow produces infinity: ");
		System.out.println(d + "*10==" + d*10);
		// An example of gradual underflow:
		d = 1e-305 * Math.PI;
		System.out.print("gradual underflow: " + d + "\n      ");
		for (int i = 0; i < 4; i++)
			System.out.print(" " + (d /= 100000));
		System.out.println();
		// An example of NaN:
		System.out.print("0.0/0.0 is Not-a-Number: ");
		d = 0.0/0.0;
		System.out.println(d);
		// An example of inexact results and rounding:
		System.out.print("inexact results with float:");
		for (int i = 0; i < 100; i++) {
			float z = 1.0f / i;
			if (z * i != 1.0f)
				System.out.print(" " + i);
		}
		System.out.println();
		// Another example of inexact results and rounding:
		System.out.print("inexact results with double:");
		for (int i = 0; i < 100; i++) {
			double z = 1.0 / i;
			if (z * i != 1.0)
				System.out.print(" " + i);
		}
		System.out.println();
		// An example of cast to integer rounding:
		System.out.print("cast to int rounds toward 0: ");
		d = 12345.6;
		System.out.println((int)d + " " + (int)(-d));
	}
}

/*
produces the output:

overflow produces infinity: 1.0e+308*10==Infinity
gradual underflow: 3.141592653589793E-305
	3.1415926535898E-310 3.141592653E-315 3.142E-320 0.0
0.0/0.0 is Not-a-Number: NaN
inexact results with float: 0 41 47 55 61 82 83 94 97
inexact results with double: 0 49 98
cast to int rounds toward 0: 12345 -12345
*/
