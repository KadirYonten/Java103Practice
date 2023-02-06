public class NumberedSquares
{
    public static void main(String[] args){
        int i=1; // declare and initialize an integer variable
        
        while (i < 10) // "loop" as long as i is less than 10
        {
            System.out.print(i+" "); // print i and a space
            System.out.println(i*i); // followed by the square
            i = i+1;                 // increment (add 1 to) i
        }
    }
}
/*
1 1
2 4
3 9
4 16
5 25
6 36
7 49
8 64
9 81
*/
