
class Daire17 {
		int yaricap; 
		double cevre; 
		double alan; 
		final static double pi = 3.14;


	public Daire17(int r){
		yaricap = r;
		alan = pi * yaricap * yaricap ;
		cevre = 2 * pi * yaricap ;
	}

  public static void main (String args[]) {
	Daire17 d1 = new Daire17(7);		// default constructor nesneyi yaratýyor

		System.out.println ("ilk Dairenin Alani    : " + d1.alan);
		System.out.println ("ilk Dairenin Cevresi  : " + d1.cevre);
		System.out.println ("ilk Dairenin Yaricapi : " + d1.yaricap); 
		System.out.println();
		

	} 	
}