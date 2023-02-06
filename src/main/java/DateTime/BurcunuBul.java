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

      // OGLAK 21Aralýk-20Ocak Capricorn Cedi
      check = new Date(year,1,20);
      if(date.before(check)) {
        bb = new String("Oðlak");
        break;
      }
      
      // KOVA 21ocak-20Þubat Aguarius Delu
      check =  new Date(year,2,19);
      if(date.before(check)) {
        bb = new String("Kova");
        break;
      }
      
      // February 19 - March 20  --> Pisces
      check =new Date(year,3,21);
      if(date.before(check)) {
        bb = new String("Balýk");
        break;
      }
      
      // KOÇ 21Mart-20Nisan Arýes - Hamel
      check =  new Date(year,4,20);
      if(date.before(check)) {
        bb = new String("Koç");
        break;
      }

      // BOGA 21 Nisan-20 mayýs Taurus - Sebir
      check =  new Date(year,5,21);
      if(date.before(check)) {
        bb = new String("Boða");
        break;
      }
      
      // ÝKÝZLER 21mayýs-20haziran Gemini-Cevza
      check =  new Date(year,6,21);
      if(date.before(check)) {
        bb = new String("Ýkizleri");
        break;
      }
      
      // YENGEÇ 21haziran-20tem. Cancer - Seretan
      check =  new Date(year,7,23);
      if(date.before(check)) {
        bb = new String("Yengeç");
        break;
      }
      
      // ASLAN 21tem-20Agu Leo - Eset
      check =  new Date(year,8,23);
      if(date.before(check)) {
        bb = new String("Aslan");
        break;
      }

      // BAÞAK 21Agu.-20eylül Virgo - Sümbüle
      check =  new Date(year,9,23);
      if(date.before(check)) {
        bb = new String("Baþak");
        break;
      }
      
      // TERAZÝ 21Eylü-20ekim Libra - Mizan
      check =  new Date(year,10,23);
      if(date.before(check)) {
        bb = new String("Terazi");
        break;
      }
      
      // AKREP 21Ekim-20kasým Scorpio - Akrep
      check =  new Date(year,11,22);
      if(date.before(check)) {
        bb = new String("Akrep");
        break;
      }
      
      // YAY 21kasým-20Aralýk Sagitarius - Kabis
      check =  new Date(year,12,22);
      if(date.before(check)) {
        bb = new String("Yay");
        break;
      }
    }
    System.out.println("Burcunuz  =>> " + bb);
  }
}
