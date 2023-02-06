class DaireDc {
		public int 		 yaricap; 
		private double 	 cevre; 
		protected double 	 alan; 
		final static double  pi = 3.14;
		
		public DaireDc(int r){	// overload yapan constructor metodu
			yaricap = r ;
			alan = pi * r * r; 
			cevre = 2 * pi * r; 			 
			};

  public static void main (String args[]) {
	DaireDc d = new DaireDc(5); 	// constructor bir nesne yaratýyor

		System.out.println ("Dairenin Alani   : " + d.alan); 
		System.out.println ("Dairenin Cevresi : " + d.cevre); 
	} 	
}
