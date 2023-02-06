/**
 *Bu sýnýf, default constructorun yarattýðý bir nesnedeki
 *anlýk deðiþkenleri anlýk metotlarla deðiþtirmektedir.
 *Anlýk deðiþkenlere her deðer giriliþinde, öncekiler silinir. 
 *Static main metodunun static olmayan deðiþken ve 
 *metotlara eriþebiþlmesi için nesneyi kullandýðýna
 *dikkat ediniz.
 */


class Daire13 {
		static int yaricap; 
		double cevre; 
		double alan; 
		final static double pi = 3.14;
	
	static int yaricapBul(int r){
		yaricap = r;
		return yaricap;
	}

	double alanBul(Daire13 d){
		alan = pi * d.yaricap * d.yaricap;
		return alan;
	}
	
	double cevreBul(Daire13 d){
		cevre = 2 * pi * d.yaricap;
		return cevre;
	}
	

  public static void main (String args[]) {
	Daire13 d1 = new Daire13();		// default constructor nesneyi yaratýyor

		yaricap  = yaricapBul(7);

		System.out.println ("ilk Dairenin Alani    : " + d1.alanBul(d1));
		System.out.println ("ilk Dairenin Cevresi  : " + d1.cevreBul(d1));
		System.out.println ("ilk Dairenin Yaricapi : " + d1.yaricap); 
		System.out.println();

		d1.yaricap  = yaricapBul(9);

		System.out.println ("ilk Dairenin Alani    : " + d1.alanBul(d1));
		System.out.println ("ilk Dairenin Cevresi  : " + d1.cevreBul(d1));
		System.out.println ("ilk Dairenin Yaricapi : " + d1.yaricap); 
		System.out.println();
	} 	
}