import java.io.* ;
public class DoyayaYaz01 {

	 static String[] str = {"outfile.dat" , "32"} ;

	public static void main(String[] args ) 
	throws IOException {
args = str;
         if (args.length < 2) {

             System.out.println(
                 "Must enter filename and buffsize as arguments.");
             System.exit(0);
         }

         int buffSize = Integer.parseInt(args[1]);

         FileOutputStream fos =
             new FileOutputStream(args[0]);

         BufferedOutputStream bos =
             new BufferedOutputStream(fos, buffSize);

         for (int i = 0; i < 100; ++i) {
             bos.write(i);
         }

         bos.close();
     }
 }
