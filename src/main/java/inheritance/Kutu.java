package kalýtým;
/* Kutu – üst-sýnýfýnýn 3 tane anlýk (instance)
   deðiþkeni var.
*/

class Kutu {
  double en;
  double boy;
  double yukseklik;

  // Parametreli constructor tanýmý.
  // Parametre class tipinden olabilir.
  // Bu constructor Kutu’nun bir kopyasýný yaratýyor.

  Kutu(Kutu ob) {     // parametre kendi sýnýfýnýn tipindendir.
    en   = ob.en;
    boy  = ob.boy;
    yukseklik   = ob.yukseklik;
  }

  // Formal parametreli constructor tanýmý.
  // Constructor Kutu’nun boyutlarýný belirliyor.

  Kutu(double e, double b, double y) { // boyutlar için 3 parametre
    en  = e;
    boy = b;
    yukseklik  = y;
  }

       /*
         * parametresiz constructor tanýmý.
         * Henüz asýl deðerlerin verilmediðini belirtmek için
         * deðiþkenlere -1 deðeri atanýyor.
        */

  Kutu() {
    en  = -1;         // geçici deðer
    boy = -1;         // geçici deðer
    yukseklik  = -1;  // geçici deðer
  }

  // Formal parametreli constructor tanýmý.
  // Constructor Kutu’nun boyutlarýný eþitliyor (küp oluþturuyor)

  Kutu(double uzunluk) {
    en = boy = yukseklik = uzunluk;
  }

  // hacim hesaplar

  double hacim() {
    return en * boy * yukseklik;
  }
}



  // alt-sýnýf tanýmý
  // Kutu’nun deðiþkenlerine bir ek yapýlýyor (agr).

class AltKutu extends Kutu {
  double agr;               // Kutu’nun aðýrlýðý
  // AltKutu için constructor metodunun tanýmý

  AltKutu(double e, double b, double y, double a) {
    en  = e;
    boy = b;
    yukseklik  = y;
    agr = a;
  }

}



// Uygulama programý.

class DemoAltKutu {
  public static void main(String args[]) {
    AltKutu kutu1 = new AltKutu(15, 30, 25, 53.7);
    AltKutu kutu2 = new AltKutu(4, 5, 6, 0.123);
    double vol;
    vol = kutu1.hacim();
    System.out.println("kutu1 ‘in hacmi    = " + vol);
    System.out.println("kutu1 ‘in aðýrlýðý = " + kutu1.agr);
    System.out.println();
    vol = kutu2.hacim();
    System.out.println("kutu2 ‘nin hacmi    = " + vol);
    System.out.println("kutu2 ‘nin aðýrlýðý = " + kutu2.agr);
  }
}

/*
Çýktý:
run:
kutu1 ‘in hacmi    = 11250.0
kutu1 ‘in aðýrlýðý = 53.7

kutu2 ‘nin hacmi    = 120.0
kutu2 ‘nin aðýrlýðý = 0.123
BUILD SUCCESSFUL (total time: 1 second)
*/
