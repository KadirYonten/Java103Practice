//* AAA s�n�f�n�n de�i�ken ve metodu BBB ye
 * kal�t�msal ge�ecektir.
 */
//�st s�n�f tan�mlan�yor.

class AAA {

    int i, j;

    void showij() {

        System.out.println("i and j: " + i + " " + j);

    }
}

// AAA �n�n BBB alt-s�n�f� tan�mlan�yor.
class BBB extends AAA {

    int k;

    void showk() {

        System.out.println("k: " + k);

    }

    void sum() {

        System.out.println("i+j+k: " + (i + j + k));

    }
}

// Uygulama program�
// AAA ve BBB s�n�flar�na ait nesneler yarat�l�yor.
// AAA ve BBB ile ayn� pakette (ayn� dizinde) bulunmal�d�r.
class BasitInheritance {

    public static void main(String args[]) {

        AAA ustOb = new AAA();      // AAA �ya ait nesne

        BBB altOb = new BBB();      // BBB �ye ait nesne



        // Anl�k de�i�kenlere atama yap�l�yor.

        ustOb.i = 15;

        ustOb.j = 25;

        System.out.println(" ustOb nesnesinin ��eleri: ");

        ustOb.showij();   //ustOb �nin ��elerini yazar

        System.out.println();



        /* Alt-s�n�f �st-s�n�f�n b�t�n
        
         * ��elerine eri�ebilir.
        
         */

        altOb.i = 3;

        altOb.j = 5;

        altOb.k = 7;

        System.out.println("altOb nesnesinin ��eleri: ");

        altOb.showij();   //�st-s�n�ftaki de�i�kenleri yazar

        altOb.showk();    //alt-s�n�ftaki de�i�keni yazar

        System.out.println();



        System.out.println("�st ve alt s�n�ftaki de�i�kenler toplan�yor� ");

        System.out.println("(i + j + k) = ");



        altOb.sum();

    }
}



/*
��kt�:
run:
 ustOb nesnesinin ��eleri: 
i and j: 15 25

altOb nesnesinin ��eleri: 
i and j: 3 5
k: 7

�st ve alt s�n�ftaki de�i�kenler toplan�yor� 
(i + j + k) = 
i+j+k: 15
BUILD SUCCESSFUL (total time: 0 seconds)
*/