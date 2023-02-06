 import java.awt.Point;

 class RefTest {
	static Point pt1;
 	
     public static void main (String args[]) {
        RefTest rt = new RefTest();
        Point pt2 = new Point(100,100);
        rt.pt1 = pt2;
         
         System.out.println("Point1: " + pt1.x + ", " + pt1.y);
         System.out.println("Point2: " + pt2.x + ", " + pt2.y);
         
         pt1.x = 200;
         pt1.y = 200;
         
         System.out.println("Point1: " + pt1.x + ", " + pt1.y);
         System.out.println("Point2: " + pt2.x + ", " + pt2.y);
     }
 }