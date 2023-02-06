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
public class AWTTest2
{  
   public static void main(String[] args)
   {  
      JFrame frame = new AWTTest2Frame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}

/**
   This frame contains a canvas for graphics and a button.
*/
class AWTTest2Frame extends JFrame
{  
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 400;
	
	private MyCanvas2 canvas;
	private JButton button;
	
	public AWTTest2Frame()
	{  
		// set frame title and size
		super();
		setTitle("AWT Test 2");
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
		canvas = new MyCanvas2();
		contentPane.add(canvas, BorderLayout.CENTER);
		
		// add a button that draws nonpersistent rectangles
		button = new JButton("Rotate Me");
		button.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					canvas.incrementAngle();
					canvas.repaint();
				}
			});
		contentPane.add(button, BorderLayout.SOUTH);
	}

}

/**
	A canvas for graphics.
 */
class MyCanvas2 extends JPanel
{
	private double angle;
	
	public MyCanvas2()
	{
		angle = 0;
	}
	
	public void incrementAngle()
	{
		angle = angle + 15;
	}
    
	public void paintComponent(Graphics g)
	{  
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		
		// reference to body parts
		Shape s;
		
		// clip
		s = new Rectangle2D.Double(75, 75, 150, 200);
		Shape oldClip = g2.getClip();
		//g2.clip(s);
		
		// translate up and left
		double xFactor = 1.0*getWidth()/300;
		double yFactor = 1.0*getHeight()/400;
		g2.scale(xFactor, yFactor);
		g2.translate(150, 175);
		g2.rotate(Math.toRadians(angle));
		g2.translate(-150, -175);
		//g2.rotate(Math.toRadians(angle), 150, 175);
		
		// nose
		s = new QuadCurve2D.Double(
						150 + 25 * Math.cos(Math.toRadians(0)),
						 75 + 25 * Math.sin(Math.toRadians(0)),
						150 + 65 * Math.cos(Math.toRadians(25)),
						 75 + 65 * Math.sin(Math.toRadians(25)),
						150 + 25 * Math.cos(Math.toRadians(50)),
						 75 + 25 * Math.sin(Math.toRadians(50)));
		g2.setPaint(Color.YELLOW);
		g2.fill(s);
						
		// head
		s = new Ellipse2D.Double(125, 50, 50, 50);
		g2.setPaint(Color.GREEN);
		g2.fill(s);
		
		// eye
		s = new Ellipse2D.Double(150, 60, 20, 10);
		g2.setPaint(Color.BLACK);
		g2.fill(s);
		
		// body
		s = new RoundRectangle2D.Double(100, 100, 100, 150, 50, 20);
		g2.setPaint(new GradientPaint(new Point(100,100), Color.RED,
		                              new Point(200,250), Color.BLUE));
		g2.fill(s);
		
		// legs
		GeneralPath p = new GeneralPath();
		p.moveTo(130, 250);
		p.lineTo(90, 330);
		p.lineTo(130, 330);
		g2.setPaint(Color.BLACK);
		g2.setStroke(new BasicStroke(10.0F, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
		g2.draw(p);
		
		p = new GeneralPath();
		p.moveTo(170, 250);
		p.lineTo(200, 330);
		p.lineTo(230, 330);
		g2.draw(p);
		
		// restore original clip
		g2.setClip(oldClip);
		
		// arm
		s = new Arc2D.Double(150, 50, 180, 150, 180, 120, Arc2D.OPEN);
		g2.draw(s);
		
		// veil
		g2.setTransform(new AffineTransform());
		s = new Rectangle2D.Double(220, 150, 80, 100);
		g2.setPaint(new Color(255,0,255,100));
		g2.fill(s);
	}
}
