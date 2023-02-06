import java.io.*;
class Konsole04 {
    public static void main(String[] args) throws IOException {
        // In order to read a line at a time from System.in,
        // which is type InputStream, it must be wrapped into
        // a BufferedReader, which requires wrapping it first
        // in an InputStreamReader.
        // Note the "throws" clause on the enclosing method (main).
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(isr);
        
        String line;  // holds each input line
        
        // Read and print lines in a loop.
        // Terminate with EOF: control-Z (Windows) or control-D (other)
        while ((line = input.readLine()) != null) {
            System.out.println(line);   // process each line
        }
    }
}