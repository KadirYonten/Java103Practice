class DaireD {
		static int 		 yaricap; 
		static double 	 cevre; 
		static double 	 alan; 
		final static double  pi = 3.14;
		
		public DaireD(int r){	// overload yapan constructor metodu
			 yaricap = r ;
			};

  public static void main (String args[]) {
	DaireD d = new DaireD(5); 	// constructor bir nesne yarat�yor

		d.alan = pi * yaricap * yaricap; 
		d.cevre = 2 * pi * yaricap; 

		System.out.println ("Dairenin Alani   : " + d.alan); 
		System.out.println ("Dairenin Cevresi : " + d.cevre); 
	} 	
}
