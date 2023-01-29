package practiceAdvanced.practice03;

public class Q02_Ascii_AdiniYaz {
    public static void main(String[] args) {
        //Adınızın içerdiği harfleri kullanmadan, adınızı yazdıran bir kod yazınız.
        // Adem icin..

        char ch1 = 'B'-1;
        char ch2 = 'e'-1;
        char ch3 = 'f'-1;
        char ch4 = 'l'+1;

        System.out.println(""+ch1+ch2+ch3+ch4);     //"" + toplama yapiyoruz ki concat olsun!!
    }
}
