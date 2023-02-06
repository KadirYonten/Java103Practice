class Daire4 {
		int yaricap; 
		double cevre; 
		double alan; 
		final static double pi = 3.14;
		
		public Daire4( 	int r )
			{
				yaricap = r ;
			};

  public static void main (String args[]) {
	Daire4 d = new Daire4(7);

		d.alan = pi * d.yaricap * d.yaricap; 
		d.cevre = 2 * pi * d.yaricap; 

		System.out.println ("Dairenin Alani   : " + d.alan); 
		System.out.println ("Dairenin Cevresi : " + d.cevre); 
	} 	
}