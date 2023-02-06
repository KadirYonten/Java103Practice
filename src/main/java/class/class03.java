/*
 *Bu program bir anlýk deðiþken ile bir class deðiþkeni 
 *ve bir anlýk metot ile bir class metodu tanýmlýyor. 
*/

class class03 {
   		// Anlýk (instant) deðiþken	
   String str1 = "Bu bir anlýk string\'dir";
   
   		// class (static) deðiþken	   
   static String str2 = "Bu bir static string\'dir";
   		
   		// Anlýk (instant) metot	
   String getText(){
        return str1;
   }

   		// class (static) metot	
   String getStaticText(){
  	return str2; 
   }

   public static void main(String[] args){
   	class03 x = new class03();  // constructor
   	String txt2 = x.getStaticText(); 
   	System.out.println(txt2);	
 
	String txt1 = x.getText();
    System.out.println(txt1);
   }
}
