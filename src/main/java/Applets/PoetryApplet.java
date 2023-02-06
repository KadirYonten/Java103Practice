import java.applet.*;   
import java.awt.*;

public class PoetryApplet extends Applet
{
  private String[] poem = new String[101];
  private int numLines;

  public void init() {
    String nextline;

    for (numLines = 1; numLines < poem.length; numLines++) {
      nextline = this.getParameter("Line" + numLines);
      if (nextline == null) break;
      poem[numLines] = nextline;
    }
    numLines--;
  }

  public void paint(Graphics g) {
    int y = 15;
    for (int i=1; i <= numLines; i++) {
      g.drawString(poem[i], 5, y);   
      y += 15;
    }
  }
} 