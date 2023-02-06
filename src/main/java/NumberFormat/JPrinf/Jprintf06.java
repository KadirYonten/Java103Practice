public class Jprintf06 {

	public static void main(String[] args) {
		int n = 123, m = 496;
		double x = 38.7, y = 49.83;
		String strA = String.format("n = %15d   m = %14o", n, m);
		String strB = String.format("n = %15x   m = %14h", n, m);

		String str1 = String.format("x = %15.0f   y = %14.3g", x, y);
		String str2 = String.format("x = %15.2f   y = %14.3E", x, y);
		String str3 = String.format("x = %15.2a   y = %14.3e", x, y);

		System.out.println(strA);
		System.out.println(strB);

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.printf( "%s\n%s\n", "Java programlamaya", "Hoþ geldiniz!" );
	}

}
/*
n =             123   m =            760
n =              7b   m =            1f0
x =              39   y =           49.8
x =           38,70   y =      4.983E+01
x =        0x1.36p5   y =      4.983e+01
Java programlamaya
Hoþ geldiniz!
 */