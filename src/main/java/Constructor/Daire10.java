public class Daire10 {
		private int yaricap; 
		protected double cevre; 
		public double alan; 
		final static double pi = 3.14;
		
	public Daire10(int rad){
		yaricap = rad;
		alan    = pi * rad * rad ;
		cevre   = 2 * pi * rad ;
	}

 	public static void main (String args[]) {
  		Daire10 c1 = new Daire10(7);	// constructor
		System.out.println("ilk Dairenin Yaricapi  : " + c1.yaricap);  		
  		System.out.println("ilk Dairenin Alani     : " + c1.alan );
  		System.out.println("ilk Dairenin Alani     : " + c1.cevre);
		System.out.println();
		
  		Daire10 c2 = new Daire10(8);	// constructor
		System.out.println("ikinci Dairenin Yaricapi  : " + c2.yaricap);   		
  		System.out.println("ikinci Dairenin Alani     : " + c2.alan);
  		System.out.println("ikinci Dairenin Cevresi   : " + c2.cevre);
		System.out.println();		

		System.out.println("ilk Dairenin Yaricapi  : " + c1.yaricap);  		
  		System.out.println("ilk Dairenin Alani     : " + c1.alan);
  		System.out.println("ilk Dairenin Alani     : " + c1.cevre);
		System.out.println();
	} 	
}