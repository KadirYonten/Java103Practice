/*
 * *Bu program klavyeden girilen 
karekterleri byte olarak okur,
karektere �evirir ve ekrana yazar 
 */

import java.io.* ;

public class ByteOku {

	public static void main(String[] args) throws IOException {
	byte veri[] = new byte[10];
	try{
		System.out.print(" Bir �eyler yaz ve Entere bas");
		System.in.read(veri);
		System.out.println("Girdi�iniz en �ok ilk 10 karekter:");
		for (int i=0;i<veri.length;i++){
		// Konsola yazmak i�in, girilenleri karektere d�n��t�rmeliyiz
		System.out.print((char)veri[i]);
		}
		System.out.println();
		}
		catch (IOException e)
		{
			System.out.print("Veri okunamad�");
	}

	}

}
