/**
 * @(#)ara.java
 *
 *
 * @author 
 * @version 1.00 2006/10/25
 */



class LogTable
  { 
    static int lg(int N)
      { int i = 0;
        while (N > 0) { i++; N/= 2; }
        return i;
      }
    public static void main(String[] args)
      { 
        for (int N = 1000; N <= 1000000000; N *= 10)
          Out.println(lg(N) + " " + N);
      }
  }