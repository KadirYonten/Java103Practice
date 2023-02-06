
class ScopeTest {
    static int  x=115;

    void printTest () {
        int x = 20; 
        System.out.println("x = " + x);
    }


    public static void main(String arg[]) {
        ScopeTest st = new ScopeTest();

        st.printTest();

        System.out.println(" x = " + x + " , st.x= " + st.x  );

}
} 