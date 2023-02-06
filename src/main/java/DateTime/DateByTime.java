/**
 * 
 */
package tarih;

import java.util.Date;

public class DateByTime {

	public static void main(String[] args) {
		// Create a new instance of Date by the time in milliseconds
		Date newDate = new Date(360 * 24 * 60 * 60 * 2000);
		System.out.println("New Date:=" + newDate);
		// getTime() method returns number of milliseconds
		System.out.println("Number of milliseconds ==>" + newDate.getTime());
	}
}
