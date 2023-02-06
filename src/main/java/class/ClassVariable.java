class ClassVariable {
    int ix; // instance deðiþken tanýmý
    static int cx;  // class deðiþken tanýmý
    
    void instanceMethod() { // instance metot tanýmý
      System.out.println(
      "A - Instance deðiþken " + ix);
      System.out.println(
      "B - Class deðiþken " + cx);
    }
    static void classMethod() { // class metot tanýmý
      System.out.println(
      "C - Class deðiþken " + cx);
    }

    public static void main(String[] args) {
    ClassVariable obj = new ClassVariable();
    obj.ix = 5;
    obj.cx = 10;
    obj.instanceMethod();
    ClassVariable.classMethod();
    }
    }