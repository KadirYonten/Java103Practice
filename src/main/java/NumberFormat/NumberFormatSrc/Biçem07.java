package Bölüm21;

import java.util.*; 

public class Biçem07 { 
  public static void main(String args[]) { 
    Formatter fmt = new Formatter(); 
 
    fmt.format("|%f|%n|%12f|%n|%012f|", 10.12345, 10.12345, 10.12345); 
 
    System.out.println(fmt); 
 
  } 
}

/*
|10,123450|
|   10,123450|
|00010,123450|
*/