package kal�t�m;
/* Bu uygulama program� referanslar�n (i�aret�i, pointer)

kullan�l���n� g�stermektedir. */

class UygulaPrg {

    public static void main(String args[]) {
        AltKutu altKutu1 = new AltKutu(4, 5, 6, 12.23);
        Kutu ustKutu2 = new Kutu();
        double vol;
        vol = altKutu1.hacim();
        System.out.println("altKutu1 in hacmi    = " + vol);
        System.out.println("altKutu1 in a��rl��� = " + altKutu1.agr);
        System.out.println();

        /*
         * ustKutu2 i�aret�isinin g�sterdi�i adres
         * altKutu1 i�aret�isinin g�sterdi�i adres ile ayn� k�l�n�yor.
         * Ayn� tipten referanslar e�itlenebibilir.
         */

        ustKutu2 = altKutu1;

        vol = ustKutu2.hacim(); // hacim(), Kutu �nun bir metodudur,
        // dolay�syla kod ge�erlidir.
        System.out.println("ustKutu2 �nin hacmi    = " + vol);

        /* A�a��daki kod ge�ersizdir, ��nk� ustKutu2�nin
        agr ��esi yoktur. */

        System.out.println("ustKutu2��n a��rl��� =  " + ustKutu2.agr);
    }
}
