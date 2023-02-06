class Daire8 {
		int yaricap; 
		double cevre; 
		double alan; 
		final static double pi = 3.14;
		


  public static void main (String args[]) {
	Daire8 d1 = new Daire8();
		d1.yaricap = 7;
		d1.alan  = pi * d1.yaricap * d1.yaricap ;
		d1.cevre = 2 * pi * d1.yaricap ;

		System.out.println ("Dairenin Alani    : " + d1.alan); 
		System.out.println ("Dairenin Cevresi  : " + d1.cevre); 
		System.out.println();
		
	Daire8 d2 = new Daire8();
		d2.yaricap = 9;
		d2.alan  = pi * d2.yaricap * d2.yaricap ;
		d2.cevre = 2 * pi * d2.yaricap ;
		
		System.out.println ("Dairenin Alani   : " + d2.alan); 
		System.out.println ("Dairenin Cevresi : " + d2.cevre); 
				
	} 	
}