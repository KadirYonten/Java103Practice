
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
	
	double cevreBul(){
		cevre = 2 * pi * a.yaricap;
		return cevre;
	}
	

  public static void main (String args[]) {
	A d1 = new A(7);		// default constructor nesneyi yaratýyor

		d1.alan  = d1.alanBul(7);
		d1.alan  = d1.alanBul(7);
		d1.cevre = d1.cevreBul(7);		
/*
		d1.alan  = d1.alanBul(7);
		d1.cevre = d1.cevreBul(7);
		System.out.println ("ilk Dairenin Alani    : " + d1.alan);
		System.out.println ("ilk Dairenin Cevresi  : " + d1.cevre);
		System.out.println ("ilk Dairenin Yaricapi : " + d1.yaricap); 
		System.out.println();
		
		d1.alan  = d1.alanBul(9);
		d1.cevre = d1.cevreBul(9);		
		System.out.println ("ikinci Dairenin Alani    : " + d1.alan);
		System.out.println ("ikinci Dairenin Cevresi  : " + d1.cevre);
		System.out.println ("ikinci Dairenin Yaricapi : " + d1.yaricap); 
		System.out.println();					
*/
	} 	
}