 public class RootApplet extends java.applet.Applet {
         int number;

         public void init() {
            number = 225;
     }

         public void paint(java.awt.Graphics g) {
            g.drawString("The square root of " +
                           number +
                           " is " +
                   Math.sqrt(number), 5, 50);
     }
 } 