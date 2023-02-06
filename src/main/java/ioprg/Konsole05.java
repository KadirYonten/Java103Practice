import java.util.Scanner;

public class Konsole05 {

   public static void main(String[] args) {

       String ad;
       int yaþ;
       Scanner in = new Scanner(System.in);

       System.out.println("Adýnýz : ");
       ad = in.nextLine();

       System.out.println("Yaþýnýz : ");
       yaþ = in.nextInt();
       in.close();            


       System.out.println("Adýnýz :" + ad);
       System.out.println("Yaþýnýz :" + yaþ);

    }
}

