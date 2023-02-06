    import java.text.NumberFormat;
    import java.util.Locale;

    public class DecimalFormat1 {
        public static void main(String args[]) {

            // get format for default locale

            NumberFormat nf1 = NumberFormat.getInstance();
            System.out.println(nf1.format(1234.56));

            // get format for German locale

            NumberFormat nf2 =
                NumberFormat.getInstance(Locale.GERMAN);
            System.out.println(nf2.format(1234.56));
        }
    }