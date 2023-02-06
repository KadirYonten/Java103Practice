// Bu program sayıları tamsayıya yuvarlar/
	# simgesi sayının bir hanesi yerine geçer.
	Sayıda yeterli hane yoksa # konumu boş kalır 
*/
import java.text.DecimalFormat;

public class Format03 {

	public static void main(String[] args) {
		String s;

		DecimalFormat formatter = new DecimalFormat("##");
		s = formatter.format(-1234.567);         // -1235
		System.out.println(s);
		
		s = formatter.format(0);                 // 0
		System.out.println(s);
		
		s = formatter.format(12345);             // 12345
		System.out.println(s);
		
		formatter = new DecimalFormat("##00");
		s = formatter.format(0);                 // 00
		System.out.println(s);
	}
}