package practiceAdvanced.practice05;

import java.text.DecimalFormat;

public class HesapMakinesi {

    public void toplama (int... a){
        int toplam = 0;
        for (int w:a){
            toplam += w;
        }
        System.out.println("Toplam = " + toplam);
    }

    public void fark (int a, int b){
        System.out.println("Fark = " + (a-b));
    }

    public void carpma (int... a){
        int carpim = 1;
        for (int w:a){
            carpim *= w;
        }
        System.out.println("Carpim = " + carpim);
    }

    public void bolme (double a,double b){
        if (b==0){
            System.out.println("Bölen sayi 0 olamaz");
        }else {
            System.out.println("Bölüm = "+new DecimalFormat("##.##").format(a/b));

        }
    }
}
