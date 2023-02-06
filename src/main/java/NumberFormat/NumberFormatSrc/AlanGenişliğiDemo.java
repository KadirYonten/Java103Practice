import java.util.*; 
 
public class AlanGeniþliðiDemo { 
  public static void main(String args[]) { 
    Formatter fmt; 
  
    for(int i=1; i <= 10; i++) { 
      fmt = new Formatter(); 
 
      fmt.format("%4d %4d %4d", i, i*i, i*i*i); 
      System.out.println(fmt); 
    } 
 
  } 
}

/*
   5   25  125
   6   36  216
   7   49  343
   8   64  512
   9   81  729
  10  100 1000
*/