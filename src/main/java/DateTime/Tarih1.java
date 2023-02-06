package Bölüm21;

import java.util.Calendar;
import java.util.Formatter;

public class Tarih01 {
  public static void main(String args[]) {
    Formatter fmt = new Formatter();
    Calendar cal = Calendar.getInstance();

    fmt.format("Bugünün Tarihi:  %te of %<tB, %<tY", cal);
    System.out.println(fmt);
  }
}

/*
Bugünün TArihi:  12 of Eylül, 2010
*/
