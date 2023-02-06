package kalýtým;
/* Bu uygulama programý referanslarýn (iþaretçi, pointer)

kullanýlýþýný göstermektedir. */

class UygulaPrg {

    public static void main(String args[]) {
        AltKutu altKutu1 = new AltKutu(4, 5, 6, 12.23);
        Kutu ustKutu2 = new Kutu();
        double vol;
        vol = altKutu1.hacim();
        System.out.println("altKutu1 in hacmi    = " + vol);
        System.out.println("altKutu1 in aðýrlýðý = " + altKutu1.agr);
        System.out.println();

        /*
         * ustKutu2 iþaretçisinin gösterdiði adres
         * altKutu1 iþaretçisinin gösterdiði adres ile ayný kýlýnýyor.
         * Ayný tipten referanslar eþitlenebibilir.
         */

        ustKutu2 = altKutu1;

        vol = ustKutu2.hacim(); // hacim(), Kutu ‘nun bir metodudur,
        // dolayýsyla kod geçerlidir.
        System.out.println("ustKutu2 ‘nin hacmi    = " + vol);

        /* Aþaðýdaki kod geçersizdir, çünkü ustKutu2’nin
        agr öðesi yoktur. */

        System.out.println("ustKutu2’ýn aðýrlýðý =  " + ustKutu2.agr);
    }
}
