package JPrintf;

public class Jprintf03 {
	static int a, b, c;
	static double x, y, z;

	public static void main(String[] args) {

		double x = 47.8;
		y = 55.67;
		System.out.printf("x = %15f y = %8g", x, y);

		System.out.println();
		int a = 3;
		b = 26;
		c = 354;
		System.out.printf("a = %1$5d b = %2$5x c = %3$2o", a, b, c);

		System.out.println();
		a = 11;
		b = 121;
		c = 251;
		System.out.printf("%na = %1$-5d b = %2$-5x c = %3$-5o", a, b, c);

		System.out.println();
		a = 25;
		b = 55;
		c = 155;
		System.out.printf("a = %3$d b = %1$x c = %2$o", a, b, c);

	}
}
/*
x =       47,800000 y =  55.6700
a =     3 b =    1a c = 542

a = 11    b = 79    c = 373  
a = 155 b = 19 c = 67
 */

