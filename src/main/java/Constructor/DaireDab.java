/**
 *Bu s�n�f, default constructorun yaratt��� bir nesnedeki
 *anl�k de�i�kenleri anl�k metotlarla de�i�tirmektedir.
 *Anl�k de�i�kenlere her de�ir girili�inde, �ncekiler silinir. 
 */


class Daire12 {
		int yaricap; 
		double cevre; 
		double alan; 
		final static double pi = 3.14;
	
	double alanBul(int r){
		yaricap = r;
		alan = pi * yaricap * yaricap;
		return alan;
	}
	
	double cevreBul(int r){
		yaricap = r;
		cevre = 2 * pi * yaricap ;
		return cevre;
	}
	

  public static void main (String args[]) {
	Daire12 d1 = new Daire12();		// default constructor nesneyi yarat�yor
		d1.alan = d1.alanBul(7);
		d1.cevre = d1.cevreBul(7);
		System.out.println ("ilk Dairenin Alani    : " + d1.alan);
		System.out.println ("ilk Dairenin Cevresi  : " + d1.cevre);
		System.out.println ("ilk Dairenin Yaricapi : " + d1.yaricap); 
		System.out.println();
		
		d1.alan = d1.alanBul(9);
		d1.cevre = d1.cevreBul(9);		
		System.out.println ("ikinci Dairenin Alani    : " + d1.alan);
		System.out.println ("ikinci Dairenin Cevresi  : " + d1.cevre);
		System.out.println ("ikinci Dairenin Yaricapi : " + d1.yaricap); 
		System.out.println();					
	} 	
}