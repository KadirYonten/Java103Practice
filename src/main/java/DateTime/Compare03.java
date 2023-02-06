/**
 * 
 */
package tarih;

import java.util.Date;

public class Compare03 {

	public static void main(String[] args) {
		Date firstDate = new Date();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		Date secondDate = new Date();
		System.out.println("FirstDate:=" + firstDate);
		System.out.println("SecondDate:=" + secondDate);
		if (secondDate.before(firstDate))
			System.out.println("First Date is initialized after Second Date");
		else
			System.out.println("First Date is initialized before Second Date");
	}
}
