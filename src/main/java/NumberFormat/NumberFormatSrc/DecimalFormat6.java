    import java.text.DecimalFormat;
    import java.text.NumberFormat;
    import java.util.Locale;

    public class DecimalFormat6 {
        public static void main(String args[]) {
            DecimalFormat df = null;

            // get a NumberFormat object and cast it to
            // a DecimalFormat object

            try {
                df = (DecimalFormat)
                    NumberFormat.getInstance(Locale.GERMAN);
            }
            catch (ClassCastException e) {
                System.err.println(e);
            }

            // set a format pattern

            df.applyPattern("####.00000");

            // format a number

            System.out.println(df.format(1234.56));
        }
    }