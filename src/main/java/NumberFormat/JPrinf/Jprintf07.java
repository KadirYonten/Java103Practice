public class Jprintf07 {

  public static void main(String[] a) {

    StringBuffer buf = new StringBuffer();
    java.util.Formatter formatter = new java.util.Formatter(buf);

    double x = 27.5, y = 33.75;
    formatter.format("x = %15.2f y = %14.3g", x, y);

    System.out.print(buf);

  }

}