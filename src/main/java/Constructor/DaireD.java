class DaireD {
		int yaricap; 
		double cevre; 
		double alan; 
		final static double pi = 3.14;
		
//		public DaireD( 	int r )
//			{
//				yaricap = r ;
//				alan = pi * r * r; 
//				cevre = 2 * pi * r; 				
//			};

  public static void main (String args[]) {
	DaireD d1 = new DaireD();
		d1.yaricap = 7;
		d1.alan  = pi * d1.yaricap * d1.yaricap ;
		d1.cevre = 2 * pi * d1.yaricap ;

		System.out.println ("Dairenin Alani    : " + d1.alan); 
		System.out.println ("Dairenin Cevresi  : " + d1.cevre); 
		System.out.println();
		
	DaireD d2 = new DaireD();
		d2.yaricap = 9;
		d2.alan  = pi * d2.yaricap * d2.yaricap ;
		d2.cevre = 2 * pi * d2.yaricap ;
		
		System.out.println ("Dairenin Alani   : " + d2.alan); 
		System.out.println ("Dairenin Cevresi : " + d2.cevre); 
				
	} 	
}