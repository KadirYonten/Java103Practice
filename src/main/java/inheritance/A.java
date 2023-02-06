package kal�t�m;

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
		super.show();    // �st s�n�ftaki show() metodunu �a��r�r
	}

	// k �y� g�ster � A i�indeki show() metodunu �rter.

	void show() {
		System.out.println("k: " + k);
		super.show();    // �st s�n�ftaki show() metodunu �a��r�r
	}
}

class Override {
	public static void main(String args[]) {
		B subOb = new B(1, 2, 3);
		subOb.show(); // B �deki show() metodunu �a��r�r
	}
}
