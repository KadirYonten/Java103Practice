//	 The Relational class.


class Relational {
  public static void main (String args[]) {
    int x = 7, y = 11, z = 11;
    System.out.println("x = " + x);
    System.out.println("y = " + y);
    System.out.println("z = " + z);
    System.out.println("x < y = " + (x < y));
    System.out.println("x > z = " + (x > z));
    System.out.println("y <= z = " + (y <= z));
    System.out.println("x >= y = " + (x >= y));
    System.out.println("y == z = " + (y == z));
    System.out.println("x != y = " + (x != z));
  }
}


/*
--------------------------------------------------------------------------------

Programýn çýktýsý þöyledir: 

x = 7
y = 11
z = 11
x < y = true
x > z = false
y <= z = true
x >= y = false
y == z = true
x != y = true

*/
