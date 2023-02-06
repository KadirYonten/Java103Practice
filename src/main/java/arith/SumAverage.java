class SumAverage {
    public static void main (String args[]) {
        int sum = 0; 

        for (int i = 0; i < args.length; i++) {
            sum += args[i];
        }

        System.out.println("Sum is: " + sum);
        System.out.println("Average is: " +
            (float)sum / args.length);
    }
} 