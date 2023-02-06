class Daire4c {
		int yaricap; 
		double cevre; 
		double alan; 
		final static double pi = 3.14;
		
			// Constructor metodu
		public Daire4c( int r )
			{
				yaricap = r ;
				alan = pi * r * r; 
				cevre = 2 * pi * r; 				
			};

  public static void main (String args[]) {
	Daire4c d1 = new Daire4c(7);		// nesne yaratýlýyor
		System.out.println ("Dairenin Alani    : " + d1.alan); 
		System.out.println ("Dairenin Cevresi  : " + d1.cevre); 
		System.out.println();
		
	Daire4c d2 = new Daire4c(9);		// nesne yaratýlýyor 

		System.out.println ("Dairenin Alani   : " + d2.alan); 
		System.out.println ("Dairenin Cevresi : " + d2.cevre); 
	} 	
}
