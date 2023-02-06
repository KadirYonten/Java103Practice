   1.
      /*
   2.
      Create AWT Checkbox Example
   3.
      This java example shows how to create a Checkbox using AWT Checkbox class.
   4.
      */
   5.
       
   6.
      import java.applet.Applet;
   7.
      import java.awt.Checkbox;
   8.
       
   9.
       
  10.
      /*
  11.
      <applet code="CreateCheckBox" width=200 height=200>
  12.
      </applet>
  13.
      */
  14.
       
  15.
      public class CreateCheckBox extends Applet{
  16.
       
  17.
      public void init(){
  18.
       
  19.
      /*
  20.
      * To create a checkbox use
  21.
      * Checkbox() constructor.
  22.
      */
  23.
       
  24.
      Checkbox checkBox1 = new Checkbox();
  25.
       
  26.
      /*
  27.
      * Set Checkbox caption or label using
  28.
      * void setLabel(String text)
  29.
      * method of AWT Checkbox class.
  30.
      */
  31.
       
  32.
      checkBox1.setLabel("My Checkbox 1");
  33.
       
  34.
      /*
  35.
      * To create checkbox with the caption use
  36.
      * CheckBox(String text) constructor of
  37.
      * AWT Checkbox class.
  38.
      */
  39.
       
  40.
      Checkbox checkbox2 = new Checkbox("My Checkbox 2");
  41.
       
  42.
      //add checkboxes using add method
  43.
      add(checkBox1);
  44.
      add(checkbox2);
  45.
      }
  46.
      }