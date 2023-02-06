import java.util.*;                

public class Konsole03 {

    public static void main(String[] args) {
        //... Initialization
        String ad;               
        Scanner in = new Scanner(System.in);

        //... Prompt and read input.
        System.out.println("Adýnýz : ");
        ad = in.nextLine();      // Konsoldan bir satýr okur.
        in.close();  // Dosyadan okurken gerekir.                 

        System.out.println("Bana güven, " + ad);
    }
}

