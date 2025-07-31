package Basic_Math;
// Armstrong Number means a number that is equal to the sum of its own digits each raised to the power of the number of digits.
// This program checks if a number is an Armstrong number or not.
public class ArmstrongNumber {
  public static void main(String[] args) {
    int number = 153;
    int originalNumber = number; // Store the original number to compare later
    int sum = 0;

    while (number > 0) { // Loop to extract each digit
      int remainder = number % 10; // Get the last digit
      sum += remainder * remainder * remainder; // Cube the digit and add to sum
      number = number / 10; // Remove the last digit
    }
 // Check if the sum of cubes of digits is equal to the original number
    if (originalNumber == sum) {
      System.out.println(originalNumber + " is an Armstrong number.");
    } else {
      System.out.println(originalNumber + " is not an Armstrong number.");
    }
  }
}