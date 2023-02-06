public class Daire6 {
		private int yaricap; 
		protected double cevre; 
		public double alan; 
		final static double pi = 3.14;
		
	public Daire6(int rad){
		yaricap = rad;
		alan    = pi * rad * rad ;
		cevre   = 2 * pi * rad ;
	}

 	public static void main (String args[]) {
  		Daire c1 = new Daire6(7);	// constructor
		System.out.println("ilk Dairenin Yaricapi  : " + c1.yaricap);  		
  		System.out.println("ilk Dairenin Alani     : " + c1.alan );
  		System.out.println("ilk Dairenin Alani     : " + c1.cevre);
		System.out.println();
		
  		Daire c2 = new Daire6(9);	// constructor
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