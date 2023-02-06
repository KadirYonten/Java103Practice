class Str04 {
  public static void main(String args[]) {
  	String strOb1 = "Bugün ";
  	String strOb2 = "okula gittim. ";
  	String strOb3 = "Java dersini dinledim. ";

  	String strOb4 = "Bugün "  +  "okula gittim. ";
  	String strOb5 = strOb1 + strOb2;

  	String strOb6 = strOb4 + strOb3;		
 	String strOb7 = strOb5 + strOb3;
 	String strOb8 = strOb7;
 	
 	System.out.println(strOb4 == strOb5);
	System.out.println(strOb6 == strOb7);
	System.out.println(strOb8 == strOb7);
	
 	System.out.println("strOb1= " + strOb1);
 	System.out.println("strOb2= " + strOb2);
 	System.out.println("strOb3= " + strOb3);
 	System.out.println("strOb4= " + strOb4);
 	System.out.println("strOb5= " + strOb5);
 	System.out.println("strOb6= " + strOb6);
 	System.out.println("strOb7= " + strOb7);
	System.out.println();

 	System.out.println("Bugün " + "okula gittim. " 
					+ "Java dersini dinledim." );
	System.out.println("strOb4 + strOb3 = " + strOb4 + strOb3);
	System.out.println();	
  }
}
