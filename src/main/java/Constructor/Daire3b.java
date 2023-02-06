class Daire3b {
		static int yaricap; 
		static protected double cevre; 
		static private double alan; 
		final static double pi = 3.14;

  public static void main (String args[]) {
  	
	Daire3b d = new Daire3b();  // constructor
	
		yaricap = 7;
		alan = pi * d.yaricap * d.yaricap; 
		cevre = 2 * pi * d.yaricap; 

		System.out.println ("Dairenin Alani : " +d.alan); 
		System.out.println ("Dairenin Cevresi is : " + d.cevre); 
	} 	
}