class Daire3c {
		static int yaricap; 
		static protected double cevre; 
		static private double alan; 
		final static double pi = 3.14;

  public static void main (String args[]) {
  	
//	Daire3c d = new Daire3c();  // constructor
	
		yaricap = 7;
		alan = pi * yaricap * yaricap; 
		cevre = 2 * pi * yaricap; 

		System.out.println ("Dairenin Alani      : " +alan); 
		System.out.println ("Dairenin Cevresi is : " + cevre); 
	} 	
}