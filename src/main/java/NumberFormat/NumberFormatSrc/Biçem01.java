import java.text.DecimalFormat;
 import java.text.NumberFormat;
 
 public class Bi�em01 {
     public static void main(String[] args) {
     NumberFormat nak�� = new DecimalFormat("0000000");
     String number = nak��.format(2500);
 
     System.out.println("Say�n�n �n�ne 0 lar konulur: " + number);
     }
 }

