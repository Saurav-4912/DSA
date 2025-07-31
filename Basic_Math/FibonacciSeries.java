package Basic_Math;
// Fibonacci Series is a sequence where each number is the sum of the two preceding ones, usually starting with 0 and 1.
// This program prints the Fibonacci series up to a specified number of terms.
public class FibonacciSeries {
  public static void main(String[] args) {
    int n = 10;
    int first = 0 ;  // First number in the Fibonacci series
    int second = 1;  // Second number in the Fibonacci series
    // The next number is the sum of the previous two numbers
    int temp =0;

    System.out.print("Fibonacci Series up to " + n + " terms: ");
    for(int i = 1; i<=n; i++){  // Loop to print the Fibonacci series up to n terms
      System.out.print( first + " ");

      // Calculate the next number in the series
      temp = first + second;
      first = second;
      second = temp;
    }
  }
}
