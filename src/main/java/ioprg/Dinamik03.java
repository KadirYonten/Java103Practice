//Dinamik02.java
import java.io.*; 

import java.util.Scanner;

public class Dinamik02 {
	  int n;
    static double VeriOku()
    {
		  System.out.println("Brüt ücreti giriniz : ");
		  
	       Scanner scanIn = new Scanner(System.in);
	       n = scanIn.nextInt();
	       scanIn.close();
        return  scanIn.nextInt();
    }

    static double Hesapla()
    {
        return VeriOku() * 40 / 100;
    }

    static void VeriYaz()
    {

    	System.out.println(Hesapla());
    }

	public static void main(String[] args) {
        VeriYaz();
    }
}

