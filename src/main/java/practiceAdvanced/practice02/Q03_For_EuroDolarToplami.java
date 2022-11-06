package practiceAdvanced.practice02;

import java.util.Arrays;

public class Q03_For_EuroDolarToplami {
    /*
    Tek bir String içerisinde verilen euro ve dolarların ayrı ayrı toplamların bulan bir kod yazınız.
    Ornek:
     String str ="$1 $12 €34 €56 $45 €78";
      dolarToplami: 58
      euroToplami: 168
     */
    public static void main(String[] args) {

        String str ="$1 $12 €34 €56 $45 €78";
        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));   // Arrays.toString (); methoduyla array i yazdiriyoruz...
        int dollarToplami = 0;
        int euroToplami = 0;

        for(String w : arr){

            if(w.contains("$")){

                dollarToplami += Integer.parseInt(w.replace("$",""));   //parseInt() ==> String degeri, Intiger değere çeivirir.

            }else {

                euroToplami += Integer.parseInt( w.replace("€",""));    //Wrapper Class ile Integer oldu  ve metodlarini kullandik.. € attik..

            }
        }

        System.out.println("dollarToplami = " + dollarToplami+"$");
        System.out.println("euroToplami = " + euroToplami+"€");



    }
}