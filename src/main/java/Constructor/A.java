
class A {
		int yaricap; 
		double cevre; 
		double alan; 
		final static double pi = 3.14;
	
	int yaricapBul(A a){
		yaricap = a.yaricap;
		return yaricap;
	}

	double alanBul(A a){
		alan = pi * a.yaricap * a.yaricap;
		return alan;
	}
	
	double cevreBul(A a){
		cevre = 2 * pi * a.yaricap;
		return cevre;
	}

	public A(int r){
		yaricap = r;
	}

  public static void main (String args[]) {
	A d1 = new A(7);		// default constructor nesneyi yaratýyor

		System.out.println ("ilk Dairenin Alani    : " + d1.alanBul(d1));
		System.out.println ("ilk Dairenin Cevresi  : " + d1.cevreBul(d1));
		System.out.println ("ilk Dairenin Yaricapi : " + d1.yaricapBul(d1)); 
		System.out.println();
		

	} 	
}