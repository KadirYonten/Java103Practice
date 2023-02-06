class DaireC {
		static int yaricap; 
		static double cevre; 
		static double alan; 
		final static double pi = 3.14;

  public static void main (String args[]) {
  	
	DaireC d = new DaireC();  // constructor
	
//		d.yaricap = 7;
		yaricap = 7;
		d.alan = pi * yaricap * yaricap; 
		d.cevre = 2 * pi * yaricap; 

		System.out.println ("Dairenin Alani : " +d.alan); 
		System.out.println ("Dairenin Cevresi is : " + d.cevre); 
	} 	
}