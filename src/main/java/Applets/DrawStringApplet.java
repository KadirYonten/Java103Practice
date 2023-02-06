import java.applet.*;   

import java.awt.*;

            

public class DrawStringApplet extends Applet {

 

  private String defaultMessage = "Hello!";

 

  public void paint(Graphics g) {

    String inputFromPage = this.getParameter("Message");

    if (inputFromPage == null) inputFromPage = defaultMessage;

    g.drawString(inputFromPage, 50, 25);

  }

 

}