package Bölüm21;
import java.util.Formatter;

public class Hizalama {
  public static void main(String args[]) {
    Formatter fmt = new Formatter();

    // saða yanaþýk (öntanýmlý)
    fmt.format("|%10.2f|", 123.123);
    System.out.println(fmt);

    // Sola yanaþýk
    fmt = new Formatter();
    fmt.format("|%-10.2f|", 123.123);
    System.out.println(fmt);
  }
}




|    123.12|
|123.12    |