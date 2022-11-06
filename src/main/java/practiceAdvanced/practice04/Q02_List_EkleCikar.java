package practiceAdvanced.practice04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q02_List_EkleCikar {
    /*
Kullanıcdan aldığınız bir sayıyı bir list'e ekleyen,
list'ten çıkaran yada mevcut bir elementi yeni bir sayı ile güncelleyen bir kod yazınız.
 */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();     // list ad´li ArrayList olusturduk..

        while (true){       // while loop sürekli dönsün diye..While () ici dogru oldukca döner!
            System.out.println("Ekleme yapmak icin 'add'\n" +
                    "Guncelleme yapmak icin 'update'\n" +
                    "Silmek icin 'delete'\n" +
                    "Cikmak icin'quit' komutunu giriniz.");

            String option = input.next();

            if(option.equalsIgnoreCase("add")){     // Kücük büyük harfe bakmadan...
                System.out.println("Eklemek istediginz sayiyi giriniz");
                int eklenecekSayi =  input.nextInt();
                list.add(eklenecekSayi);

            }else if (option.equalsIgnoreCase("update")){
                System.out.println("Guncellemek istediginiz sayiyi giriniz");
                int guncellenecekSayi = input.nextInt();
                System.out.println("Girmek istediginiz yeni sayiyi giriniz.");
                int yeniSayi = input.nextInt();
                list.set(list.indexOf(guncellenecekSayi), yeniSayi);    //index lazim oldugu icin..

            }else if(option.equalsIgnoreCase("delete")){
                System.out.println("Silmek istediginiz sayiyi giriniz");
                int silinecekSayi = input.nextInt();
                list.remove((Integer)silinecekSayi);    // Integer yazarak type casting yaptik
                // Wrapper Class non-Primitive oldugu icin obje diye algilar..yoksa sayi int sanip onu index sanar..

            } else if (option.equalsIgnoreCase("quit")) {
                break;

            }else {
                System.out.println("Gecerli bir komut giriniz");
            }

            System.out.println(list);    // Yaptigimiz islemleri görebilmek icin list´i yazdirdik

        }
        System.out.println("Güle güle!!!");

    }
}