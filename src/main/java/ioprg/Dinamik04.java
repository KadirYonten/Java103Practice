package statik_dinamik;
import java.io.*;


import java.util.Scanner;

public class Dinamik04 {
	int n;

	double VeriOku() {
		System.out.println("Brüt ücreti giriniz : ");

		Scanner scanIn = new Scanner(System.in);
		n = scanIn.nextInt();
		scanIn.close();
		return scanIn.nextInt();
	}

	double Hesapla() {
		return VeriOku() * 40 / 100;
	}

	void VeriYaz() {

		System.out.println(Hesapla());
	}

	public static void main(String[] args) {
		Dinamik04  p = new Dinamik04();
		p.VeriYaz();
	}
}
