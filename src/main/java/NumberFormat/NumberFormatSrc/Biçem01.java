import java.text.DecimalFormat;
 import java.text.NumberFormat;
 
 public class Biçem01 {
     public static void main(String[] args) {
     NumberFormat nakýþ = new DecimalFormat("0000000");
     String number = nakýþ.format(2500);
 
     System.out.println("Sayýnýn önüne 0 lar konulur: " + number);
     }
 }

