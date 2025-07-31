package Basic_Math;
// Reverse Digit means reversing the order of digits in a number.
// This program reverses the digits of a given number.
public class ReverseDigit {
  public static void main(String[] args) {
    int number = 56325;
    int originalNumber = number;
    int reverseDigit = 0;

    while(number > 0){
      int digit = number % 10;  // Get the last digit
      reverseDigit = reverseDigit *  10 + digit; // Append the digit to the reversed number
      number /= 10; // Remove the last digit from the original number
    }

    System.out.println(reverseDigit); // Print the reversed number
  }
}
