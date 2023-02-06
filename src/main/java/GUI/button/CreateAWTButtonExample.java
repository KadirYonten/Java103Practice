   1.
      /*
   2.
      Create AWT Button Example
   3.
      This java example shows how to create a Button using AWT Button class.
   4.
      */
   5.
       
   6.
      import java.applet.Applet;
   7.
      import java.awt.Button;
   8.
       
   9.
       
  10.
      /*
  11.
      <applet code="CreateAWTButtonExample" width=200 height=200>
  12.
      </applet>
  13.
      */
  14.
       
  15.
      public class CreateAWTButtonExample extends Applet{
  16.
       
  17.
      public void init(){
  18.
       
  19.
      /*
  20.
      * To create a button use
  21.
      * Button() constructor.
  22.
      */
  23.
       
  24.
      Button button1 = new Button();
  25.
       
  26.
      /*
  27.
      * Set button caption or label using
  28.
      * void setLabel(String text)
  29.
      * method of AWT Button class.
  30.
      */
  31.
       
  32.
      button1.setLabel("My Button 1");
  33.
       
  34.
      /*
  35.
      * To create button with the caption use
  36.
      * Button(String text) constructor of
  37.
      * AWT Button class.
  38.
      */
  39.
       
  40.
      Button button2 = new Button("My Button 2");
  41.
       
  42.
      //add buttons using add method
  43.
      add(button1);
  44.
      add(button2);
  45.
      }
  46.
       
  47.
      }