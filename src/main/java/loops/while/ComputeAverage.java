public class ComputeAverage {

   /*  This program will read a sequence of positive integers input
       by the user, and it will print out the average of those
       integers.  The user is prompted to enter one integer at a
       time.  The user must enter a 0 to mark the end of the
       data.  (The zero is not counted as part of the data to
       be averaged.)  The program does not check whether the
       user's input is positive, so it will actually work for
       both positive and negative input values.
   */
 
  public static void main(String[] args) {
    
     int inputNumber;   // One of the positive integers input by the user.
     int sum;           // The sum of the positive integers.
     int count;         // The number of positive integers.
     double average;    // The average of the positive integers.
    
     /* Initialize the summation and counting variables. */
    
     sum = 0;
     count = 0;
    
     /* Read and process the user's input. */
    
     TextIO.put("Enter your first positive integer: ");
     inputNumber = TextIO.getlnInt();
    
     while (inputNumber != 0) {
        sum += inputNumber;   // Add inputNumber to running sum.
        count++;              // Count the inputNumber by adding 1 to count.
        TextIO.put("Enter your next positive integer, or 0 to end: ");
        inputNumber = TextIO.getlnInt();
     }
    
     /* Display the result. */
    
     if (count == 0) {
        TextIO.putln("You didn't enter any data!");
     }
     else {
        average = ((double)sum) / count;
        TextIO.putln();
        TextIO.putln("You entered " + count + " positive integers.");
        TextIO.putln("Their average is " + average + ".");
     }

 } // end main()
 
} // end class ComputeAverage
