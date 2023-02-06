package JPrintf;

public class Jprintf04 {

	public static void main(String[] args) {
		int count = 0;
		for (int ch = 'a'; ch <= 'z'; ch++) {
			System.out.printf("      %1$4c%1$4x", ch);
			if (++count % 6 == 0) {
				System.out.printf("%n");
			}
			System.out.printf("      %1$4c%<4x", ch);
		}

	}

}
/*
a  61         a  61         b  62         b  62         c  63         c  63         d  64         d  64         e  65         e  65         f  66
f  66         g  67         g  67         h  68         h  68         i  69         i  69         j  6a         j  6a         k  6b         k  6b         l  6c
l  6c         m  6d         m  6d         n  6e         n  6e         o  6f         o  6f         p  70         p  70         q  71         q  71         r  72
r  72         s  73         s  73         t  74         t  74         u  75         u  75         v  76         v  76         w  77         w  77         x  78
x  78         y  79         y  79         z  7a         z  7a
*/