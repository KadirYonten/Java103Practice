package practiceAdvanced.practice05;

import java.util.Scanner;

//Kullanıcıdan aldığınız iki karakterin arasında bulunan tüm karakterleri yazdıran bir kod yazınız.
public class Q01_Ascii {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ilk karakteri giriniz");
        char ch1 = input.next().charAt(0);           // charAt(0); diyerek kullanicinin kelime girmesi durumunda bile sadece ilk harfi aliriz

        System.out.println("Ikinci karakteri giriniz");
        char ch2 = input.next().charAt(0);

        int ilk = Math.min(ch1,ch2);        // Math. Class taki min ve max metodlarini kullandik ascii degeri büyük olani önce almak icin..
        int ikinci = Math.max(ch1,ch2);

        for (int i = ilk+1; i <= ikinci; i++){      // Verilen degeri almasin diye +1 yaptik..
            System.out.println((char)i+" ");        //Type Casting yaptik yoksa index verirdi..
        }
    }
}
