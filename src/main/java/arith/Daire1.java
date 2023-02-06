// yaricapi verilen bir dairenin alani ve cevresinin hesaplanmasi.

import java.io.*;





public static void main (String[] args) {
BufferedReader stdin = new BufferedReader
        (new InputStreamReader(System.in));

double radius; 
double circumference; 
double area; 
double pi = 3.14 

System.out.println("Enter the radius");
radius = Double.valueOf(stdin.readLine()).doubleValue(); 

area = pi * radius * radius; 

circumference = 2 * pi * radius; 

System.out.println ("Area is : "+area); 
System.out.println ("Circumference is : "+circumference); 

} 