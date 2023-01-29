package practiceAdvanced.practice01;

import java.util.Scanner;

public class Q02_Substring_AdSoyad {

    /*
     Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
     ad ayrı soyad ayrı sekilde ekrana yazdırınız.
     Örn:
     Ad: Ali
     Soyad: Can
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ad ve soyadınızı aralarında bir boşluk olacak şekilde giriniz.");
        String adSoyad = input.nextLine();
        String ad = adSoyad.substring(0,adSoyad.indexOf(" "));  // adSoyad adli stringi bosluk index inden parcaladik..
        String soyAd = adSoyad.substring(adSoyad.indexOf(" ")+1);

        System.out.println("Ad: "+ad);
        System.out.println("Soyad : "+soyAd);

    }
}