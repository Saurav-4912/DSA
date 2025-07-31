package Basic_Math;
// Plaindrome Number means a number that remains the same when its digits are reversed.
// This program checks if a number is a palindrome or not.
public class Palindrome_Number {
  public static void main(String[] args) {
        int number = 121;
        int originalNumber = number; // Store the original number to compare later
        int reverseNumber = 0; // Variable to hold the reversed number

        while(number > 0){ // 
          int remainder = number % 10;
          reverseNumber = reverseNumber * 10 + remainder;
          number = number / 10;
        }

        if(originalNumber == reverseNumber){
          System.out.println(originalNumber + " is a palindrome number.");
        } else {
          System.out.println(originalNumber + " is not a palindrome number.");
        }
  }
}
