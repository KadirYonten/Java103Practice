/**
 *Bu s�n�f farkl� iki dairenin alan ve �evrelerini 
 *bulmak i�in ayn� kodlar�
 *yinelemektedir.
 *Dolay�s�yla programc�l�kta tercih edilmez.
 *Bunu sonraki iki programda iyile�tirmeye �al��aca��z.
 */


class Daire11 {
		int yaricap; 
		double cevre; 
		double alan; 
		final static double pi = 3.14;


  public static void main (String args[]) {
	Daire11 d1 = new Daire11();		// default constructor ilk nesneyi yarat�yor
		d1.yaricap = 7;
		d1.alan  = pi * d1.yaricap * d1.yaricap ;
		d1.cevre = 2 * pi * d1.yaricap ;

		System.out.println ("ilk Dairenin Yaricapi : " + d1.yaricap); 
		System.out.println ("ilk Dairenin Alani    : " + d1.alan); 
		System.out.println ("ilk Dairenin Cevresi  : " + d1.cevre); 
		System.out.println();
		
	Daire11 d2 = new Daire11();		// default constructor ikinci nesneyi yarat�yor
		d2.yaricap = 8;
		d2.alan  = pi * d2.yaricap * d2.yaricap ;
		d2.cevre = 2 * pi * d2.yaricap ;
		
		System.out.println ("ilk Dairenin Yaricapi: " + d2.yaricap); 		
		System.out.println ("ilk Dairenin Alani   : " + d2.alan); 
		System.out.println ("ilk Dairenin Cevresi : " + d2.cevre); 
				
	} 	
}