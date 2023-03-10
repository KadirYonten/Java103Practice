import java.io.*;
import java.net.*;
import java.util.regex.*;

/**
   This program displays all URLs in a web page by
   matching a regular expression that describes the
   <a href=...> HTML tag. Start the program as
   java HrefMatch URL
*/
public class HrefMatch
{
   public static void main(String[] args)
   {
      try
      {
         // get URL string from command line or use default
         String urlString;
         if (args.length > 0) urlString = args[0];
         else urlString = "http://java.sun.com";

         // open reader for URL
         InputStreamReader in = new InputStreamReader(
            new URL(urlString).openStream());

         // read contents into string buffer
         StringBuffer input = new StringBuffer();
         int ch;
         while ((ch = in.read()) != -1) input.append((char)ch);

         // search for all occurrences of pattern
         String patternString 
            = "<a\\s+href\\s*=\\s*(\"[^\"]*\"|[^\\s>])\\s*>";
         Pattern pattern = Pattern.compile(patternString,
            Pattern.CASE_INSENSITIVE);
         Matcher matcher = pattern.matcher(input);

         while (matcher.find())
         {
            int start = matcher.start();
            int end = matcher.end();
            String match = input.substring(start, end);
            System.out.println(match);
         }
      }
      catch (IOException exception)
      {
         exception.printStackTrace();
      }
      catch (PatternSyntaxException exception)
      {
         exception.printStackTrace();
      }
   }
}
