package B�l�m21;
import java.util.Formatter;

public class Hizalama {
  public static void main(String args[]) {
    Formatter fmt = new Formatter();

    // sa�a yana��k (�ntan�ml�)
    fmt.format("|%10.2f|", 123.123);
    System.out.println(fmt);

    // Sola yana��k
    fmt = new Formatter();
    fmt.format("|%-10.2f|", 123.123);
    System.out.println(fmt);
  }
}




|    123.12|
|123.12    |