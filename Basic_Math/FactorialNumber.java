package Basic_Math;
// Factorial of a number is the product of all positive integers up to that number.
// This program calculates the factorial of a given number.
public class FactorialNumber {
  public static void main(String[] args) {
    int number = 5;
    int fact = 1;
    // Factorial of a number is the product of all positive integers up to that number
    for(int i = 1; i<= number; i++){
      fact = fact * i; // Multiply fact by i for each iteration
    }
    System.out.println("Factorial of " + number + " is: " + fact);
  }
}
