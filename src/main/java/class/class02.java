/*
 *Bu program bir class 
 *de�i�keni (nesne) tan�ml�yor. 
 *Bu nesnenin kurulumu (constructor) gerekmiyor.
 *Static de�i�kenler do�rudan bellekte yer al�rlar.
 *Onlar�n yarat�lamas� (instantiate) gerekmez. 
*/


class class02 {
   static String str = "Bu bir string\'dir";
   
   public static void main(String[] args){
        System.out.println(str);
   }
}
