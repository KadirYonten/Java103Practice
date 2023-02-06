/**
 * 
 */
package tarih;
import java.util.Date;
import java.text.SimpleDateFormat;

public class SimpleFormatDate
{
  public static void main(String args[]){
    Date todaysDate = new java.util.Date();
    // Formatting date into  yyyy-MM-dd HH:mm:ss e.g 2008-10-10 11:21:10
     
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String formattedDate = formatter.format(todaysDate);
    System.out.println("Formatted date is ==>"+formattedDate);

    // Formatting date into  yyyy-MM-dd e.g 2008-10-10 
    formatter = new SimpleDateFormat("yyyy-MM-dd");
    formattedDate = formatter.format(todaysDate);
    System.out.println("Formatted date is ==>"+formattedDate);

    // Formatting date into  MM/dd/yyyy e.g 10/10/2008 
    formatter = new SimpleDateFormat("MM/dd/yyyy");
    formattedDate = formatter.format(todaysDate);
    System.out.println("Formatted date is ==>"+formattedDate);
  }
}
