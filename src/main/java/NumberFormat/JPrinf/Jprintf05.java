package JPrintf;

public class Jprintf05 {

	public static void main(String[] a) {
		int y�zde = 85;
		System.out.printf("\n%1$d%%", y�zde);

		String str = "�evik kurnaz tilki.";
		System.out.printf("%nThe string is:%n%s%n%1$25s", str);

	}
}

/*
85%
The string is:
�evik kurnaz tilki.
      �evik kurnaz tilki.
*/