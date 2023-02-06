
package tarih;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class Tarih03 {

	public static void main(String[] args) {
		// orta ve kýsa tarih biçemi yazan bir String nakýþý
		String dateString = "Nov 4, 2003 8:14 PM";

		// Öntanýmlý MEDIUM/SHORT DateFormat
		DateFormat format = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,
				DateFormat.SHORT);

		// date 'in Parse edilmesi
		try {
			Date date = format.parse(dateString);
			System.out.println("Orijinal string: " + dateString);
			System.out.println("Parse edilen date    : " + date.toString());
		} catch (ParseException pe) {
			System.out.println("HATA: date stringe parse edilemedi \""
					+ dateString + "\"");
		}
	}
}
/*
 * HATA: date stringe parse edilemedi "Nov 4, 2003 8:14 PM"
*/
