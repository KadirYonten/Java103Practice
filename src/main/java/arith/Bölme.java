package Bölüm06;

public class Bölme {

	public static void main(String[] args) {
        int x, y, isonuç ;
        float fsonuç ;
        double dsonuç;
        
        x = 7;
        y = 5;
        
        isonuç = x/y;
        System.out.println("x / y = " + isonuç );

        fsonuç = (float) x / y;
        System.out.println("x / y = " + fsonuç );
        fsonuç = x / (float) y;
        System.out.println("x / y = " + fsonuç );
        fsonuç = (float)x / (float) y;
        System.out.println("x / y = " + fsonuç );
        
        dsonuç = (double)x/y;
        System.out.println("x / y = " + dsonuç );
        dsonuç = x/(double)y;
        System.out.println("x / y = " + dsonuç );
        dsonuç = x/(double)y;
        System.out.println("x / y = " + dsonuç );
	}
}
