import java.util.Scanner;

public class Konsole05 {

   public static void main(String[] args) {

       String ad;
       int ya�;
       Scanner in = new Scanner(System.in);

       System.out.println("Ad�n�z : ");
       ad = in.nextLine();

       System.out.println("Ya��n�z : ");
       ya� = in.nextInt();
       in.close();            


       System.out.println("Ad�n�z :" + ad);
       System.out.println("Ya��n�z :" + ya�);

    }
}

