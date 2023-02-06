//Listing 23.2. Code for the Dialog class that changes the frame title.
import java.awt.*;
import java.lang.*;
import java.applet.*;
import java.awt.event.*;

// This applet simply starts up the frame
// which provides a menu for setting the frame title...

public class DialogTestApplet extends Applet  {
   public void init() {
      // Create the frame with a title...
      new FrameMenuTest("Menu Based Test");
   }
}
// Listen for changes to the frame title
class FrameMenuListener implements ActionListener {
   // The dialog to change the title...
   ChangeTitleDialog dlg;
   Frame fr;  // Frame to use...
   // Constructor...
   public FrameMenuListener(Frame fr) {
        this.fr = fr;
      // Instantiate the dialog...
      dlg = new ChangeTitleDialog(fr,true,"Change the title");
   }
   // Handle the action to be performed...
   public void actionPerformed(ActionEvent e) {
       // Get the action that occured...
       String selection = e.getActionCommand();
       if (selection.equals("Quit"))
            fr.dispose();
       // Otherwise call the Dialog...
       if (selection.equals("Change Title Dialog"))
            dlg.show(); // Make the dialog visible...
   }
}
// The frame that creates a dialog that
// changes the frame's title
class FrameMenuTest extends Frame {
   // Create the frame with a title...
   public FrameMenuTest(String title) {
      // Call the superclass constructor...
      super(title);
      // Add the menus...
      // First create the menu bar
      MenuBar mbar = new MenuBar();
      setMenuBar(mbar); // Attach to the frame...
      // Add the File submenu...
      Menu m = new Menu("File");
      mbar.add(m);  // Add to menu bar
      // Create action listener for the menu items...
      FrameMenuListener listener = new FrameMenuListener(this);
      // Add Dialog to the submenu...
      MenuItem item = new MenuItem("Change Title Dialog");
      item.addActionListener(listener);
      m.add(item);
      // Add a separator
      m.addSeparator();
      // Add Quit to the submenu...
      item = new MenuItem("Quit");
      item.addActionListener(listener);
      m.add(item);
      // Pack and display...
      pack();
      resize(300,200); // Make it a reasonable size...
      show();
   }
}
// Listen for changes to the frame title
class DialogTitleListener implements ActionListener {
   Frame fr;  // Frame to use...
   // Constructor...
   public DialogTitleListener(Frame fr) {
        this.fr = fr;
   }
   // Handle the action to be performed...
   public void actionPerformed(ActionEvent e) {
       // Get the action that occured...
       String selection = e.getActionCommand();
       fr.setTitle(selection);
   }
}
// Handle close events...
class DialogListener implements WindowListener {
   Dialog dlg;  // Dialog to use...
   // Constructor...
   public DialogListener(Dialog dlg) {
        this.dlg = dlg;
   }
   // This closes the window...
   public void windowClosing(WindowEvent e) {
        dlg.dispose();
   }
   public void windowOpened(WindowEvent e) {
   }
   public void windowClosed(WindowEvent e) {
   }
   public void windowIconified(WindowEvent e) {
   }
   public void windowDeiconified(WindowEvent e) {
   }
}
// Dialog that presents a grid of buttons
// for changing the Frame title.
class ChangeTitleDialog extends Dialog {
   Frame fr;
   // Create the dialog and store the title string...
   public ChangeTitleDialog(Frame parent,boolean modal,String title) {
        // Create dialog with title
        super(parent,title,modal);
        fr = parent;
        // Create a grid layout to place the buttons...
        setLayout(new GridLayout(3,2));
        // Add the buttons for choosing the titles...
        DialogTitleListener listener = new DialogTitleListener(fr);
        Button b = new Button("Frame Title #1");
        b.addActionListener(listener);
        add(b);
        b = new Button("Frame Title #2");
        b.addActionListener(listener);
        add(b);
        b = new Button("Frame Title #3");
        b.addActionListener(listener);
        add(b);
        b = new Button("Frame Title #4");
        b.addActionListener(listener);
        add(b);
        b = new Button("Frame Title #5");
        b.addActionListener(listener);
        add(b);
        b = new Button("Frame Title #6");
        b.addActionListener(listener);
        add(b);
        // Have a listener for shutting down the dialog...
        addWindowListener(new DialogListener(this));
        // Pack and size for display...
        pack();
        resize(300,200);
 }


}
