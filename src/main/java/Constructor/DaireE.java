class DaireE {
		static int yaricap; 
		static double cevre; 
		static double alan; 
		final static double pi = 3.14;
			// Constructor metodu
		public DaireE( 	int r )
			{
				this.yaricap = r ; 
			};

  public static void main (String args[]) {
	DaireE daire = new DaireE(7); //Nesne yaratýlýyor

		alan = pi * yaricap * yaricap; 
		cevre = 2 * pi * yaricap; 			

		System.out.println ("Dairenin Alani : " +daire.alan); 
		System.out.println ("Dairenin Cevresi is : " + daire.cevre); 
	} 	
}