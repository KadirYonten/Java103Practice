import java.io.File;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.IOException;

public class GetImageType
{
	public static void main(String[] args)
	{
		try
		{
			// read image
			File in = new File(args[0]);
			BufferedImage image = ImageIO.read(in);
			int type = image.getType();
			System.out.println(ImageType.getName(type));
			System.out.println(ImageType.getDesc(type));
			
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}