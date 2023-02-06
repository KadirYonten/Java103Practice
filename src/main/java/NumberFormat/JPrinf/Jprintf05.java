package JPrintf;

public class Jprintf05 {

	public static void main(String[] a) {
		int yüzde = 85;
		System.out.printf("\n%1$d%%", yüzde);

		String str = "Çevik kurnaz tilki.";
		System.out.printf("%nThe string is:%n%s%n%1$25s", str);

	}
}

/*
85%
The string is:
Çevik kurnaz tilki.
      Çevik kurnaz tilki.
*/