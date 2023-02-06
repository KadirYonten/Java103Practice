package B�l�m21;

public class Say�salBi�emler {
	  public static void main(String args[]) {
	    System.out.println("Farkl� bi�emlerde yaz�lm�� " + "baz� say�lar:\n");

	    System.out.printf("Farkl� tamsay� g�sterimleri: ");
	    System.out.printf("%d %(d %+d %05d\n", 3, -3, 3, 3);

	    System.out.println();

	    System.out.printf("�ntan�ml� float-say� g�sterimi: %f\n", 1234567.123);
	    System.out.printf("Y�zl�klere ayr�lm�� bi�em     : %,f\n", 1234567.123);
	    System.out.printf("Negatif float say�lar�n �ntan�ml� g�sterimi: %,f\n", -1234567.123);
	    System.out.printf("Negatif float say�lar�n () i�ine al�nmas�  : %,(f\n", -1234567.123);

	    System.out.println();

	    System.out.printf("Pozitif ve negatif say�lar�n listesi:\n");
	    System.out.printf("% ,.2f\n% ,.2f\n", 1234567.123, -1234567.123);

	  }
	}

/*
Farkl� bi�emlerde yaz�lm�� baz� say�lar:

Farkl� tamsay� g�sterimleri: 3 (3) +3 00003

�ntan�ml� float-say� g�sterimi: 1234567,123000
Y�zl�klere ayr�lm�� bi�em     : 1.234.567,123000
Negatif float say�lar�n �ntan�ml� g�sterimi: -1.234.567,123000
Negatif float say�lar�n () i�ine al�nmas�  : (1.234.567,123000)

Pozitif ve negatif say�lar�n listesi:
 1.234.567,12
-1.234.567,12

*/