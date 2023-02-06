package Bölüm21;
import java.util.*; 

public class Biçem06 {
  public static void main(String args[]) { 
    Formatter fmt = new Formatter(); 
 
    for(double i=1000; i < 1.0e+10; i *= 100) { 
      fmt.format("%g ", i); 
      System.out.println(fmt); 
    } 
 
  } 
}

/*
1000.00 
1000.00 100000 
1000.00 100000 1.00000e+07 
1000.00 100000 1.00000e+07 1.00000e+09 
*/