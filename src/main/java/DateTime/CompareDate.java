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
		System.out.println("�lk Zaman   :=" + ilkDate);
		System.out.println("�kinci Zaman:=" + ikinciDate);
		if (ilkDate.compareTo(ikinciDate) > 0)
			System.out.println("ilkZaman ikinciZamandan �nce geldi");
		else if (ilkDate.compareTo(ikinciDate) < 0)
			System.out.println("ikinciZaman ilkZamandan �nce geldi");
		else
			System.out.println("ilk ve ikinci zamanlar e�ittir");
	}
}
