package practiceAdvanced.practice05;

public class Q03_Overloading {
    //Küp, kare prizma ve dikdörtgen prizmanın hacmini hesaplayan
    // bir method oluşturunuz.(Method overloading kullanınız)
    public static void main(String[] args) {

        //Küp Hacmini hesaplamak icin Hacim Classindan Object olusturacaz..
        Hacim hacim = new Hacim();

        int küp = hacim.hacimHesapla(5);
        int karePrizma = hacim.hacimHesapla(5,6);
        int dikdörtgenPrizma = hacim.hacimHesapla(5,6,7);

        System.out.println("küp = " + küp);
        System.out.println("karePrizma = " + karePrizma);
        System.out.println("dikdörtgenPrizma = " + dikdörtgenPrizma);


    }
}
