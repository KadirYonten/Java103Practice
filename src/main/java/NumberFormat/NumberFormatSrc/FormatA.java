
//package sayýBiçemleme;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class FormatA {
	public static void main(String[] args) {
		
		NumberFormat nf = new DecimalFormat("000000");
		String s = nf.format(-1234.567);     // -001235
		System.out.println(s);
	}
}
