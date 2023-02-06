import java.awt.image.BufferedImage;

// Program displays all image type names and descriptions.
// Public methods available to obtain an image type name and description.
// Written 03/16/04 by David Housman

public class ImageType
{
	private static final int[] code = 
	{
		BufferedImage.TYPE_3BYTE_BGR, 
		BufferedImage.TYPE_4BYTE_ABGR,
		BufferedImage.TYPE_4BYTE_ABGR_PRE,
		BufferedImage.TYPE_BYTE_BINARY,
		BufferedImage.TYPE_BYTE_GRAY,
		BufferedImage.TYPE_BYTE_INDEXED,
		BufferedImage.TYPE_CUSTOM,
		BufferedImage.TYPE_INT_ARGB,
		BufferedImage.TYPE_INT_ARGB_PRE,
		BufferedImage.TYPE_INT_BGR,
		BufferedImage.TYPE_INT_RGB,
		BufferedImage.TYPE_USHORT_555_RGB,
		BufferedImage.TYPE_USHORT_565_RGB,
		BufferedImage.TYPE_USHORT_GRAY
	};
	
	private static final String[] name = 
	{
		"TYPE_3BYTE_BGR", 
		"TYPE_4BYTE_ABGR",
		"TYPE_4BYTE_ABGR_PRE",
		"TYPE_BYTE_BINARY",
		"TYPE_BYTE_GRAY",
		"TYPE_BYTE_INDEXED",
		"TYPE_CUSTOM",
		"TYPE_INT_ARGB",
		"TYPE_INT_ARGB_PRE",
		"TYPE_INT_BGR",
		"TYPE_INT_RGB",
		"TYPE_USHORT_555_RGB",
		"TYPE_USHORT_565_RGB",
		"TYPE_USHORT_GRAY"
	};
	
	private static final String[] desc = 	
	{
		"Represents an image with 8-bit RGB color components, corresponding to a Windows-style BGR color model) with the colors Blue, Green, and Red stored in 3 bytes.", 
		"Represents an image with 8-bit RGBA color components with the colors Blue, Green, and Red stored in 3 bytes and 1 byte of alpha. ",
		"Represents an image with 8-bit RGBA color components with the colors Blue, Green, and Red stored in 3 bytes and 1 byte of alpha. ",
		"Represents an opaque byte-packed 1, 2, or 4 bit image. ",
		"Represents a unsigned byte grayscale image, non-indexed. ",
		"Represents an indexed byte image. ",
		"Image type is not recognized so it must be a customized image. ",
		"Represents an image with 8-bit RGBA color components packed into integer pixels. ",
		"Represents an image with 8-bit RGBA color components packed into integer pixels. ",
		"Represents an image with 8-bit RGB color components, corresponding to a Windows- or Solaris- style BGR color model, with the colors Blue, Green, and Red packed into integer pixels. ",
		"Represents an image with 8-bit RGB color components packed into integer pixels. ",
		"Represents an image with 5-5-5 RGB color components (5-bits red, 5-bits green, 5-bits blue) with no alpha. ",
		"Represents an image with 5-6-5 RGB color components (5-bits red, 6-bits green, 5-bits blue) with no alpha. ",
		"Represents an unsigned short grayscale image, non-indexed). "
	};
		
	// Displays all image type names and descriptions.
	public static void main(String[] args)
	{
		for (int i = 0; i < code.length; i++)
		{
			//System.out.println(code[i]);
			System.out.println(getName(i));
			System.out.println(getDesc(i));
			System.out.println();
			
		}
	}
	
	// Returns index of the specified image type code
	private static int getIndex(int targetCode)
	{
		int index = 0;
		while (index < code.length)
		{
			if (code[index] == targetCode) return index;
			index++;
		}
		return -1;
	}
	
	// Returns name of the specified image type code
	public static String getName(int targetCode)
	{
		int index = getIndex(targetCode);
		if (index == -1) {
			return "UNKNOWN";
		}
		else {
			return name[index];
		}
	}
	
	// Returns description of the specified image type code
	public static String getDesc(int targetCode)
	{
		int index = getIndex(targetCode);
		if (index == -1) {
			return "Unknown";
		}
		else {
			return desc[index];
		}
	}	
}