import java.util.*;                

public class Konsole03 {

    public static void main(String[] args) {
        //... Initialization
        String ad;               
        Scanner in = new Scanner(System.in);

        //... Prompt and read input.
        System.out.println("Ad�n�z : ");
        ad = in.nextLine();      // Konsoldan bir sat�r okur.
        in.close();  // Dosyadan okurken gerekir.                 

        System.out.println("Bana g�ven, " + ad);
    }
}

