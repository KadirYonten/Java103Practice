class Daire7 {
		int yaricap; 
		double cevre; 
		double alan; 
		final static double pi = 3.14;
		
	double alanBul(){
			alan = pi * yaricap * yaricap ;
			return alan ;
		};
		
	double cevreBul(){
			return 2 * pi * yaricap ;
		};
	public Daire7(int rad){
		yaricap=rad;
	}
		
  	public static void main (String args[]) {
  		Daire7 c1 = new Daire7(7);	// constructor
		System.out.println("ilk Dairenin Yaricapi  : " + c1.yaricap);  		
  		System.out.println("ilk Dairenin Alani     : " + c1.alanBul());
  		System.out.println("ilk Dairenin Alani     : " + c1.cevreBul());
		System.out.println();
		
  		Daire7 c2 = new Daire7(9);	// constructor
		System.out.println("ikinci Dairenin Yaricapi  : " + c2.yaricap);   		
  		System.out.println("ikinci Dairenin Alani     : " + c2.alanBul());
  		System.out.println("ikinci Dairenin Cevresi   : " + c2.cevreBul());
		System.out.println();		

		System.out.println("ilk Dairenin Yaricapi  : " + c1.yaricap);  		
  		System.out.println("ilk Dairenin Alani     : " + c1.alanBul());
  		System.out.println("ilk Dairenin Alani     : " + c1.cevreBul());
		System.out.println();
				
	} 	
}