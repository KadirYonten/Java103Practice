/*
Anlýk bir metot static bir deðiþkeni çaðýrabilir.
*/

class Class05 {
	//class deðiþkeni
   static String str = "Bu bir static string\'dir";
   
	//anlýk metodu
   String getText(){
        return str;
   }

   public static void main(String[] args){
   	 	Class05 x = new Class05();
   	 	
        String metinal = x.getText();
        System.out.println(metinal);
   }
}
