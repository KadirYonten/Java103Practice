package Bölüm21;

public class SayýsalBiçemler {
	  public static void main(String args[]) {
	    System.out.println("Farklý biçemlerde yazýlmýþ " + "bazý sayýlar:\n");

	    System.out.printf("Farklý tamsayý gösterimleri: ");
	    System.out.printf("%d %(d %+d %05d\n", 3, -3, 3, 3);

	    System.out.println();

	    System.out.printf("Öntanýmlý float-sayý gösterimi: %f\n", 1234567.123);
	    System.out.printf("Yüzlüklere ayrýlmýþ biçem     : %,f\n", 1234567.123);
	    System.out.printf("Negatif float sayýlarýn öntanýmlý gösterimi: %,f\n", -1234567.123);
	    System.out.printf("Negatif float sayýlarýn () içine alýnmasý  : %,(f\n", -1234567.123);

	    System.out.println();

	    System.out.printf("Pozitif ve negatif sayýlarýn listesi:\n");
	    System.out.printf("% ,.2f\n% ,.2f\n", 1234567.123, -1234567.123);

	  }
	}

/*
Farklý biçemlerde yazýlmýþ bazý sayýlar:

Farklý tamsayý gösterimleri: 3 (3) +3 00003

Öntanýmlý float-sayý gösterimi: 1234567,123000
Yüzlüklere ayrýlmýþ biçem     : 1.234.567,123000
Negatif float sayýlarýn öntanýmlý gösterimi: -1.234.567,123000
Negatif float sayýlarýn () içine alýnmasý  : (1.234.567,123000)

Pozitif ve negatif sayýlarýn listesi:
 1.234.567,12
-1.234.567,12

*/