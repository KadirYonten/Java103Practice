// String sýnýfý
class Str02 {
  public static void main(String args[]) {
    String strOb1 = new String("Bugün ");
    String strOb2 = "okula gittim. ";
    String strOb3 = new String("Java dersini dinledim. ");
    String strOb4 = strOb1 + strOb2;

    System.out.print(strOb1);
    System.out.print(strOb2);
    System.out.println(strOb3);
    System.out.println(strOb4 + strOb3);
  }
}