class Daire3 {
		public int yaricap; 
		protected double cevre; 
		private double alan; 
		final static double pi = 3.14;

  public static void main (String args[]) {
  	
	Daire3 d = new Daire3();  // constructor
	
		d.yaricap = 7;
		d.alan = pi * d.yaricap * d.yaricap; 
		d.cevre = 2 * pi * d.yaricap; 

		System.out.println ("Dairenin Alani : " +d.alan); 
		System.out.println ("Dairenin Cevresi is : " + d.cevre); 
	} 	
}