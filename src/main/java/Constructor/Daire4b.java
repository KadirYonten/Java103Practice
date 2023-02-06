class Daire4b {
	static int yaricap; 
	static double cevre; 
	static double alan; 
	final static double pi = 3.14;

		// Constructor metodunun tanýmý
	public Daire4b( int r ){
		  yaricap = r ;
		};

  public static void main (String args[]) {

	Daire4b d1 = new Daire4b(7);	//Birinci nesneyi yaratýyor
	D1.alan    = pi * yaricap * yaricap; 
	D1.cevre   = 2 * pi * yaricap; 

	System.out.println ("ilk Dairenin Yaricapi : " + d1.yaricap); 
	System.out.println ("ilk Dairenin Alani    : " + d1.alan); 
	System.out.println ("ilk Dairenin Cevresi  : " + d1.cevre); 
	System.out.println();

	Daire4b d2 = new Daire4b(9);	//Ýkinci nesneyi yaratýyor
	d2.alan = pi * yaricap * yaricap; 
	d2.cevre = 2 * pi * yaricap; 

System.out.println ("ikinci Dairenin Yaricapi : " + d1.yaricap);
	System.out.println ("ikinci Dairenin Alani    : " + d2.alan); 
	System.out.println ("ikinci Dairenin Cevresi  : " + d2.cevre); 
	System.out.println();
		
	System.out.println ("ilk Dairenin Yaricapi : " + d1.yaricap); 
	System.out.println ("ilk Dairenin Alani    : " + d1.alan); 
	System.out.println ("ilk Dairenin Cevresi  : " + d1.cevre); 
	System.out.println();
	} 	
}

