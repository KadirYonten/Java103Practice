package Bölüm06;

public class UnaryOperatörler {

	public static void main(String[] args) {
		int sayı = 0;
        int önelArtım;
        int önelEksim;
        int sonalArtım;
        int sonalEksim;
        int pozitif;
        int negatif;
        byte bitWiseNot;
        boolean logicalNot;

        önelArtım = ++sayı;
        System.out.println("önel_Artım:  "+ önelArtım);

        önelEksim = --sayı;
        System.out.println("önel_Eksim:  "+ önelEksim);

        sonalEksim = sayı--;
        System.out.println("Sonal_Eksim:  "+ sonalEksim);

        sonalArtım = sayı++;
        System.out.println("Sonal_Artım:  "+ sonalArtım);

        System.out.println("sayı nın son değeri:  "+ sayı);

        pozitif = -sonalArtım;
        System.out.println("Pozitif:  "+ pozitif);

        negatif = +sonalArtım;
        System.out.println("Negatif:  "+ negatif);

        bitWiseNot = 0;
        bitWiseNot = (byte)(~bitWiseNot);
        System.out.println("Bitwise Not:  "+ bitWiseNot);

        logicalNot = false;
        logicalNot = !logicalNot;
        System.out.println("Logical Not:  "+ logicalNot);
	}
}