import java.io.*;

public class DosyaOku {

	public static void main(String[] args) throws IOException {
		{
			int i;
			FileInputStream fin;
			try {
				fin = new FileInputStream(args[0]);
			} catch (FileNotFoundException exc) {
				System.out.println("Dosya bulunamadý");
				return;
			} catch (ArrayIndexOutOfBoundsException exc) {
				System.out.println("Hata: " + exc.getMessage());
				System.out.println("Kullaným: java ShowFile FileName");
				return;
			}
			// dosya bitene kadar (EOF) byte oku
			do {
				i = fin.read();
				if (i != -1)
					System.out.print((char) i);
			} while (i != -1);
			fin.close();
		}

	}

}
