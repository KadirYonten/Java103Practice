import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.*;
import javax.swing.*;
import java.io.*;
import javax.imageio.*;
import java.awt.image.*;

// Demonstrates reading and writing an image file and manipulating the
// pixels of an image.
// David Housman 2005-03-17.

public class ImageIODemo
{  
   public static void main(String[] args)
   {  
      JFrame frame = new ImageIOFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}

// This frame contains a canvas for graphics and some buttons.
class ImageIOFrame extends JFrame
{  
	private static final int FRAME_WIDTH = 600;
	private static final int FRAME_HEIGHT = 800;
	
	private BufferedImage image;
	private JPanel panel;
	
	public ImageIOFrame()
	{
		// setup frame
		setTitle("ImageIODemo");
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		
		try
		{
			// read image
			//File in = new File("GenOutside.jpg");
			File in = new File("cj2v1.jpg");
			image = ImageIO.read(in);
			
			// display image
			System.out.println(image);
			JLabel imageHolder = new JLabel(new ImageIcon(image));
			panel = new JPanel();
			panel.add(imageHolder);
			setLayout(new BorderLayout());
			add(new JScrollPane(panel), BorderLayout.CENTER);
			
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
		JPanel buttons = new JPanel();
		JButton button = new JButton("Line");
		button.addActionListener(new
			ActionListener()
			{
				public void actionPerformed(ActionEvent event)
				{
					// usual representation of a color: red, green, blue, alpha
					Color color = new Color(255, 255, 255, 150);
					
					// get the packed representation of the color
					int argb = color.getRGB();
					
					// set appropriate pixels to the specified color
					int y = (int)(0.7 *image.getHeight());
					for (int x = 0; x < image.getWidth(); x++) {					
						image.setRGB(x, y, argb);
					}					
					panel.repaint();
				}
			});
		buttons.add(button);
		
		// Transformation of each pixel done via the buffered image.
		// This approach takes care of translating our messages to the
		// buffered image to the underlying raster via the color model.
		// But it is slow.
		button = new JButton("Negative 1");
		button.addActionListener(new
			ActionListener()
			{
				public void actionPerformed(ActionEvent event)
				{
					for (int x = 0; x < image.getWidth(); x++)
					{
						int h = image.getHeight()/4;
						for (int y = h; y < 2*h; y++)
						{
							int argb = image.getRGB(x, y);
							Color color = new Color(argb, true);
							int alpha = color.getAlpha();
							int red = 255 - color.getRed();
							int green = 255 - color.getGreen();
							int blue = 255 - color.getBlue();
							color = new Color(red, green, blue, alpha);
							argb = color.getRGB();
							
							image.setRGB(x, y, argb);		
						}				
					}			
					panel.repaint();
				}
			});
		buttons.add(button);
				
		// Transformation of each pixel done directly on the raster of
		// the buffered image.  This only works if you have the right
		// SampleModel.  As coded here, the assumption is TYPE_3BYTE_BGR.
		button = new JButton("Negative 2");
		button.addActionListener(new
			ActionListener()
			{
				public void actionPerformed(ActionEvent event)
				{
					WritableRaster raster = image.getRaster();
					int[] sample = null;// = new int[3];
					//ColorModel model = image.getColorModel();
					
					for (int x = 0; x < image.getWidth(); x++)
					{
						int h = image.getHeight()/4;
						for (int y = h; y < 2*h; y++)
						{
							sample = raster.getPixel(x, y, sample);
							sample[0] = 255 - sample[0];
							sample[1] = 255 - sample[1];
							sample[2] = 255 - sample[2];
							raster.setPixel(x, y, sample);	
						}				
					}			
					panel.repaint();
				}
			});
		buttons.add(button);
		
		// Transformation of each pixel done directly on the raster of
		// the buffered image.  This only works if you have the right
		button = new JButton("Negative 3");
		button.addActionListener(new
			ActionListener()
			{
				public void actionPerformed(ActionEvent event)
				{
					// obtain a view of a horizontal strip of the image
					int w = image.getWidth();
					int h = image.getHeight()/4;
					BufferedImage subimage = image.getSubimage(0,h,w,h);
					
					// create table 0->255, 1->254, ..., 255->0
					byte[] negative	= new byte[256];
					for (int i = 0; i < 256; i++) negative[i] = (byte)(255 - i);
					ByteLookupTable table = new ByteLookupTable(0, negative);
					
					// create and use a lookup operation to filter subimage
					LookupOp op = new LookupOp(table, null); // no rendering hints
					op.filter(subimage, subimage);  // source, destination
					
					panel.repaint();
				}
			});
		buttons.add(button);
		
		// Save the image to a file
		button = new JButton("Save");
		button.addActionListener(new
			ActionListener()
			{
				public void actionPerformed(ActionEvent event)
				{
					File out = new File("output.jpg");
					String format = "JPEG";
					try {
						ImageIO.write(image, format, out);
					} 
					catch(IOException e) { }
				}
			});
		buttons.add(button);
				
		add(buttons, BorderLayout.NORTH);
	}
}