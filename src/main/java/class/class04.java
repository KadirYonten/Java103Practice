/*
Bu program yanl��t�r.
Static getText()  metodu static olmayan de�i�keni �a��ramaz.
*/

class class04 {
	//anl�k de�i�ken
   String str = "Bu bir anl�k string\'dir";
   
	//class metodu
   static String getText(){
        return str;
   }

   public static void main(String[] args){
        String metinal = getText();
        System.out.println(metinal);
   }
}
