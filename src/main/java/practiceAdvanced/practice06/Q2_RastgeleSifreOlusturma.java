package practiceAdvanced.practice06;

import java.util.Scanner;

public class Q2_RastgeleSifreOlusturma {
    //Kullanıcıdan aldığınız sayi kadar karakter uzunluğuna sahip
    // rastgele şifre üreten bir kod yazınız.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kac karakterli sifre istiyorsunuz");
        int karakterSayisi = input.nextInt();
        String sifre = "";
        int sayac = 0;

        String karakterler = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789 ";
        int maxIndex = karakterler.length()-1;

        while (sayac < karakterSayisi){

            int rastgeleIndex = (int) ( Math.random()*maxIndex);
            sifre += karakterler.charAt(rastgeleIndex);

            sayac++;
        }
        System.out.println("Sifre : "+ sifre);








    }
}
