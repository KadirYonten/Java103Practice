class Daire4d {
		int yaricap; 
		double cevre; 
		double alan; 
		final static double pi = 3.14;

			// Yazdýrma metodu
		void yaz(Daire4d d){
		System.out.println ("Dairenin Yaricapi   : " + d.yaricap); 
		System.out.println ("Dairenin Alani      : " + d.alan); 
		System.out.println ("Dairenin Cevresi    : " + d.cevre); 
		System.out.println();			
		} ;

			// Constructor metodu
		public Daire4d( int r )
			{
				yaricap = r ;
				alan    = pi * r * r; 
				cevre   = 2 * pi * r; 				
			};

  public static void main (String args[]) {
	Daire4d d1 = new Daire4d(7);		// nesne yaratýlýyor
				d1.yaz(d1);
		
	Daire4d d2 = new Daire4d(9);		// nesne yaratýlýyor 
				d1.yaz(d2);
	} 	
}
