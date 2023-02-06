
    import java.util.Locale;
    import java.text.NumberFormat;
    import java.text.ParseException;

    public class DecimalFormat5 {
        public static void main(String args[]) {

            // get format for default locale

            NumberFormat nf1 = NumberFormat.getInstance();
            Object obj1 = null;

            // parse number based on format

            try {
                obj1 = nf1.parse("1234,56");
            }
            catch (ParseException e1) {
                System.err.println(e1);
            }
            System.out.println(obj1);

            // get format for German locale

            NumberFormat nf2 =
                NumberFormat.getInstance(Locale.GERMAN);
            Object obj2 = null;

            // parse number based on format

            try {
                obj2 = nf2.parse("1234,56");
            }
            catch (ParseException e2) {
                System.err.println(e2);
            }
            System.out.println(obj2);
        }
    }