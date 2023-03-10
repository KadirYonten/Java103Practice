import java.awt.*;
import java.util.*;
import java.applet.*;
import java.text.*;

public class Clock extends java.applet.Applet implements Runnable {
    private volatile Thread clockThread = null;
    DateFormat formatter;     // Formats the date displayed
    String lastdate;          // String to hold date displayed
    Date currentDate;         // Used to get date to display
    Color numberColor;        // Color of numbers
    Font clockFaceFont;
    Locale locale;

    public void init() {
        setBackground(Color.white);
        numberColor = Color.red;
        locale = Locale.getDefault();
        formatter =
            DateFormat.getDateTimeInstance(DateFormat.FULL,
            DateFormat.MEDIUM, locale);
        currentDate = new Date();
        lastdate = formatter.format(currentDate);
        clockFaceFont = new Font("Sans-Serif",
                                 Font.PLAIN, 14);
        resize(275,25); 
   }

    public void start() {
      if (clockThread == null) {
         clockThread = new Thread(this, "Clock");
         clockThread.start();
      }
    }

    public void run() {
      Thread myThread = Thread.currentThread();
        while (clockThread == myThread) {
            repaint();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){ }
        }
    }

    public void paint(Graphics g) {
      String today;
      currentDate = new Date();
      formatter =
           DateFormat.getDateTimeInstance(DateFormat.FULL,
           DateFormat.MEDIUM, locale);
      today = formatter.format(currentDate);
      g.setFont(clockFaceFont);

      // Erase and redraw  
      g.setColor(getBackground());
      g.drawString(lastdate, 0, 12);   				

      g.setColor(numberColor);
      g.drawString(today, 0, 12);    
      lastdate = today;
      currentDate=null;

    }

    public void stop() {
        clockThread = null;
    }
}