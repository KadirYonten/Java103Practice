/**
 * 
 */
package tarih;

import java.util.Date;

public class CompareDate02 {

	public static void main(String[] args) {
		Date firstDate = new Date();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		Date secondDate = new Date();
		System.out.println("�lk Tarih    :=" + firstDate);
		System.out.println("�kinci Tarih :=" + secondDate);
		if (firstDate.after(secondDate))
			System.out.println("ilkZaman ikinciZamandan sonra geldi");
		else
			System.out.println("ilkZaman ikinciZamandan �nce geldi");
	}
}
