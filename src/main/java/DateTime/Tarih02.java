package tarih;

import java.text.DateFormat;
import java.util.Date;

public class Tarih02 {

	public static void main(String[] args) {
		// Þimdiki tarihi ve zamaný tutan Date nesnesi yaratýr
		Date now = new Date();

		// toString() metodunun yaptýðýný 1. sýra numarada gör
		System.out.println(" 1. " + now.toString());

		// Öntanýmlý (default DateFormat
		System.out.println(" 2. " + DateFormat.getInstance().format(now));

		// And the default time and date-time DateFormats
		System.out.println(" 3. " + DateFormat.getTimeInstance().format(now));
		System.out.println(" 4. "
				+ DateFormat.getDateTimeInstance().format(now));

		// öntanýmlý zaman biçemleri: kýsa, orta ve uzun zaman gösterimleri
		System.out.println(" 5. "
				+ DateFormat.getTimeInstance(DateFormat.SHORT).format(now));
		System.out.println(" 6. "
				+ DateFormat.getTimeInstance(DateFormat.MEDIUM).format(now));
		System.out.println(" 7. "
				+ DateFormat.getTimeInstance(DateFormat.LONG).format(now));

		// Öntanýmlý date-formatý için, tarih ve zaman gösterim biçemi
		// seçilebilir
		System.out.println(" 8. "
				+ DateFormat.getDateTimeInstance(DateFormat.SHORT,
						DateFormat.SHORT).format(now));
		System.out.println(" 9. "
				+ DateFormat.getDateTimeInstance(DateFormat.MEDIUM,
						DateFormat.SHORT).format(now));
		System.out.println("10. "
				+ DateFormat.getDateTimeInstance(DateFormat.LONG,
						DateFormat.LONG).format(now));
	}
}
/*
 *  1. Wed Jan 05 09:47:00 EET 2011
 2. 05.01.2011 09:47
 3. 09:47:00
 4. 05.Oca.2011 09:47:00
 5. 09:47
 6. 09:47:00
 7. 09:47:00 EET
 8. 05.01.2011 09:47
 9. 05.Oca.2011 09:47
10. 05 Ocak 2011 Çarþamba 09:47:00 EET
*/
