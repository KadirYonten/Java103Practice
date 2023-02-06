class ClassVariable {
    int ix; // instance de�i�ken tan�m�
    static int cx;  // class de�i�ken tan�m�
    
    void instanceMethod() { // instance metot tan�m�
      System.out.println(
      "A - Instance de�i�ken " + ix);
      System.out.println(
      "B - Class de�i�ken " + cx);
    }
    static void classMethod() { // class metot tan�m�
      System.out.println(
      "C - Class de�i�ken " + cx);
    }

    public static void main(String[] args) {
    ClassVariable obj = new ClassVariable();
    obj.ix = 5;
    obj.cx = 10;
    obj.instanceMethod();
    ClassVariable.classMethod();
    }
    }