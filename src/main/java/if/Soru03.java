
public class Soru03 {

  public static void main( String[] args ) {
    boolean durum = false;
    boolean devam = true; 
    String str1 = "Java'y� iyi �al��t�m. \n S�navda y�ksek not alaca��m." ;
    String str2 = "Java'y� biraz �al��t�m. \n S�navda belki ba�arabilirim." ;
    String str3 = "Java'y� hi� �al��mad�m. \n S�nav� ba�aramayaca��m." ;
    
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