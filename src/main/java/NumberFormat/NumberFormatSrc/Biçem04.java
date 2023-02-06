//package say�Bi�emleme;
import java.text.DecimalFormat;
public class Bi�em04 {
	public static void main(String[] args) {
		String s;

		DecimalFormat nak�� = new DecimalFormat("##");
		s = nak��.format(-1234.567);         // -1235
		System.out.println(s);
		
		s = nak��.format(0);                 // 0
		System.out.println(s);
		
		s = nak��.format(12345);             // 12345
		System.out.println(s);
		
		nak�� = new DecimalFormat("##00");
		s = nak��.format(0);                 // 00
		System.out.println(s);
	}
}

/*
-1235
0
12345
00
*/