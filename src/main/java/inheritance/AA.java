package kal�t�m;


// AA �n�n alt-s�n�f�
public class AA {
	// overloaded metot -- not overridden�den farkl�d�r.
	int i, j;
	AA(int a, int b) {
		i = a;
		j = b;
	}
	// i ile j yi g�ster
	void show() {
		System.out.println("i ile j: " + i + " " + j);
	}
}
class BB extends AA {
	int k;
	BB(int a, int b, int c) {
		super(a, b);
		k = c;
	}
	// overload show()
	void show(String msg) {
		System.out.println(msg + k);
	}
}

class Override {
	public static void main(String args[]) {
		BB subOb = new BB(1, 2, 3);
		subOb.show(" k : "); // BB deki show() metodunu �a��r�r
		subOb.show(); // AA �daki show() metodunu �a��r�r
	}
}

