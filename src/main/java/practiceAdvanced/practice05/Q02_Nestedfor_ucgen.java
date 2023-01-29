package practiceAdvanced.practice05;
  /*
Kullanıcıdan aldığınız satır sayısına göre aşağıdaki şekli yazdıran bir kod yazınız.

               *
              * *
             * * *
            * * * *
           * * * * *
 */

import java.util.Scanner;

public class Q02_Nestedfor_ucgen {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("istediginiz ücgen icin sayi giriniz");
        int satir = input.nextInt();

        for (int i = 0; i <satir ; i++) { //Satir kontrolu

            for (int bosluk = satir-i; bosluk > 1 ; bosluk--) { // 1.for bosluklar icin..
                 System.out.print(" ");
            }

            for (int yildiz=0; yildiz<=i ; yildiz++) {      //2.for yildizlar icin..
                System.out.print("* ");
            }

            System.out.println(); //distaki for da satir asagiya atlasin diye...
        }
    }
}
