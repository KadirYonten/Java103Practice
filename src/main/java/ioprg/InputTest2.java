import java.util.Scanner;

public class InputTest2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out
					.print("Klavyeden bir metin giriniz ( ��k�� i�in '!' ye bas�n�z:");
			String str = scanner.nextLine();
			System.out.println("Girdi�iniz metin : " + str);
			if ("!".equalsIgnoreCase(str)) {
				System.out.println("G�le g�le! ");
				break;
			}
		}
	}
}
