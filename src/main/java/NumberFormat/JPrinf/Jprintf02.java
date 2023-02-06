package JPrintf;

public class Jprintf02 {
	static int a, b, c;
	static double x, y, z;

	public static void main(String[] args) {

		x = 27.5;
		y = 33.75;
		System.out.printf("x = %f y = %g", x, y);

		System.out.println();
		a = 5;
		b = 15;
		c = 255;
		System.out.printf("a = %d b = %x c = %o", a, b, c);

		System.out.println();
		x = 27.5;
		y = 33.75;
		System.out.printf("x = %2$f y = %1$g", x, y);

		System.out.println();
		// a = 5; b = 15; c = 255;
		System.out.printf("a = %3$d b = %1$x c = %2$o", a, b, c);

	}
}
/*
x = 27,500000 y = 33.7500
a = 5 b = f c = 377
x = 33,750000 y = 27.5000
a = 255 b = 5 c = 17
*/
