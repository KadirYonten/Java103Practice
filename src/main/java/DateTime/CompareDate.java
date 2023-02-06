/**
 * 
 */
package tarih;

import java.util.Date;

public class CompareDate {

	public static void main(String[] args) {
		Date ilkDate = new Date();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		Date ikinciDate = new Date();
		System.out.println("Ýlk Zaman   :=" + ilkDate);
		System.out.println("Ýkinci Zaman:=" + ikinciDate);
		if (ilkDate.compareTo(ikinciDate) > 0)
			System.out.println("ilkZaman ikinciZamandan önce geldi");
		else if (ilkDate.compareTo(ikinciDate) < 0)
			System.out.println("ikinciZaman ilkZamandan önce geldi");
		else
			System.out.println("ilk ve ikinci zamanlar eþittir");
	}
}
