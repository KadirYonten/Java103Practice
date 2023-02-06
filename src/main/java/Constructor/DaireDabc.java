/**
 *Bu s�n�f, default constructorun yaratt��� bir nesnedeki
 *anl�k de�i�kenleri anl�k metotlarla de�i�tirmektedir.
 *Anl�k de�i�kenlere her de�er girili�inde, �ncekiler silinir. 
 *Static main metodunun static olmayan de�i�ken ve 
 *metotlara eri�ebi�lmesi i�in nesneyi kulland���na
 *dikkat ediniz.
 */


class DaireDabc {
		static int yaricap; 
		double cevre; 
		double alan; 
		final static double pi = 3.14;
	
	static int yaricapBul(int r){
		yaricap = r;
		return yaricap;
	}

	double alanBul(DaireDabc d){
		alan = pi * d.yaricap * d.yaricap;
		return alan;
	}
	
	double cevreBul(DaireDabc d){
		cevre = 2 * pi * d.yaricap;
		return cevre;
	}
	

  public static void main (String args[]) {
	DaireDabc d1 = new DaireDabc();		// default constructor nesneyi yarat�yor

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