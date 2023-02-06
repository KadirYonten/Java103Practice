/* check boxes */

import java.awt.*;

public class CheckboxAppletTest extends java.applet.Applet {

  public void init() {
    add(new Checkbox("Kundura"));
    add(new Checkbox("Çorap"));
    add(new Checkbox("Pantalon"));
    add(new Checkbox("Gömlek", null, true));
    add(new Checkbox("Kazak"));
  }

  public boolean action(Event evt, Object arg) {
    System.out.println(arg);
    return true;
  }
}
