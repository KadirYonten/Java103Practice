package giri���k��;

/*
JDK 5.0 provides a feature to read input from console. 
Java.util,Scanner is used for this purpose. 
This code read a String and an Integer from the console and 
stores them in the variables.
import java.util.Scanner;
*/
import java.util.Scanner;
public class InputExp {

   public static void main(String[] args) {

       String name;
       int age;
       Scanner in = new Scanner(System.in);

       // Reads a single line from the console 
       // and stores into name variable
       name = in.nextLine();

       // Reads a integer from the console
       // and stores into age variable
       age=in.nextInt();
       in.close();            

       // Prints name and age to the console
       System.out.println("Name :"+name);
       System.out.println("Age :"+age);

    }
}