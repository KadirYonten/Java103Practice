package kalýtým /*

         * Üst-sýnýfýn private öðelerini

         * alt-sýnýfýn kodlarý kullanamaz.

         */ // Üst-sýnýf tanýmlanýyor.



class AAAA {

    int i;              // eriþim kýsýtý yok
    private int j;      // eriþim kýsýtlanýyor

    void setij(int x, int y) {

        i = x;

        j = y;

    }
}

// AAAA'nýn j öðesine eriþemez.
class BBBB extends AAAA {

    int toplam;

    void sum() {

        total = i + j; // HATA!, alt-sýnýftaki bu kod j ye eriþemez

    }
}

class DegerVer {

    public static void main(String args[]) {

        BBBB subOb = new BBBB();



        subOb.setij(15, 20);



        subOb.sum();

        System.out.println("Toplam : " + subOb.toplam);

    }
}
