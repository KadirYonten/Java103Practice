/**
   @version 2005-03-14
   @author David Housman
*/

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.*;
import javax.swing.*;

/**
   This program illustrates graphics contexts, demonstrates 
   the need for.the paintComponent method, and demonstrates 
   the need for the 'super.paintComponent' method call 
   (comment it out and do some resizing).
*/
public class AWTTest
{  
   public static void main(String[] args)
   {  
      JFrame frame = new AWTTestFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}

/**
   This frame contains a canvas for graphics and a button.
*/
class AWTTestFrame extends JFrame
{  
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 300;
	
	private MyCanvas canvas;
	private JButton button;
	
	public AWTTestFrame()
	{  
		// set frame title and size
		super();
		setTitle("AWT Test");
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		
		// get screen dimensions
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenWidth = screenSize.width;
		int screenHeight = screenSize.height;
		
		// center frame in the screen
		setLocation((screenWidth - FRAME_WIDTH) / 2, 
		            (screenHeight - FRAME_HEIGHT) / 2);
		
		// obtain the part of the frame onto which most components are placed
		Container contentPane = getContentPane();
		
		// add the drawing canvas to the frame
		canvas = new MyCanvas();
		contentPane.add(canvas, BorderLayout.CENTER);
		
		canvas.setBackground(Color.GREEN);
		
		// add a button that draws nonpersistent rectangles
		button = new JButton("Push Me!");
		button.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					// the black rectangle is drawn on the canvas
					Rectangle2D r = new Rectangle2D.Double(0, 0, 50, 100);
					Graphics2D g2 = (Graphics2D)canvas.getGraphics();
					g2.setPaint(Color.BLACK);
					g2.fill(r);
					// the red rectangle is drawn on the frame	
					g2 = (Graphics2D)getGraphics();
					g2.setPaint(Color.RED);
					g2.fill(r);
					// the blue rectangle is drawn on the button
					g2 = (Graphics2D)button.getGraphics();
					g2.setPaint(Color.BLUE);
					g2.fill(r);
				}
			});
		contentPane.add(button, BorderLayout.SOUTH);
		 	
		// Does the frame's graphic context exist yet?
		System.out.println((Graphics2D)getGraphics());    
	}

}

/**
	A canvas for graphics.
 */
class MyCanvas extends JPanel
{
	public MyCanvas()
	{}
    
	public void paintComponent(Graphics g)
	{  
		//super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		Rectangle2D r = new Rectangle2D.Double(70, 70, 50, 100);
		g2.fill(r);
	}
}
