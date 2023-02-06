import java.util.Scanner;

public class InputTest2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out
					.print("Klavyeden bir metin giriniz ( çýkýþ için '!' ye basýnýz:");
			String str = scanner.nextLine();
			System.out.println("Girdiðiniz metin : " + str);
			if ("!".equalsIgnoreCase(str)) {
				System.out.println("Güle güle! ");
				break;
			}
		}
	}
}
