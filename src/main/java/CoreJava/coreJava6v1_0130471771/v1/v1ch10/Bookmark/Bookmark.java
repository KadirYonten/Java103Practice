/**
   @version 1.21 2002-07-12
   @author Cay Horstmann
*/

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.*;
import java.net.*;
import javax.swing.*;

public class Bookmark extends JApplet 
{  
   public void init()
   {  
      Box box = Box.createVerticalBox();
      ButtonGroup group = new ButtonGroup();

      int i = 1;
      String urlString;

      // read all link_n parameters
      while ((urlString = getParameter("link." + i)) != null)
      {  

         try
         {  
            final URL url = new URL(urlString);

            // make a radio button for each link
            JRadioButton button = new JRadioButton(urlString);
            box.add(button);
            group.add(button);

            // selecting the radio button shows the URL in 
            // the "right" frame
            button.addActionListener(new 
               ActionListener()
               {
                  public void actionPerformed(ActionEvent event)
                  {
                     AppletContext context = getAppletContext();
                     context.showDocument(url, "right");
                  }
               });
         } 
         catch(MalformedURLException exception) 
         { 
            exception.printStackTrace(); 
         }

         i++;
      }

      Container contentPane = getContentPane();
      contentPane.add(box);
   }
}

