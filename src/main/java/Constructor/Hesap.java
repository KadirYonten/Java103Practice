package kurucu01;
public class Hesap {
	int x;
	int y;

	public Hesap() {
		x = 10;
		y = 15;
	}

	public Hesap(int m, int n) {
		x = m;
		y = n;
	}

	public void atama(int m, int n) {
		x = m;
		y = n;
	}

	public int toplamBul() {
		int z;
		z = x + y;
		return z;
	}
}

class HesapYap {
	public static void main(String[] args) {
		Hesap h1 = new Hesap(3, 5);
		Hesap h2 = new Hesap(6, 9);
		Hesap h3 = new Hesap();
		
		System.out.println("x+y = " + h1.toplamBul());
		System.out.println("x+y = " + h2.toplamBul());
		System.out.println("x+y = " + h3.toplamBul());
		System.out.println();
		
		h3.atama(5,6);
		
		System.out.println("x+y = " + h1.toplamBul());
		System.out.println("x+y = " + h2.toplamBul());
		System.out.println("x+y = " + h3.toplamBul());
	}
}

