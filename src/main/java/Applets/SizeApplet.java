import java.applet.*;   

import java.awt.*;

 

public class SizeApplet extends Applet {

 

  public void paint(Graphics g) {

    Dimension appletSize = this.getSize();

    int appletHeight = appletSize.height;

    int appletWidth = appletSize.width;

   

    g.drawString("This applet is " + appletHeight +

      " pixels high by " + appletWidth + " pixels wide.",

      15, appletHeight/2);

  }

 

}