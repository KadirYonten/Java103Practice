/*
 *Bu program bir anl�k de�i�ken ile bir class de�i�keni 
 *ve bir anl�k metot ile bir class metodu tan�ml�yor. 
*/

class class03 {
   		// Anl�k (instant) de�i�ken	
   String str1 = "Bu bir anl�k string\'dir";
   
   		// class (static) de�i�ken	   
   static String str2 = "Bu bir static string\'dir";
   		
   		// Anl�k (instant) metot	
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
