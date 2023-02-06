// The ColoredCheckbox class.
// Class for creating a checkbox associated
// with a given color...

import java.awt.*;

class ColoredCheckbox extends Checkbox {
   Color color;  // The color of this checkbox...
   // Constructor creates checkbox with specified color...

   public ColoredCheckbox(Color color, String label,
         CheckboxGroup grp, boolean set) {
         // Call the default constructor...
         super(label,grp,set);
         this.color = color;
         setBackground(color);
   }

   // Sets itself to true if it matches the color

   public void setIfColorMatches(Color match) {
      if (color == match)
         setState(true);
      else
         setState(false);
   }

   // Return the color matching this box...

   public Color getColor() {
      return color;
   }


}
