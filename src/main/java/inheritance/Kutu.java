package kal�t�m;
/* Kutu � �st-s�n�f�n�n 3 tane anl�k (instance)
   de�i�keni var.
*/

class Kutu {
  double en;
  double boy;
  double yukseklik;

  // Parametreli constructor tan�m�.
  // Parametre class tipinden olabilir.
  // Bu constructor Kutu�nun bir kopyas�n� yarat�yor.

  Kutu(Kutu ob) {     // parametre kendi s�n�f�n�n tipindendir.
    en   = ob.en;
    boy  = ob.boy;
    yukseklik   = ob.yukseklik;
  }

  // Formal parametreli constructor tan�m�.
  // Constructor Kutu�nun boyutlar�n� belirliyor.

  Kutu(double e, double b, double y) { // boyutlar i�in 3 parametre
    en  = e;
    boy = b;
    yukseklik  = y;
  }

       /*
         * parametresiz constructor tan�m�.
         * Hen�z as�l de�erlerin verilmedi�ini belirtmek i�in
         * de�i�kenlere -1 de�eri atan�yor.
        */

  Kutu() {
    en  = -1;         // ge�ici de�er
    boy = -1;         // ge�ici de�er
    yukseklik  = -1;  // ge�ici de�er
  }

  // Formal parametreli constructor tan�m�.
  // Constructor Kutu�nun boyutlar�n� e�itliyor (k�p olu�turuyor)

  Kutu(double uzunluk) {
    en = boy = yukseklik = uzunluk;
  }

  // hacim hesaplar

  double hacim() {
    return en * boy * yukseklik;
  }
}



  // alt-s�n�f tan�m�
  // Kutu�nun de�i�kenlerine bir ek yap�l�yor (agr).

class AltKutu extends Kutu {
  double agr;               // Kutu�nun a��rl���
  // AltKutu i�in constructor metodunun tan�m�

  AltKutu(double e, double b, double y, double a) {
    en  = e;
    boy = b;
    yukseklik  = y;
    agr = a;
  }

}



// Uygulama program�.

class DemoAltKutu {
  public static void main(String args[]) {
    AltKutu kutu1 = new AltKutu(15, 30, 25, 53.7);
    AltKutu kutu2 = new AltKutu(4, 5, 6, 0.123);
    double vol;
    vol = kutu1.hacim();
    System.out.println("kutu1 �in hacmi    = " + vol);
    System.out.println("kutu1 �in a��rl��� = " + kutu1.agr);
    System.out.println();
    vol = kutu2.hacim();
    System.out.println("kutu2 �nin hacmi    = " + vol);
    System.out.println("kutu2 �nin a��rl��� = " + kutu2.agr);
  }
}

/*
��kt�:
run:
kutu1 �in hacmi    = 11250.0
kutu1 �in a��rl��� = 53.7

kutu2 �nin hacmi    = 120.0
kutu2 �nin a��rl��� = 0.123
BUILD SUCCESSFUL (total time: 1 second)
*/
