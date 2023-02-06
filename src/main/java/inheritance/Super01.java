package kal�t�m;
// Super01 ve AltKutu�nun tan�mlar�.

class Super01 {

    private double en;
    private double boy;
    private double yukseklik;

    /* Parametreli constructor.
    
    Constructor metodunun parametresi kendi
    
    s�n�f�n�n tipindendir. */
    Super01(Super01 ob) {

        en = ob.en;

        boy = ob.boy;

        yukseklik = ob.yukseklik;

    }

    /*
    
     * Parametreli constructor.
    
     * Constructor �a�r�l�rken formal parametreler
    
    yerine ger�ek parametreler girilir.
    
     */
    Super01(double e, double b, double y) {

        en = e;

        boy = b;

        yukseklik = y;

    }

    /*
    
     * Parametresiz constructor.
    
     * De�i�kenlere ge�ici -1 de�eri atanm��t�r.
    
     * Program ko�arken ger�ek de�erleri alacakt�r.
    
     */
    Super01() {

        en = -1;         // ge�ici de�er

        boy = -1;         // ge�ici de�er

        yukseklik = -1;  // ge�ici de�er

    }

    /*
    
     * Tek parametreli constructor.
    
     * Boyutlar e�it k�l�narak, bir k�p yarat�l�yor.
    
     */
    Super01(double uzunluk) {

        en = boy = yukseklik = uzunluk;

    }

    // Super01�nun hacmini hesaplayan metodun tan�m�
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
