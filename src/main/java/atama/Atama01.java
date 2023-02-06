package Bölüm06;

public class Atama01 {

	public static void main(String[] args) {
		int x = 5;
        int y = 4;
        System.out.print("x= " + x + " ve y = " + y + " ise   x += y = ");
        x += y;
        System.out.println(x);
 
        System.out.print("x= " + x + " ve y = " + y + " ise   x -= y = ");
        x -= y;
        System.out.println(x);
        
        System.out.print("x= " + x + " ve y = " + y + " ise   x *= y = ");
        x *= y;
        System.out.println(x);
        
        System.out.print("x= " + x + " ve y = " + y + " ise   x /= y = ");
        x /= y;
        System.out.println(x);
        
        
        System.out.print("x= " + x + " ve y = " + y + " ise   x %= y = ");
        x %= y;
        System.out.println(x);
	}
}
