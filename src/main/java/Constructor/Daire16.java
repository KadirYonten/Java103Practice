
class Daire16 {
		int yaricap; 
		double cevre; 
		double alan; 
		final static double pi = 3.14;
	
	int yaricapBul(Daire16 a){
		yaricap = a.yaricap;
		return yaricap;
	}

	double alanBul(Daire16 a){
		alan = pi * a.yaricap * a.yaricap;
		return alan;
	}
	
	double cevreBul(Daire16 a){
		cevre = 2 * pi * a.yaricap;
		return cevre;
	}

	public Daire16(int r){
		yaricap = r;
	}

  public static void main (String args[]) {
	Daire16  d1 = new Daire16(7);		// default constructor nesneyi yaratýyor

		System.out.println ("ilk Dairenin Alani    : " + d1.alanBul(d1));
		System.out.println ("ilk Dairenin Cevresi  : " + d1.cevreBul(d1));
		System.out.println ("ilk Dairenin Yaricapi : " + d1.yaricapBul(d1)); 
		System.out.println();
		

	} 	
}