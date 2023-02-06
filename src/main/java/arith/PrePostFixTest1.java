//	 Test of prefix and postfix increment operators. 

 1: class PrePostFixTest1 {
 2: 
 3: public static void main (String args[]) {
 4:     int x = 0;
 5:     int y = 0;
 6: 
 7:     System.out.println("x and y are " + x + " and " + y );
 8:     x++;
 9:     System.out.println("x++ results in " + x);
10:     ++x;
11:     System.out.println("++x results in " + x);
12:     System.out.println("Resetting x back to 0.");
13:     x = 0;
14:     System.out.println("------------");
15:     y = x++;
16:     System.out.println("y = x++ (postfix) results in:");
17:     System.out.println("x is " + x);
18:     System.out.println("y is " + y);
19:     System.out.println("------------");
20: 
21:     y = ++x;
22:     System.out.println("y = ++x (prefix) results in:");
23:     System.out.println("x is " + x);
24:     System.out.println("y is " + y);
25:     System.out.println("------------");
26: 
27: }
28: }


/*
Programýn çýktýsý:
 

x and y are 0 and 0
x++ results in 1
++x results in 2
Resetting x back to 0.
------------
y = x++ (postfix) results in:
x is 1
y is 0
------------
y = ++x (prefix) results in:
x is 2
y is 2
------------

*/