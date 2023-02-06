
public class Soru03 {

  public static void main( String[] args ) {
    boolean durum = false;
    boolean devam = true; 
    String str1 = "Java'yý iyi çalýþtým. \n Sýnavda yüksek not alacaðým." ;
    String str2 = "Java'yý biraz çalýþtým. \n Sýnavda belki baþarabilirim." ;
    String str3 = "Java'yý hiç çalýþmadým. \n Sýnavý baþaramayacaðým." ;
    
    if( durum ) {
      System.out.println( str1 );
    }
    else if( durum && devam ) {
      System.out.println( str2 );
    }
    else {
      System.out.println( str3 );
    }
  }
}