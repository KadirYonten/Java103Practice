class Daire14 {
		public int 		 yaricap; 
		private double 	 cevre; 
		protected double 	 alan; 
		final static double  pi = 3.14;
		
		public Daire14(int r){	// overload yapan constructor metodu
			 yaricap = r ;
			};

  public static void main (String args[]) {
	Daire14  d = new Daire14(5); 	// constructor bir nesne yaratýyor

		d.alan  = pi * d.yaricap * d.yaricap; 
		d.cevre = 2 * pi * d.yaricap; 

		System.out.println ("Dairenin Alani   : " + d.alan); 
		System.out.println ("Dairenin Cevresi : " + d.cevre); 
	} 	
}
