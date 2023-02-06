/*
Bu program yanlýþtýr.
Static getText()  metodu static olmayan deðiþkeni çaðýramaz.
*/

class class04 {
	//anlýk deðiþken
   String str = "Bu bir anlýk string\'dir";
   
	//class metodu
   static String getText(){
        return str;
   }

   public static void main(String[] args){
        String metinal = getText();
        System.out.println(metinal);
   }
}
