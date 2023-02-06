
package B�l�m21;

import java.util.Calendar;
import java.util.Formatter;

public class TarihZaman {
  public static void main(String args[]) {
    Formatter fmt = new Formatter();
    Calendar cal = Calendar.getInstance();

    // Standart 12 saat zaman bi�eminde yaz.
    fmt.format("%tr", cal);
    System.out.println(fmt);

    // Tarih ve zaman� tam bi�emiyle yaz.
    fmt = new Formatter();
    fmt.format("%tc", cal);
    System.out.println(fmt);

    // Yaln�z saat ve dakikay� g�ster.
    fmt = new Formatter();
    fmt.format("%tl:%tM", cal, cal);
    System.out.println(fmt);

    // Ay ad�n� ve s�ras�n� g�ster.
    fmt = new Formatter();
    fmt.format("%tB %tb %tm", cal, cal, cal);
    System.out.println(fmt);
  }
}

/*
11:32:28 AM
Paz Eyl 12 11:32:28 EEST 2010
11:32
Eyl�l Eyl 09
*/  