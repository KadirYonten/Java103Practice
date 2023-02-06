class Daire15 {
		public int 		 yaricap; 
		private double 	 cevre; 
		protected double 	 alan; 
		final static double  pi = 3.14;
		
		public Daire15(int r){	// overload yapan constructor metodu
			yaricap = r ;
			alan = pi * r * r; 
			cevre = 2 * pi * r; 			 
			};

  public static void main (String args[]) {
	Daire15 d = new Daire15(7); 	// constructor bir nesne yaratýyor

		System.out.println ("Dairenin Alani   : " + d.alan); 
		System.out.println ("Dairenin Cevresi : " + d.cevre); 
	} 	
}
