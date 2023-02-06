package sayıBiçemleme;

public class Concat01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int x = 73;
        String s, s0, s1, s2, s3, s4;
        // s0 = x;             // HATA, String tipine sayı atanamaz
        s1 = "" + x;           // 73 sayısını "73" String tipine dönüştürüyor
        System.out.println(s1);
		
        s2 = x + " yıl";  // s2 değişkenine "73 yıl" stringini  atıyor
        System.out.println(s2);
		
        s3 = "" + 7.6;      // s3 değişkenine "7.6" stringini  atıyor
        System.out.println(s3);
		
        s4 = "" + 1.0 / 7.0;  // s4 değişkenine "0.14285714285714285" stringini atıyor
        System.out.println(s4);
    }
}