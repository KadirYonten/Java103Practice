/*
Anl�k bir metot static bir de�i�keni �a��rabilir.
*/

class Class05 {
	//class de�i�keni
   static String str = "Bu bir static string\'dir";
   
	//anl�k metodu
   String getText(){
        return str;
   }

   public static void main(String[] args){
   	 	Class05 x = new Class05();
   	 	
        String metinal = x.getText();
        System.out.println(metinal);
   }
}
