public class FiveThreadsTest {
    public static void main (String[] args) {
        new SimpleThread("Jamaica").start();
        new SimpleThread("Fiji").start();
        new SimpleThread("Antalya").start();
        new SimpleThread("Istanbul").start();
        new SimpleThread("Izmir").start();
    }
}