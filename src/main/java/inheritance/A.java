package kalýtým;

public class A {
	// overriding metot.
	int i, j;
	A(int a, int b) {
		i = a;
		j = b;
	}
	// i ile j yi yazar
	void show() {
		System.out.println("i and j: " + i + " " + j);
	}
}

class B extends A {
	int k;
	B(int a, int b, int c) {
		super(a, b);
		k = c;
		super.show();    // üst sýnýftaki show() metodunu çaðýrýr
	}

	// k ‘yý göster – A içindeki show() metodunu örter.

	void show() {
		System.out.println("k: " + k);
		super.show();    // üst sýnýftaki show() metodunu çaðýrýr
	}
}

class Override {
	public static void main(String args[]) {
		B subOb = new B(1, 2, 3);
		subOb.show(); // B ‘deki show() metodunu çaðýrýr
	}
}
