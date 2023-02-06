/**
 * 
 */
package tarih;

import java.util.Date;

public class BurcunuBul
{
  public static void main(String args[]){
    int year;
    Date date = new Date(42,11,28);
    Date check;
    String bb=new String("");
    year = date.getYear();
    while (true) {

      // OGLAK 21Aral�k-20Ocak Capricorn Cedi
      check = new Date(year,1,20);
      if(date.before(check)) {
        bb = new String("O�lak");
        break;
      }
      
      // KOVA 21ocak-20�ubat Aguarius Delu
      check =  new Date(year,2,19);
      if(date.before(check)) {
        bb = new String("Kova");
        break;
      }
      
      // February 19 - March 20  --> Pisces
      check =new Date(year,3,21);
      if(date.before(check)) {
        bb = new String("Bal�k");
        break;
      }
      
      // KO� 21Mart-20Nisan Ar�es - Hamel
      check =  new Date(year,4,20);
      if(date.before(check)) {
        bb = new String("Ko�");
        break;
      }

      // BOGA 21 Nisan-20 may�s Taurus - Sebir
      check =  new Date(year,5,21);
      if(date.before(check)) {
        bb = new String("Bo�a");
        break;
      }
      
      // �K�ZLER 21may�s-20haziran Gemini-Cevza
      check =  new Date(year,6,21);
      if(date.before(check)) {
        bb = new String("�kizleri");
        break;
      }
      
      // YENGE� 21haziran-20tem. Cancer - Seretan
      check =  new Date(year,7,23);
      if(date.before(check)) {
        bb = new String("Yenge�");
        break;
      }
      
      // ASLAN 21tem-20Agu Leo - Eset
      check =  new Date(year,8,23);
      if(date.before(check)) {
        bb = new String("Aslan");
        break;
      }

      // BA�AK 21Agu.-20eyl�l Virgo - S�mb�le
      check =  new Date(year,9,23);
      if(date.before(check)) {
        bb = new String("Ba�ak");
        break;
      }
      
      // TERAZ� 21Eyl�-20ekim Libra - Mizan
      check =  new Date(year,10,23);
      if(date.before(check)) {
        bb = new String("Terazi");
        break;
      }
      
      // AKREP 21Ekim-20kas�m Scorpio - Akrep
      check =  new Date(year,11,22);
      if(date.before(check)) {
        bb = new String("Akrep");
        break;
      }
      
      // YAY 21kas�m-20Aral�k Sagitarius - Kabis
      check =  new Date(year,12,22);
      if(date.before(check)) {
        bb = new String("Yay");
        break;
      }
    }
    System.out.println("Burcunuz  =>> " + bb);
  }
}
