import java.text.NumberFormat;
import java.text.ParseException;

public class FormatD {

	public static void main(String[] av) {

    String input = "76054.984";
    NumberFormat nf = NumberFormat.getInstance();

    try {
      Number d = nf.parse(input);
      System.out.println(input + " stringini " + d + " olarak okur ve \n"  + nf.format(d) + "biçiminde yazar");
    } catch (ParseException pe) {
      System.err.println(input + "okunamýyor!");
    }
  }
}
/*
76054.984 stringini 76054984 olarak okur ve 
76.054.984biçiminde yazar
*/