package B�l�m21;

import java.util.Calendar;
import java.util.Formatter;

public class Tarih01 {
  public static void main(String args[]) {
    Formatter fmt = new Formatter();
    Calendar cal = Calendar.getInstance();

    fmt.format("Bug�n�n Tarihi:  %te of %<tB, %<tY", cal);
    System.out.println(fmt);
  }
}

/*
Bug�n�n TArihi:  12 of Eyl�l, 2010
*/
