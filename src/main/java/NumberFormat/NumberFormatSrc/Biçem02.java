//package sayýBiçemleme;
/*
* DecimalFormat() metodu 
*/
import java.text.DecimalFormat;

public class Biçem02 {
    public static void main(String[] args) {
        DecimalFormat nakýþ = new DecimalFormat("0.000");
		for (int i = 1; i <= 10; i++) {
			double sayý = 1.0 / i; 
System.out.println("1/" + i + " = " + nakýþ.format(sayý) + ", " + sayý);
        }
    }
}
/*
 * 1/1 = 1,000, 1.0
1/2 = 0,500, 0.5
1/3 = 0,333, 0.3333333333333333
1/4 = 0,250, 0.25
1/5 = 0,200, 0.2
1/6 = 0,167, 0.16666666666666666
1/7 = 0,143, 0.14285714285714285
1/8 = 0,125, 0.125
1/9 = 0,111, 0.1111111111111111
1/10 = 0,100, 0.1
*/
