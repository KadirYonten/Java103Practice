// constructor prog01.java

class Prog01 {
  
   String txt;
   
		//constructor
   Prog01(){
     txt = "Ben bir anlýk string\'im";
   }

   String getText(){
        return txt;
   }

   public static void main(String[] args){
        Prog01 x = new Prog01();
        String metinal = x.getText();
        System.out.println(metinal);
   }
}
