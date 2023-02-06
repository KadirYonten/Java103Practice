public class RootApplet extends java.applet.Applet {
         int number;

 public void init() {
                String parameter = getParameter("NUMBER");
                if (parameter != null)
                        number = Integer.parseInt(parameter);
}

         public void paint(java.awt.Graphics g) {
            g.drawString("The square root of " +
                           number +
                           " is " +
                   Math.sqrt(number), 5, 50);
     }
 } 


