//* AAA sýnýfýnýn deðiþken ve metodu BBB ye
 * kalýtýmsal geçecektir.
 */
//Üst sýnýf tanýmlanýyor.

class AAA {

    int i, j;

    void showij() {

        System.out.println("i and j: " + i + " " + j);

    }
}

// AAA ‘nýn BBB alt-sýnýfý tanýmlanýyor.
class BBB extends AAA {

    int k;

    void showk() {

        System.out.println("k: " + k);

    }

    void sum() {

        System.out.println("i+j+k: " + (i + j + k));

    }
}

// Uygulama programý
// AAA ve BBB sýnýflarýna ait nesneler yaratýlýyor.
// AAA ve BBB ile ayný pakette (ayný dizinde) bulunmalýdýr.
class BasitInheritance {

    public static void main(String args[]) {

        AAA ustOb = new AAA();      // AAA ‘ya ait nesne

        BBB altOb = new BBB();      // BBB ’ye ait nesne



        // Anlýk deðiþkenlere atama yapýlýyor.

        ustOb.i = 15;

        ustOb.j = 25;

        System.out.println(" ustOb nesnesinin öðeleri: ");

        ustOb.showij();   //ustOb ‘nin öðelerini yazar

        System.out.println();



        /* Alt-sýnýf üst-sýnýfýn bütün
        
         * öðelerine eriþebilir.
        
         */

        altOb.i = 3;

        altOb.j = 5;

        altOb.k = 7;

        System.out.println("altOb nesnesinin öðeleri: ");

        altOb.showij();   //üst-sýnýftaki deðiþkenleri yazar

        altOb.showk();    //alt-sýnýftaki deðiþkeni yazar

        System.out.println();



        System.out.println("üst ve alt sýnýftaki deðiþkenler toplanýyor… ");

        System.out.println("(i + j + k) = ");



        altOb.sum();

    }
}



/*
Çýktý:
run:
 ustOb nesnesinin öðeleri: 
i and j: 15 25

altOb nesnesinin öðeleri: 
i and j: 3 5
k: 7

üst ve alt sýnýftaki deðiþkenler toplanýyor… 
(i + j + k) = 
i+j+k: 15
BUILD SUCCESSFUL (total time: 0 seconds)
*/