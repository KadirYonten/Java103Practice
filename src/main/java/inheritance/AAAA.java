package kal�t�m /*

         * �st-s�n�f�n private ��elerini

         * alt-s�n�f�n kodlar� kullanamaz.

         */ // �st-s�n�f tan�mlan�yor.



class AAAA {

    int i;              // eri�im k�s�t� yok
    private int j;      // eri�im k�s�tlan�yor

    void setij(int x, int y) {

        i = x;

        j = y;

    }
}

// AAAA'n�n j ��esine eri�emez.
class BBBB extends AAAA {

    int toplam;

    void sum() {

        total = i + j; // HATA!, alt-s�n�ftaki bu kod j ye eri�emez

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
