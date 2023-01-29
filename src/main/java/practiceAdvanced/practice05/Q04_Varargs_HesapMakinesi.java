package practiceAdvanced.practice05;

public class Q04_Varargs_HesapMakinesi {
    //Temel 4 matematik işlemi yapan bir kod yazınız.
    public static void main(String[] args) {

        HesapMakinesi hesapMakinesi = new HesapMakinesi();
        hesapMakinesi.toplama(1,4,6,7,8);
        hesapMakinesi.fark(100,43);
        hesapMakinesi.carpma(12,12,8);
        hesapMakinesi.bolme(40,3);

    }
}
