/*
 * *Bu program klavyeden girilen 
karekterleri byte olarak okur,
karektere çevirir ve ekrana yazar 
 */

import java.io.* ;

public class ByteOku {

	public static void main(String[] args) throws IOException {
	byte veri[] = new byte[10];
	try{
		System.out.print(" Bir þeyler yaz ve Entere bas");
		System.in.read(veri);
		System.out.println("Girdiðiniz en çok ilk 10 karekter:");
		for (int i=0;i<veri.length;i++){
		// Konsola yazmak için, girilenleri karektere dönüþtürmeliyiz
		System.out.print((char)veri[i]);
		}
		System.out.println();
		}
		catch (IOException e)
		{
			System.out.print("Veri okunamadý");
	}

	}

}
