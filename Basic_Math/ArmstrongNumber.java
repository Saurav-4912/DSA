package Basic_Math;

public class ArmstrongNumber {
  public static void main(String[] args) {
    int number = 153;
    int originalNumber = number; // Store the original number to compare later
    int sum = 0;

    while (number > 0) {
      int remainder = number % 10;
      sum += remainder * remainder * remainder;
      number = number / 10;
    }

    if (originalNumber == sum) {
      System.out.println(originalNumber + " is an Armstrong number.");
    } else {
      System.out.println(originalNumber + " is not an Armstrong number.");
    }
  }
}