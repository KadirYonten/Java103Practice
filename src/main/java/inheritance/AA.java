package kalýtým;


// AA ‘nýn alt-sýnýfý
public class AA {
	// overloaded metot -- not overridden’den farklýdýr.
	int i, j;
	AA(int a, int b) {
		i = a;
		j = b;
	}
	// i ile j yi göster
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
		subOb.show(" k : "); // BB deki show() metodunu çaðýrýr
		subOb.show(); // AA ‘daki show() metodunu çaðýrýr
	}
}

