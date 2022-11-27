package practiceAdvanced.practice10;

public class Q04_Random_AdOlusturma {

    public static void main(String[] args) {
        //Rastgele alınan harfleri bir Stringe ekleyerek adınızı oluşturan
        // ve bunu kaç deneme ile yaptığını yazdıran bir kod yazınız.

        String alfabe = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        int maxIndx = alfabe.length();
        String isim = "adem";
        String yeniIsim = "";
        int sayac = 0;

        for (int i=0; i<isim.length(); i++){


            while (true){

                char rastgeleChar = alfabe.charAt((int)(Math.random()*maxIndx));

                sayac++;

                if (isim.charAt(i)==rastgeleChar){
                    yeniIsim += rastgeleChar;

                    break;

                }

            }
        }
        System.out.println("Yeni isim = " + yeniIsim);
        System.out.println("sayac = " + sayac);


    }
}
