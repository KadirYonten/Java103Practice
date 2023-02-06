import java.applet.*; 

/** Illustrate use of the DecimalFormat class **/
public class PrintfDemo extends Applet
{
  /** Illustrate several output formats with printf() **/
  public void init () {

    double q = 1.0/3.0;
    // Print the number with 3 decimal places.
    System.out.printf ("1.0/3.0 = %5.3f %n", q);

    // Increase the number of decimal places
    System.out.printf ("1.0/3.0 = %7.5f %n", q);

    // Pad with zeros.
    q = 1.0/2.0;
    System.out.printf ("1.0/2.0 = %09.3f %n", q);

    // Scientific notation
    q = 1000.0/3.0;
    System.out.printf ("1000/3.0 = %7.2e %n", q);

    // More scientific notation
    q = 3.0/4567.0;
    System.out.printf ("3.0/4567.0 = %7.2e %n", q);

    // Negative infinity
    q = -1.0/0.0;
    System.out.printf ("-1.0/0.0 = %7.2e %n", q);

    q = 0.0/0.0;
    // NaN
    System.out.printf ("0.0/0.0 = %5.2e %n", q);

    // Multiple arguments
    System.out.printf ("pi = %5.3f, e = %5.4f %n", Math.PI, Math.E);

    double r = 1.1;
    // User the argument index to put the argument values into
    // different locations within th string.
    System.out.printf ("C = 2 * %1$5.5f * %2$4.1f, "+
                       "A = %2$4.1f * %2$4.1f * %1$5.5f %n",
                         Math.PI, r);

  }

  /** Paint message in Applet window. **/
  public void paint (java.awt.Graphics g) {
     g.drawString ("Test printf()",20,20);
  }

  /** Can also run this program as an application.
    * No windowing needed so just run the applets
    * init () function.
   **/
  public static void main (String [] args) {
    PrintfDemo obj = new PrintfDemo ();
    obj.init ();
  }

} // class PrintfDemo