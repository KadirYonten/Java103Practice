    import java.text.DecimalFormat;
    import java.util.Locale;

    public class DecimalFormat2 {
        public static void main(String args[]) {

            // get format for default locale

            DecimalFormat df1 = new DecimalFormat("####.000");
            System.out.println(df1.format(1234.56));

            // get format for German locale

            Locale.setDefault(Locale.GERMAN);
            DecimalFormat df2 = new DecimalFormat("####.000");
            System.out.println(df2.format(1234.56));
        }
    }