import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

// Converts <filename>.gif to <filename>.jpg using the buffered image type
// associated with windows monitors.
// Written 03/16/04 by David Housman

public class GifToJpgConverter
{
	public static void main(String[] args)
   	{  
   		String filename = "cj2v1";
   		BufferedImage gif, jpg;
   		  		
		try 
		{
			// read gif image
			File in = new File(filename + ".gif");
			gif = ImageIO.read(in);
		
			// create blank jpg image same size as gif image and
			// a type that represents an image with 8-bit RGB color components,
			// corresponding to a Windows-style BGR color model with the colors
			// Blue, Green, and Red stored in 3 bytes.	
			jpg = new BufferedImage(gif.getWidth(), gif.getHeight(),
							        BufferedImage.TYPE_3BYTE_BGR);
			
			// copy gif image to jpg image				                  
			for (int x = 0; x < gif.getWidth(); x++)
			{
				System.out.println(x);
				for (int y = 0; y < gif.getHeight(); y++)
				{
					int argb = gif.getRGB(x, y);
					jpg.setRGB(x, y, argb);		
				}				
			}
			
			// write jpg image to file
			File out = new File(filename + ".jpg");
			String format = "JPEG";
			ImageIO.write(jpg, format, out);
		} 
		catch(IOException e) { System.out.println(e);	}					
   	}
}