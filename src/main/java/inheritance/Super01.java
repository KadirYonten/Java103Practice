package kalýtým;
// Super01 ve AltKutu’nun tanýmlarý.

class Super01 {

    private double en;
    private double boy;
    private double yukseklik;

    /* Parametreli constructor.
    
    Constructor metodunun parametresi kendi
    
    sýnýfýnýn tipindendir. */
    Super01(Super01 ob) {

        en = ob.en;

        boy = ob.boy;

        yukseklik = ob.yukseklik;

    }

    /*
    
     * Parametreli constructor.
    
     * Constructor çaðrýlýrken formal parametreler
    
    yerine gerçek parametreler girilir.
    
     */
    Super01(double e, double b, double y) {

        en = e;

        boy = b;

        yukseklik = y;

    }

    /*
    
     * Parametresiz constructor.
    
     * Deðiþkenlere geçici -1 deðeri atanmýþtýr.
    
     * Program koþarken gerçek deðerleri alacaktýr.
    
     */
    Super01() {

        en = -1;         // geçici deðer

        boy = -1;         // geçici deðer

        yukseklik = -1;  // geçici deðer

    }

    /*
    
     * Tek parametreli constructor.
    
     * Boyutlar eþit kýlýnarak, bir küp yaratýlýyor.
    
     */
    Super01(double uzunluk) {

        en = boy = yukseklik = uzunluk;

    }

    // Super01’nun hacmini hesaplayan metodun tanýmý
    double hacim() {

        return en * boy * yukseklik;

    }
}

class UygulamaPrg {

    public static void main(String args[]) {

        Super01 supOb = new Super01(1, 2, 3);
        System.out.println(supOb.hacim());
    }
}
