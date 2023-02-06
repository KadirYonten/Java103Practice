
http://www.java2s.com/Tutorial/Java/0120__Development/SpecifyingtheWidthandPrecision.htm

Formatting Numerical Data:
public class MainClass {

  public static void main(String[] a) {

    double x = 27.5, y = 33.75;
  
    System.out.printf("x = %f y = %g", x, y);

  }
}
x = 27.500000 y = 33.7500
public class MainClass {

  public static void main(String[] args) {

    int a = 5, b = 15, c = 255;
  
    System.out.printf("a = %d b = %x c = %o", a, b, c); 

  }
}
a = 5 b = f c = 377
public class MainClass {

  public static void main(String[] args) {

    double x = 27.5, y = 33.75;
  
    System.out.printf("x = %2$f y = %1$g", x, y);

  }
}
x = 33.750000 y = 27.5000
public class MainClass {

  public static void main(String[] args) {

    int a = 5, b = 15, c = 255;
  
    System.out.printf("a = %3$d b = %1$x c = %2$o", a, b, c);

  }
}
a = 255 b = 5 c = 17