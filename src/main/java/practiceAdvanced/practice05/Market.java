package practiceAdvanced.practice05;

import java.time.LocalDate;

public class Market {
    String urunAdi;
    double urunFiyati;
    String sonKullanmaTarihi;

    Market(String urunIsmi, double fiyat, int aySonra){         // 3 degeri olan Market Constuructor olusturduk..

        urunAdi = urunIsmi;
        urunFiyati = fiyat;
        sonKullanmaTarihi = LocalDate.now().plusMonths(aySonra).toString();  // son kullanma tarihini hesaplamak icin LocalDate.now() kullandik

    }

    Market(String urunIsmi, double fiyat){

        urunAdi = urunIsmi;
        urunFiyati = fiyat;
        sonKullanmaTarihi = "Bu urunun son kullanma tarihi yoktur";

    }


}