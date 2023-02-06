//Dinamik01.java
import java.io.*; 

import java.util.Scanner;

public class Dinamik01 {
	  public static void main(String[] args) {
		  int n;
		  System.out.println("Brüt ücreti giriniz : ");
	  
	       Scanner scanIn = new Scanner(System.in);
	       n = scanIn.nextInt();
	       scanIn.close();
	       System.out.println(n);
	       System.out.println(n*40/100);
	  }
	}

